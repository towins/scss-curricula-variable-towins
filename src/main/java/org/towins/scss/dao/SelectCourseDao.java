package org.towins.scss.dao;

import org.towins.scss.dto.vo.SelectInfoVoForWrite;

public interface SelectCourseDao {
    void selectCourse(SelectInfoVoForWrite vo);
    void addOneCurrentAmount(long courseId);

    void cancelCourse(long cadreId, long courseId);

    void subOneCurrentAmount(long courseId);

    Long queryPD2XK(long courseId);
}
