
import java.util.Scanner;

class number{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        if(number<0){
            System.out.println("loss");
        }
        else if (number>0){
              System.out.println("profit");
        }
        else if (number==0){
              System.out.println("no profit no loss");
        }
    }
}