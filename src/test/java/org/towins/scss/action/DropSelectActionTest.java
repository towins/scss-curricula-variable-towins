package org.towins.scss.action;

import org.junit.Test;
import org.towins.BaseTest;
import org.towins.scss.bo.DropSelectCourseBo;
import org.towins.scss.dto.vo.CourseVoForSelect;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DropSelectActionTest extends BaseTest {
    @Resource
    DropSelectCourseBo bo;
    @Test
    public void queryDropCourse() throws Exception {
        List<CourseVoForSelect> list =bo.queryForDropSelect(1);
        assertNotNull(list);
        assertEquals(2,list.size());
    }
}