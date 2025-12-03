import java.util.*;

class ReverseANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the reverse of it: ");
        int number = sc.nextInt();

        int revNumber = 0;

        while (number != 0) {
            revNumber = revNumber * 10 + number % 10;
            number /= 10;
        }

        System.out.print("The reversed number is: "+revNumber);
    }
}