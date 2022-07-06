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
        int n = array.length;
        if (n == 0) {
            return false;
        }

        boolean found = false;
        for (int i =0; i < n; i++) {
            if (array[i] == numberToSearchFor) {
                found = true;
                break;
            }
        }
        return found;
    }

    int[] sortArray(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    void printArray(int[] array, int index) {
        System.out.println(array[index]);
    }
}
