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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anubhav
 */
class Flight_Manager{
    public boolean checkRequirements(String departdate, String Source, String Dest, int seats, String path){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())!=null){
                String[] data = line.split(",");
                if ((data[0].equals(departdate)) && (data[3].equals(Source)) && (data[4].equals(Dest)) && (Integer.parseInt(data[8])>seats))
                                   
                  return true;
                      
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
    public boolean show(String s){
        String path = "C:\Users\Anubhav\Desktop\Netbeansworkspace\FlightManager\Flightdata.csv";
        boolean b = checkRequirements("03-02-2021",s,"Bangalore",1,path );
        
        
        return b;
        
    }
    public List<Flights> giveFlight(String departdate, String Source, String Dest, int seats, String path){
    //public static String[][] readData(String departdate, String Source, String Dest, int seats, String path){
        List<Flights> flightavailable = new ArrayList<Flights>();
        String line = "";
        
       
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())!=null){
                String[] data = line.split(",");
                if ((data[0].equals(departdate)) && (data[3].equals(Source)) && (data[4].equals(Dest)) && (Integer.parseInt(data[8])>seats))
                {
                   
                   Flights f = new Flights(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], Integer.parseInt(data[8]),Integer.parseInt(data[9]));
                   flightavailable.add(f);
                }      
                    
            } 
            }
        catch (FileNotFoundException fe) {
            System.out.println("Error1");
        }
        catch (IOException ioe){
            System.out.println("Error2");
        }
        /*int size = flightavailable.size();
        if (size == 0){return (null);}
        String[] array = new String[size];
        flightavailable.toArray(array);
        String[][]flightarray= new String[size/10][10];
        int x=0;
        for (int i = 0; i < size/10 ; i++) {
            for (int j = 0; j < 10; j++){
                flightarray[i][j] = array[x++];
            }
        }*/
       return flightavailable; 
    }
    
}
