/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesion;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nelstu
 */
public class paneldte extends javax.swing.JFrame {
   DefaultTableModel modelo;
    /**
     * Creates new form paneldte
     */
    public paneldte() {
        initComponents();
        setLocationRelativeTo(null);
         modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
        modelo.addColumn("Numero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Neto");
        modelo.addColumn("Iva");
        modelo.addColumn("Total");
         modelo.addColumn("Pdf");
          modelo.addColumn("Xml");
          modelo.addColumn("Trackid");
          modelo.addColumn("Estado SII");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        jDatePickerUtil3 = new org.jdatepicker.util.JDatePickerUtil();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setTitle("Panel DTE SII");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Fecha", "Neto", "Iva", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Fecha");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero");

        jButton2.setText("Generar XML y PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("PDF");

        jLabel4.setText("XML");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesion/img/pdf.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("xml");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel5.setText("Fecha");

        jButton5.setText("Generar Consumo de Folios");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Total");

        jLabel7.setText("#Boletas");

        jLabel8.setText("Desde");

        jLabel9.setText("Hasta");

        jButton6.setText("Generar Todos XML y PDF");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Envio DTE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Consulta Estado");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel10.setText("Track ID");

        jButton9.setText("Envio DTE  Todos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Consulta Estados Todos");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(jTextField4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addGap(29, 29, 29)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8)
                                    .addComponent(jTextField10)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(50, 50, 50)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

           private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {

    }
  }
       private void limpiarjtable(){
          modelo.setRowCount(0);
   }
    
    public void llenar1(){
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();   
  
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

               String fecha = sdf.format(this.jDateChooser1.getDate()); 
        String Buscar= fecha;
        cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select numero_bol,fecha,total,neto,iva,xmlgenerado,pdfgenerado,trackid,estadosii from boletas where fecha ='"+Buscar+"' order by numero_bol ASC"; 
         // JOptionPane.showMessageDialog(null, query);
          try {
              //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbURL, username, password); 
           //getting PreparedStatment to execute query 
           stmt = dbCon.prepareStatement(query); 
          //Resultset returned by query 
           rs = stmt.executeQuery(query);
           int tboletas=0;
           int sboletas=0;
           String Desde="";
           String Hasta="";
           String Actual="";
           while(rs.next()){
                  Actual = rs.getString(1);
                  if (sboletas == 0) {
                      Desde = Actual;
                  }
                  String pdfg = rs.getString(7);
                  String xmlg = rs.getString(6);
                  Object[] object = new Object[9];
                  object[0] = rs.getString(1);
                  object[1] = rs.getString(2);
                  object[2] = rs.getString(4);
                  object[3] = rs.getString(5);
                  object[4] = rs.getString(3);
                  tboletas = tboletas + rs.getInt(3);
                  sboletas++;
                  if (pdfg.equals("S")) {
                      object[5] = "http://45.7.230.72/ierp/public/vendor/sasco/libredte/examples/dte_dennis/pdf/pdf39/" + rs.getString(2) + "/dte" + rs.getString(1) + ".pdf";
                  } else {
                      object[5] = "N";
                  }

                  if (xmlg.equals("S")) {
                      object[6] = "http://45.7.230.72/ierp/public/vendor/sasco/libredte/examples/dte_dennis/in/in39/" + rs.getString(2) + "/EnvioDTE_" + rs.getString(1) + ".xml";

                  } else {
                      object[6] = "N";
                  }

                  object[7] = rs.getString(8);
                  object[8] = rs.getString(9);

                  model.addRow(object);
              }
              Hasta = Actual;
              this.jTextField5.setText(String.valueOf(tboletas));
              this.jTextField6.setText(String.valueOf(sboletas));
              this.jTextField7.setText(Desde);
              this.jTextField8.setText(Hasta);
        } catch(SQLException ex){
          System.out.println("Nop" ); 
        }

    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Fecha  no Seleccionada", "Sin Seleccionar", JOptionPane.INFORMATION_MESSAGE);
            jDateChooser1.requestFocusInWindow();
            return;
        }
        
       this.jTextField10.setText("1");

        limpiarjtable();
        llenar1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        // get the selected row index
       int selectedRowIndex = jTable1.getSelectedRow();
       
        // set the selected row data into jtextfields
       jTextField2.setText(model.getValueAt(selectedRowIndex, 0).toString());
       jTextField1.setText(model.getValueAt(selectedRowIndex, 1).toString());
       jTextField3.setText(model.getValueAt(selectedRowIndex, 5).toString());
       jTextField4.setText(model.getValueAt(selectedRowIndex, 6).toString());
       jTextField9.setText(model.getValueAt(selectedRowIndex, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/ierp/public/vendor/sasco/libredte/examples/alumgo39.php?id="+this.jTextField2.getText()+"&fecha='"+this.jTextField1.getText()+"'"));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI(this.jTextField3.getText()));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }



    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI(this.jTextField4.getText()));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }



    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(this.jDateChooser1.getDate()); 
        String Buscar= fecha;
        
