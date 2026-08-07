
import java.util.Scanner;

class adult{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
                if (age<=3) {
                System.out.println("child");
            }  else if(age>=4 && age<=14){
                System.out.println("teenager");
            } else if(age>=15 && age<=19){
                System.out.println("young");    
            } else if(age>=20 && age<=59){
                System.out.println("adult");    
            } else {
                System.out.println("senior citizen");

    }
}
      
    }
}