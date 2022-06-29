package com.vti;

import com.vti.entity.Department;
import com.vti.repo.DepartmentRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Group;

public class TestProgram {
	
	public static void main(String[] args) {
		DepartmentRepo departmentRepo = new DepartmentRepo();

		// create department
//		Department department = new Department();
//		department.setName("Developer");
//		departmentRepo.create(department);

		// get all
		System.out.println(departmentRepo.getAll());
	}
}
