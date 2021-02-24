import java.util.Scanner;

 class Linecomparision {

		static Double length, length1;
		static int x1,y1,x2,y2,w1,z1,w2,z2;
		

		 public static void  length () {
		
		length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		length1 = Math.sqrt(((w2 - w1) * (w2 - w1)) + ((z2 - z1) * (z2 - z1)));

		
}



		static void compare() {
		boolean result = length.equals(length1);

		int compare = length.compareTo(length1);
		if(result) {
		System.out.println("Line1 and Line2 are equal in Length");
		}
		else {
		if (compare > 0){		
		System.out.println("Line1 is greater than Line2 are  equal in Length");
	

		}
		else{
		System.out.println("Line1 is less than Line2 are  equal in Length");
		}

 }
}
		public static void input () {

		int x1 , y1 , x2, y2;
		int w1, z1, w2,z2;
		Scanner s = new Scanner(System.in);

		System.out.println("Co-ordinates for Line1");
			System.out.println("Enter x1: ");
			x1 = s.nextInt();
			System.out.println("Enter y1: ");
			y1 = s.nextInt();
			System.out.println("Enter x2: ");
			x2 = s.nextInt();
			System.out.println("Enter y2: ");
			y2 = s.nextInt();


		 System.out.println("Co-ordinates for Line2");

			System.out.println("Enter w1: ");
         w1 = s.nextInt();
         System.out.println("Enter z1: ");
         z1 = s.nextInt();
         System.out.println("Enter w2: ");
         w2 = s.nextInt();
         System.out.println("Enter z2: ");
         z2 = s.nextInt();
						
			}

			
			public static void main(String [] args){

			input();
			length();
			System.out.println("Length of Line1: "+length);
			System.out.println("length of line2:"+length1);

				compare();

	}
 }

