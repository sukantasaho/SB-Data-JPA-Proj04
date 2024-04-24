package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Doctor;
import com.main.view.IDoctorView;
import com.main.view.IResultView;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer>
{
    public List<Doctor> findByDocName(String name);
    public List<Doctor> findByDocNameEquals(String name);
    public List<Doctor> findByDocNameIs(String name);
    public List<Doctor> findByDocNameAndDocId(String docName, Integer docId);
    public List<Doctor> findByIncomeGreaterThanAndIncomeLessThan(Float income1, Float income2);
    public List<Doctor> findByIncomeGreaterThanEqualAndIncomeLessThanEqualAndSpecialization(Float income1, Float income2, String specialization);
    public List<Doctor> findByDocNameOrSpecialization(String name, String specialization);
    public List<Doctor> findByDocNameStartingWith(String initChars);
    public List<Doctor> findByDocNameEndingWith(String endChars);
    public List<Doctor> findByIncomeBetween(Float min, Float max);
    public List<Doctor> findByDocNameContaining(String chars);
    public List<Doctor> findByDocNameEqualsIgnoreCase(String chars);
    public List<Doctor> findByDocNameContainingIgnoreCase(String chars);
    public List<Doctor> findByDocNameLike(String name);
    public List<Doctor> findByIncomeOrderBySpecializationDesc(Float sal1);
    public List<Doctor> findByIncomeOrderBySpecialization(Float sal1);
    
    public List<IResultView> findBySpecializationIn(List<String> specialization);
    public List<IDoctorView> findByIncomeIn(List<Float> income);
  
}
