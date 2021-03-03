# Airline-Reservation-System
This is simple Airline Reservation System developed by Anubhav Ghosh, Arijit Dutta and Aninda Roy which accesses a flight database, credit card database and a user database and runs on Java Swing. This has been developed for the fifth semester SWE and OOP project for the term 2018-2022. For more details regarding the project, visit: http://103.127.146.165/wiki/index.php?title=RSS:Main

Note: While the file reading parts of UserInfo.csv and FlightDetails.csv work fine, the file reading part of PaymentCardDatabase.csv seems to return a FileNotFound exception, even though it is in the same package. This issue is quietly resolved in boolean cardDetaila(...) of PaymentManager.java where in FileNotFoundException fe, we set the complete and detailed file path, as it is saved in the drive/ folder. It works when we do this. Hence, if this code is checked, please adjust the file path acccordingly. 

P.S.: Run the MAIN.java class, as it is the designated driver class.
