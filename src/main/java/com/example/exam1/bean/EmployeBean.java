package com.example.exam1.bean;

import com.example.exam1.dao.EmployeDAO;
import com.example.exam1.dao.EmployeProjectDAO;
import com.example.exam1.dao.ProjectDAO;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class EmployeBean {
    public EmployeProjectDAO employeProjectDAO = new EmployeProjectDAO();

    public EmployeDAO getEmployeDAO() {
        return employeDAO;
    }

    public void setEmployeDAO(EmployeDAO employeDAO) {
        this.employeDAO = employeDAO;
    }

    EmployeDAO employeDAO = new EmployeDAO() ;

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }

    public void setProjectDAO(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }

    ProjectDAO projectDAO = new ProjectDAO() ;


}
