package org.towins.scss.bo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.towins.dao.MybatisDao;
import org.towins.scss.dao.DropSelectCourseDao;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DropSelectCourseBo {
    @Resource
   private MybatisDao mdao;
    @Transactional(readOnly = true)
    public List<CourseVoForSelect> queryForDropSelect(long cadreId){
        return getDropSelectDao().queryForDropSelect(cadreId);
    }

    public DropSelectCourseDao getDropSelectDao(){
        return  mdao.openSession().getMapper(DropSelectCourseDao.class);
    }
}
