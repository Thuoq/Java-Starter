package collections;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetExercise
{
    public static void main(String[] args)
    {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        // convert numbers arr above to list
        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        TreeSet<Integer> treeSet = new TreeSet<>(numbersList);
        System.out.println(treeSet);
        // min value
        System.out.println("Min value: " + treeSet.first());
        // max value
        System.out.println("Max value: " + treeSet.last());

    }
}
