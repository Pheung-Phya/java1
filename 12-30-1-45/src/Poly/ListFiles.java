package Poly;


import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:\\Users\\USER\\Desktop\\flutter_app";
        
        // Create a File object for the directory
        File directory = new File(directoryPath);
        
        // Get all the files in the directory
        File[] filesList = directory.listFiles();
        
        if (filesList != null) {
            for (File file : filesList) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                }
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
}
