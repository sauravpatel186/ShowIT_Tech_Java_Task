public class Task2 {
    private float AOR(float length, float width){
        return length * width;
    }
    public static void main(String[] args){
        float l = 4.0f;
        float w = 3.0f;
        Task2 aor= new Task2();
        System.out.print(aor.AOR(l,w));
    }
}
