package com.vti.utils;

import com.vti.entity.Address;
import com.vti.entity.ContractEmployee;
import com.vti.entity.Employee;
import com.vti.entity.Group;
import com.vti.entity.Order;
import com.vti.entity.RegularEmployee;
import com.vti.entity.User;
import com.vti.entity.UserAddress;
import com.vti.repo.RegularEmployeeRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Department;

public class HibernateUtils {

    private static HibernateUtils instance;

    private Configuration configuration;
    private SessionFactory sessionFactory;

    public static HibernateUtils getInstance() {
        if (null == instance) {
            instance = new HibernateUtils();
        }
        return instance;
    }

    private HibernateUtils() {
        configure();
    }

    private void configure() {
        // load configuration
        configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        // add entity
        configuration.addAnnotatedClass(Department.class);
        configuration.addAnnotatedClass(Group.class);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(UserAddress.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(RegularEmployee.class);
        configuration.addAnnotatedClass(ContractEmployee.class);
    }

    private SessionFactory buildSessionFactory() {
        if (null == sessionFactory || sessionFactory.isClosed()) {
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }

        return sessionFactory;
    }

    public void closeFactory() {
        if (null != sessionFactory && sessionFactory.isOpen()) {
            sessionFactory.close();
        }
    }

    public Session openSession() {
        buildSessionFactory();
        return sessionFactory.openSession();
    }

}
