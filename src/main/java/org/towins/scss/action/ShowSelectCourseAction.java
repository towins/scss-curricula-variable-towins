package org.towins.scss.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.towins.scss.bo.ShowSelectCourseBo;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ShowSelectCourseAction {
    @Resource
    private ShowSelectCourseBo bo;
    @GetMapping("/sc/show")
    public List<CourseVoForSelect> queryForShowSelect(){
        long cadreId = 1;
        return bo.queryForShowCourse(cadreId);
    }
}
