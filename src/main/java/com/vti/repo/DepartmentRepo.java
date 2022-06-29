package com.vti.repo;

import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class DepartmentRepo implements IDepartmentRepo {

    private HibernateUtils hibernateUtils;

    public DepartmentRepo() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Department> getAll() {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<Department> query = session.createQuery("FROM Department");

            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void create(Department department) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            session.save(department);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
