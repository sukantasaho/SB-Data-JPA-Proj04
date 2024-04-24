package com.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.services.IDoctorService;

@SpringBootApplication
public class SbDataJpaProj03Application
{

	public static void main(String[] args) 
	{
		   ApplicationContext ctx = SpringApplication.run(SbDataJpaProj03Application.class, args);
		   IDoctorService service = ctx.getBean("docService", IDoctorService.class);
		   //invoke the business logic
		    
		   //fetch doctor record by doctor name
			/*service.getDoctorByName("Dr Burma").forEach(System.out::print);*/
		   
		   //fetch doctor record by doctor name and doctor id
			/*long c = service.getDoctorByDocNameAndDocId("Saroj", 10044).stream().count();
			System.out.println("total doctor record found - "+c);
			service.getDoctorByDocNameAndDocId("Saroj", 10044).forEach(System.out::print);*/
		   
		       //fetch doctor record where applied condition
			/* service.getAllDoctorsSalaryGreaterThanAndSalaryLessThan(23000f, 40000f).forEach(System.out::print);*/
		   
		     //fetch doctor records where applied condition
			/*service.getAllDoctorsByIncomeGreaterThanEqualAndIncomeLessThanEqualAndSpecialization(23000f, 40000f, "Dermitology").forEach(System.out::print);*/
		    
		     //fetch doctor records where applied condition
				/*service.getByDocNameOrSpecialization("SK Sahoo", "Nurology").forEach(System.out::println);*/
		       
		         //fetch doctors whose name starting with Dr
				/*service.getByDocNameStartingWith("Dr").forEach(System.out::println);*/
		   
		         //fetch doctors whose name ending with oo
				/*service.getByDocNameEndingWith("oo").forEach(System.out::println);*/
		        
		         //fetch doctors whose name containing with Sa
				/*service.getByDocNameContaining("Sa").forEach(System.out::println);*/
		        
		           //fetch doctors whose name containing ignore case with Sa
				/*service.getByDocNameContainingIgnoreCase("aho").forEach(System.out::println);*/
		         
		           //fetch doctors whose salary range between 40000 to 60000
				/*service.getByIncomeBetween(40000f, 60000f).forEach(System.out::println);*/
		         
		        //fetch doctors by passing value in like
				/*service.getByDocNameLike("HK%").forEach(System.out::println);*/
		   
		         //fetch record sorting with desc(Specialization)
				/*service.getByIncomeOrderBySpecializationDesc(23000f).forEach(System.out::println);*/
		   
		          //fetch record sorting with asc(Specialization)
				/*service.getByIncomeOrderBySpecialization(23000f).forEach(System.out::println);*/
		   
		          //display doctor record specific columns scalar projection operation
				/*service.getBySpecializationIn(List.of("Urology","Surgery-1")).forEach(doc->System.out.println(doc.getDocName()+"  "+doc.getIncome()));*/
		   
		         //display doctor record specific columns scalar projection operation
				/*service.getByIncomeIn(List.of(23000f,43000f)).forEach(doc->System.out.println(doc.getDocId()+"  "+doc.getDocName()+"  "+doc.getIncome()));;*/
		   ((ConfigurableApplicationContext) ctx).close();
	}

}
