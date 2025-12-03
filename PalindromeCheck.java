import java.util.*;

class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int num = sc.nextInt();

        int t = num, revNum = 0;

        while (num != 0) {
            revNum = revNum * 10 + num % 10;
            num /= 10;
        }

        if (t == revNum) {
            System.out.println(t + " It is a palindrome number!");
        } else {
            System.out.println(t + " It is not a palindrome number");
        }
    }
}