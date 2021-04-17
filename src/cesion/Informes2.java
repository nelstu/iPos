/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesion;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author dev
 */
public class Informes2 extends javax.swing.JFrame {

    /**
     * Creates new form Informes2
     */
    public Informes2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void cargarDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setTitle("Ventas por dia por Tickets");

        jLabel1.setText("Desde");

        jLabel2.setText("Hasta");

        jButton1.setText("Informe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(this.jDateChooser1.getDate()); 
        String Buscar= fecha;
        
        String fecha2 = sdf.format(this.jDateChooser2.getDate()); 
        String Buscar2= fecha2;
        
        
        
        
        try {

            File f = new File("informeportickets.xls"); // Creamos un objeto file
            System.out.println(f.getAbsolutePath());
//Se crea el libro Excel
            WritableWorkbook workbook = Workbook.createWorkbook(f);

//Se crea una nueva hoja dentro del libro
            WritableSheet sheet = workbook.createSheet("Informe", 0);

//Creamos celdas de varios tipos
//sheet.addCell(new jxl.write.Number(0, 0, "Numero"));
            sheet.addCell(new jxl.write.Label(0, 0, "Numero"));
            sheet.addCell(new jxl.write.Label(1, 0, "Fecha"));
            sheet.addCell(new jxl.write.Label(2, 0, "Neto"));
            sheet.addCell(new jxl.write.Label(3, 0, "Iva"));
            sheet.addCell(new jxl.write.Label(4, 0, "Total"));
//sheet.addCell(new jxl.write.Boolean(3,0,true));
//buscar ventas
            cargarDriver();
            Conexion cn = new Conexion();
            String dbURL = "jdbc:mysql://" + cn.ip + ":3306/" + cn.base;
            String username = cn.usuario;
            String password = cn.pass;
            Connection dbCon = null;
            Statement stmt = null;
            ResultSet rs = null;
            String query = "select id,numero_bol,total,fecha,neto,iva from tickets WHERE fecha>='" + Buscar + "' AND fecha<='" + Buscar2 + "' order by numero_bol ASC";
            try {
                //getting database connection to MySQL server 
                dbCon = DriverManager.getConnection(dbURL, username, password);
                //getting PreparedStatment to execute query 
                stmt = dbCon.prepareStatement(query);
                //Resultset returned by query 
                rs = stmt.executeQuery(query);
                int j = 1;
                int jtot = 0;
                while (rs.next()) {
                    sheet.addCell(new jxl.write.Label(0, j, rs.getString(2)));
                    sheet.addCell(new jxl.write.Label(1, j, rs.getString(4)));
                    sheet.addCell(new jxl.write.Number(2, j, rs.getInt(5)));
                    sheet.addCell(new jxl.write.Number(3, j, rs.getInt(6)));
                    sheet.addCell(new jxl.write.Number(4, j, rs.getInt(3)));
                    jtot = jtot + rs.getInt(3);
                    j++;
                }
                sheet.addCell(new jxl.write.Label(3, j, "Total"));
                sheet.addCell(new jxl.write.Number(4, j, jtot));
            } catch (SQLException ex) {
                System.out.println("Nop");
            }
//fin buscar ventas

//Escribimos los resultados al fichero Excel
            workbook.write();
            workbook.close();

            System.out.println("Ejemplo finalizado.");
        } catch (IOException ex) {
            System.out.println("Error al crear el fichero.");
        } catch (WriteException ex) {
            System.out.println("Error al escribir el fichero.");
        }

        try {
            Desktop.getDesktop().open(new File("informeportickets.xls"));
            //To check if the solution is open or not, you can wait some time here
            Thread.sleep(1000);

        } catch (IOException | InterruptedException ex) {
            //   Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Informes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informes2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
