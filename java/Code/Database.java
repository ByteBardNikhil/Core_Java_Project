
package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    
        
    public boolean DatabaseCreate(String check,String a[],String var)
    {boolean flag;
     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/atm";
            Connection con = DriverManager.getConnection(url,"root","1234");
            Statement smt=con.createStatement();
            PreparedStatement psmt;
            
            if(check.equals("SecretCode"))
            {String code=var;
                String q="select *from SecretCode";
                ResultSet rs=smt.executeQuery(q);
                while(rs.next())
                {
                    if(code.equals(rs.getString("code")))
                    {
                        return flag=true;
                    }
                }
            }
            else
                if(check.equals("AccountDetails")||check.equals("phonenumbercheck"))
            {
                String q="select *from ad";
                ResultSet rs=smt.executeQuery(q);
               
                
                while(rs.next())
                {
                    if(check.equals("AccountDetails"))
                    {
                if(a[0].equals(rs.getString("Acc_Num"))&&a[1].equals(rs.getString("PIN")))   
                    { 
                        return flag=true;
                    }
                    }
                    else
                    {String pno=var;
                        if(pno.equals(rs.getString("phoneno")))
                        {
                            return flag=true;
                        }
                    }
                }
              }
            else
               if(check.equals("onlyaccno"))
               {   
               
                   String accno=var;
                 
               String q="select Acc_Num from ad;";
               ResultSet rs=smt.executeQuery(q);
               while(rs.next())
               {
               if(accno.equals(rs.getString("AccountNumber")))   
                    { 
                        return flag=true;
                    }
               }
               
               }
            else
                   if(check.equals("deposit"))
                   {
                      // Account Number :  a[0]
                       //Balance : a[1]
                       
                       String q1="select balance from ad where acc_num="+Integer.parseInt(a[0]);
                       ResultSet rs=smt.executeQuery(q1);
                       rs.next();
                       double prevBalance=Double.parseDouble(rs.getString("balance"));
                       System.out.println("Preve Balance : "+prevBalance);
                       double newBalance =prevBalance +Double.parseDouble(a[1]);
                       String q2="update ad set balance ="+newBalance+ "where acc_num="+Integer.parseInt(a[0])+";";
                       smt.executeUpdate(q2);
                       return true;
               }
            else
                       if(check.equals("withdraw"))
                       {
                           //Account Number = a[0];
                           //Withdraw amt = a[1];
                          
                         String q1="select balance from ad where acc_num="+Integer.parseInt(a[0]);
                          
                         ResultSet rs=smt.executeQuery(q1);
                       
                         
                         rs.next();
                         double balance=rs.getDouble(1);
                         System.out.println("Balance before deduction : "+balance);
                         balance=balance-Double.parseDouble(a[1]);
                         System.out.println("Balance after deduction : "+balance);
                         String q2="update ad set balance ="+balance+" where acc_num ="+Integer.parseInt(a[0]);
                        
                         smt.executeUpdate(q2);
                         return true;
                          
                          
                       }
             if (check.equals("checkpin"))
         {
            
            int accno=Integer.parseInt(a[0]);
             System.out.println("aCC : "+a[0]);
            String q="select pin from ad where acc_num="+Integer.parseInt(a[0])+";";
            
            ResultSet rs=smt.executeQuery(q);
            rs.next();
             System.out.println("Pin Original : "+rs.getInt(1));
           if(rs.getInt(1)==Integer.parseInt(a[1]))
           {
               return true;
           }
       }
             else
                 if(check.equals("UpDatePin"))
                 {
                     System.out.println("a[1] : "+a[1]);
                     String q2="update ad set pin = "+Integer.parseInt(a[1])+" where acc_num ="+Integer.parseInt(a[0])+";";
                     smt.executeUpdate(q2);
                     return true;
                   
                 }
            con.close();
            smt.close();
        } 
       
        catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
     
    }
    
    public double getBalance(String accno)
    {double bal=0.0;
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/atm";
          Connection con=DriverManager.getConnection(url,"root","1234");
          Statement smt=con.createStatement();
          String q="select balance from ad where acc_num = "+Integer.parseInt(accno)+";";
          ResultSet rs=smt.executeQuery(q);
          rs.next();
          bal=rs.getDouble(1);
            System.out.println("Balance in double : "+bal);
          
          smt.close();
          con.close();
          
        
        }catch(SQLException s)
        {
            System.out.println(s);
        }
        catch(ClassNotFoundException c)
        {
            System.out.println(c);
        }
        
      return bal;  
       
    }
}
       
         
   
  
 
  
       
   
    

