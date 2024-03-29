package com.example.exam1.dao;

import com.example.exam1.model.Employe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ProjectDAO implements IProject{
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    @Override
    public List<Employe> selectAllProjects() {
        Query query = entityManager.createQuery("SELECT p FROM Project p");
        return query.getResultList();
    }


}
