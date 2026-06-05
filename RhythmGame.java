/**
 * File: Culminating - Rhythm Game
 * Author: Mikah Ho
 * Date Created: June 3, 2026
 * Date Last Modified: June 5, 2026
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class RhythmGame extends Application {

     public static void main(String[] args) {

        launch(args);
    }
    
    @Override
    public void start(Stage gameWindow) {

        gameWindow.setTitle("Rhythm.808"); //placeholder game name
        Button start = new Button();
        start.setText("Start");

        start.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {

                StackPane startButton = new StackPane();
                startButton.getChildren().add(start);
            }
        });
        
        StackPane startMenu = new StackPane();
        startMenu.getChildren().add(start);
        
        gameWindow.setScene(new Scene(startMenu, 450, 350));
        gameWindow.show();
    }
}
