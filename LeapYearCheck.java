import java.util.*;

class LeapYearCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, Enter a year in 'yyyy' format.");

        if(!sc.hasNextInt()){  //Validated the number
            System.out.println("Warning!, Enter a valid year in yyyy format.");
        }

        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}