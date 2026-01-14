package ExceptionHandlingDemo;
import java.lang.ArithmeticException;
public class ArthmeticExceptionDemo {
    static void divideByZero(int a,int b){
        try{
                int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero not possible");
        }
    }
    public static void main(String[] args) {
        divideByZero(10,0);

    }
}
