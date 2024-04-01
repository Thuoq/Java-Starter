package org.example;


public class Main {
    public static void main( String args[] ) {
        char[] input = {'a', 'b','b'}; // b b a, // a b b
        permutations(input, input.length);
        System.out.println("Permutations of a string");
    }

    public static void permutations(char[] array, int length) {
        // Write your code here
        // base case
        if(length == 1) {
            System.out.println(array);
            return;
        }
        // for
        for(int i = 0 ; i < length; i ++){
            swap(i,length-1, array);
            permutations(array, length - 1);
            swap(i,length-1, array);
        }

    }

    private static void swap(int i , int j , char[] arr ) {
        char arrZ = arr[i];
        arr[i] = arr[j];
        arr[j] = arrZ;
    }
}
