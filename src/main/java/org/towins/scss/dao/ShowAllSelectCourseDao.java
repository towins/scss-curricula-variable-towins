package org.towins.scss.dao;

import org.towins.scss.dto.vo.CourseVoForSelect;

import java.util.List;

/**
 * Created by zhaoqiwang on 2018/1/24.
 */
public interface ShowAllSelectCourseDao {
    List<CourseVoForSelect> queryAllSelectedCourse(long cadreId);
}
