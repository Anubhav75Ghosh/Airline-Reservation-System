/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AirlineReservation;
import AirlineReservation.Flight_Manager;
import AirlineReservation.Flights;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import AirlineReservation.UserInfo;
/**
 *
 * @author Anubhav
 */
public class BookTicket extends javax.swing.JFrame {
    
    String date; 
    String source; 
    String destination; 
    int seats;
    String path;
    Flight_Manager fm;
    List<Flights> getFlights;
    UserInfo user;
    /**
     * Creates new form BookTicket
     */
    public BookTicket(){
        initComponents();
    }
    public BookTicket(String date, String source, String destination,int seats,String path,UserInfo user) {
        initComponents();
        this.date = date;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.path = path;
        this.user = user;
        this.fm = new Flight_Manager();
        this.getFlights  = new ArrayList<Flights>();
        getFlights = fm.giveFlight(date, source, destination,1,path );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBookTicket = new javax.swing.JPanel();
        lbFlight1 = new javax.swing.JLabel();
        lbFlight2 = new javax.swing.JLabel();
        lbFlight3 = new javax.swing.JLabel();
        rbFlight1 = new javax.swing.JRadioButton();
        rbFlight2 = new javax.swing.JRadioButton();
        rbFlight3 = new javax.swing.JRadioButton();
        btBook = new javax.swing.JButton();
        btDisplayFlights = new javax.swing.JButton();
        lbIndex = new javax.swing.JLabel();
        lbWelcomeUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBookTicket.setBackground(new java.awt.Color(0, 0, 0));
        jpBookTicket.setForeground(new java.awt.Color(0, 153, 153));

        lbFlight1.setBackground(new java.awt.Color(255, 255, 255));
        lbFlight1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbFlight1.setForeground(new java.awt.Color(255, 255, 255));
        lbFlight1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lbFlight2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbFlight2.setForeground(new java.awt.Color(255, 255, 255));
        lbFlight2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lbFlight3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbFlight3.setForeground(new java.awt.Color(255, 255, 255));
        lbFlight3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        rbFlight1.setBackground(new java.awt.Color(0, 204, 204));
        rbFlight1.setForeground(new java.awt.Color(0, 204, 204));
        rbFlight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFlight1ActionPerformed(evt);
            }
        });

        rbFlight2.setBackground(new java.awt.Color(0, 204, 204));
        rbFlight2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFlight2ActionPerformed(evt);
            }
        });

        rbFlight3.setBackground(new java.awt.Color(0, 204, 204));
        rbFlight3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFlight3ActionPerformed(evt);
            }
        });

        btBook.setBackground(new java.awt.Color(0, 204, 204));
        btBook.setText("Book Flight");
        btBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBookActionPerformed(evt);
            }
        });

        btDisplayFlights.setBackground(new java.awt.Color(0, 204, 204));
        btDisplayFlights.setText("Display Flights");
        btDisplayFlights.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btDisplayFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisplayFlightsActionPerformed(evt);
            }
        });

        lbIndex.setBackground(new java.awt.Color(0, 0, 0));
        lbIndex.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbIndex.setForeground(new java.awt.Color(255, 255, 255));

        lbWelcomeUser.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lbWelcomeUser.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jpBookTicketLayout = new javax.swing.GroupLayout(jpBookTicket);
        jpBookTicket.setLayout(jpBookTicketLayout);
        jpBookTicketLayout.setHorizontalGroup(
            jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBookTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBookTicketLayout.createSequentialGroup()
                        .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFlight1)
                            .addComponent(rbFlight2)
                            .addComponent(rbFlight3))
                        .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBookTicketLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbIndex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpBookTicketLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lbWelcomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBookTicketLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbFlight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBookTicketLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbFlight2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBookTicketLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbFlight3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBookTicketLayout.createSequentialGroup()
                        .addGap(0, 191, Short.MAX_VALUE)
                        .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBookTicketLayout.createSequentialGroup()
                                .addComponent(btDisplayFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBookTicketLayout.createSequentialGroup()
                                .addComponent(btBook, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192))))))
        );
        jpBookTicketLayout.setVerticalGroup(
            jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBookTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbWelcomeUser)
                .addGap(16, 16, 16)
                .addComponent(btDisplayFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFlight1)
                    .addComponent(lbFlight1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFlight2)
                    .addComponent(lbFlight2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jpBookTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFlight3)
                    .addComponent(lbFlight3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btBook, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBookTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBookTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDisplayFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisplayFlightsActionPerformed
        // TODO add your handling code here:
       
        
        lbIndex.setText("Airline - Departure Time - Arrival Time - Duration - Price");
        lbFlight1.setText(" " + (getFlights.get(0)).Airline + " " + (getFlights.get(0)).DepartureTime + " " + (getFlights.get(0)).ArrivalTime + " " + "INR" + " " + Integer.toString((getFlights.get(0)).price));
        lbFlight2.setText(" " + (getFlights.get(1)).Airline + " " + (getFlights.get(1)).DepartureTime + " " + (getFlights.get(1)).ArrivalTime + " " + "INR" + " " + Integer.toString((getFlights.get(1)).price));
        lbFlight3.setText(" " + (getFlights.get(2)).Airline + " " + (getFlights.get(2)).DepartureTime + " " + (getFlights.get(2)).ArrivalTime + " " + "INR" + " " + Integer.toString((getFlights.get(2)).price));
    }//GEN-LAST:event_btDisplayFlightsActionPerformed

    private void rbFlight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFlight1ActionPerformed
        // TODO add your handling code here:
        rbFlight2.setSelected(false);
        rbFlight3.setSelected(false);
    }//GEN-LAST:event_rbFlight1ActionPerformed

    private void rbFlight2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFlight2ActionPerformed
        // TODO add your handling code here:
        rbFlight1.setSelected(false);
        rbFlight3.setSelected(false);
    }//GEN-LAST:event_rbFlight2ActionPerformed

    private void rbFlight3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFlight3ActionPerformed
        // TODO add your handling code here:
        rbFlight1.setSelected(false);
        rbFlight2.setSelected(false);
    }//GEN-LAST:event_rbFlight3ActionPerformed

    private void btBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBookActionPerformed
        // TODO add your handling code here:
        if(rbFlight1.isSelected()){
            new DisplayTicket(getFlights.get(0),user).setVisible(true);
        }
        else if(rbFlight2.isSelected()){
            new DisplayTicket(getFlights.get(1),user).setVisible(true);
        }
        else if(rbFlight3.isSelected()){
            new DisplayTicket(getFlights.get(2),user).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "No flights chosen", "Failure", JOptionPane.INFORMATION_MESSAGE);
            
        }
        this.dispose();
    }//GEN-LAST:event_btBookActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBook;
    private javax.swing.JButton btDisplayFlights;
    private javax.swing.JPanel jpBookTicket;
    private javax.swing.JLabel lbFlight1;
    private javax.swing.JLabel lbFlight2;
    private javax.swing.JLabel lbFlight3;
    private javax.swing.JLabel lbIndex;
    private javax.swing.JLabel lbWelcomeUser;
    private javax.swing.JRadioButton rbFlight1;
    private javax.swing.JRadioButton rbFlight2;
    private javax.swing.JRadioButton rbFlight3;
    // End of variables declaration//GEN-END:variables
}
