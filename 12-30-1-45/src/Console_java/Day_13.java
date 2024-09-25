
package Console_java;

import java.util.Arrays;
import java.util.Scanner;

public class Day_13 {
    public static void main(String[] args) {
         int arr[][]={{1,2,3},{10,20},{50,20,90,70}};
         int arrc[][]=new int[arr.length][];
         for(int i=0;i<arr.length;i++){
             arrc[i]=new int[arr[i].length];
             System.arraycopy(arr[i], 0, arrc[i], 0, arr[i].length);
         }
         System.out.println(Arrays.deepToString(arrc));
    } 
}
