package com.vti.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "contractemployee")
public class ContractEmployee extends Employee {

    @Column(name = "pay_per_hour")
    private Integer payPerHour;

    @Column(name = "contract_duration")
    private String contractDuration;

    public ContractEmployee() {
    }

    public Integer getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(Integer payPerHour) {
        this.payPerHour = payPerHour;
    }

    public String getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(String contractDuration) {
        this.contractDuration = contractDuration;
    }
}
