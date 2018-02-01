package org.towins.scss.bo;

import org.apache.ibatis.session.SqlSession;
import org.forten.dto.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.towins.dao.HibernateDao;
import org.towins.dao.MybatisDao;
import org.towins.scss.dao.CourseDao;
import org.towins.scss.dto.qo.CourseQoForTeacher;
import org.towins.scss.dto.vo.CourseForTeacher;
import org.towins.scss.entity.Course;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseBo {
    @Resource
    private HibernateDao dao;
    @Resource
    private MybatisDao mdao;
    @Transactional
    public Message doSave(Course course){
        try {
            dao.save(course);
            return Message.info("保存成功");
        }catch (Exception e) {
            e.printStackTrace();
            return Message.error("保存失败");
        }
    };
    @Transactional(readOnly = true)
    public List<CourseForTeacher> seletctAll(CourseQoForTeacher qo){
        SqlSession session = mdao.openSession();
        CourseDao cdao =  session.getMapper(CourseDao.class);
        return cdao.queryForTeacher(qo);
    }
}
