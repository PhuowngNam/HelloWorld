package com.vti.entity.dto;

import javax.persistence.Column;

public class UpdateRegularEmployeeDTO {

    private String name;

    private Integer salary;

    private Integer bonus;

    public UpdateRegularEmployeeDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public UpdateRegularEmployeeDTO name(String name) {
        this.name = name;
        return this;
    }

    public UpdateRegularEmployeeDTO salary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public UpdateRegularEmployeeDTO bonus(Integer bonus) {
        this.bonus = bonus;
        return this;
    }
}
