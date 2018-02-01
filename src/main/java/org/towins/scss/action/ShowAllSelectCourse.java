package org.towins.scss.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.towins.scss.bo.ShowAllSelectCourseBo;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhaoqiwang on 2018/1/24.
 */
@RestController
public class  ShowAllSelectCourse {
    @Resource
    private ShowAllSelectCourseBo bo;
    @GetMapping("/sc/selectedAllCourse")
    public List<CourseVoForSelect> ShowAllSelectedCourse(){
        long cadreId = 1;
        return bo.showAllSelectedCourse(cadreId);
    }
}
