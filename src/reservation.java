import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class reservation extends javax.swing.JFrame {
    public home home;
    public Connection cons;
    public Statement stat;
    public reservation() {
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
        
         Random rand = new Random();
        int RandNumb = rand.nextInt(1000);
        
        
        kodeBooking.setEditable(false);
        kodeBooking.setText("HSB-" +RandNumb);
        harga.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kodeBooking = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        noHp = new javax.swing.JTextField();
        tipekamar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tglCheckin = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cLamainap = new javax.swing.JComboBox<>();
        check = new javax.swing.JButton();
        readykamar = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("RESERVATION");

        jLabel2.setText("KODE BOOKING");

        jLabel3.setText("NAMA");

        jLabel4.setText("ALAMAT");

        jLabel5.setText("NO HP");

        jLabel7.setText("TANGGAL CHECK IN ");

        jLabel9.setText("TIPE KAMAR");

        kodeBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBookingActionPerformed(evt);
            }
        });

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        tipekamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Family", "Deluxe", "Suite" }));
        tipekamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipekamarActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reserve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("HARGA");

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        jLabel10.setText("LAMA INAP");

        cLamainap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        cLamainap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLamainapActionPerformed(evt);
            }
        });

        check.setText("Check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        readykamar.setForeground(new java.awt.Color(255, 0, 0));

        warning.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setText("Rp. ");

        jLabel11.setText("HARI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))))
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kodeBooking)
                            .addComponent(nama)
                            .addComponent(alamat)
                            .addComponent(noHp)
                            .addComponent(tipekamar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cLamainap, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addContainerGap(61, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(readykamar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(warning)
                        .addGap(171, 171, 171))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kodeBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(noHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tipekamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tglCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cLamainap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(readykamar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(warning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kodeBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBookingActionPerformed
       
    }//GEN-LAST:event_kodeBookingActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void tipekamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipekamarActionPerformed
        
    }//GEN-LAST:event_tipekamarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               home = new home();
               home.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        
    }//GEN-LAST:event_hargaActionPerformed

    private void cLamainapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLamainapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cLamainapActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        String tkamar = tipekamar.getSelectedItem().toString();
        int lamamenginap = Integer.parseInt(cLamainap.getSelectedItem().toString());
        int hargakamar;
        int total;
        try{
            
        if (tkamar.equals("Standard")){
        hargakamar = 250000;
        total = hargakamar * lamamenginap;
        harga.setText(String.valueOf(total));
        String db = "select count(*) as jmlh from standard";
        ResultSet result = stat.executeQuery(db);
        result.next();
        int hasil = result.getInt(1);
        readykamar.setText("Terdapat " +hasil + " Kamar Kosong Untuk Tipe Kamar Standard");
    }
        
        else if (tkamar.equals("Family")){
            hargakamar = 500000;
            total = hargakamar * lamamenginap;
            harga.setText(String.valueOf(total));
            String db = "select count(*) as jmlh from family";
            ResultSet result = stat.executeQuery(db);
            result.next();
            int hasil = result.getInt(1);
            readykamar.setText("Terdapat " +hasil + " Kamar Kosong Untuk Tipe Kamar Family");
        }
        
        else if (tkamar.equals("Deluxe")){
            hargakamar = 750000;
            total = hargakamar * lamamenginap;
            harga.setText(String.valueOf(total));
            String db = "select count(*) as jmlh from Deluxe";
            ResultSet result = stat.executeQuery(db);
            result.next();
            int hasil = result.getInt(1);
            readykamar.setText("Terdapat " +hasil + " Kamar Kosong Untuk Tipe Kamar Deluxe");
        }
        
        else if(tkamar.equals("Suite")){
            hargakamar = 1000000;
            total = hargakamar * lamamenginap;
            harga.setText(String.valueOf(total));
            String db = "select count(*) as jmlh from Suite";
            ResultSet result = stat.executeQuery(db);
            result.next();
            int hasil = result.getInt(1);
            readykamar.setText("Terdapat " +hasil + " Kamar Kosong Untuk Tipe Kamar Suite");
        }
        
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
        }
        
    }//GEN-LAST:event_checkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int value;
        String type = tipekamar.getSelectedItem().toString();
        String lama = cLamainap.getSelectedItem().toString();
        
        
        Date day = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = tglCheckin.getDate();
        String tanggal = DateFormat.getDateInstance().format(date);
        
        if(nama.getText().trim().isEmpty() && alamat.getText().trim().isEmpty() && noHp.getText().trim().isEmpty() && tanggal== null){
             warning.setText("Kolom Tidak Boleh Kosong!");
             value = -1;
        }
        
        else if(nama.getText().trim().isEmpty()){
             warning.setText("Nama Tidak Boleh Kosong!");
             value = -1;
        }
        
        else if(alamat.getText().trim().isEmpty()){
             warning.setText("Alamat Tidak Boleh Kosong!");
             value = -1;
        }
        
        else if(noHp.getText().trim().isEmpty()){
            warning.setText("No HP Tidak Boleh Kosong!");
            value = -1;
        }
        
        else if (harga.getText().trim().isEmpty()) {
            warning.setText("Mohon Click Tombol Check Untuk Menampilkan Harga Sewa!");
            value = -1;

        }
        
        else{
            value = 1;
        }
        
        
            String db = "insert into reservation values (?,?,?,?,?,?,?,?)";
            try{
                if (value>0){
             PreparedStatement statement = cons.prepareStatement(db);
             statement.setString(1,kodeBooking.getText());
             statement.setString(2,nama.getText());
             statement.setString(3,alamat.getText());
             statement.setString(4,noHp.getText());
             statement.setString(5,type);
             statement.setString(6,tanggal);
             statement.setString(7,lama);
             statement.setString(8,harga.getText());
          
              statement.executeUpdate();
              JOptionPane.showMessageDialog(null,"Reservation Complete! You will be directed back to home page");
              home home = new home();
              home.setVisible(true);
               this.dispose();
            }
                
                
                 
        }
           catch (Exception E){
           JOptionPane.showMessageDialog(null, "Register Gagal!");
           }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> cLamainap;
    private javax.swing.JButton check;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kodeBooking;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noHp;
    private javax.swing.JLabel readykamar;
    private com.toedter.calendar.JDateChooser tglCheckin;
    private javax.swing.JComboBox<String> tipekamar;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
