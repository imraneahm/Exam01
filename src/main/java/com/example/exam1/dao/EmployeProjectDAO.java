package com.example.exam1.dao;

import com.example.exam1.model.Employe;
import com.example.exam1.model.EmployeProject;

import com.example.exam1.model.Project;
import jakarta.persistence.*;

public class EmployeProjectDAO implements IEmployeProjectDAO {
    EmployeProject employeProject = new EmployeProject();
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void addEmployeProject(EmployeProject employeProject) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employeProject);
        transaction.commit();
    }

    @Override
    public void affecterEmployeProject(Employe employe, Project project) {

        EmployeProject employeProject = new EmployeProject();
        employeProject.setEmploye(employe);
        employeProject.setProject(project);
        employeProject.setTaux(employeProject.getTaux());

        addEmployeProject(employeProject);
    }

    public String toStringByEmploye(Employe employe){
        return "EmployeProject{" +
                "project=" + employe.getProjects() +
                ", taux=" + employeProject.getTaux() +
                '}';

    }
}
