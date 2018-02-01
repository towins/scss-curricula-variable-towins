package org.towins.scss.action;

import org.forten.dto.Message;
import org.springframework.web.bind.annotation.*;
import org.towins.scss.bo.SelectCourseBo;
import org.towins.scss.dto.vo.SelectInfoVoForWrite;

import javax.annotation.Resource;

/**
 * Created by zhaoqiwang on 2018/1/24.
 */
@RestController
public class SelectCourse {
    @Resource
    private SelectCourseBo bo;

    @PostMapping("/sc/select")
    public Message selectCourse(@RequestBody SelectInfoVoForWrite vo){
        long cadreId = 1;
        vo.setCadreId(cadreId);
        return bo.doSelectCourse(vo);
    }

    @PutMapping("/sc/cancel/{courseId}")
    public Message cancelCourse(@PathVariable long courseId){
        long cadreId = 1;
        return bo.doCancelCourse(cadreId,courseId);
    }
}
