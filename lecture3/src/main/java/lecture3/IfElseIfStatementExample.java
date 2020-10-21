package lecture3;

public class IfElseIfStatementExample {
    public static void main(String[] args) {
        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = true;

        if (condition1) {
            System.out.println("We have satisfied 'condition 1'!");
        } else if (condition2) {
            System.out.println("We have satisfied 'condition 2'!");
        } else if (condition3) {
            System.out.println("We have satisfied 'condition 3'!");
        } else {
            System.out.println("We have not satisfied conditions at all!");
        }
    }
}
