import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class choose extends javax.swing.JFrame {

    public Connection cons;
    public Statement stat;
    public choose() {
        initComponents();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root",""); //connection
            stat = cons.createStatement();
        
        }
        catch (Exception E) {
            
           JOptionPane.showMessageDialog(null,"Program Can't Connect To Database!");
           System.exit(0);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login", "Reservation", "Checkin", "Checkout" }));

        jLabel1.setText("PILIH DATA : ");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabel);

        cetak.setText("CETAK");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cetak)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(cetak)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String choose = pilihan.getSelectedItem().toString();
      DefaultTableModel tb = new DefaultTableModel();
      
      if(choose.equals("Login")){
          tb.addColumn("ID");
          tb.addColumn("Username");
          tb.addColumn("Password");
          tabel.setModel(tb);
          
        try{
       String db = "select * from " +choose;
       ResultSet result = stat.executeQuery(db);
            
       while (result.next()){
           tb.addRow(new Object[]{
               result.getString("ID"),
               result.getString("Username"),
               result.getString("Password"),
           });
       }
        }
        
        catch(Exception E){
             JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
        }
      }
      
      else if(choose.equals("Reservation")){
          tb.addColumn("Kode Booking");
          tb.addColumn("Nama");
          tb.addColumn("Alamat");
          tb.addColumn("No HP");
          tb.addColumn("Tipe Kamar");
          tb.addColumn("Tgl Check In");
          tb.addColumn("Lama Inap");
          tb.addColumn("Harga");
          tabel.setModel(tb);
          
        try{
       String db = "select * from " +choose;
       ResultSet result = stat.executeQuery(db);
            
       while (result.next()){
           tb.addRow(new Object[]{
               result.getString("KodeBooking"),
               result.getString("Nama"),
               result.getString("Alamat"),
               result.getString("No HP"),
               result.getString("TipeKamar"),
               result.getString("TglCheckin"),
               result.getString("LamaInap"),
               result.getString("Harga"),
           });
       }
        }
        
        catch(Exception E){
             JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
        }
      }
      
      else if(choose.equals("Checkin")){
          tb.addColumn("Kode Booking");
          tb.addColumn("Nama");
          tb.addColumn("Alamat");
          tb.addColumn("No HP");
          tb.addColumn("Tipe Kamar");
          tb.addColumn("Nomor Kamar");
          tb.addColumn("Lama Inap");
          tb.addColumn("Tgl Check In");
          tb.addColumn("Harga");
          tb.addColumn("Pembayaran");
          tabel.setModel(tb);
          
        try{
       String db = "select * from " +choose;
       ResultSet result = stat.executeQuery(db);
            
       while (result.next()){
           tb.addRow(new Object[]{
               result.getString("KodeBooking"),
               result.getString("Nama"),
               result.getString("Alamat"),
               result.getString("No HP"),
               result.getString("TipeKamar"),
               result.getString("NoKamar"),
               result.getString("LamaInap"),
               result.getString("tglCheckin"),
               result.getString("Harga"),
               result.getString("Pembayaran"),
           });
       }
        }
        
        catch(Exception E){
             JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
        }
      }
      
      
       else if(choose.equals("Checkout")){
          tb.addColumn("Kode Booking");
          tb.addColumn("Nama");
          tb.addColumn("Alamat");
          tb.addColumn("No HP");
          tb.addColumn("Tipe Kamar");
          tb.addColumn("Nomor Kamar");
          tb.addColumn("Lama Inap");
          tb.addColumn("Tgl Check In");
          tb.addColumn("Tgl Check Out");
          tabel.setModel(tb);
          
        try{
       String db = "select * from " +choose;
       ResultSet result = stat.executeQuery(db);
            
       while (result.next()){
           tb.addRow(new Object[]{
               result.getString("KodeBooking"),
               result.getString("Nama"),
               result.getString("Alamat"),
               result.getString("NoHP"),
               result.getString("TipeKamar"),
               result.getString("NoKamar"),
               result.getString("LamaInap"),
               result.getString("TglCheckin"),
               result.getString("TglCheckout"),
           });
       }
        }
        
        catch(Exception E){
             JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
       String choose = pilihan.getSelectedItem().toString();
        if(choose.equals("Login")){
           try{
        JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportlogin.jasper"), null, cons);
        JasperViewer.viewReport(jp, false);
        
           }
           
           catch (Exception E){
               JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
           }
           
       }
    }//GEN-LAST:event_cetakActionPerformed

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
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
