import java.util.Scanner;

 class Linecomparision {

		static double length;
		

		 public static double  length (int x1,int y1,int x2, int y2) {
		
		length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

		return length;
}

		public static  void main (String []args ){

		int x1 , y1 , x2, y2;
		Double  input;
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

			length(x1 ,y1, x2, y2);

			System.out.println("Length of Line1: "+length);
	}
}

