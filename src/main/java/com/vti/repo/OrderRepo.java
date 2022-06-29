package com.vti.repo;

import com.vti.entity.Department;
import com.vti.entity.Order;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class OrderRepo implements IOrderRepo {

    private HibernateUtils hibernateUtils;

    public OrderRepo() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Order> getAll() {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<Order> query = session.createQuery("FROM Order");

            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void create(Order order) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
