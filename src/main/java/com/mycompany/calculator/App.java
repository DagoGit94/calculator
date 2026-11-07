package com.mycompany.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.paint.Color.color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
     AnchorPane root = new AnchorPane();
     root.setStyle("-fx-background-color: skyblue;");
     Scene scene = new Scene(root, 280, 180);
     
     TextField num1 = new TextField();
     TextField num2 = new TextField();
     Label answer = new Label();
     
     Button addBtn = new Button("+");
     addBtn.setOnAction(actionEvent ->{
         try{
             double a = Double.parseDouble(num1.getText())+ Double.parseDouble(num2.getText());
             answer.setText("Answer: " + a);
         }catch (NumberFormatException e){
             answer.setText("Type Number!");
         }
     });
     
     Button subBtn = new Button("-");
     subBtn.setOnAction(actionEvent ->{
         try{
             double a = Double.parseDouble(num1.getText())- Double.parseDouble(num2.getText());
             answer.setText("Answer: " + a);
         }catch (NumberFormatException e){
             answer.setText("Type Number!");
         }
     });
     
     Button mulBtn = new Button("*");
     mulBtn.setOnAction(actionEvent ->{
         try{
             double a = Double.parseDouble(num1.getText())* Double.parseDouble(num2.getText());
             answer.setText("Answer: " + a);
         }catch (NumberFormatException e){
             answer.setText("Type Number!");
         }
     });
     
     Button divBtn = new Button("/");
     divBtn.setOnAction(actionEvent ->{
         try{
             double a = Double.parseDouble(num1.getText())/ Double.parseDouble(num2.getText());
             answer.setText("Answer: " + a);
         }catch (NumberFormatException e){
             answer.setText("Type Number!");
         }
     });
     
     AnchorPane.setTopAnchor(num1, 40.0);
     AnchorPane.setLeftAnchor(num1, 40.0);
     
     AnchorPane.setTopAnchor(num2, 70.0);
     AnchorPane.setLeftAnchor(num2, 40.0);
     
     AnchorPane.setTopAnchor(answer,100.0);
     AnchorPane.setLeftAnchor(answer, 40.0);
     
     AnchorPane.setTopAnchor(addBtn,40.0);
     AnchorPane.setLeftAnchor(addBtn, 200.0);
     
     AnchorPane.setTopAnchor(subBtn,70.0);
     AnchorPane.setLeftAnchor(subBtn, 200.0);
     
     AnchorPane.setTopAnchor(mulBtn,100.0);
     AnchorPane.setLeftAnchor(mulBtn, 200.0);
     
     AnchorPane.setTopAnchor(divBtn,130.0);
     AnchorPane.setLeftAnchor(divBtn,200.0);
     
     root.getChildren().addAll(num1, num2, answer, addBtn, subBtn,
             mulBtn, divBtn);
     
     stage.setTitle("Mini Clculator");
     stage.setScene(scene);
     stage.show();
      
    }
    
    public static void main(String[] args) {
        launch();
    }

}