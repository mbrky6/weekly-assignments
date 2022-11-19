package com.mycompany.flagpanes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("FlagPanes"), 600, 400);
        stage.setTitle("Flags");
        stage.setScene(scene);
        stage.show();
    } // + void start

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    } // static void setRoot

    private static Parent loadFXML(String fxml) throws IOException {
        System.out.println(fxml + "FlagPanes.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FlagPanes.fxml"));
        return fxmlLoader.load();
    } // - static Parent loadFXML

    public static void main(String[] args) {
        Application.launch(args);
    } // + static void main

} // + class App extends Application