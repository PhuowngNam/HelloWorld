package com.vti.repo;

import com.vti.entity.Department;
import com.vti.entity.Order;
import java.util.List;

public interface IOrderRepo {

    List<Order> getAll();
//
    void create(Order department);
}
