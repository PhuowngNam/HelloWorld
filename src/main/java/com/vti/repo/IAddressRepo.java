package com.vti.repo;

import com.vti.entity.Address;
import com.vti.entity.User;
import java.util.List;

public interface IAddressRepo {
    List<Address> getAll();
    void create(Address address);
}
