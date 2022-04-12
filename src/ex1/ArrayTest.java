package ex1;

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0;i<array.length;i++){
            array[i] = new Random().nextInt(0,1000);
            System.out.println(i+":"+array[i]);
        }
        for (int i =0;i<array.length;i++) {
            System.out.println("Returned"+i+":"+array[i]);
        }
    }
}
