package ExceptionHandlingDemo;

public class AgeVerification {

    static void verifyAge(int voterAge) throws Exception{
            if(voterAge < 18){
                throw new InvalidAgeException("Voter not eligible");
            }else{
                System.out.println("Voter is eligible");
            }
    }
    public static void main(String args[]){
        try{

            verifyAge(17);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
