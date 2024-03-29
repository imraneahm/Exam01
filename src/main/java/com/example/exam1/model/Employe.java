package com.example.exam1.model;

import com.example.exam1.dao.EmployeProjectDAO;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employe_project",
            joinColumns = @JoinColumn(name = "employe_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> projects;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void removeEmploye(long id) {
         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
         EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Employe employe = entityManager.find(Employe.class, id);
        if (employe != null) {
            entityManager.remove(employe);
        }
        transaction.commit();
    }
}
