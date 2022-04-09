package class_6th.lab5;

import java.util.Scanner;

public class PartiallyFilledArray {
    private int maxNumberElements;
    private double[] a;
    private int numberUsed;

    PartiallyFilledArray() {
        maxNumberElements = 10;
        a = new double[maxNumberElements];
        numberUsed = 0;
    }

    PartiallyFilledArray(int arraySize){
        if(arraySize <= 0){
            System.out.println("Error Array size zero or negative.");
            System.exit(0);
        }
        maxNumberElements = arraySize;
        a = new double[maxNumberElements];
        numberUsed=0;
    }

    PartiallyFilledArray(PartiallyFilledArray original) { //copy constructor
        if (original == null) {
            System.out.println("Fatal error : aborting system.");
            System.exit(0);
        }
        maxNumberElements = original.maxNumberElements;
        numberUsed = original.numberUsed;
        a = new double[maxNumberElements];
        for (int i = 0; i < numberUsed; i++) {
            a[i] = original.a[i];
        }
    }

    public void add(double newElement) {
        if(numberUsed == maxNumberElements) System.exit(0);
        a[numberUsed++] = newElement;
    }

    public double getElement(int index){
        if (index < 0 || index >= numberUsed) {
            System.out.println("Error:Illegal or unused index.");
            System.exit(0);
        }
        return a[index];
    }

    public void resetElement(int index, double newValue) {
        if (index < 0 || index >= maxNumberElements) {
            System.out.println("Error:Illegal Index.");
        } else if (index > numberUsed) {
            System.out.println("Error: Changing an index that is too large.");
            System.exit(0);
        } else{
            a[index] = newValue;
        }
    }

    public void deleteLast() {
        if(a == null) {
            System.out.println("Error:Deleting from an empty array.");
            System.exit(0);
        }else{
            // decrement numUsed since we delete the last one.
            numberUsed--;
        }
    }

    // deletes the element in position index
    public void delete(int index) {
        if(index < 0 || index >= numberUsed) {
            System.out.println("Error:Illegal or unused index.");
            System.exit(0);
        }

        for(int i = index;i<numberUsed;i++) {
            // moves down all elements with indices
            // higher than the deleted element.
            a[i] = a[i+1];
        }
        numberUsed--;
    }

    public boolean full() {
        return (numberUsed == maxNumberElements);
    }

    public int getMaxCapacity() {
        return maxNumberElements;
    }

    public int getNumberOfElements() {
        return numberUsed;
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public void selectionSort() { // in PartiallyFilledArray
        int i;
        System.out.println("Array values before sorting: ");
        for(i = 0;i < a.length;i++)
            System.out.println(a[i] + " ");
        System.out.println();

        // Perform selection sort on a

        for (i = 0; i < a.length; i++) {
            int minidx = i;
            for(int j=i+1; j<a.length-1; j++){
                if(a[minidx] > a[j]) minidx = j;
            }

            double temp = 0;
            temp = a[minidx];
            a[minidx] = a[i];
            a[i] = temp;

        }




        System.out.println("Sorted array values: ");
        for(i = 0;i < a.length;i++)
            System.out.println(a[i] + " ");
        System.out.println();
    }

}
