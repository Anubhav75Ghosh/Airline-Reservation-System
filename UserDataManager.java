/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlineReservation;

import AirlineReservation.UserInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Anubhav
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UserDataManager {
    public void addUser(String name, String emailID, String Username, String Password, String path){
        UserInfo user = new UserInfo(name, emailID, Username, Password);
        try{
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(user.name + "," + user.emailID + "," + user.Username + "," + user.Password);
            pw.flush();
            pw.close();
        }
        catch (Exception e){
            System.out.print("Error");
        }
        
    }
    public boolean verify(String Username, String Password, String path){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())!=null){
                String[] data = line.split(",");
                if ((data[2].equals(Username))&&(data[3].equals(Password))){
                    return true;
                }
            }
        }
        catch (FileNotFoundException fe) {
            System.out.println("Error1");
        }
        catch (IOException ioe){
            System.out.println("Error2");
        }
        return false;
    }
    public boolean checkIfPresent(String EmailID, String Username, String path){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())!=null){
                String[] data = line.split(",");
                if ((data[2].equals(Username))||(data[1].equals(EmailID))){
                    return false;
                }
            }
        }
        catch (FileNotFoundException fe) {
            System.out.println("Error1");
        }
        catch (IOException ioe){
            System.out.println("Error2");
        }
        return true;
    }
    
   public UserInfo userdata(String Username, String Password, String path){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())!=null){
                String[] data = line.split(",");
                
                if ((data[2].equals(Username))&&(data[3].equals(Password))){
                    UserInfo user = new UserInfo(data[0], data[1], data[2], data[3]) ;
                    return user;
                }
            }
        }
        catch (FileNotFoundException fe) {
            System.out.println("Error1");
        }
        catch (IOException ioe){
            System.out.println("Error2");
        }
        return null ;
    }
}
