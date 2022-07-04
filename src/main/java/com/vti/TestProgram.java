package com.vti;

import com.vti.entity.Department;
import com.vti.entity.Order;
import com.vti.entity.enumtype.DepartmentLevel;
import com.vti.entity.enumtype.DepartmentSize;
import com.vti.entity.enumtype.DepartmentStatus;
import com.vti.entity.multiPK.OrderPK;
import com.vti.repo.AddressRepo;
import com.vti.repo.DepartmentRepo;
import com.vti.repo.IAddressRepo;
import com.vti.repo.IUserRepo;
import com.vti.repo.OrderRepo;
import com.vti.repo.UserRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Group;

public class TestProgram {
	
	public static void main(String[] args) {
//		DepartmentRepo departmentRepo = new DepartmentRepo();

		// create department
//		Department department = new Department();
//		department.setName("BA");
//		department.setStatus(DepartmentStatus.REJECT);
//		department.setLevel(DepartmentLevel.FRESHER);
//		department.setSize(DepartmentSize.MEDIUM);
//		departmentRepo.create(department);

		// get all
//		System.out.println(departmentRepo.getAll());

		//		DepartmentRepo departmentRepo = new DepartmentRepo();

		// ======== tạo order
		// cách 1
		// Tạo dữ liệu cho khóa chính
//		OrderPK id = new OrderPK();
//		id.setCustomerId(1);
//		id.setProductId(2);
//
//		OrderRepo orderRepo = new OrderRepo();
//		// create order
//		Order order = new Order();
//		order.setId(id);
//		order.setTotalMoney(1000.0);
//
//		orderRepo.create(order);

		//cách 2

//		OrderRepo orderRepo = new OrderRepo();
//		// create order
//		Order order = new Order();
//		order.setCustomerId(2);
//		order.setProductId(2);
//		order.setTotalMoney(1000.0);
//
//		orderRepo.create(order);


		//test one to one
//		IUserRepo userRepo = new UserRepo();
//		System.out.println("all user");
//		userRepo.getAll().forEach(System.out::println);


		//test one to many: 1 address co nhieu user
		IAddressRepo addressRepo = new AddressRepo();
		addressRepo.getAll().forEach(System.out::println);
	}
}
