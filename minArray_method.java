package array_method_Java;
import java.util.Arrays;
import java.util.Collections;

public class minArray_method {
    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
