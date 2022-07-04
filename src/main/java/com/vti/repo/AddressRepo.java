package com.vti.repo;

import com.vti.entity.Address;
import com.vti.entity.User;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class AddressRepo implements IAddressRepo {

    private HibernateUtils hibernateUtils;

    public AddressRepo() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Address> getAll() {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<Address> query = session.createQuery("FROM Address");

            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void create(Address address) {

    }
}
