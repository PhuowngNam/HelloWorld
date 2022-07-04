package com.vti.entity;

import com.vti.entity.multiPK.UserAddressPK;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")
public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UserAddressPK id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("addressId")
    @JoinColumn(name = "address_id")
    private Address address;

    @Override
    public String toString() {
        return "UserAddress{" +
            "id=" + id +
            ", user=" + user.getUsername() +
            ", address=" + address.getName() +
            '}';
    }

    public UserAddress() {
    }

    public UserAddressPK getId() {
        return id;
    }

    public void setId(UserAddressPK id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
