package io.datajek.springbootdemo.recommenderapi;

public class ArrayMethods {
    int findIndex(int[] array, int number) {
        int n = array.length;
        if (n == 0) {
            return -1;
        }

        int index = -1;
        for (int i =0; i < n; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        return index;
    }

    boolean searchForNumber(int[] array, int numberToSearchFor) {
        boolean found = false;
        return found;
    }
}
