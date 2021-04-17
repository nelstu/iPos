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
public class Informes1 extends javax.swing.JFrame {

    /**
     * Creates new form Informes1
     */
    public Informes1() {
        initComponents();
        setLocationRelativeTo(null);
    }

            private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {

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

        setTitle("Ventas por Totales por Dia");

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
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
     
try
{
    
    File f = new File("informeporboletatotal.xls"); // Creamos un objeto file
    System.out.println(f.getAbsolutePath());  
//Se crea el libro Excel
WritableWorkbook workbook =Workbook.createWorkbook(f);

//Se crea una nueva hoja dentro del libro
WritableSheet sheet =workbook.createSheet("Informe", 0);

//Creamos celdas de varios tipos
//sheet.addCell(new jxl.write.Number(0, 0, "Numero"));
sheet.addCell(new jxl.write.Label(0, 0, "Fecha"));
sheet.addCell(new jxl.write.Label(1, 0, "Desde"));
sheet.addCell(new jxl.write.Label(2, 0, "Hasta"));
sheet.addCell(new jxl.write.Label(3, 0, "#Boletas"));
sheet.addCell(new jxl.write.Label(4, 0, "Total"));
//sheet.addCell(new jxl.write.Boolean(3,0,true));
//buscar ventas
cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select fecha,desde,hasta,ventadia,cantboletas from cajas WHERE fecha>='"+Buscar+"' AND fecha<='"+Buscar2+"' order by fecha ASC"; 
          try {
              //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password); 
           //getting PreparedStatment to execute query 
           stmt = dbCon.prepareStatement(query); 
          //Resultset returned by query 
           rs = stmt.executeQuery(query);  
           int j=1;
           int jtot=0;
           int totalboletas=0;
           int totalrango=0;
           while(rs.next()){ 
              sheet.addCell(new jxl.write.Label(0, j, rs.getString(1)));
              sheet.addCell(new jxl.write.Label(1, j, rs.getString(2)));
              sheet.addCell(new jxl.write.Label(2, j, rs.getString(3)));
              
              sheet.addCell(new jxl.write.Number(3, j, rs.getInt(5)));
              sheet.addCell(new jxl.write.Number(4, j, rs.getInt(4)));
              //sheet.addCell(new jxl.write.Number(2, j, rs.getInt(5)));
              //sheet.addCell(new jxl.write.Number(3, j, rs.getInt(6)));
              //sheet.addCell(new jxl.write.Number(4, j, rs.getInt(3)));
              //jtot=jtot+rs.getInt(3);
              totalboletas=totalboletas+rs.getInt(5);
              totalrango=totalrango+rs.getInt(4);
              j++;
              } 
              sheet.addCell(new jxl.write.Label(2, j, "Totales"));
              sheet.addCell(new jxl.write.Number(3, j, totalboletas));
              sheet.addCell(new jxl.write.Number(4, j, totalrango));
        } catch(SQLException ex){
          System.out.println(ex.getMessage().toString() ); 
        }
//fin buscar ventas


//Escribimos los resultados al fichero Excel
workbook.write();
workbook.close();



System.out.println("Ejemplo finalizado.");
}
catch (IOException ex)
{
System.out.println("Error al crear el fichero.");
}
catch (WriteException ex)
{
System.out.println("Error al escribir el fichero.");
}

  try {
                Desktop.getDesktop().open(new File("informeporboletatotal.xls"));
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
            java.util.logging.Logger.getLogger(Informes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informes1().setVisible(true);
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
