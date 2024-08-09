[8:59 م، 2024/8/9] Joker 😎: public class CourseWork {

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
        System.out.println("Error: Base pay must be at l…
[9:00 م، 2024/8/9] Joker 😎: package flowControl;
import java.util.Map;
import java.util.HashMap;


 @author Racheal 
 
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
        runn…