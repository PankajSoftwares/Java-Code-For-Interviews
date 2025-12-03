import java.util.*;

class LargestOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter the 3rd number: ");
        int c = sc.nextInt();

        //Case 1. All three are equals
        if( a == b && b ==c){
            System.out.println("Warning! All numbers are same.");
        return;
        }

        // Case 2. Any two are equals
        if(a == b || b == c || a == c){
            System.out.println("Warning! Some numbers are same. ");
            return;
        }






        int largest = a;

        if( b > largest) largest = b;
        if(c > largest) largest = c;

        System.out.println("The Largest numeber is: "+largest);
    }
}