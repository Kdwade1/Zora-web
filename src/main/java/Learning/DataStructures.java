package Learning;

import org.hibernate.mapping.Array;

import java.util.Arrays;

public class DataStructures {

    //Arrays Gets Stored sequentially
    //Arrays are Static. Size can't change later on. If guess is to large waste memory
    //Array to small, run out of space.
    public static void main(String[]args){
        int[]numbers = new int[3];
        numbers[0] =10;
        numbers[1]=20;
        numbers[2]=30;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

    }
}
