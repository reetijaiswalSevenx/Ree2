package io.sevenx;

import io.sevenx.d.Developer;
import io.sevenx.d.Employee;
import io.sevenx.d.Hr;


public class MoEmployeManagement {
	public static void main(String[] args) {
		System.out.println("");
	
		Employee employee = new Employee("Reeti","Jaiswal");
		employee.setBaseSalary(12500);
		System.out.println(" Display Name: "+ employee.getFirstName() + " " + employee.getLastName());
		System.out.println("Employee Id:"+ employee.getEmployeeId());
		System.out.println("Email:" + employee.getEmail());
		System.out.println("Basic Salary: "+ employee.getBaseSalary());
		
		Developer developer = new Developer();
		developer.setFirstName("Ved");
		developer.setLastName("Jaiswal");
		developer.setBaseSalary(12500);
		developer.setprojectBonus(2000);
		
		System.out.println(" Display Name: "+ developer.getFirstName() + " " + developer.getLastName());
		System.out.println("Employee Id:"+ developer.getEmployeeId());
		System.out.println("Email:" + developer.getEmail());
		System.out.println("Basic Salary: "+ developer.getSalary());
		
		Hr hr = new Hr();
		hr.setFirstName("Meenu");
		hr.setLastName("Shah");
		hr.setBaseSalary(12500);
		System.out.println(" Display Name: "+ hr.getFirstName() + " " + hr.getLastName());
		System.out.println("Employee Id:"+ hr.getEmployeeId());
		System.out.println("Email:" + hr.getEmail());
		System.out.println("Basic Salary: "+ hr.getSalary());
		
		
		}
	}
	

	

 