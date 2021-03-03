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

      public class Flights{
            String Airline;
            String Flightnum;
            int price;
            String DepartureDate;
            String Source;
            String Destination;
            String DepartureTime;
            String ArrivalTime;
            String Duration;
            int Seats;
            
            public Flights(String DepartureDate,String Airline,String Flightnum, String Source, String Destination, String DepartureTime, String ArrivalTime, String Duration, int Seats, int price){
                this.Airline = Airline;
                this.Flightnum = Flightnum;
                this.price = price;
                this.DepartureDate = DepartureDate;
                this.DepartureTime = DepartureTime;
                this.Source = Source;
                this.Destination = Destination;
                this.ArrivalTime = ArrivalTime;
                this.Seats = Seats;
                this.Duration = Duration;
                
            }
    }

