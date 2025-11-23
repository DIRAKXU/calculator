import java.util.Scanner;

public class Calculator{
    
    static double num1, num2, res;
    static char oper;
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        
        System.out.println("Enter 1st Number: ");
        num1 = in.nextDouble();
        System.out.println("Enter the Operator(+,-,*,/): ");
        oper = in.next().charAt(0);
        System.out.println("Enter 2nd Number: ");
        num2 = in.nextDouble();
        in.close();
        switch (oper) {
            case '+':
                res = num1+num2;
                System.out.println("Result= "+res);
                break;
            case '-':
                    res = num1-num2;
                    System.out.println("Result= "+res);
                    break;
            case '*':
                res = num1*num2;
                System.out.println("Result= "+res);
                break;
            case '/':
                if(num2!=0){
                    res = num1/num2;
                    System.out.println("Result= "+res);
                }
                else
                    System.out.println("!!Error: Division by 0 is not allowed!!");
                break;
            default:
                System.out.println("!!Invalid Operator Input!!");
                break;
        }
    }
}