/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amleat_room;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class LoginController implements Initializable {

    @FXML
    TextField username;
    @FXML
    PasswordField password;
    
    
        public void login (Event e){
          
            
            
          //////////file fxml
          try {
              if(username.getText().trim().equals("admin")&&password.getText().equals("admin")){
            
                                Parent root = FXMLLoader.load(getClass().getResource("farm22.fxml"));

                                Scene scene = new Scene(root);
                
                Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
                     stage.setScene(scene); 
                      stage.setTitle("المتابعات");
                      
                      ///////////Code menu Center
                      Rectangle2D rd= Screen.getPrimary().getVisualBounds();
                      stage.setX((rd.getWidth() - stage.getWidth())/2);
                      stage.setY((rd.getHeight() - stage.getHeight())/2);
            
            }else{
            JOptionPane.showMessageDialog(null,"تحقق من اسم المستخدم وكلمة المرور");
                    }
          
                      
                      
          } catch (IOException ex) {
          }

    }
      
      public void exit(){
         Platform.exit();
      }

        ///////////////Mune Muose
       public void entred (Event e){
((Button)e.getSource()).setScaleX(1.1);
((Button)e.getSource()).setScaleY(1.1);
((Button)e.getSource()).setTextFill(Color.BLUE);
if(((Button)e.getSource()).getText().equals("خروج")){
((Button)e.getSource()).setTextFill(Color.RED);
}
       }
       
       public void exited (Event e){
((Button)e.getSource()).setScaleX(1);
((Button)e.getSource()).setScaleY(1);
((Button)e.getSource()).setTextFill(Color.BLACK);
if(((Button)e.getSource()).getText().equals("خروج")){
((Button)e.getSource()).setTextFill(Color.BLACK);
}
       }
      
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {

  
    }    
    
}
