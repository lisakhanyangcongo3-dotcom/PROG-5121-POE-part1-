/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class POEPART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Login User = new Login();
        Boolean registered = false;
        Boolean loggedIn = false;
        //Register
        while (registered == false) {
            System.out.println("Enter Username:");
            String username = scan.next();
            System.out.println("Enter Password:");
            String password = scan.next();
            System.out.println("Enter CellPhone:");
            String cellphone = scan.next();
            if (User.registerUser(username, password, cellphone).matches("Registered")) {
                registered = true;
                System.out.println(User.registerUser(username, password, cellphone));
            }

        }
        //Login
        while(loggedIn == false){
            System.out.println("=============Login============");
            System.out.println("Enter Username");
            String username = scan.next();
            System.out.println("Enter Password");
            String password = scan.next();
            if(User.returnLoginStatus(username, password).matches("Login Successful")){
                loggedIn = true;
                System.out.println(User.returnLoginStatus(username, password));
            }
        }

    }

}
