
package Service;

import bean.AuthorizeCreditCardBean;
import bean.account_details;
import bean.account_transactions;
import connectDB.connectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service {
    connectDB con=new connectDB();
    Connection connect=con.connectToDB();
    
    public  boolean login(String username, String password){
        boolean value=false;
        try {
            Statement st=connect.createStatement();
            String Query="select * from user_pass where UserName='"+username+"'";
            System.out.println("Query is: "+Query);
            ResultSet rs=st.executeQuery(Query);
           if(rs.next()){
             value= true;  
           }else{
               value= false;
           }
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    public int insertaccount_details(account_details ac){
        int i=0;
        try {
            Statement st=connect.createStatement();
            String Query="insert into account_details values('"+ac.getName()+"','"+ac.getDOB()+"','"+ac.getAddress()+"','"+ac.getEmailID()+"','"+ac.getTypeOfAccount()+"','"+ac.getUserName()+"')";
            System.out.println("Query is: "+Query);
             i=st.executeUpdate(Query);
            if(i>0){
                System.out.println("inside the if statement in service insert into account_details");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public String getAccountNumberfromUserName(String username){
        String accountnumber="";
         try {
            Statement st=connect.createStatement();
            String Query="select * from account_username where UserName='"+username+"'";
            System.out.println("Query is: "+Query);
            ResultSet rs=st.executeQuery(Query);
            if(rs.next()){
                accountnumber=rs.getString("Account Number");
            }
            
    }catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
         return accountnumber;
}
    public int depositFromandCreditTo(account_transactions actdebit, account_transactions actcredit){
        int i=0;
        int j=0;
        try {
            Statement st=connect.createStatement();
            String Query="SELECT * FROM `account_transactions` where `Account Number`='"+actdebit.getWithdrawaccountNo()+"' and `SINo` =(select MAX(`SINo`) from `account_transactions`where `Account Number`='"+actdebit.getWithdrawaccountNo()+"')";
            System.out.println("Query is: "+Query);
            ResultSet rs=st.executeQuery(Query);
            if(rs.next()){
                System.out.println("inside if statement in depositfrom method");
                actdebit.setAvailablebalance(rs.getDouble("Available Balance"));
            }
             System.out.println("available balance is: "+actdebit.getAvailablebalance());
            Double accountbalfinal=actdebit.getAvailablebalance()-actdebit.getWithdraw();
            System.out.println("final account balance is: "+accountbalfinal);
            String Query2="insert into `account_transactions`(`Date`,`Description`,`Withdraw`,`Available Balance`,`Account Number`) values('"+actdebit.getDate()+"','"+actdebit.getDescription()+"',"+actdebit.getWithdraw()+","+accountbalfinal+",'"+actdebit.getWithdrawaccountNo()+"')";
            System.out.println("Query2 is: "+Query2); 
            i=st.executeUpdate(Query2);
            
         
            
            
            
             String Query3="SELECT * FROM `account_transactions` where `Account Number`='"+actcredit.getDepositaccountNo()+"' and `SINo` =(select MAX(`SINo`) from `account_transactions`where `Account Number`='"+actcredit.getDepositaccountNo()+"')";
            System.out.println("Query3 is: "+Query3);
            ResultSet rs1=st.executeQuery(Query3);
            if(rs1.next()){
                System.out.println("inside if statement in depositfrom method crediting");
                actcredit.setAvailablebalance(rs1.getDouble("Available Balance"));
            }
             System.out.println("available balance is: "+actcredit.getAvailablebalance());
            Double accountbalfinalcredit=actcredit.getAvailablebalance()+actcredit.getDeposit();
            System.out.println("final account balance credit is: "+accountbalfinalcredit);
            String Query4="insert into `account_transactions`(`Date`,`Description`,`Deposit`,`Available Balance`,`Account Number`) values('"+actcredit.getDate()+"','"+actcredit.getDescription()+"',"+actcredit.getDeposit()+","+accountbalfinalcredit+",'"+actcredit.getDepositaccountNo()+"')";
            System.out.println("Query4 is: "+Query4); 
            j=st.executeUpdate(Query4);
            
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return j;
    }
    public List< account_transactions> displayStatement(String username,String fromdate,String todate){
        int i=1;
        List< account_transactions> list=new ArrayList< account_transactions>();
        account_transactions act;
        try {
            String accountnumber=getAccountNumberfromUserName(username);
            Statement st=connect.createStatement();
            String Query="select `SINo`,`Date`,`Description`,`Cheque No`,`Withdraw`,`Deposit`,`Available Balance` from `account_transactions` where `Account Number`='"+accountnumber+"' and `Date` between'"+fromdate+"' and'"+todate+"'"; 
             System.out.println("Query for display statement is: "+Query);
             ResultSet rs=st.executeQuery(Query);
             while(rs.next()){
                 act=new account_transactions();
                 act.setSINo(i);
                 act.setDate(rs.getString("Date"));
                 act.setDescription(rs.getString("Description"));
                 act.setChequeNo(rs.getString("Cheque No"));
                 act.setWithdraw(rs.getDouble("Withdraw"));
                 act.setDeposit(rs.getDouble("Deposit"));
                 act.setAvailablebalance(rs.getDouble("Available Balance"));
                 list.add(act);
                 i++;
             }
                    } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list; 
    }
    
    
    public int authorizecreditcard(AuthorizeCreditCardBean ab){
        int i=0;
    
        if(ab.getAmount()<100000.00){
            try {
                System.out.println("inside if , less than 1 lakh:");
                Statement st=connect.createStatement();  
                String QueryCheck="select * from authorize_creditcard where CardNumber='"+ab.getCardNumber()+"'";
                ResultSet rs=st.executeQuery(QueryCheck);
                if(rs.next()){
                    
                    System.out.println("inside if checked the cardnumber is present in table:");
                String Query="insert into authorize_creditcard values('"+ab.getName()+"','"+ab.getCardNumber()+"',"+ab.getCvv()+","+ab.getAmount()+")";
                System.out.println("Query is: "+Query);
                i=st.executeUpdate(Query);
                }   
            
            } catch (SQLException ex) {
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            
        }else{
            
            System.out.println("inside else amount is greater than 1 lakh");
        }


        return i;   
    }
    
}
