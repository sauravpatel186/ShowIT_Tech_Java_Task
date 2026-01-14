package ExceptionHandlingDemo;

public class NestedTryCatch {
    static void Demo(int a,int b){
        int[] arr = {1,2,3};
        try {
            int c = a / b;
            try {
                    int i = arr[3];
            } catch (ArrayIndexOutOfBoundsException  e) {
                    System.out.println(e.getMessage());
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        Demo(10,0);
    }
}
