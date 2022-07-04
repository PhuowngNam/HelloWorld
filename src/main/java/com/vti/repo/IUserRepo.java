package com.vti.repo;

import com.vti.entity.Order;
import com.vti.entity.User;
import java.util.List;

public interface IUserRepo {
    List<User> getAll();
    //
    void create(User user);
}
