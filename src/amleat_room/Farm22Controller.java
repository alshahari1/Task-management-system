/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amleat_room;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javafx.event.ActionEvent;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;


public class Farm22Controller implements Initializable {
Connection con;

    ////// الربط بين عناصر الواجهه وبرمجة العناصر
     @FXML
    TextField M_ALL_mtabah;
     @FXML
    TextField M_ALL_monjz;
     @FXML
    TextField M_ALL_not_monjz;
   
     @FXML
    TextField M_ALL_malqe;
     ///////////الخيارات 
    
     //////////////// مربعات الادخال
     @FXML
     TextField num_M;
     @FXML
     TextField da_M;
     @FXML
     ComboBox tayp_M;
     @FXML
     TextField Jhah_M;
     @FXML
     TextArea title_M;
     @FXML
     TextField days_M;
     @FXML
     TextField mtaba_M;
     @FXML
     TextField mstfed_M;
     @FXML
     ComboBox ahmeh_M;
     @FXML
     TextArea ejra_M;
     @FXML
     TextField natgfinl_M;
     @FXML
     ComboBox natg_M;
     @FXML
     TextField nsbh_M;
     @FXML
     TextField mdah_M;
     @FXML
     Label doneB;
     
     ///التقارير
     
     @FXML
     TextField M2;
//////////////الجدول
     @FXML
     TableView TreeTableViewT;
     
     @FXML
    TableColumn<Mtabah,Integer>T_num_M;
    @FXML
    TableColumn<Mtabah,String>T_da_M;
    @FXML
    TableColumn<Mtabah,String>T_tayp_M;    
    @FXML
    TableColumn<Mtabah,String>T_Jhah_M;
    @FXML
    TableColumn<Mtabah,String>T_title_M;
    @FXML
    TableColumn<Mtabah,String>T_ahmeh_M;
    @FXML
    TableColumn<Mtabah,String>T_mtaba_M;
    @FXML
    TableColumn<Mtabah,String>T_mstfed_M;
    @FXML
    TableColumn<Mtabah,Integer>T_days_M;
    @FXML
    TableColumn<Mtabah,String>T_ejra_M;
    @FXML
    TableColumn<Mtabah,String>T_natg_M;
    @FXML
    TableColumn<Mtabah,String>T_natgfinl_M;
    @FXML
    TableColumn<Mtabah,Integer>T_nsbh_M;
    @FXML
    TableColumn<Mtabah,String>T_mdah_M;
     
        ObservableList<Mtabah> listM ;

//////////////الجدول1
     @FXML
     TableView TreeTableViewT1;
     
     @FXML
    TableColumn<Mtabah,Integer>T_num_M1;
    @FXML
    TableColumn<Mtabah,String>T_da_M1;
    @FXML
    TableColumn<Mtabah,String>T_tayp_M1;    
    @FXML
    TableColumn<Mtabah,String>T_Jhah_M1;
    @FXML
    TableColumn<Mtabah,String>T_title_M1;
    @FXML
    TableColumn<Mtabah,String>T_ahmeh_M1;
    @FXML
    TableColumn<Mtabah,String>T_mtaba_M1;
    @FXML
    TableColumn<Mtabah,String>T_mstfed_M1;
    @FXML
    TableColumn<Mtabah,Integer>T_days_M1;
    @FXML
    TableColumn<Mtabah,String>T_ejra_M1;
    @FXML
    TableColumn<Mtabah,String>T_natg_M1;
    @FXML
    TableColumn<Mtabah,String>T_natgfinl_M1;
    @FXML
    TableColumn<Mtabah,Integer>T_nsbh_M1;
    @FXML
    TableColumn<Mtabah,String>T_mdah_M1;
     
        ObservableList<Mtabah> listM1 ;

    //////////////الجدول11
     @FXML
     TableView TreeTableViewT11;
     
