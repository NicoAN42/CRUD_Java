/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.Timer;


/**
 *
 * @author USER-ACER-PC
 */
public class frmMain extends javax.swing.JFrame {
    String nol_jam = "";
     String nol_menit = "";
      String nol_detik = "";
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        selectData();
        setTanggal();
        SetJam();
        
        
    }
    
   
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        dateChooserPanel1 = new com.toedter.calendar.demo.DateChooserPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ljam = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        txttempat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        rdPerempuan = new javax.swing.JRadioButton();
        rdLaki = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtNama1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tgl = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 17, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic School");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 55, -1, -1));

        ljam.setText("Jam");
        jPanel2.add(ljam, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        labeltanggal.setText("Tanggal");
        jPanel2.add(labeltanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 90));

        jPanel3.setBackground(new java.awt.Color(102, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NIS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ISIAN DATA SISWA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        txtNIS.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        txttempat.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txttempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tanggal Lahir");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtKelas.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Kelas");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Alamat");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 10));

        txtAlamat.setBackground(new java.awt.Color(255, 255, 255));
        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 180, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nama");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        rdPerempuan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("Perempuan");
        rdPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPerempuanActionPerformed(evt);
            }
        });
        jPanel3.add(rdPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        rdLaki.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki-laki");
        rdLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLakiActionPerformed(evt);
            }
        });
        jPanel3.add(rdLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Jenis Kelamin");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtNama1.setBackground(new java.awt.Color(255, 255, 255));
        txtNama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtNama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tempat Lahir");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        tgl.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 540));

        jPanel4.setBackground(new java.awt.Color(102, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refresh.setBackground(new java.awt.Color(204, 204, 204));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel4.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 80, 30));

        edit.setBackground(new java.awt.Color(204, 204, 204));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel4.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 80, 30));

        save.setBackground(new java.awt.Color(204, 204, 204));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel4.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 30));

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 30));

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel4.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 630, 50));

        jPanel5.setBackground(new java.awt.Color(102, 255, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblData.setBackground(new java.awt.Color(255, 255, 255));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat", "TempatLahir", "TanggalLahir"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setResizable(false);
            tblData.getColumnModel().getColumn(1).setResizable(false);
            tblData.getColumnModel().getColumn(2).setResizable(false);
            tblData.getColumnModel().getColumn(3).setResizable(false);
            tblData.getColumnModel().getColumn(4).setResizable(false);
            tblData.getColumnModel().getColumn(5).setResizable(false);
            tblData.getColumnModel().getColumn(6).setResizable(false);
            tblData.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 390));

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel5.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 630, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setTanggal(){
    java.util.Date skrg = new java.util.Date();
    java.text.SimpleDateFormat kal = new
            java.text.SimpleDateFormat("dd/MM/yyyy");
    labeltanggal.setText(kal.format(skrg));
    }
    
    public void SetJam(){
        ActionListener taskPerformer = new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9){
                    nol_jam = "0";
                }
                if (nilai_menit <= 9){
                    nol_menit = "0";
                }
                if (nilai_detik <= 9){
                    nol_detik = "0";
                }
              
                String jam = nol_jam + Integer.toString(nilai_jam);
                 String menit = nol_menit + Integer.toString(nilai_menit);
                  String detik = nol_detik + Integer.toString(nilai_detik);
                  ljam.setText("Jam "+jam+":"+menit+":"+detik);
            }};
        new Timer(100, taskPerformer).start();}
    
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
   String tanggal = dateFormat.format(tgl.getDate());
          String JK ="";
if(rdLaki.isSelected())
{}

else  {
    JK = "L";
} 
            
