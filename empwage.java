public class empwage {

		//Constant
		public static final int IS_PRESENT = 1;
		public static final int emp_wage_per_hr = 20;

		public static void calwage(){

		//variables
		int emphrs,empwage;
		int empCheck =(int) Math.floor(Math.random() * 10) % 2;
		switch (empCheck) {
		case IS_PRESENT :
		System.out.println("Employee is Present");
		emphrs = 8;
		break;
		default :
		System.out.println("Employee is Absent");
		emphrs = 0;
		}
		empwage = emphrs * emp_wage_per_hr;
		System.out.println("employee  daily wage  " +empwage);

	}


		public static void main(String[] args){

	
 		calwage();
	}		
}	
