package org.towins.scss.bo;

import org.junit.Test;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShowSelectCourseBoTest {
    @Resource
    private ShowSelectCourseBo bo;
    @Test
    public void queryForShowCourse() throws Exception {
        List<CourseVoForSelect> list =  bo.queryForShowCourse(1);
        assertNotNull(list);
        assertEquals(2,list.size());
    }

}