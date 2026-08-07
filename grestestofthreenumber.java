
import java.util.Scanner;

class number{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number");
        int number1 =sc.nextInt();
          System.out.println("Enter the 2 number");
         int number2 =sc.nextInt();
           System.out.println("Enter the 3 number");
          int number3 =sc.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("gretest "+number1);
        }
        else if (number2>number1 && number2>number3){
              System.out.println("greatest number is: "+number2);
        }
        else if (number3>number1 && number3>number2){
              System.out.println("greatest number is: "+number3);
           
        }
    }
}