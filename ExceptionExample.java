import java.util.Scanner;

class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
