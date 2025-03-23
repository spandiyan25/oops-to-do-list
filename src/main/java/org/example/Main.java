package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        LoginPage loginPage = new LoginPage();
        Map<Integer, List<String>> login = loginPage.LoginDetails();
        List<String> cred = login.get(1);
        boolean loginValidation = loginPage.loginValidation(cred.get(0),cred.get(1));
        if(!loginValidation) {
            System.out.println("Login Attempt failed");
            System.exit(0); // to stop program if condition fails
        }




        }
    }



