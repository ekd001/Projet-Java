package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button("Click me ");
        btn.setBackground(null);
        Scene scene = new Scene( btn,300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX with Ant");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}