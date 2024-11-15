public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = ((hours * 60) + minutes + minutesToAdd);
        int totalHours = (totalMinutes / 60);

        int newHours = (totalHours % 24);
        int newminutes = (totalMinutes - (totalHours * 60));
        
        // Program checks whether the new hours and minutes are ones or tens,
		// and prints '0' if needed.
        if (newHours < 10) {
            if (newminutes < 10) {
                System.out.println("0" + newHours + ":" + "0" + newminutes);
            } else {
                System.out.println("0" + newHours + ":" + newminutes);
            }
        } else {
            if (newminutes < 10) {
                System.out.println(newHours + ":" + "0" + newminutes);
            } else {
                System.out.println(newHours + ":" + newminutes);
            } 
        }

    }
}
