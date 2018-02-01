package org.towins.scss.bo;

import org.forten.dto.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.towins.dao.MybatisDao;
import org.towins.scss.dao.SelectCourseDao;
import org.towins.scss.dto.vo.SelectInfoVoForWrite;

import javax.annotation.Resource;

/**
 * Created by zhaoqiwang on 2018/1/24.
 */
@Service
public class SelectCourseBo {
    @Resource
    private MybatisDao mdao;
    @Transactional
    public Message doSelectCourse(SelectInfoVoForWrite vo) {
        try {
            getSelectCourseDao().selectCourse(vo);
            if (vo.getOptType().equals("XK")) {
                getSelectCourseDao().addOneCurrentAmount(vo.getCourseId());
                return Message.info("选课操作成功!");
            } else if (vo.getOptType().equals("PD")) {
                return Message.info("此课程已达到选课人数上限，您目前处理排队状态!");
            } else {
                return Message.warn("未知操作！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error("选课操作失败!");
        }
    }

    @Transactional
    public Message doCancelCourse(long cadreId, long courseId) {
        SelectCourseDao selectCourseDao = getSelectCourseDao();
        try {
            selectCourseDao.cancelCourse(cadreId, courseId);

            Long toXKCadreId = selectCourseDao.queryPD2XK(courseId);
            if(toXKCadreId==null){
                selectCourseDao.subOneCurrentAmount(courseId);
            }else{
                SelectInfoVoForWrite vo = new SelectInfoVoForWrite(toXKCadreId,courseId,"XK");
                selectCourseDao.selectCourse(vo);
            }
            return Message.info("退课操作成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error("退课操作失败!");
        }
    }
    private SelectCourseDao getSelectCourseDao() {
        return mdao.openSession().getMapper(SelectCourseDao.class);
    }
}