if (rdPerempuan.isSelected())
 JK = "P";
         if("".equals(txtNIS.getText())|| "".equals(txtNama1.getText()) || "".equals(txtKelas.getText()) ||"".equals(txtEmail.getText())|| "".equals(txtAlamat.getText())||"".equals(txttempat.getText())){
    JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
    } else {
   
            String SQL = "UPDATE t_siswa SET" +"WHERE NIS='"+txtNIS.getText()
            + "WHERE NamaSiswa='"+txtNama1.getText()+"',"+ "WHERE JenisKelamin='"+JK+"',"   
            + "WHERE Kelas='"+txtKelas.getText()+"',"+ "WHERE Email='"+txtEmail.getText()+"'"
            + "WHERE Alamat='"+txtAlamat.getText()+"'"
            +"'"
                    + "WHERE TempatLahir='"+txttempat.getText()+"'"
                    + "WHERE TanggalLahir='"+tanggal+"',";
            int status = KoneksiDB.execute(SQL);
            if(status == 0){
            JOptionPane.showMessageDialog(this, "Data Berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
            }else {
            JOptionPane.showMessageDialog(this, "Data gagal diupdate","Sukses",JOptionPane.WARNING_MESSAGE);
            }
            }
// TODO add your handling code here:
             // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed
 
   

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
   String tanggal = dateFormat.format(tgl.getDate());
    String JK = "";
    if(rdLaki.isSelected())
{   
}
    else  {
    JK = "L";
}      
    if (rdPerempuan.isSelected())
    JK = "P";
           
        if("".equals(txtNIS.getText())|| "".equals(txtNama1.getText()) || "".equals(txtKelas.getText()) ||"".equals(txtEmail.getText())|| "".equals(txtAlamat.getText())||"".equals(txttempat.getText())){
        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
   } else {
            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,TempatLahir,TanggalLahir)"
                + "VALUES ('"+txtNIS.getText()+"','"+txtNama1.getText()+"','"+JK+"',"
                + "'"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"','"+txttempat.getText()+"','"+tanggal+"')";
            int status = KoneksiDB.execute((String) SQL);
            if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
            }else {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan","Sukses",JOptionPane.WARNING_MESSAGE);
            }}
            
// TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    int baris = tblData.getSelectedRow();
    if (baris != -1){
    String NIS = tblData.getValueAt(baris, 0).toString();
    String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
    int status = KoneksiDB.execute(SQL);
    if (status==1) {
        JOptionPane.showMessageDialog(this, "Data Berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        
    }else {
        JOptionPane.showMessageDialog(this, "Data Gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
    }
    }else {
    JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error",JOptionPane.WARNING_MESSAGE);// TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed
    }
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
     txtNIS.setText("");
    txtNama1.setText("");   
    txtKelas.setText("");  
    txtEmail.setText("");  
    txtAlamat.setText(""); 
    txttempat.setText("");
    tgl.setDate(java.sql.Date.valueOf("2016-11-18"));
    buttonGroup1.clearSelection();  // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
     selectData();
    }
    
    private void selectData() {
        
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat","TempatLahir","TanggalLahir"};
        DefaultTableModel dtm = new DefaultTableModel(null,kolom);        //To change body of generated methods, choose Tools | Templates.
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        
  
        try {
            while(rs.next()) 
            {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(3))){
                    JenisKelamin = "Laki-Laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(6);
                String TempatLahir = rs.getString(7);
                String TanggalLahir = rs.getString(8);
               Object data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,TempatLahir,TanggalLahir};
                
                dtm.addRow(data);
            }
        }catch (SQLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }tblData.setModel(dtm);
    }//GEN-LAST:event_refreshActionPerformed

    private void rdPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdPerempuanActionPerformed

    private void rdLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdLakiActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
    MessageFormat header = new MessageFormat("Biodata SIswa SMK Telkom Malan");
    MessageFormat footer = new MessageFormat("Page {0,number,integer} ");
   try{
       tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
       
   }
   catch(java.awt.print.PrinterException e){
       System.err.format("Cannot print %a%n", e.getMessage());
   }// TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    
    
    private void txtNama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama1ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris = tblData.getSelectedRow();
    if(baris != -1){
        txtNIS.setText(tblData.getValueAt(baris, 0).toString());
         txtNama1.setText(tblData.getValueAt(baris, 1).toString());
          txttempat.setText(tblData.getValueAt(baris, 6).toString());
          SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
          Date dateFormat = null;
          try{
            try { 
                dateFormat = date.parse(tblData.getValueAt(baris, 7).toString());
            } catch (java.text.ParseException ex) {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
          catch(ParseException ex){
              Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
              
          }
          tgl.setDate(dateFormat);
          String JKL = tblData.getValueAt(baris, 2).toString();
          if(JKL.equals("Laki-Laki"))
              rdLaki.setSelected(true);
          else
              rdPerempuan.setSelected(true);
             txtKelas.setText(tblData.getValueAt(baris, 3).toString());
         txtEmail.setText(tblData.getValueAt(baris, 4).toString());
         txtAlamat.setText(tblData.getValueAt(baris, 5).toString());
      
    } // TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private com.toedter.calendar.demo.DateChooserPanel dateChooserPanel1;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private com.toedter.calendar.JCalendar jCalendar1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JLabel ljam;
    private javax.swing.JButton print;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTable tblData;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama1;
    private javax.swing.JTextField txttempat;
    // End of variables declaration//GEN-END:variables
}
