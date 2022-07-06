package com.vti.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "regularemployee")
public class RegularEmployee extends Employee {

    private static final long serialVersionUID = 1L;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "bonus")
    private Integer bonus;

    public RegularEmployee() {
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

    @Override
    public String toString() {
        return "RegularEmployee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            ", bonus=" + bonus +
            '}';
    }

    public RegularEmployee salary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public RegularEmployee bonus(Integer bonus) {
        this.bonus = bonus;
        return this;
    }
}
