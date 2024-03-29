package com.example.exam1.dao;

import com.example.exam1.model.Employe;

import java.util.List;

public interface IEmploye {
    public void addEmploye(Employe employe) ;
    public Employe getEmployeById(long id) ;
    public void removeEmploye(long id) ;
    List<Employe> selectAll() ;
}
