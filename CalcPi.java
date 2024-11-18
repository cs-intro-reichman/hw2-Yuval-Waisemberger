// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sumPI = 0;
		double denominator = 3;
		
		// Program iterates {num} times - each time it's updating the final sumPI,
		// and the denominator of the fraction
		for (int i = 0; i < num; i++) {
			if(i == 0) {
				sumPI ++;
			} else {
				if (i % 2 == 0) {
					sumPI = sumPI + (1 / denominator);
				} else {
					sumPI = sumPI - (1 / denominator);
				}
				denominator = denominator + 2 ;
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (4 * sumPI));
	}
}
