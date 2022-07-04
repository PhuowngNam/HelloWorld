package com.vti.entity.multiPK;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserAddressPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "address_id")
    private Integer addressId;

    public UserAddressPK() {
    }

    @Override
    public String toString() {
        return "UserAddressPK{" +
            "userId=" + userId +
            ", addressId=" + addressId +
            '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
