import tk.bailinzheng.fm.control.MemberManager;
import tk.bailinzheng.fm.control.TransactionDetails;
import tk.bailinzheng.fm.model.Finacial;
import tk.bailinzheng.fm.model.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagerMain {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("success");
        }catch(ClassNotFoundException e1){
            System.out.println("can not find mysql");
            e1.printStackTrace();
        }

        String url="jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url,    "root","Merphy0210");
            Statement stmt = conn.createStatement();
            System.out.print("success");
            stmt.close();
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        ArrayList<Member> array = new ArrayList<Member>();
        MemberManager mm = new MemberManager();
        ArrayList<Finacial> tda = new ArrayList<Finacial>();
        TransactionDetails td = new TransactionDetails();

        while(true) {
            System.out.println("Welcome to Family manager");
            System.out.println("1 add member");
            System.out.println("2 delete member");
            System.out.println("3 change information");
            System.out.println("4 see the member form");
            System.out.println("5 add one transaction ");
            System.out.println("6 see the transaction ");
            System.out.println("7 exit");
            System.out.println("write your option here:");

            Scanner sc = new Scanner(System.in);

            String line = sc.nextLine();

            switch (line) {
                case "1":
                    mm.addMember(array);
                    break;
                case "2":
                    mm.delete(array);
                    break;
                case "3":
                    mm.change(array);
                    break;
                case "4":
                    mm.form(array);
                    break;
                case "5":
                    td.addTran(tda);
                    break;
                case "6":
                    td.seeTran(tda);
                    break;
                case "7":
                    System.out.println("thanks for your using");
                    System.exit(0);
            }
        }
    }

}
