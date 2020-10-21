package lecture3;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        String ternaryResult = (5 < 9) ? String.valueOf(5) : "5 more than 9 which is false";
        
        // this the same way to 
        /*if (5 < 9) {
            ternaryResult = String.valueOf(5);
        } else {
            ternaryResult = "5 more than 9 which is false";
        }*/
        System.out.println(ternaryResult);
    }
}
