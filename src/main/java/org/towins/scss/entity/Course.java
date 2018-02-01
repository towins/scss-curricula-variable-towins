package org.towins.scss.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.forten.utils.system.CurrentTimeKeyBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "course")
public class Course implements Serializable {
    @Id
    long id;
    @Column
    private String name;
    @Column
    private String teacher;
    @Column
    private String intro;
    @Column
    private String service_teacher;
    @Column
    private String service_teacher_tel;
    @Column
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date begin_teach_time;
    @Column
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date end_teach_time;
    @Column
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date begin_select_time;
    @Column
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date end_select_time;
    @Column
    private String classroom;
    @Column
    private int max_amount;
    @Column
    private int current_amount;
    @Column
    private int credit;
    @Column
    private String status;

    public Course() {
        this.id = CurrentTimeKeyBuilder.getInstance().nextPK();
        this.current_amount = 0 ;
        this.status="AC";
    }

    public Course(long id, String name, String teacher, String intro, String service_teacher, String service_teacher_tel, Date begin_teach_time, Date end_teach_time, Date begin_select_time, Date end_select_time, String classroom, int max_amount, int current_amount, int credit, String status) {
        this();
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.intro = intro;
        this.service_teacher = service_teacher;
        this.service_teacher_tel = service_teacher_tel;
        this.begin_teach_time = begin_teach_time;
        this.end_teach_time = end_teach_time;
        this.begin_select_time = begin_select_time;
        this.end_select_time = end_select_time;
        this.classroom = classroom;
        this.max_amount = max_amount;
        this.current_amount = current_amount;
        this.credit = credit;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getIntro() {
        return intro;
    }

    public String getService_teacher() {
        return service_teacher;
    }

    public String getService_teacher_tel() {
        return service_teacher_tel;
    }

    public Date getBegin_teach_time() {
        return begin_teach_time;
    }

    public Date getEnd_teach_time() {
        return end_teach_time;
    }

    public Date getBegin_select_time() {
        return begin_select_time;
    }

    public Date getEnd_select_time() {
        return end_select_time;
    }

    public String getClassroom() {
        return classroom;
    }

    public int getMax_amount() {
        return max_amount;
    }

    public int getCurrent_amount() {
        return current_amount;
    }

    public int getCredit() {
        return credit;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setService_teacher(String service_teacher) {
        this.service_teacher = service_teacher;
    }

    public void setService_teacher_tel(String service_teacher_tel) {
        this.service_teacher_tel = service_teacher_tel;
    }

    public void setBegin_teach_time(Date begin_teach_time) {
        this.begin_teach_time = begin_teach_time;
    }

    public void setEnd_teach_time(Date end_teach_time) {
        this.end_teach_time = end_teach_time;
    }

    public void setBegin_select_time(Date begin_select_time) {
        this.begin_select_time = begin_select_time;
    }

    public void setEnd_select_time(Date end_select_time) {
        this.end_select_time = end_select_time;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setMax_amount(int max_amount) {
        this.max_amount = max_amount;
    }

    public void setCurrent_amount(int current_amount) {
        this.current_amount = current_amount;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return id == course.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", intro='" + intro + '\'' +
                ", service_teacher='" + service_teacher + '\'' +
                ", service_teacher_tel='" + service_teacher_tel + '\'' +
                ", begin_teach_time=" + begin_teach_time +
                ", end_teach_time=" + end_teach_time +
                ", begin_select_time=" + begin_select_time +
                ", end_select_time=" + end_select_time +
                ", classroom='" + classroom + '\'' +
                ", max_amount=" + max_amount +
                ", current_amount=" + current_amount +
                ", credit=" + credit +
                ", status='" + status + '\'' +
                '}';
    }
}
