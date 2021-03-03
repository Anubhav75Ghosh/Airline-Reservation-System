/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlineReservation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import AirlineReservation.PaymentInfo;
/**
 *
 * @author Anubhav
 */

    



class PaymentManager
{
    public boolean checkCard(String cardNumber, String cardName, String cvv, String dateExpirey, String path){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine())!=null)
            {
                String[] data = line.split(",");
                
                if((data[0].equals(cardNumber) && (data[1].equals(cardName)) && data[2].equals(cvv) && (data[3].equals(dateExpirey)) )){
                                   
                  return true;
                      
                 } 
            }
        }
        catch (FileNotFoundException fe) {
            System.out.println("File Error - Resolving issue");
            String fullpath = "C:\Users\Anubhav\Desktop\Netbeansworkspace\FlightManager\src\AirlineReservation\PaymentCardDatabase.csv";
            return(checkCard(cardNumber, cardName, cvv, dateExpirey, fullpath));
        }
        catch (IOException ioe){
            System.out.println("Error2");
        }
        return false;
    }
    public int getPrice(Flights flight){
        return (flight.price);
    }
    public boolean makePayment(int price){
        return true;
    }
}
