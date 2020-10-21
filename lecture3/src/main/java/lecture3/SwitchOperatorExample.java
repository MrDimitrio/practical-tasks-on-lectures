package lecture3;

public class SwitchOperatorExample {
    public static void main(String[] args) {
        int case2 = 1;
        
        switch (case2) {
            case 1:
            case 2:
            case 3:
                System.out.println("We have performed 'case 3'");
                break;
            default:
                System.out.println("We have performed default case");
        }
    }
}
