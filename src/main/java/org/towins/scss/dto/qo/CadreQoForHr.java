package org.towins.scss.dto.qo;

public class  CadreQoForHr {
    private String name;
    private String employee_card;
    private int first;
    private int pageNo;
    private int pageSize;

    public CadreQoForHr() {
    }

    public CadreQoForHr(String name, String employee_card, int first, int pageNo, int pageSize) {
        this.name = name;
        this.employee_card = employee_card;
        this.first = first;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
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

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "CadreQoForHr{" +
                "name='" + name + '\'' +
                ", employee_card='" + employee_card + '\'' +
                ", first=" + first +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}
