import java.util.*;

class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number.: ");
        if (!sc.hasNextInt()) {
            System.out.println("Warning! Please, Enter a valid number.");
            return;
        }
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

            //To know the factorial of each i or n
            //System.out.println("Factorial of "+i+" is: "+fact);
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}