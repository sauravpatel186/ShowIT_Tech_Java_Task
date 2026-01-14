package ExceptionHandlingDemo;

public class ThrowsDemo {
    static void checkEligibility(int age) throws Exception {
        if (age < 21) {
            throw new Exception("Not eliglible");
        } else {
            System.out.println("Eligible! Age is " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(20);
            checkEligibility(22);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
