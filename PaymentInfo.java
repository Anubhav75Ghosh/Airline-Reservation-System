/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlineReservation;

/**
 *
 * @author Anubhav
 */
class PaymentInfo{
            String cardNumber ;
            String cardName;
            String cvv;
            String dateExpiry;
           
            String phoneNo;
            
            public PaymentInfo(String cardNumber, String cardName, String cvv, String dateExpiry,  String phoneNo){
                this.cardNumber = cardNumber;
                this.cardName = cardName;
                this.cvv = cvv;
                this.dateExpiry = dateExpiry;
                
                this.phoneNo = phoneNo;
               
            }
    }

