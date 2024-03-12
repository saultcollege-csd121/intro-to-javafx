package iheartui;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        var ellipse = new Ellipse(110, 70);
        ellipse.setFill(Color.BLACK);
        ellipse.setStroke(Color.HOTPINK);
        ellipse.setStrokeWidth(5);

        var reflection = new Reflection();
        reflection.setFraction(0.2);
        reflection.setTopOffset(1.0);
        ellipse.setEffect(reflection);

        var text = new Text("I ❤ UI");
        text.setFill(Color.WHITE);
        text.setFont(new Font("Arial Bold", 24));
        text.setEffect(new DropShadow(10, 0, 0, Color.WHITE));

        text.setOnMouseClicked(new TextClickHandler(text));


        var stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, text);

        var scene = new Scene(stackPane, 350, 230, Color.rgb(25, 5, 25));

        primaryStage.setTitle("I ❤ UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static class TextClickHandler implements EventHandler<MouseEvent> {

        private final Text text;

        public TextClickHandler(Text text) {
            this.text = text;
        }

        @Override
        public void handle(MouseEvent event) {
            var throb = new ScaleTransition(Duration.seconds(0.1), this.text);
            throb.setAutoReverse(true);
            throb.setCycleCount(2);
            throb.setByX(1.2);
            throb.setByY(1.2);
            throb.playFromStart();
        }
    }
}
