package class_6th.HW5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class IntegerList {
    private int[] myList;

    public IntegerList(int size) {
        if(size <= 0){
            System.out.println("Error Array size zero or negative.");
            System.exit(0);
        }
        Random rnd = new Random();
        myList = new int[size];
        for(int i=0; i<size; i++){
            myList[i] = rnd.nextInt(15);
        }
    }

    public String toString(){
        String valueStr = "Array values : ";

        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i< myList.length; i++) stringBuffer.append(myList[i]+" ");
        valueStr += stringBuffer;

        return valueStr;
    }

    public int findMinElement(){
        return  IntStream.of(myList).min().getAsInt();
    }

    public void findMaxAddition(){
        Integer temp[] = new Integer[myList.length];
        for (int i=0; i<myList.length; i++) temp[i] = myList[i];

        Arrays.sort(temp,Collections.reverseOrder());

        System.out.println("Pair of the maximum addition is (" + temp[0] + ", " + temp[1] + "), " +
                "and the result is " + (temp[0]+temp[1]) + ".");
    }

    public boolean findDuplicateElements() {
        return myList.length != stream(myList).distinct().count() ? true : false;
    }

    public int[] reverseArray() {
        int j=myList.length-1;
        int temp;
        for(int i=0; i<myList.length/2; i++){
            temp = myList[i];
            myList[i] = myList[j];
            myList[j--] = temp;
        }

        return this.myList;
    }

}
