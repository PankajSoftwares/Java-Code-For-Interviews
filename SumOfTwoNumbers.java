import java.util.*;

class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number n2: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;

        System.out.println("Sum of n1=" + n1 + " & sum of n2=" + n2 + " is: " + sum);
    }

}
