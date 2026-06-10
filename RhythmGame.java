/**
 * File: Culminating - Rhythm Game
 * Author: Mikah Ho
 * Date Created: June 3, 2026
 * Date Last Modified: June 10, 2026
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

public class RhythmGame extends Application { // "you're going to submit a culminating to me this year, right?" well...

     public static void main(String[] args) {

        launch(args);
    }
    
    @Override
    public void start(Stage gameWindow) { //forgive me for how horrendous this looks i didn't have time to make it look good

        gameWindow.setTitle("rhythm.808"); //placeholder game name

        Text title = new Text("rhythm 808"); //game title
        // title.setFont(Font.loadFont("file:resources/CourierPrime-Regular.ttf", 50)); //lol i couldn't figure out how to load fonts
        title.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        //start menu
        Button start = new Button();
        start.setPrefSize(150, 50);
        start.setFont(new Font(24)); 
        start.setText("Start");

        start.setOnAction(new EventHandler<ActionEvent>() { //goes to song menu
 
            @Override
            public void handle(ActionEvent event) {

                //song that would've worked if i didn't give up on this
                Button coffee = new Button();
                coffee.setText("    Coffee\nby Good Kid");
                StackPane songCoffee = new StackPane();
                songCoffee.getChildren().add(coffee);

                //filler song 1
                Button cicada = new Button();
                cicada.setText("    Cicada\nby Good Kid");
                StackPane songCicada = new StackPane();
                songCicada.getChildren().add(cicada);

                //filler song 2
                Button rift = new Button();
                rift.setText("      Rift\nby Good Kid");
                StackPane songRift = new StackPane();
                songRift.getChildren().add(rift);

                //grouping song buttons
                HBox songs = new HBox(20);
                songs.setAlignment(Pos.CENTER);
                songs.getChildren().addAll(songCoffee, songCicada, songRift);

                Scene songMenu = new Scene(songs, 450, 350);
        
                gameWindow.setScene(songMenu);
                gameWindow.show();
                
                //"working" song
                coffee.setOnAction(new EventHandler<ActionEvent>() {
 
                    @Override
                    public void handle(ActionEvent event) {

                        Text title = new Text("    Coffee\nby Good Kid");
                        title.setFont(Font.font("Arial", FontWeight.BOLD, 24));

                        Button start = new Button();
                        start.setPrefSize(150, 50);
                        start.setFont(new Font(24)); 
                        start.setText("Start");

                        StackPane startButton = new StackPane();
                        startButton.getChildren().add(start);

                        VBox coffeeMenu = new VBox(10);
                        coffeeMenu.setAlignment(Pos.CENTER);
                        coffeeMenu.getChildren().addAll(title, startButton);

                        Scene coffeeStart = new Scene(coffeeMenu, 450, 350);
        
                        gameWindow.setScene(coffeeStart);
                        gameWindow.show();
                    }
                });
            }
        });
        
        //start menu cont'd
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

// i'm really tired
// i might finish this over the summer if i have time
// i didn't read your feedback yet in case you were wondering