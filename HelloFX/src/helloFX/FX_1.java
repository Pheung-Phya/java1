
package helloFX;
import java.awt.Button;
import java.awt.Color;
import java.awt.Rectangle;


public class FX_1 extends Application {

     public void start(Stage primaryStage) {
        Button button = new Button("Click me");

        button.setOnAction(event -> {
            button.setStyle("-fx-background-color: red;");
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Change Color on Click");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