     @FXML
    TableColumn<Mtabah,Integer>T_num_M11;
    @FXML
    TableColumn<Mtabah,String>T_da_M11;
    @FXML
    TableColumn<Mtabah,String>T_tayp_M11;    
    @FXML
    TableColumn<Mtabah,String>T_Jhah_M11;
    @FXML
    TableColumn<Mtabah,String>T_title_M11;
    @FXML
    TableColumn<Mtabah,String>T_ahmeh_M11;
    @FXML
    TableColumn<Mtabah,String>T_mtaba_M11;
    @FXML
    TableColumn<Mtabah,String>T_mstfed_M11;
    @FXML
    TableColumn<Mtabah,Integer>T_days_M11;
    @FXML
    TableColumn<Mtabah,String>T_ejra_M11;
    @FXML
    TableColumn<Mtabah,String>T_natg_M11;
    @FXML
    TableColumn<Mtabah,String>T_natgfinl_M11;
    @FXML
    TableColumn<Mtabah,Integer>T_nsbh_M11;
    @FXML
    TableColumn<Mtabah,String>T_mdah_M11;
     
        ObservableList<Mtabah> listM11 ;

////البحث
@FXML
TextField S_title_M;   

@FXML
TextField S_num_M;

@FXML
TextField S_da_M;

@FXML
TextField S_ahmeh_M;

@FXML
TextField S_tayp_M;

@FXML
Button ButtonReport;
// التعديل
int indexM = -1;
 ////////////////التنقل بين البرنامج
      public void login (Event e){
          
          //////////file fxml
          try {
              Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
              
                Scene scene = new Scene(root);
                
                Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
                     stage.setScene(scene); 
                      stage.setTitle("القائمة");
                      
                      ///////////Code menu Center
                      Rectangle2D rd= Screen.getPrimary().getVisualBounds();
                      stage.setX((rd.getWidth() - stage.getWidth())/2);
                      stage.setY((rd.getHeight() - stage.getHeight())/2);

                      
                      
          } catch (IOException ex) {
          }

    }
      


                       public void Report1(Event e){


    }
                       
                       public void Rend() throws JRException{
                           
             
                           
                       }
                      
//            public void Report(){
////              ButtonReport = DB.
//            }

    
        
    
        

///  اغلاق البرنامج
      public void exit(){
         Platform.exit();
      }
 
     
     
  ///////////////Mune Muose التأشير بالماوس
       public void entred (Event e){
((Button)e.getSource()).setScaleX(1.1);
((Button)e.getSource()).setScaleY(1.1);
((Button)e.getSource()).setTextFill(Color.BLUE);
if(((Button)e.getSource()).getText().equals("خروج")){
((Button)e.getSource()).setTextFill(Color.RED);
}
       }
       
