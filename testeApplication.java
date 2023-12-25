package Department;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class testeApplication {
  
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name:");
		 String departmentName = sc.nextLine();
		     System.out.println();
		     
		System.out.println("Enter Worker data:"); 
		System.out.print("Name:");
		 String Workername = sc.nextLine();
		System.out.print("Level:");
		 String workerlevel = sc.nextLine().toLowerCase();
		System.out.print("Base salary:");
		 double baseSalary = sc.nextDouble();
		
		 worker w1 = new worker(Workername, WorkLevel.valueOf(workerlevel), baseSalary, new Department(departmentName));
		
		 System.out.print("How many contracts to this worker? ");
		  int n = sc.nextInt();
		 
		  for (int i = 1; i <= n ; i++) {
			  System.out.println("Enter contract #" + i + " data:");
               System.out.print("Date (DD/MM/YYYY) : ");
                 Date contractDate  = sfd.parse(sc.next());
               System.out.print("Value per hour:");
                 double valueperhour = sc.nextDouble();
               System.out.println("Duration (Hours): ");
                 int hours = sc.nextInt();
                 
                HourContract contract = new HourContract(contractDate, valueperhour, hours);
                
                w1.addContracct(contract);
			
		   }
		 
		    System.out.println();
		    System.out.println("Enter month and year to calculate income (MM/yyyy): ");
		    String monthAndYear = sc.next();
		 
		    int month = Integer.parseInt(monthAndYear.substring(0, 2));
		    int year  = Integer.parseInt(monthAndYear.substring(3));
		    
		    System.out.println("Name: "  +  w1.getName());
		    System.out.println("Department: " +  w1.getDepartment().getName());
		    System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", w1.Income(year, month)));
		    
		    
		sc.close();
	}

}
