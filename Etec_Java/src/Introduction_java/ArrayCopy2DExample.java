
package Introduction_java;
public class ArrayCopy2DExample {
    public static void main(String[] args) {
        // Source 2D array
        int[][] sourceArray = {{1, 2, 3,4}, {4, 5, 6}, {7, 8, 9}};
        
        // Destination 2D array
        System.out.println(sourceArray[0].length);
        System.out.println(sourceArray.length);
        int[][] destinationArray = new int[sourceArray.length][sourceArray[0].length]; // Assuming all rows have the same length
        
        // Copying elements from sourceArray to destinationArray
        for (int i = 0; i < sourceArray.length; i++) {
            System.arraycopy(sourceArray[i], 0, destinationArray[i], 0, sourceArray[i].length);
        }
        
        // Displaying destinationArray
        for (int[] row : destinationArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


//public class ArrayCopyExample {
//    public static void main(String[] args) {
//        // Source array
//        int[] sourceArray = {1, 2, 3, 4, 5};
//        
//        // Destination array
//        int[] destinationArray = new int[5]; // Needs to be of appropriate size
//        
//        // Copying elements from sourceArray to destinationArray
//        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
//        
//        // Displaying destinationArray
//        for (int num : destinationArray) {
//            System.out.print(num + " ");
//        }
//    }
//}