       public void exited (Event e){
     doneB.setVisible(false);
//  listM = DB.getMtabah();
//        TreeTableViewT.setItems(listM);
//     
//        listM1 = DB.getMtabah1();
//        TreeTableViewT1.setItems(listM1);
//        
//        
//        listM11 = DB.getMtabah11();
//        TreeTableViewT11.setItems(listM11);
        
((Button)e.getSource()).setScaleX(1);
((Button)e.getSource()).setScaleY(1);
((Button)e.getSource()).setTextFill(Color.BLACK);
if(((Button)e.getSource()).getText().equals("خروج")){
((Button)e.getSource()).setTextFill(Color.BLACK);
}
       }
       public void exitedButtomUbdate (Event e){
     doneB.setVisible(false);
  listM = DB.getMtabah();
        TreeTableViewT.setItems(listM);
     
        listM1 = DB.getMtabah1();
        TreeTableViewT1.setItems(listM1);
        
        
        listM11 = DB.getMtabah11();
        TreeTableViewT11.setItems(listM11);
        
((Button)e.getSource()).setScaleX(1);
((Button)e.getSource()).setScaleY(1);
((Button)e.getSource()).setTextFill(Color.BLACK);
if(((Button)e.getSource()).getText().equals("خروج")){
((Button)e.getSource()).setTextFill(Color.BLACK);
}
       }
           public void insert_Mtabah(){
        int num1 = Integer.parseInt(num_M.getText()); //جلب النص

        String title2 = da_M.getText();
        String type3 = tayp_M.getSelectionModel().getSelectedItem().toString();//// الكولموبوكس
        
        String av4 = Jhah_M.getText();
        String av5 = title_M.getText();

        int num6 = Integer.parseInt(days_M.getText());
        String av7 = mtaba_M.getText();
        String av8 = mstfed_M.getText();
        String type9 = ahmeh_M.getSelectionModel().getSelectedItem().toString();//// الكولموبوكس
        String av10 = ejra_M.getText();
        String av11 = natgfinl_M.getText();
        String type12 = natg_M.getSelectionModel().getSelectedItem().toString();//// الكولموبوكس
        int av13 = Integer.parseInt(nsbh_M.getText());
        String av14 = mdah_M.getText();

        

        if(!DB.insert_Mtabah("Mtabah", num1, title2, type3, av4, av5, num6, av7,av8, type9, av10, av11,type12,av13,av14)){
          //  doneB.setText("لم تتم الاضافة");
        //   doneB.setVisible(true);
      //                doneB.setVisible(false);
            //                 JOptionPane.showMessageDialog(null,e.getMessage());

           JOptionPane.showMessageDialog(null,"not insert");
        
        } else {
//  /////////////////////
//            listB.add(new Book(num,title,cost,av,type1,type2));
//            ////////////////
            doneB.setText("تم الاضافة");
            doneB.setVisible(true);
 M_ALL_mtabah.setText(DB.count("num_M","Mtabah")+"");
    M_ALL_monjz.setText(DB.countWHERE("num_M","Mtabah","منجز")+"");
    M_ALL_not_monjz.setText(DB.countWHERE("num_M","Mtabah","معلق")+""); 
    M_ALL_malqe.setText(DB.countWHERE("num_M","Mtabah","ملغي")+""); 

//            Totol_Cost_Book.setText(Integer.parseInt(Totol_Cost_Book.getText())+cost+"");
        }

    }

           
            public void SearchMtabah(){
              String ST = S_title_M.getText();
//              textArea_display.setText(DB.Search(num)+"");
              listM = DB.SearchMtitle(ST);
              TreeTableViewT.setItems(listM);
            }
       
            public void SearchMtabah2(){
              int num = Integer.parseInt(S_num_M.getText());
//              textArea_display.setText(DB.Search(num)+"");
              listM = DB.SearchMtitle2(num);
              TreeTableViewT.setItems(listM);
            }
            
              public void SearchMtabah3(){
              String ST = S_da_M.getText();
//              textArea_display.setText(DB.Search(num)+"");
              listM = DB.SearchMtitle3(ST);
              TreeTableViewT.setItems(listM);
            }
              
               public void SearchMtabah4(){
              String ST = S_ahmeh_M.getText();
//              textArea_display.setText(DB.Search(num)+"");
              listM = DB.SearchMtitle4(ST);
              TreeTableViewT.setItems(listM);
            }
               
                public void SearchMtabah5(){
              String ST = S_tayp_M.getText();
//              textArea_display.setText(DB.Search(num)+"");
              listM = DB.SearchMtitle5(ST);
              TreeTableViewT.setItems(listM);
            }
                
