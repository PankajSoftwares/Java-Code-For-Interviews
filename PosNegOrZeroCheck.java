import java.util.*;

class PosNegOrZeroCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        //To Validate a valid number
        if(!sc.hasNextInt()){
            System.out.println("Warning! Enter a valid number!");
            return;
        }
        int n = sc.nextInt();

        if(n == 0) System.out.println("This is a zero.");
        if(n > 0) System.out.println(n +" is a positive number.");
        if(n < 0) System.out.println(n +" is Negative number.");

    }
}