package org.towins.scss.action;

import org.forten.dto.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.towins.scss.bo.CourseBo;
import org.towins.scss.entity.Course;

import javax.annotation.Resource;

@Controller
public class CourseAction {
    @Resource
    private CourseBo bo;
    @RequestMapping("course/save")
    public @ResponseBody
    Message save(@RequestBody Course course){
        return bo.doSave(course);
    }
}
