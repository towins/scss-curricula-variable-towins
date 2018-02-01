package org.towins.scss.bo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.towins.dao.MybatisDao;
import org.towins.scss.dao.ShowSelectCourseDao;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShowSelectCourseBo {
    @Resource
    MybatisDao mdao;
    @Transactional(readOnly = true)
    public List<CourseVoForSelect> queryForShowCourse(long cadreId){
        return getShowSelectCourseDao().queryForShowSelect(cadreId);
    }

    private ShowSelectCourseDao getShowSelectCourseDao(){
        return mdao.openSession().getMapper(ShowSelectCourseDao.class);
    }
}
