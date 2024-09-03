import java.util.Scanner;
public class payCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String empName = in.nextLine();
        System.out.println("Enter the Pay rate: ");
        float empPayRate = in.nextFloat();
        System.out.println("Enter the Hours Worked");
        float empHrs = in.nextFloat();
        double payCheck = 0;
        if (empHrs > 40){
            payCheck = (40 * empPayRate) + ((empHrs-40)*1.5*empPayRate);
        }

        else{
            payCheck = (empHrs * empPayRate);
        }
         
        System.out.printf("Paycheck for " + empName + " %.2f", payCheck);
    }
}