                public void getselectedMtabah(){

                    indexM = TreeTableViewT.getSelectionModel().getSelectedIndex();
                    
                    if(indexM <= -1){return;
                    }
                   
                    
                    num_M.setText(T_num_M.getCellData(indexM).toString());
                    da_M.setText(T_da_M.getCellData(indexM).toString());
                    tayp_M.getSelectionModel().select(T_tayp_M.getCellData(indexM));
                    Jhah_M.setText(T_Jhah_M.getCellData(indexM).toString());
                    title_M.setText(T_title_M.getCellData(indexM).toString());
                    ahmeh_M.getSelectionModel().select(T_ahmeh_M.getCellData(indexM));
                    mtaba_M.setText(T_mtaba_M.getCellData(indexM).toString());
                    mstfed_M.setText(T_mstfed_M.getCellData(indexM).toString());
                    days_M.setText(T_days_M.getCellData(indexM).toString());
                    ejra_M.setText(T_ejra_M.getCellData(indexM).toString());
                    natg_M.getSelectionModel().select(T_natg_M.getCellData(indexM));
                    natgfinl_M.setText(T_natgfinl_M.getCellData(indexM).toString());
                    nsbh_M.setText(T_nsbh_M.getCellData(indexM).toString());
                    mdah_M.setText(T_mdah_M.getCellData(indexM).toString());

                }
                
                  public void updateMtabah(){
                      // او اطرحم بداخل داله
        int num1 = Integer.parseInt(num_M.getText()); //جلب النص

        String title2 = da_M.getText();
        
        String type3 = tayp_M.getSelectionModel().getSelectedItem().toString();//// الكولموبوكس
        
        String av4 = Jhah_M.getText();
        String av5 = title_M.getText();

        int num6 = Integer.parseInt(days_M.getText());
        String av7 = mtaba_M.getText();
        String av8 = mstfed_M.getText();
        String type9 = ahmeh_M.getSelectionModel().getSelectedItem().toString();//// الكولموبوكس
        String av10 = ejra_M.getText();
        String av11 = natgfinl_M.getText();
        String type12 = natg_M.getSelectionModel().getSelectedItem().toString();//// الكولموبوكس
        int av13 = Integer.parseInt(nsbh_M.getText());
        String av14 = mdah_M.getText();

        
        if(DB.updateMtitle2("Mtabah","where num_M ="+num1,title2,type3,av4,av5,num6,av7,av8,type9,av10,av11,type12,av13,av14)){
            listM.set(indexM, new Mtabah(num1, title2, type3, av4, av5, num6, av7, av8, type9, av10, av11, type12, av13, av14));
            doneB.setText("تم التعديل");
            doneB.setVisible(true);
            Clear();
        }
   }
   
                  public void Clear(){
        num_M.clear();
        da_M.clear();
        tayp_M.getSelectionModel().select(-1);
        Jhah_M.clear();
        title_M.clear();
        mtaba_M.clear();
        mstfed_M.clear();
        ahmeh_M.getSelectionModel().select(-1);
        ejra_M.clear();
        natgfinl_M.clear();
        natg_M.getSelectionModel().select(-1);
        mdah_M.clear();          
                  }
                  
