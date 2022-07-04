package com.vti.repo;

import com.vti.entity.Order;
import com.vti.entity.User;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UserRepo implements IUserRepo {

    private HibernateUtils hibernateUtils;

    public UserRepo() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<User> getAll() {

        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<User> query = session.createQuery("FROM User");

            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void create(User user) {

    }
}
