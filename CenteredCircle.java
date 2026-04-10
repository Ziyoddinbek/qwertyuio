package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class CenteredCircle extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Pane pa=new Pane();
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2.7);


        circle.centerXProperty().bind(pa.widthProperty().divide(2));
        circle.centerYProperty().bind((pa.heightProperty().divide(2)));
        pa.getChildren().add(circle);
        Scene sc= new Scene(pa, 300, 300);
        stage.setTitle("Centered Circle");
        stage.setScene(sc);



        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}