/**
 * File: Culminating - Rhythm Game
 * Author: Mikah Ho
 * Date Created: June 3, 2026
 * Date Last Modified: June 9, 2026
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;

public class RhythmGame extends Application {

     public static void main(String[] args) {

        launch(args);
    }
    
    @Override
    public void start(Stage gameWindow) { //forgive me for how horrendous this looks i didn't have time to make it look good

        gameWindow.setTitle("rhythm.808"); //placeholder game name

        Text title = new Text("rhythm 808"); //game title
        title.setFont(Font.font("Courier New", FontWeight.BOLD, 24));

        //start menu
        Button start = new Button();
        start.setPrefSize(150, 50);
        start.setFont(new Font(24)); 
        start.setText("Start");
        // start.setTranslateY(50);

        start.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {

                System.out.println("start");

                //song that works
                Button coffee = new Button();
                coffee.setText("  Coffee\nby Good Kid");
                // coffee.setTranslateX(15);
                // coffee.setTranslateY(20);
                StackPane songCoffee = new StackPane();
                songCoffee.getChildren().add(coffee);

                //filler song 1
                Button cicada = new Button();
                cicada.setText("  Cicada\nby Good Kid");
                // cicada.setTranslateX(5);
                // cicada.setTranslateY(20);
                StackPane songCicada = new StackPane();
                songCicada.getChildren().add(cicada);

                //filler song 2
                Button rift = new Button();
                rift.setText("   Rift\nby Good Kid");
                // rift.setTranslateX(20);
                // rift.setTranslateY(20);
                StackPane songRift = new StackPane();
                songRift.getChildren().add(rift);

                //grouping song buttons
                HBox songs = new HBox(20);
                songs.setAlignment(Pos.CENTER);
                songs.getChildren().addAll(songCoffee, songCicada, songRift);

                Scene songMenu = new Scene(songs, 450, 350);
        
                gameWindow.setScene(songMenu);
                gameWindow.show();
            }
        });
        
        StackPane startButton = new StackPane();
        startButton.getChildren().add(start);

        VBox menu = new VBox(10);
        menu.setAlignment(Pos.CENTER);
        menu.getChildren().addAll(title, startButton);

        Scene startMenu = new Scene(menu, 450, 350);
        
        gameWindow.setScene(startMenu);
        gameWindow.show();
    }
}
