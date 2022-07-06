package com.vti.repo;

import com.vti.entity.Employee;
import com.vti.entity.RegularEmployee;
import com.vti.entity.dto.UpdateRegularEmployeeDTO;
import com.vti.utils.HibernateUtils;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class RegularEmployeeRepo implements IRegularEmployeeRepo {

    private final HibernateUtils hibernateUtils;

    public RegularEmployeeRepo() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<RegularEmployee> getAlls() {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<RegularEmployee> query = session.createQuery("FROM RegularEmployee ");

            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public RegularEmployee getOne(Integer id) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<RegularEmployee> query = session
                .createQuery("FROM RegularEmployee re where re.id = :id");

            query.setParameter("id", id);
            return query.uniqueResult();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<RegularEmployee> getByName(String name) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<RegularEmployee> query = session
                .createQuery("FROM RegularEmployee re where re.name like :name");

            query.setParameter("name", "%" + name + "%");
            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void update(Integer id, UpdateRegularEmployeeDTO updateRegularEmployeeDTO) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            session.beginTransaction();

            // cách theo hql
//            String hql = "UPDATE RegularEmployee SET name=:newName, salary =:newSalary, bonus =:newBonus WHERE id = :id";
//
//            Query<RegularEmployee> query = session.createQuery(hql);
//            query.setParameter("newName", updateRegularEmployeeDTO.getName());
//            query.setParameter("newSalary", updateRegularEmployeeDTO.getSalary());
//            query.setParameter("newBonus", updateRegularEmployeeDTO.getBonus());
//            query.setParameter("id", id);
//
//            query.executeUpdate();

            //spring
            //cách 2
            session.update(
                new RegularEmployee()
                    .salary(updateRegularEmployeeDTO.getSalary())
                    .bonus(updateRegularEmployeeDTO.getBonus())
                    .id(id)
                    .name(updateRegularEmployeeDTO.getName()));
            session.getTransaction().commit();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<RegularEmployee> getAllsWithPage(Integer page, Integer size) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<RegularEmployee> query = session.createQuery("FROM RegularEmployee");

            query.setFirstResult((page - 1) * size);
            query.setMaxResults(size);

            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<RegularEmployee> getByNameAndSalaryGreaterThan(String name, Integer salary) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<RegularEmployee> criteria = builder.createQuery(RegularEmployee.class);
            Root<RegularEmployee> root = criteria.from(RegularEmployee.class);

            Predicate where = builder.and(
                builder.like( root.get("name"), "%" + name + "%"),
                builder.greaterThan( root.get("salary"), salary)
            );

            criteria.select(root).where(where);

            TypedQuery<RegularEmployee> query = session.createQuery(criteria);

            return query.getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
