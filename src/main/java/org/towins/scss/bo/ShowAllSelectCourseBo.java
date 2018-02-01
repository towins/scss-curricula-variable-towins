package org.towins.scss.bo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.towins.dao.MybatisDao;
import org.towins.scss.dao.ShowAllSelectCourseDao;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhaoqiwang on 2018/1/24.
 */
@Service
public class ShowAllSelectCourseBo {
    @Resource
    private MybatisDao mdao;
    @Transactional(readOnly = true)
    public List<CourseVoForSelect> showAllSelectedCourse(long cadreId) {
        return getAllSelectCourseDao().queryAllSelectedCourse(cadreId);
    }
    public ShowAllSelectCourseDao getAllSelectCourseDao(){
        return mdao.openSession().getMapper(ShowAllSelectCourseDao.class);
    }
}

