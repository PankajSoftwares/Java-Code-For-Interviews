import java.util.*;

class LargestOfTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        if(num1 != num2) {
            System.out.println(num1 > num2 ? num1 + " is largest Number !" : num2 +" is largest number !");
        }
        else{
            System.out.println("Well, 1st and 2nd numbers are equal!");
        }
    }
}