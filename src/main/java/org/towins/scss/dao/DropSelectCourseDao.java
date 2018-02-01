package org.towins.scss.dao;

import org.towins.scss.dto.vo.CourseVoForSelect;

import java.util.List;

public interface DropSelectCourseDao {
   List<CourseVoForSelect> queryForDropSelect(long cadreId);
}
