package com.example.exam1.dao;

import com.example.exam1.model.Employe;
import com.example.exam1.model.Project;

public interface IEmployeProjectDAO {
    public void affecterEmployeProject(Employe employe, Project project);
}
