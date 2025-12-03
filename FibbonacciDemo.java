import java.util.*;

class FibbonacciDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, how many you want: ");
        if(!sc.hasNextInt()){
            System.out.println("Warning!, Please Enter a valid number & retry.");
            return;
        }
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Please, Enter a Positive number: ");
        }
        //initialization for first two numbers
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++){
            System.out.print(a+ " ");

            //Logic to assign the sum of prev two numbers to 3rd and then move a to b and b to c like

            int c = a + b;
            a = b;
            b = c;
        }
    }
}





//Concept
//Addition of prev number is next: 0,1,1,2,3,5,8,13.....
// 1. to find series i need n till how many numbers - n
// 2.