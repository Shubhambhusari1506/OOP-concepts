public class empwage {

		//Constant

		public static final int IS_FULL_TIME = 1;
		
		public static final int IS_PART_TIME = 2;
		
		public static final int emp_wage_per_hr = 20;
		
		public static final int days_in_month = 20;
		
		static int totalempwage;
		
		public static int calwage(){
		
		for (int day = 1; day <= days_in_month; day++){
		
		//variables
		
		int emphrs, empwage; 
		
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		
		if (empCheck == IS_FULL_TIME) {
	
			emphrs = 8;
	
		}else if (empCheck == IS_PART_TIME) {
		
	
		emphrs = 4;
	
		}else {
	
		emphrs = 0;

	}
	
		empwage = emphrs * emp_wage_per_hr;
	
			totalempwage += empwage;
	
			System.out.println("Employee day " + day + " Wage : "+empwage);
	
		}
		
		return totalempwage;

}
		public static void main(String[] args){

	
 		calwage();
		System.out.println("Total Employee Wage : " +totalempwage);
	}		
}	
