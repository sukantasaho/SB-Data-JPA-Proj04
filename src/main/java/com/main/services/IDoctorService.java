package com.main.services;
import java.util.List;
import com.main.entity.Doctor;
import com.main.view.IDoctorView;
import com.main.view.IResultView;

public interface IDoctorService 
{
      public List<Doctor> getDoctorByName(String docName);
      public List<Doctor> getDoctorByDocNameAndDocId(String docName, Integer docId);
      public List<Doctor> getAllDoctorsSalaryGreaterThanAndSalaryLessThan(Float sal1, Float sal2);
      public List<Doctor> getAllDoctorsByIncomeGreaterThanEqualAndIncomeLessThanEqualAndSpecialization(Float income1, Float income2, String specialization);
      public List<Doctor> getByDocNameOrSpecialization(String name, String specialization);
      public List<Doctor> getByDocNameStartingWith(String initChars);
      public List<Doctor> getByDocNameEndingWith(String endChars);
      public List<Doctor> getByIncomeBetween(Float min, Float max);
      public List<Doctor> getByDocNameContaining(String chars);
      public List<Doctor> getByDocNameEqualsIgnoreCase(String chars);
      public List<Doctor> getByDocNameContainingIgnoreCase(String chars);
      public List<Doctor> getByDocNameLike(String name);
      public List<Doctor> getByIncomeOrderBySpecializationDesc(Float sal1);
      public List<Doctor> getByIncomeOrderBySpecialization(Float sal1);
      public List<IResultView> getBySpecializationIn(List<String> specialization);
      public List<IDoctorView> getByIncomeIn(List<Float> income);
}
