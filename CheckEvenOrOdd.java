import java.util.*;

class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number: ");
        int a = sc.nextInt();
        System.out.print(a % 2 == 0 ? a + " is even" : a + " is odd number");
        }
    }