/*
 * this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

 * and open the template in the editor.
 */
package amleat_room;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TMS extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("تسجيل الدخول");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
