package org.towins.scss.entity;

import org.forten.utils.system.CurrentTimeKeyBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "cadre")
public class Cadre implements Serializable {
    @Id
    private long id;
    @NotNull(message = "干部名称不能为空")
    @Column
    private String name;
    @NotNull(message = "工作证不能为空")
    @Column
    private String employee_card;
    @NotNull(message = "性别不能为空")
    @Column
    private String sex;
    @Column
    private String tel;
    @Column
    private String email;

    public Cadre() {
        this.id = CurrentTimeKeyBuilder.getInstance().nextPK();
    }

    public Cadre(long id, @NotNull(message = "干部名称不能为空") String name, @NotNull(message = "工作证不能为空") String employee_card, @NotNull(message = "性别不能为空") String sex, String tel, String email) {
        this();
        this.id = id;
        this.name = name;
        this.employee_card = employee_card;
        this.sex = sex;
        this.tel = tel;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee_card() {
        return employee_card;
    }

    public void setEmployee_card(String employee_card) {
        this.employee_card = employee_card;
    }

    public String getSex() {
        if (sex.equals("男")){
            return sex= "M";
        }else if (sex.equals("女")){
            return sex="F";
        }else {
            return sex;
        }
    }

    public void setSex(String sex) {
        if(sex.equals("M")){
            this.sex="男";
        }else if(sex.equals("F")){
            this.sex= "女";
        }else {
            this.sex = sex;
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cadre cadre = (Cadre) o;

        return id == cadre.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "cadre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employee_card='" + employee_card + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
