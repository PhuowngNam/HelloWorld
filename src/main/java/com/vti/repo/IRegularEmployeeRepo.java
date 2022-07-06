package com.vti.repo;

import com.vti.entity.RegularEmployee;
import com.vti.entity.dto.UpdateRegularEmployeeDTO;
import java.util.List;

public interface IRegularEmployeeRepo {

    List<RegularEmployee> getAlls();

    RegularEmployee getOne(Integer id);

    List<RegularEmployee> getByName(String name);

    void update(Integer id, UpdateRegularEmployeeDTO updateRegularEmployeeDTO);

    List<RegularEmployee> getAllsWithPage(Integer page, Integer size);

    List<RegularEmployee> getByNameAndSalaryGreaterThan(String name, Integer salary);
}
