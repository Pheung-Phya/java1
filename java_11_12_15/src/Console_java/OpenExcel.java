
package Console_java;
public class OpenExcel {
    public static void main(String[] args) {
        try {
            // Get the runtime instance
            Runtime runtime = Runtime.getRuntime();

            // Execute the command to open Excel
            Process process = runtime.exec("C:/Users/USER/Desktop/OOP.docx");

            System.out.println("Microsoft Excel started.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//public class RuntimeExample {
//    public static void main(String[] args) {
//        // Get the runtime instance
//        Runtime runtime = Runtime.getRuntime();
//
//        // Print the total memory in the JVM
//        long totalMemory = runtime.totalMemory();
//        System.out.println("Total memory in JVM: " + totalMemory + " bytes");
//
//        // Print the free memory in the JVM
//        long freeMemory = runtime.freeMemory();
//        System.out.println("Free memory in JVM: " + freeMemory + " bytes");
//
//        // Run the garbage collector
//        runtime.gc();
//        System.out.println("Garbage collection executed.");
//
//        // Print the free memory after garbage collection
//        freeMemory = runtime.freeMemory();
//        System.out.println("Free memory after GC: " + freeMemory + " bytes");
//
//        // Execute a system command
//        try {
//            Process process = runtime.exec("notepad");
//            System.out.println("Notepad started.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
