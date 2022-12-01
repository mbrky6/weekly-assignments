package com.mycompany.splitfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    
    // Labels
    private Label lblInstructions = new Label("If you split a file named temp.txt into 3 files, the 3\nsmaller files are temp-1.txt, temp-2.txt, and temp-3.txt.");
    private Label lblFileName = new Label("Enter a file:");
    private Label lblFileCount = new Label("Number of smaller files: ");
    
    // Entry Boxes
    private TextField txtFileName = new TextField();
    private TextField txtFileCount = new TextField();
    
    // Button
    private Button btnStart = new Button("Split");
    
    
    @Override
    public void start(Stage stage) {
        Pane panMain = new Pane();
        
        btnStart.setOnAction(a -> splitApart(new File(txtFileName.getText()), Integer.parseInt(txtFileCount.getText())));
        
        // Containers
        VBox vbxLabels = new VBox(lblFileName, lblFileCount);
        VBox vbxFields = new VBox(txtFileName, txtFileCount);
        HBox hbxWorkspace = new HBox(vbxLabels, vbxFields);
        
        // Whole app window
        VBox vbxAll = new VBox(lblInstructions, hbxWorkspace, btnStart);
        panMain.getChildren().addAll(vbxAll);
        Scene scnMain = new Scene(panMain, 280, 120);
        stage.setScene(scnMain);
        stage.show();
    } // + void start
    
    public void splitApart(File fileName, int divisor) {
        // Read the file as binary data
        try {
            RandomAccessFile large = new RandomAccessFile(fileName, "r");
            RandomAccessFile writer;
            long increment = large.length()/divisor;
            
            // Using a for loop, read the increment amount of bytes, output the section of bytes to a numbered .txt file
            for (int i = 0; i <= divisor; i++) {
                writer = new RandomAccessFile(fileName.getName() + '-' + i + ".txt", "rw");
                
                for (int b = 0; b < increment; b++) {
                    if (b + increment * i < large.length()) {
                        large.seek(b + increment * i);
                        System.out.println(b * i);
                        writer.writeByte(large.readByte());
                    } // if (still inside file)
                    else {
                        break;
                    }
                } // for (each byte in the size of the increment)
            } // for (as many times as specified)
        } // try
        
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } // catch (FileNotFoundException)
        
        catch (IOException ex) {
            System.out.println("Information invalid");
        } // catch
    } // + void splitApart

    public static void main(String[] args) {
        Application.launch(args);
    } // + static void main

} // + class App