package org.towins.scss.dto.vo;

import javax.validation.constraints.NotNull;

public class CadreForHr2 {
    long id;
    @NotNull(message = "干部名称不能为空")
    private String name;
    @NotNull(message = "工作证不能为空")
    private String employee_card;
    @NotNull(message = "性别不能为空")
    private String sex;
    private String tel;
    private String email;

    public CadreForHr2() {
    }

    public CadreForHr2(long id, String name, String employee_card, String sex, String tel, String email) {
        this.id = id;
        this.name = name;
        this.employee_card = employee_card;
        setSex(sex);
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
            return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("男")){
            this.sex="M";
        }else if(sex.equals("女")){
            this.sex= "F";
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

    public String getIdStr() {
        return id + "";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CadreForHr2 that = (CadreForHr2) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "CadreForHr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employee_card='" + employee_card + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
