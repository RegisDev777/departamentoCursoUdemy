package Department;

import java.util.Date;

public class HourContract {

 	    private Date date;
 	    private double ValuePerHour;
	    private Integer  hours;
	    
	    
	    //CONSTRUTORES

		public HourContract(Date date, double valuePerHour, Integer hours) {
			this.date = date;
			ValuePerHour = valuePerHour;
			this.hours = hours;
		}

		
		//GETTERS E SETTERS
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}

		public double getValuePerHour() {
			return ValuePerHour;
		}
		public void setValuePerHour(double valuePerHour) {
			ValuePerHour = valuePerHour;
		}
	
		public Integer getHours() {
			return hours;
		}
		public void setHours(Integer hours) {
			this.hours = hours;
		}
	    
	    
 	    //METODOS
		public double totalValue() {
			return ValuePerHour * hours;
		}
 	    
}
