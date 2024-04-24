package com.main.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.main.entity.Doctor;
import com.main.repository.IDoctorRepository;
import com.main.view.IDoctorView;
import com.main.view.IResultView;

@Service("docService")
public class DoctorServiceImp implements IDoctorService 
{
	@Autowired
	private IDoctorRepository repo;

	@Override
	public List<Doctor> getDoctorByName(String docName) 
	{
		 //same purpose all 3
		 //List<Doctor> dList = repo.findByDocName(docName);
		 //List<Doctor> dList = repo.findByDocNameEquals(docName);
		 List<Doctor> dList = repo.findByDocNameIs(docName);
		return dList;
	}

	@Override
	public List<Doctor> getDoctorByDocNameAndDocId(String docName, Integer docId) 
	{
		 
		return repo.findByDocNameAndDocId(docName, docId);
	}

	@Override
	public List<Doctor> getAllDoctorsSalaryGreaterThanAndSalaryLessThan(Float sal1, Float sal2) 
	{
		 
		return repo.findByIncomeGreaterThanAndIncomeLessThan(sal1, sal2);
	}

	@Override
	public List<Doctor> getAllDoctorsByIncomeGreaterThanEqualAndIncomeLessThanEqualAndSpecialization(Float income1, Float income2, String specialization)
	{
		 
		return repo.findByIncomeGreaterThanEqualAndIncomeLessThanEqualAndSpecialization(income1, income2, specialization);
	}

	@Override
	public List<Doctor> getByDocNameOrSpecialization(String name, String specialization) 
	{
		 
		return repo.findByDocNameOrSpecialization(name, specialization);
	}

	@Override
	public List<Doctor> getByDocNameStartingWith(String initChars) 
	{
		
		return repo.findByDocNameStartingWith(initChars);
		
	}

	@Override
	public List<Doctor> getByDocNameEndingWith(String endChars) 
	{
		 
		return repo.findByDocNameEndingWith(endChars);
	}

	@Override
	public List<Doctor> getByIncomeBetween(Float min, Float max) 
	{
		 
		return repo.findByIncomeBetween(min, max);
	}

	@Override
	public List<Doctor> getByDocNameContaining(String chars)
	{
		 
		return repo.findByDocNameContaining(chars);
	}

	@Override
	public List<Doctor> getByDocNameEqualsIgnoreCase(String chars) 
	{
		 
		return repo.findByDocNameEqualsIgnoreCase(chars);
	}

	@Override
	public List<Doctor> getByDocNameContainingIgnoreCase(String chars) 
	{
		 
		return repo.findByDocNameContainingIgnoreCase(chars);
	}

	@Override
	public List<Doctor> getByDocNameLike(String name) 
	{
		 
		return repo.findByDocNameLike(name);
	}

	@Override
	public List<Doctor> getByIncomeOrderBySpecializationDesc(Float sal1)
	{
		 
		return repo.findByIncomeOrderBySpecializationDesc(sal1);
	}

	@Override
	public List<Doctor> getByIncomeOrderBySpecialization(Float sal1) 
	{  
		return repo.findByIncomeOrderBySpecialization(sal1);
	}

	@Override
	public List<IResultView> getBySpecializationIn(List<String> specialization)
	{
		 
		return repo.findBySpecializationIn(specialization);
	}

	@Override
	public List<IDoctorView> getByIncomeIn(List<Float> income)
	{
		 
		return repo.findByIncomeIn(income);
	}
	
	
	
	
	 
	
	
 
}
