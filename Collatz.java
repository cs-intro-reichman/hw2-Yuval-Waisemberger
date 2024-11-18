// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1].toLowerCase();

		for (int i=1; i <= N; i++){
			int seed = i;
			// countIterations will count the number of steps the program takes to reach 1.
			int countIterations = 1;
			do {
				if (mode.equals("v")) {
					System.out.print(seed + " ");
				}
				if (seed % 2 == 0) {
					seed /= 2;
				} else {
					seed = (seed * 3) + 1;
				}
				countIterations ++;
			}
			while (seed != 1);
			// 	The program will display the sequence from  
				if (mode.equals("v")) {
					System.out.print(seed + " (" + countIterations + ")");
					System.out.println();
			}
			countIterations ++;
		}

		// In the exercise we assumed that the inputs are valid- only 'v' or 'c'.
		// The program will print a summary line for both options.
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		
	}
}
