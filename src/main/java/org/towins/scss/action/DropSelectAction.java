package org.towins.scss.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.towins.scss.bo.DropSelectCourseBo;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DropSelectAction {
    @Resource
    private DropSelectCourseBo bo;

    @GetMapping("sc/drop")
    public List<CourseVoForSelect> queryDropCourse(){
        long cadreId = 2;
        return bo.queryForDropSelect(cadreId);
    }

}
