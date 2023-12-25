package Department;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class worker {

	private String name;
	private WorkLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	//CONSTRUTORES
	public worker() {
	}
	public worker(String name, WorkLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	
	
	
	
	//GETTERS E SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}
	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

    
	
	
	
    //METODOS
	//ADICIONA CONTRATOS
	public void addContracct(HourContract contract) {
		contracts.add(contract);
	}
	//REMOVE CONTRATOS
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	//CALCULA MES
	public double Income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			 cal.setTime(c.getDate());
			  int c_year = cal.get(Calendar.YEAR);
			  int c_moth = 1 + cal.get(Calendar.MONTH);
			     if(year == c_year && month == c_moth) {
			    	 sum += c.totalValue();
			     }    
		  }
		  return sum;
	}
	
	
	
	
}
