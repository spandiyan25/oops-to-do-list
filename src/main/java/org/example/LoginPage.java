package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class LoginPage {

    String $user;
    String $password;

    Connection conn = MysqlConection.getConnection();

    LoginPage() throws ClassNotFoundException {}
    public Map<Integer, List<String>> LoginDetails(){
        Scanner s = new Scanner(System.in);
        Map<Integer,List<String>> value = new HashMap<>();
        List<String> list = new ArrayList<>();
        System.out.println("=======   Welcome SPAN Company To Do List====== \n");
        System.out.print("Enter UserName: ");
        String username = s.nextLine();
        System.out.print("Enter password: ");
        String password = s.nextLine();

        list.add(username);
        list.add(password);
        value.put(1,list);
        return value;

    }

    public boolean loginValidation(String user, String password){

        if(conn != null){
            try{
                String query = "Select * from login where username = ?";
                PreparedStatement prp = conn.prepareStatement(query);
                prp.setString(1,user.toLowerCase());
                ResultSet rs = prp.executeQuery();
                while(rs.next()){
                    $user = rs.getString("username");
                    $password = rs.getString("password1");
                }
                rs.close();
                prp.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return password.equalsIgnoreCase($password);
    }
}
