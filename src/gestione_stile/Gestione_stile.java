/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_stile;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author russo.salvatore
 */
public class Gestione_stile extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label l=new Label("prova CSS");
        StackPane root = new StackPane();
        root.getChildren().add(l);
        
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add(Gestione_stile.class.getResource("stile.css").toExternalForm());
        primaryStage.setTitle("prova CSS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
