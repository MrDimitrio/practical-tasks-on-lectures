import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ForLoopExample {
    public static void main(String[] args) {
        
        int [] array = {1, 2, 3, 4, 5};
        List<Integer> list = asList(1, 2, 3, 4);

        System.out.println("for i");
        for (int i = 0; i < array.length; i++) {
            System.out.println("This is " + array[i] + " iteration;");
        }

        System.out.println("\nfor each");
        for (int value: list) {
            value = 78;
            System.out.println(value);
        }
    }
}
