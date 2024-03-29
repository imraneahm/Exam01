package com.example.exam1.dao;

import com.example.exam1.model.Employe;

import jakarta.persistence.* ;
import java.util.List;

public class EmployeDAO implements IEmploye {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void addEmploye(Employe employe) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employe);
        transaction.commit();
    }

    @Override
    public Employe getEmployeById(long id) {
        return entityManager.find(Employe.class, id);
    }

    @Override
    public void removeEmploye(long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Employe employe = entityManager.find(Employe.class, id);
        if (employe != null) {
            entityManager.remove(employe);
        }
        transaction.commit();
    }

    @Override
    public List<Employe> selectAll() {
        Query query = entityManager.createQuery("SELECT e FROM Employe e");
        return query.getResultList();
    }

}
