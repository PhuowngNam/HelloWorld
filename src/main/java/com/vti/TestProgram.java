package com.vti;

import com.vti.entity.Department;
import com.vti.entity.Order;
import com.vti.entity.User;
import com.vti.entity.dto.UpdateRegularEmployeeDTO;
import com.vti.entity.enumtype.DepartmentLevel;
import com.vti.entity.enumtype.DepartmentSize;
import com.vti.entity.enumtype.DepartmentStatus;
import com.vti.entity.multiPK.OrderPK;
import com.vti.repo.AddressRepo;
import com.vti.repo.DepartmentRepo;
import com.vti.repo.IAddressRepo;
import com.vti.repo.IRegularEmployeeRepo;
import com.vti.repo.IUserRepo;
import com.vti.repo.OrderRepo;
import com.vti.repo.RegularEmployeeRepo;
import com.vti.repo.UserRepo;
import java.util.List;
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
//		IAddressRepo addressRepo = new AddressRepo();
//		addressRepo.getAll().forEach(System.out::println);

        // test many to many
//		IUserRepo userRepo = new UserRepo();d
//		List<User> userList = userRepo.getAll();
//		userList.forEach(System.out::println);

        // Bai 4
        // Test inheritance: single table
//		IRegularEmployeeRepo repo = new RegularEmployeeRepo();
//		System.out.println(repo.getAlls());;

        //get one
        IRegularEmployeeRepo repo = new RegularEmployeeRepo();
//        System.out.println(repo.getOne(1));
//        get by name
//        System.out.println(repo.getByName("nam"));
//
//        repo.update(
//        	1,
//			new UpdateRegularEmployeeDTO()
//				.name("Dung Ha")
//				.salary(10000)
//				.bonus(10));
//
//        System.out.println(repo.getOne(1));

        //get all with page
//        repo.getAllsWithPage(2, 5).forEach(System.out::println);

        System.out.println(repo.getByNameAndSalaryGreaterThan("an", 200));

    }
}
