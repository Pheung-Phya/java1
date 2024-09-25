package rupp_access;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class API_Test {
    public static void main(String[] args) {
        try {
            // URL of the API you want to connect to
            String apiUrl = "http://localhost:3000/products";
            
            // Create a URL object
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Set any required headers (if necessary)
            connection.setRequestProperty("Accept", "application/json");
            // connection.setRequestProperty("Authorization", "Bearer your_api_token");

            // Get the response code
            int responseCode = connection.getResponseCode();
            // Check if the request was successful
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                // Print each line of the response
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
                in.close();
            } else {
                System.out.println("GET request failed. Response Code: " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//package rupp_access;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//public class API_Test {
//    public static void main(String[] args) {
//        try {
//            // URL of the API you want to connect to
//            String apiUrl = "http://localhost:3000/products";
//            
//            // Create a URL object
//            URL url = new URL(apiUrl);
//
//            // Open a connection to the URL
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            // Set the request method to GET
//            connection.setRequestMethod("GET");
//
//            // Set any required headers (if necessary)
//            connection.setRequestProperty("Accept", "application/json");
//            // connection.setRequestProperty("Authorization", "Bearer your_api_token");
//
//            // Get the response code
//            int responseCode = connection.getResponseCode();
//            // Check if the request was successful
//            if (responseCode == HttpURLConnection.HTTP_OK) {
//                // Read the response
//                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                StringBuilder response = new StringBuilder();
//                String inputLine;
//                while ((inputLine = in.readLine()) != null) {
//                    response.append(inputLine);
//                }
//                in.close();
//
//                // Parse the JSON response
//                JSONArray jsonArray = new JSONArray(response.toString());
//
//                // Print specific values from the JSON
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject product = jsonArray.getJSONObject(i);
//                    int id = product.getInt("id");
//                    String name = product.getString("name");
//                    double price = product.getDouble("price");
//
//                    // Print the values
//                    System.out.println("ID: " + id);
//                    System.out.println("Name: " + name);
//                    System.out.println("Price: " + price);
//                    System.out.println(); // Blank line for readability
//                }
//            } else {
//                System.out.println("GET request failed. Response Code: " + responseCode);
//            }
//
//            // Disconnect the connection
//            connection.disconnect();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

