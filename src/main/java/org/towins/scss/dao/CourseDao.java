package org.towins.scss.dao;

import org.towins.scss.dto.qo.CourseQoForTeacher;
import org.towins.scss.dto.vo.CourseForTeacher;

import java.util.List;

public interface CourseDao {
    List<CourseForTeacher> queryForTeacher(CourseQoForTeacher qo);

}
