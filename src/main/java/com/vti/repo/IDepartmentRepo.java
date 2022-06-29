package com.vti.repo;

import com.vti.entity.Department;
import java.util.List;

public interface IDepartmentRepo {

    List<Department> getAll();
//
//    Department getOne();
//
    void create(Department department);
//
//    void update(Department department);
//
//    void delete(Integer departmentId);
//
//    Boolean checkExistsById(Integer departmentId);
//
//    Boolean checkExistsByName(String departmentName);
}