  try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/ierp/public/vendor/sasco/libredte/examples/libroconsumo.php?envio="+this.jTextField10.getText()+"&son="+this.jTextField6.getText()+"&total="+this.jTextField5.getText()+"&fecha="+Buscar+"&Desde="+this.jTextField7.getText()+"&Hasta="+this.jTextField8.getText()));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       int desde=Integer.parseInt(this.jTextField7.getText());
       int hasta=Integer.parseInt(this.jTextField8.getText());
       for(int i=desde  ; i <= hasta; i++){
           
            try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/ierp/public/vendor/sasco/libredte/examples/alumgo39i.php?folio="+String.valueOf(i)));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }
           
           
           try {
               java.util.concurrent.TimeUnit.SECONDS.sleep(5);
           } catch (InterruptedException ex) {
               Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
           }
          System.out.println(i);
         } 
        JOptionPane.showMessageDialog(null, "XML Generados y Pdf Generados");
    /*    
  
*/

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
      try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/api/envio.php?numero="+this.jTextField2.getText()+"&fecha="+this.jTextField1.getText()));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
     try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/api/consultaestado.php?folio="+this.jTextField2.getText()+"&track="+this.jTextField9.getText()));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(this.jDateChooser1.getDate()); 
        String Buscar= fecha;
        //envio todos
        int desde=Integer.parseInt(this.jTextField7.getText());
       int hasta=Integer.parseInt(this.jTextField8.getText());
       for(int i=desde  ; i <= hasta; i++){
           /*
            try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/ierp/public/vendor/sasco/libredte/examples/alumgo39i.php?folio="+String.valueOf(i)));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }
         */
            try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/api/envio.php?numero="+String.valueOf(i)+"&fecha="+Buscar));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }
           
           
           
           
           
           try {
               java.util.concurrent.TimeUnit.SECONDS.sleep(5);
           } catch (InterruptedException ex) {
               Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
           }
          System.out.println(i);
         } 
        JOptionPane.showMessageDialog(null, "Envios Generados ");


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(this.jDateChooser1.getDate()); 
        String Buscar= fecha;
        //envio todos
        int desde=Integer.parseInt(this.jTextField7.getText());
       int hasta=Integer.parseInt(this.jTextField8.getText());
       for(int i=desde  ; i <= hasta; i++){
           //buscar track
            String Buscarbol= String.valueOf(i);
        
        cargarDriver();
         Conexion cn=new Conexion();
        String dbURL = "jdbc:mysql://"+cn.ip+":3306/"+cn.base;
        String username = cn.usuario;
        String password = cn.pass;
        Connection dbCon = null; 
        Statement stmt = null; 
        ResultSet rs = null; 
        String query ="select numero_bol,fecha,total,neto,iva,trackid from boletas where total<>0 and numero_bol= '"+Buscarbol+"' "; 
         // JOptionPane.showMessageDialog(null, query);
         String trackid="";
           try {
               //getting database connection to MySQL server 
               dbCon = DriverManager.getConnection(dbURL, username, password);
               //getting PreparedStatment to execute query 
               stmt = dbCon.prepareStatement(query);
               //Resultset returned by query 
               rs = stmt.executeQuery(query);
               int st = 0;
               while (rs.next()) {

                   trackid = rs.getString(6);

               }
               this.jTextField1.setText(Integer.toString(st));
           } catch (SQLException ex) {
               System.out.println("Nop");
           }

           
           //fin buscar track
           
           
       try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/api/consultaestado.php?folio="+String.valueOf(i)+"&track="+trackid));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       /*
            try {
           // TODO add your handling code here:
           Desktop.getDesktop().browse(new URI("http://45.7.230.72/api/envio.php?numero="+String.valueOf(i)+"&fecha="+Buscar));
       } catch (URISyntaxException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
       }
           */
           
           
           
           
           try {
               java.util.concurrent.TimeUnit.SECONDS.sleep(5);
           } catch (InterruptedException ex) {
               Logger.getLogger(paneldte.class.getName()).log(Level.SEVERE, null, ex);
           }
          System.out.println(i);
         } 
        JOptionPane.showMessageDialog(null, "Consutas Todos ");


    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(paneldte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paneldte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paneldte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paneldte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paneldte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}