                  public void delete(){
                      
                      if(indexM == -1){
                          return;
                          
                      }
                      
                      if(DB.Delete("Mtabah","num_M ="+T_num_M.getCellData(indexM))){
                    doneB.setText("تم الحذف");
                    doneB.setVisible(true);
                    M_ALL_malqe.setText(Integer.parseInt(M_ALL_malqe.getText())-1+"");
                    listM.remove(indexM);
                    indexM = -1;
                    Clear();      
                      }
                  }
                  
                  
 @FXML
    private void handleButtonAction(ActionEvent event) {
            con = DB.connent();
    try {
        JasperReport jr = JasperCompileManager.compileReport("M1.jrxml");
            JasperPrint jp =  JasperFillManager.fillReport(jr, null,con);
            JasperViewer.viewReport(jp,false);            
    } catch (JRException ex) {
        Logger.getLogger(Farm22Controller.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    }
    
      @FXML
    private void handleButtonAction2(ActionEvent event) {
           con = DB.connent();
//                         String ST = 

    try {
        JasperDesign id = JRXmlLoader.load("M1.jrxml");
        String sql = "SELECT\n" +
"     Mtabah.`num_M` AS Mtabah_num_M,\n" +
"     Mtabah.`da_M` AS Mtabah_da_M,\n" +
"     Mtabah.`tayp_M` AS Mtabah_tayp_M,\n" +
"     Mtabah.`Jhah_M` AS Mtabah_Jhah_M,\n" +
"     Mtabah.`title_M` AS Mtabah_title_M,\n" +
"     Mtabah.`days_M` AS Mtabah_days_M,\n" +
"     Mtabah.`mtaba_M` AS Mtabah_mtaba_M,\n" +
"     Mtabah.`mstfed_M` AS Mtabah_mstfed_M,\n" +
"     Mtabah.`ahmeh_M` AS Mtabah_ahmeh_M,\n" +
"     Mtabah.`ejra_M` AS Mtabah_ejra_M,\n" +
"     Mtabah.`natgfinl_M` AS Mtabah_natgfinl_M,\n" +
"     Mtabah.`natg_M` AS Mtabah_natg_M,\n" +
"     Mtabah.`nsbh_M` AS Mtabah_nsbh_M,\n" +
"     Mtabah.`mdah_M` AS Mtabah_mdah_M\n" +
"FROM\n" +
"     `Mtabah` Mtabah\n"
                + "WHERE\n"
                + "natg_M = '"+M2.getText()+"' ";
        JRDesignQuery newQuery = new JRDesignQuery();
        newQuery.setText(sql);
        id.setQuery(newQuery);
        
        JasperReport jr = JasperCompileManager.compileReport(id);
            JasperPrint jp =  JasperFillManager.fillReport(jr, null,con);
            JasperViewer.viewReport(jp,false);            
    } catch (JRException ex) {
        Logger.getLogger(Farm22Controller.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex.getMessage());

    }

    }
    
      @FXML
    private void handleButtonAction3(ActionEvent event) {
            con = DB.connent();
//                         String ST = 

    try {
        JasperDesign id = JRXmlLoader.load("M1.jrxml");
        String sql = "SELECT\n" +
"     Mtabah.`num_M` AS Mtabah_num_M,\n" +
"     Mtabah.`da_M` AS Mtabah_da_M,\n" +
"     Mtabah.`tayp_M` AS Mtabah_tayp_M,\n" +
"     Mtabah.`Jhah_M` AS Mtabah_Jhah_M,\n" +
"     Mtabah.`title_M` AS Mtabah_title_M,\n" +
"     Mtabah.`days_M` AS Mtabah_days_M,\n" +
"     Mtabah.`mtaba_M` AS Mtabah_mtaba_M,\n" +
"     Mtabah.`mstfed_M` AS Mtabah_mstfed_M,\n" +
"     Mtabah.`ahmeh_M` AS Mtabah_ahmeh_M,\n" +
"     Mtabah.`ejra_M` AS Mtabah_ejra_M,\n" +
"     Mtabah.`natgfinl_M` AS Mtabah_natgfinl_M,\n" +
"     Mtabah.`natg_M` AS Mtabah_natg_M,\n" +
"     Mtabah.`nsbh_M` AS Mtabah_nsbh_M,\n" +
"     Mtabah.`mdah_M` AS Mtabah_mdah_M\n" +
"FROM\n" +
"     `Mtabah` Mtabah\n"
                + "WHERE\n"
                + "da_M LIKE '%"+M2.getText()+"%' ";
        JRDesignQuery newQuery = new JRDesignQuery();
        newQuery.setText(sql);
        id.setQuery(newQuery);
        
        JasperReport jr = JasperCompileManager.compileReport(id);
            JasperPrint jp =  JasperFillManager.fillReport(jr, null,con);
            JasperViewer.viewReport(jp,false);            
    } catch (JRException ex) {
        Logger.getLogger(Farm22Controller.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null,ex.getMessage());

    }

    }
    
//      @FXML
//    private void handleButtonAction4(ActionEvent event) {
//con = DB.connent();
//              String ST = M2.getText();
//
//    try {
//        String path = "M2.jrxml";
//                JasperDesign id = JRXmlLoader.load(path);
//
//                String sql = "select * from Mtabah WHERE da_M LIKE '%"+ST+"%'";
//        
//        JRDesignQuery newQuery = new JRDesignQuery();
//        newQuery.setText(sql);
//        id.setQuery(newQuery);
//        
//        JasperReport jr = JasperCompileManager.compileReport(id);
//            JasperPrint jp =  JasperFillManager.fillReport(jr, null,con);
//            JasperViewer.viewReport(jp,false);    
//    } catch (JRException ex) {
//        Logger.getLogger(Farm22Controller.class.getName()).log(Level.SEVERE, null, ex);
//        JOptionPane.showMessageDialog(null,ex.getMessage());
//    }
//  
//    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        Report.connent();
    /// الجدول
        T_num_M.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("num_M"));
        T_da_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("da_M"));
        T_tayp_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("tayp_M"));        
        T_Jhah_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("Jhah_M"));        
        T_title_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("title_M"));        
        T_ahmeh_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("ahmeh_M"));        
        T_mtaba_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mtaba_M"));        
        T_mstfed_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mstfed_M"));                
        T_days_M.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("days_M"));
        T_ejra_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("ejra_M"));        
        T_natg_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("natg_M")); 
        T_natgfinl_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("natgfinl_M")); 
        T_nsbh_M.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("nsbh_M"));
        T_mdah_M.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mdah_M"));                
        
        
        listM = DB.getMtabah();
        TreeTableViewT.setItems(listM);
        
        /// الجدول1
        T_num_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("num_M"));
        T_da_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("da_M"));
        T_tayp_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("tayp_M"));        
        T_Jhah_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("Jhah_M"));        
        T_title_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("title_M"));        
        T_ahmeh_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("ahmeh_M"));        
        T_mtaba_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mtaba_M"));        
        T_mstfed_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mstfed_M"));                
        T_days_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("days_M"));
        T_ejra_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("ejra_M"));        
        T_natg_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("natg_M")); 
        T_natgfinl_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("natgfinl_M")); 
        T_nsbh_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("nsbh_M"));
        T_mdah_M1.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mdah_M"));                
        
        
        listM1 = DB.getMtabah1();
        TreeTableViewT1.setItems(listM1);
       
        /// الجدول11
        T_num_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("num_M"));
        T_da_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("da_M"));
        T_tayp_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("tayp_M"));        
        T_Jhah_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("Jhah_M"));        
        T_title_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("title_M"));        
        T_ahmeh_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("ahmeh_M"));        
        T_mtaba_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mtaba_M"));        
        T_mstfed_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mstfed_M"));                
        T_days_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("days_M"));
        T_ejra_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("ejra_M"));        
        T_natg_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("natg_M")); 
        T_natgfinl_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("natgfinl_M")); 
        T_nsbh_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,Integer>("nsbh_M"));
        T_mdah_M11.setCellValueFactory(new PropertyValueFactory<Mtabah,String>("mdah_M"));                
        
        
        listM11 = DB.getMtabah11();
        TreeTableViewT11.setItems(listM11);
       
    /// الأحصائيات
    M_ALL_mtabah.setText(DB.count("num_M","Mtabah")+"");
    M_ALL_monjz.setText(DB.countWHERE("num_M","Mtabah","منجز")+"");
    M_ALL_not_monjz.setText(DB.countWHERE("num_M","Mtabah","معلق")+""); 
    M_ALL_malqe.setText(DB.countWHERE("num_M","Mtabah","ملغي")+""); 
        //num_M.setText(DB.count("num_M","Mtabah")+"");
      //  da_MsetText(DB.count)+""
    
    ///////// الكولوبوكس الخيارات 
     ObservableList list = FXCollections.observableArrayList("وارد","صادر");
     tayp_M.setItems(list);
     ObservableList list2 = FXCollections.observableArrayList("ملغي","معلق","منجز");
     natg_M.setItems(list2);
     ObservableList list3 = FXCollections.observableArrayList("غير مهم","متوسط","مهم جداً");
     ahmeh_M.setItems(list3);
    
    }    
    
}
