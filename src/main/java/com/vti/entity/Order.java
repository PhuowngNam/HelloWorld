package com.vti.entity;

import com.vti.entity.multiPK.OrderPK;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
@IdClass(OrderPK.class)
public class Order implements Serializable  {

    private static final long serialVersionUID = 1L;

    //Cach 1
//    @EmbeddedId
//    private OrderPK id;

    // cách 2
    @Id
    @Column(name = "customer_id")
    private Integer customerId;

    @Id
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "total_money")
    private Double totalMoney;

    public Order() {
    }

//    public OrderPK getId() {
//        return id;
//    }
//
//    public void setId(OrderPK id) {
//        this.id = id;
//    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
