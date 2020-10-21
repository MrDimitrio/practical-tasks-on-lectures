package lecture3;

public class NestedIfExample {
    public static void main(String[] args) {
        boolean isBlockOk = true;
        boolean isNestedBlockOk = true;
        
        if (isBlockOk) {
            System.out.println("We are in the upper 'if'");
            if (isNestedBlockOk) {
                System.out.println("We are in the nested 'if'");
            } else {
                
            }
        }
        else {
            
        }
        System.out.println("We have gone away from if blocks.");
    }
}
