package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

        public static void main(String[] args) {
            Application.launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            Stage other = new Stage();
            other.setTitle("Other Stage");
            other.show();

            primaryStage.setTitle("Hello World!");
            Label label = new Label("Hello World");
            Scene scene = new Scene(label, 400, 200);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
}
