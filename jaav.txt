package flowControl;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Racheal 
 */
public class runer {
    public static void main(String[] args) {
        // Define the runners and their times
        Map<String, Integer> runners = new HashMap<>();
        runners.put("Elena", 341);
        runners.put("Thomas", 273);
        runners.put("Hamilton", 278);
        runners.put("Suzie", 329);
        runners.put("Phil", 445);
        runners.put("Matt", 402);
        runners.put("Alex", 388);
        runners.put("Emma", 275);
        runners.put("John", 243);
        runners.put("James", 334);
        runners.put("Jane", 412);
        runners.put("Emily", 393);
        runners.put("Daniel", 299);
        runners.put("Neda", 343);
        runners.put("Aaron", 317);
        runners.put("Kate", 265);

        // Find the fastest runner
        String fastestRunner = "";
        int fastestTime = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : runners.entrySet()) {
            if (entry.getValue() < fastestTime) {
                fastestTime = entry.getValue();
                fastestRunner = entry.getKey();
            }
        }
        System.out.println("Fastest runner: " + fastestRunner + " - " + fastestTime + " minutes");

        // Find the second fastest runner
        String secondFastestRunner = "";
        int secondFastestTime = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : runners.entrySet()) {
            if (!entry.getKey().equals(fastestRunner) && entry.getValue() < secondFastestTime) {
                secondFastestTime = entry.getValue();
                secondFastestRunner = entry.getKey();
            }
        }
        System.out.println("Second fastest runner: " + secondFastestRunner + " - " + secondFastestTime + " minutes");
    }
}
public class CourseWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Enter base pay of employee1:");
        double basePay = scanner.nextDouble();

        if (basePay < 8.00) {
        System.out.println("Error: Base pay must be at least $8.00");
        }
        System.out.print("Enter hours worked (max 60): ");
        int hoursWorked = scanner.nextInt();
        if (hoursWorked > 60) {
        System.out.println("Error: Hours worked cannot exceed 60");
        }
        
        
        System.out.print("Enter base pay of employee2:");
        double basepay = scanner.nextDouble();

        if (basepay < 8.00) {
        System.out.println("Error: Base pay must be at least $8.00");
        
        System.out.print("Enter hours worked (max 60): ");
        int hoursworked = scanner.nextInt();

        if (hoursworked > 60) {
        System.out.println("Error: Hours worked cannot exceed 60");
        }
        
       
        System.out.print("Enter base pay of employee3:");
         double Basepay = scanner.nextDouble();
        if (basepay < 8.00) {
        System.out.println("Error: Base pay must be at least $8.00");
        
        System.out.print("Enter hours worked (max 60): ");
        int Hoursworked = scanner.nextInt();

        if (hoursworked > 60) {
        System.out.println("Error: Hours worked cannot exceed 60");
         return;
        }
        int regularHours = Math.min(hoursWorked, 40);
        
        
        double regularPay = regularHours * basePay;
        double overtimePay =  basePay * 1.5;
        
        
        double totalPay = regularPay + overtimePay;

        System.out.println("Total pay: $" + totalPay);
        
        }
            }
        
        }
    }