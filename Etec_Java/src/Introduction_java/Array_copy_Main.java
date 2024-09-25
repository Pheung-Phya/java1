
package Introduction_java;

import java.util.Arrays;


public class Array_copy_Main {

    public static void main(String[] args) {
       int[][] source={
           {2,3,4,5},{7,8},{-5,7,8,4}
       };
       int[][] destination=new int[source.length][];
        for(int i=0;i<source.length;i++){
            destination[i]=new int[source[i].length];
            System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }
        System.out.println(Arrays.deepToString(destination));
    }
    
}
