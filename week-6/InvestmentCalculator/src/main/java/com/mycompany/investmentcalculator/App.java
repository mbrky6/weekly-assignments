package com.mycompany.investmentcalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    private Pane panMain;
    
    // Labels
    private Label lblInvestmentAmount = new Label("Investment Amount:");
    private Label lblYearCount = new Label("Number of Years:");
    private Label lblInterestRate = new Label("Monthly Interest Rate (%):");
    private Label lblFutureValue = new Label("Future Value:");
    
    
    // Entry boxes
    private TextField txtInvestmentAmount = new TextField();
    private TextField txtYearCount = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextField txtFutureValue = new TextField();
    
    // Button
    private Button btnCalculate = new Button("Calculate");

    @Override
    public void start(Stage stage) {
        panMain = new Pane();
        
        lblInvestmentAmount.setMinWidth(150);
        lblYearCount.setMinWidth(150);
        lblInterestRate.setMinWidth(150);
        lblFutureValue.setMinWidth(150);
        
        btnCalculate.setOnAction(a -> calculateInterest());
        
        // Containers
        HBox hbxInvestmentAmount = new HBox(lblInvestmentAmount, txtInvestmentAmount);
        HBox hbxYearCount= new HBox(lblYearCount, txtYearCount);
        HBox hbxInterestRate = new HBox(lblInterestRate, txtInterestRate);
        HBox hbxFutureValue = new HBox(lblFutureValue, txtFutureValue);
        
        // Whole app window
        VBox vbxAll = new VBox(hbxInvestmentAmount, hbxYearCount, hbxInterestRate, hbxFutureValue, btnCalculate);
        panMain.getChildren().addAll(vbxAll);
        Scene scnMain = new Scene(panMain, 300, 130);
        stage.setScene(scnMain);
        stage.show();
    } // + void start
    
    public void calculateInterest() {
        try {
            int investment = Integer.parseInt(txtInvestmentAmount.getText());
            int years = Integer.parseInt(txtYearCount.getText());
            double rate = Double.parseDouble(txtInterestRate.getText());
            
            Double future = investment * Math.pow((1 + rate/100), years * 12);
            
            System.out.println(future);
            txtFutureValue.setText("$" + future);
        } // try
        catch(RuntimeException e) {
            txtFutureValue.setText("Unable to calculate");
        } // catch RuntimeException
        
    } // + void calculateInterest

    public static void main(String[] args) {
        Application.launch(args);
    } // + static void main

} // + class App extends Application