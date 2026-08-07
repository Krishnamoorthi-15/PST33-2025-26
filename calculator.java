import java.util.*;

class adult {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float a=sc.nextFloat();
        char ch=sc.next().charAt(0);
        System.out.println("Enter second number: ");
        float b=sc.nextFloat();
       switch (ch){
        case '+':
            System.out.println("Addition: "+(a+b));
            break;
        case '-':                       
            System.out.println("Subtraction: "+(a-b));
            break;  
        case '*':
            System.out.println("Multiplication: "+(a*b));
            break;
        case '/':
            System.out.println("Division: "+(a/b));
            break;
        default:
            System.out.println("Invalid operator");
            break;
        }
       }
        }
    
        

    
