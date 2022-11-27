
package amleat_room;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.JOptionPane;




public class DB {

    
      public static Connection connent(){
        Connection con = null;        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Library2.accdb");
//            JOptionPane.showMessageDialog(null,"Done");

    }catch(Exception e){
//                    JOptionPane.showMessageDialog(null,e.getMessage());
            JOptionPane.showMessageDialog(null,"Not Connect");

        }
        return con;
    }
      
       public static int count(String col,String table) {
  
       Connection con =connent();
       
       try {
           
         PreparedStatement ps =con.prepareStatement("select count("+col+") from "+table);
         //         PreparedStatement ps =con.prepareStatement("select count("+col+") from "+table WHERE natg_M = '%"+منجز"+"%'");

         ResultSet rs = ps.executeQuery();
                   
         if(rs.next()){
         return Integer.parseInt(rs.getString(1));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
       return 0;
}

        public static ObservableList<Mtabah>getMtabah(){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
                   PreparedStatement ps =con.prepareStatement("select * from Mtabah ORDER BY num_M");

   //      PreparedStatement ps =con.prepareStatement("select * from Mtabah WHERE natg_M LIKE '%معلق%'");
//         PreparedStatement ps =con.prepareStatement("select * from Mtabah ORDER BY num_M");
//DESC  ASC
//
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
      //     list.add(new Mtabah());
           list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));

         }
          
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }

        public static ObservableList<Mtabah>getMtabah1(){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
//                   PreparedStatement ps =con.prepareStatement("select * from Mtabah");

         PreparedStatement ps =con.prepareStatement("select * from Mtabah WHERE natg_M LIKE '%معلق%'");
//         PreparedStatement ps =con.prepareStatement("select * from Mtabah ORDER BY num_M");
//DESC  ASC
//
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
      //     list.add(new Mtabah());
           list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));

         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }
       
         public static ObservableList<Mtabah>getMtabah11(){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
//                   PreparedStatement ps =con.prepareStatement("select * from Mtabah");

         PreparedStatement ps =con.prepareStatement("select * from Mtabah WHERE natg_M LIKE '%منجز%'");
//         PreparedStatement ps =con.prepareStatement("select * from Mtabah ORDER BY num_M");
//DESC  ASC
//
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
      //     list.add(new Mtabah());
           list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));

         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }
       
         
       public static int countWHERE(String col,String table,String where) {
  
       Connection con =connent();
       
       try {
           

             PreparedStatement ps =con.prepareStatement("select count("+col+") from "+table+" WHERE natg_M LIKE '%"+where+"%'");

   ResultSet rs = ps.executeQuery();
                   
         if(rs.next()){
         return Integer.parseInt(rs.getString(1));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
       return 0;
}
       
       public static int DATE(String table) {
  
       Connection con =connent();
       
       try {
           

             PreparedStatement ps =con.prepareStatement("SELECT date_G AS SYSDATE From "+table+"");

   ResultSet rs = ps.executeQuery();
                   
         if(rs.next()){
         return Integer.parseInt(rs.getString(1));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
       return 0;
}
       
       
 public static boolean insert_Mtabah(String table,int num_M,String da_M,String tayp_M,String Jhah_M,String title_M,int days_M,String mtaba_M,String mstfed_M,String ahmeh_M,String ejra_M,String natgfinl_M,String natg_M,int nsbh_M,String mdah_M){
  
     Connection con =connent();
       
       try {
          
//             PreparedStatement ps =con.prepareStatement("INSERT INTO "+table+" VALUES('"+unique_number+"','"+title+"','"+cost+"','"+authat+"','"+type_fiction+"','"+type_non_fiction+"')");
         PreparedStatement ps =con.prepareStatement("INSERT INTO "+table+" (num_M, da_M, tayp_M, Jhah_M, title_M, days_M, mtaba_M, mstfed_M, ahmeh_M, ejra_M, natgfinl_M, natg_M, nsbh_M, mdah_M) VALUES ('"+num_M+"',SYSDATE,'"+tayp_M+"','"+Jhah_M+"','"+title_M+"','"+days_M+"','"+mtaba_M+"','"+mstfed_M+"','"+ahmeh_M+"','"+ejra_M+"','"+natgfinl_M+"','"+natg_M+"','"+nsbh_M+"','"+mdah_M+"')");
            ps.execute();
           
           }catch(Exception e){    
             if(table.equals("Mtabah")){
                             JOptionPane.showMessageDialog(null,e.getMessage());
    
               }else{                      
                                  JOptionPane.showMessageDialog(null,e.getMessage());
}
           }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
                  }
    
     return true;
 }  
 
 
public static ObservableList<Mtabah>SearchMtitle(String ST){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
           
         PreparedStatement ps =con.prepareStatement("select num_M, da_M, tayp_M, Jhah_M, title_M, days_M, mtaba_M, mstfed_M, ahmeh_M, ejra_M, natgfinl_M, natg_M, nsbh_M, mdah_M from Mtabah WHERE title_M LIKE '%"+ST+"%'");
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
            list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }


public static ObservableList<Mtabah>SearchMtitle2(int num){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
           
         PreparedStatement ps =con.prepareStatement("select num_M, da_M, tayp_M, Jhah_M, title_M, days_M, mtaba_M, mstfed_M, ahmeh_M, ejra_M, natgfinl_M, natg_M, nsbh_M, mdah_M from Mtabah WHERE num_M LIKE '%"+num+"%'");
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
            list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }
       
public static ObservableList<Mtabah>SearchMtitle3(String ST){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
           
         PreparedStatement ps =con.prepareStatement("select num_M, da_M, tayp_M, Jhah_M, title_M, days_M, mtaba_M, mstfed_M, ahmeh_M, ejra_M, natgfinl_M, natg_M, nsbh_M, mdah_M from Mtabah WHERE da_M LIKE '%"+ST+"%'");
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
            list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }

public static ObservableList<Mtabah>SearchMtitle4(String ST){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
           
         PreparedStatement ps =con.prepareStatement("select num_M, da_M, tayp_M, Jhah_M, title_M, days_M, mtaba_M, mstfed_M, ahmeh_M, ejra_M, natgfinl_M, natg_M, nsbh_M, mdah_M from Mtabah WHERE ahmeh_M LIKE '%"+ST+"%'");
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
            list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }

public static ObservableList<Mtabah>SearchMtitle5(String ST){
     Connection con =connent();      
     ObservableList<Mtabah> list = FXCollections.observableArrayList();

     try {
           
         PreparedStatement ps =con.prepareStatement("select num_M, da_M, tayp_M, Jhah_M, title_M, days_M, mtaba_M, mstfed_M, ahmeh_M, ejra_M, natgfinl_M, natg_M, nsbh_M, mdah_M from Mtabah WHERE tayp_M LIKE '%"+ST+"%'");
         ResultSet rs = ps.executeQuery();
                   
         while(rs.next()){
            list.add(new Mtabah(Integer.parseInt(rs.getString("num_M")),rs.getString("da_M"),rs.getString("tayp_M"),rs.getString("Jhah_M"),rs.getString("title_M"),Integer.parseInt(rs.getString("days_M")),rs.getString("mtaba_M"),rs.getString("mstfed_M"),rs.getString("ahmeh_M"),rs.getString("ejra_M"),rs.getString("natgfinl_M"),rs.getString("natg_M"),Integer.parseInt(rs.getString("nsbh_M")),rs.getString("mdah_M")));
         }
           
    }catch(Exception e){
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
     
        return list;
             }

 public static boolean updateMtitle(String table,String Where ,String da_M,String tayp_M,String Jhah_M,String title_M,int days_M,String mtaba_M,String mstfed_M,String ahmeh_M,String ejra_M,String natgfinl_M,String natg_M,int nsbh_M,String mdah_M){
  
     Connection con =connent();
     String Sql = null ;
     if(table.equals("Mtitle")){
         Sql = "update "+table+" set da_M = '"+da_M+"' ,tayp_M = '"+tayp_M+"', Jhah_M ='"+Jhah_M+"', title_M = '"+title_M+"', days_M ='"+days_M+"', mtaba_M ='"+mtaba_M+"', mstfed_M ='"+mstfed_M+"', ahmeh_M = '"+ahmeh_M+"', ejra_M = '"+ejra_M+"', natgfinl_M = '"+natgfinl_M+"', natg_M = '"+natg_M+"', nsbh_M = '"+nsbh_M+"', mdah_M = '"+mdah_M+"' "+Where;
     }
       
       try {
          
//             PreparedStatement ps =con.prepareStatement("INSERT INTO "+table+" VALUES('"+unique_number+"','"+title+"','"+cost+"','"+authat+"','"+type_fiction+"','"+type_non_fiction+"')");
         PreparedStatement ps =con.prepareStatement(Sql);
            return !ps.execute();
           
           }catch(Exception e){    
             if(table.equals("Mtabah")){
                             JOptionPane.showMessageDialog(null,e.getMessage());
    
               }else{                      
                                  JOptionPane.showMessageDialog(null,e.getMessage());
}
           }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
                  }
    
     return true;
 }  
 public static boolean updateMtitle2(String table,String Where ,String da_M,String tayp_M,String Jhah_M,String title_M,int days_M,String mtaba_M,String mstfed_M,String ahmeh_M,String ejra_M,String natgfinl_M,String natg_M,int nsbh_M,String mdah_M){
  
     Connection con =connent();
     
       
       try {

 PreparedStatement ps =con.prepareStatement("update "+table+" set da_M = '"+da_M+"',tayp_M = '"+tayp_M+"', Jhah_M ='"+Jhah_M+"', title_M = '"+title_M+"', days_M ='"+days_M+"', mtaba_M ='"+mtaba_M+"', mstfed_M ='"+mstfed_M+"', ahmeh_M = '"+ahmeh_M+"', ejra_M = '"+ejra_M+"', natgfinl_M = '"+natgfinl_M+"', natg_M = '"+natg_M+"', nsbh_M = '"+nsbh_M+"', mdah_M = '"+mdah_M+"' "+Where);
            ps.execute();
           
           }catch(Exception e){    
             if(table.equals("Mtabah")){
                             JOptionPane.showMessageDialog(null,e.getMessage());
    
               }else{                      
                                  JOptionPane.showMessageDialog(null,e.getMessage());
}
         }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
                  }
      return true;

 }
public static boolean Delete(String table,String wh){
     Connection con =connent();      

     try {
           
         PreparedStatement ps =con.prepareStatement("Delete from "+table+" where "+wh);
         return !ps.execute();
        
           
    }catch(Exception e){
        if(table.equals("Mtabah")){
                             JOptionPane.showMessageDialog(null,e.getMessage());
    
               }else{                      
                                  JOptionPane.showMessageDialog(null,e.getMessage());
}
        }finally{
              try {
                  con.close();
                  }catch(Exception e){
                  }
       }
       
return false;     
             } 

/////////////////////////////////////////////
}  