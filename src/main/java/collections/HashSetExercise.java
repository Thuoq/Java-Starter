package collections;


import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {
    public static void main(String[] args) {
        int[] data = {12, 34, 1, 56, 43, 34, 65};
        int duplicate = 0;
        Set<Integer> set = new HashSet<>();
        for (int val : data) {
            if (!set.add(val)) {
                duplicate = val;
                break;
            }
        }
        System.out.println("Duplicate element is: " + duplicate);
    }
}
