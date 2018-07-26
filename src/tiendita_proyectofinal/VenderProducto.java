/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendita_proyectofinal;

import Clase.*;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jvald
 */
public class VenderProducto extends javax.swing.JFrame {

    /**
     * Creates new form VenderProducto
     */
    public VenderProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDescuento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENDER PRODUCTO");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NOMBRE");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CANTIDAD");

        TextPrompt placeholderID = new TextPrompt("ID", jTextFieldId);
        placeholderID.changeAlpha(0.75f);
        placeholderID.changeStyle(Font.ITALIC);
        jTextFieldId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIdKeyPressed(evt);
            }
        });

        TextPrompt placeholderNombre = new TextPrompt("NOMBRE", jTextFieldNombre);
        placeholderNombre.changeAlpha(0.75f);
        placeholderNombre.changeStyle(Font.ITALIC);
        jTextFieldNombre.setEditable(false);

        TextPrompt placeholderCantidad = new TextPrompt("CANTIDAD", jTextFieldCantidad);
        placeholderCantidad.changeAlpha(0.75f);
        placeholderCantidad.changeStyle(Font.ITALIC);
        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyPressed(evt);
            }
        });

        btnVender.setText("VENDER");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBack.setText("REGRESAR");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PRECIO");

        TextPrompt placeholderPrecio = new TextPrompt("PRECIO", jTextFieldPrecio);
        placeholderPrecio.changeAlpha(0.75f);
        placeholderPrecio.changeStyle(Font.ITALIC);
        jTextFieldPrecio.setEditable(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("DESCUENTO");

        TextPrompt placeholderDescuento = new TextPrompt("DESCUENTO", jTextFieldDescuento);
        placeholderDescuento.changeAlpha(0.75f);
        placeholderDescuento.changeStyle(Font.ITALIC);
        jTextFieldDescuento.setEditable(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TOTAL");

        TextPrompt placeholderTotal = new TextPrompt("PRECIO", jTextFieldTotal);
        placeholderTotal.changeAlpha(0.75f);
        placeholderTotal.changeStyle(Font.ITALIC);
        jTextFieldTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCantidad)
                            .addComponent(jTextFieldPrecio)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTotal))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnVender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            buscaProducto();
        } catch (SQLException ex) {
            Logger.getLogger(VenderProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Menu menu = new Menu();
        menu.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        try {
            buscaProducto();
            venderProducto();
        } catch (SQLException ex) {
            Logger.getLogger(VenderProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void jTextFieldIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        try {
            buscaProducto();
        } catch (SQLException ex) {
            Logger.getLogger(VenderProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jTextFieldIdKeyPressed

    private void jTextFieldCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
            buscaProducto();
            venderProducto();
        } catch (SQLException ex) {
            Logger.getLogger(VenderProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jTextFieldCantidadKeyPressed

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
            java.util.logging.Logger.getLogger(VenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenderProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenderProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldDescuento;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

    private void buscaProducto() throws SQLException{
        Connection conection = conectorSQL.getInstance().getConnection();
        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "SELECT id,nombre,precio,descuento FROM producto where id ='" + jTextFieldId.getText() + "'";
        pst = conection.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        System.out.println("hasta aqui");
        //System.out.println(rs.getString(1));
        while (rs.next()) {
            System.out.println("si entro");
            jTextFieldNombre.setText(rs.getString(2));
            jTextFieldPrecio.setText(rs.getString(3));
            jTextFieldDescuento.setText(rs.getString(4));
            float totalFloat = Float.parseFloat(rs.getString(3)) - Float.parseFloat(rs.getString(4));
            jTextFieldTotal.setText(Float.toString(totalFloat));
        }
    }

    private void venderProducto() throws SQLException{
        Connection conection = conectorSQL.getInstance().getConnection();
        ResultSet rs = null;
        Statement st = null;
        String idString = jTextFieldId.getText();
        String cantidadString = jTextFieldCantidad.getText();
        String totalString = jTextFieldTotal.getText();
        java.util.Date dHoy = new java.util.Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fecha_inserString = ft.format(dHoy);
        if(idString.equals("") || cantidadString.equals("") || totalString.equals("")){
            JOptionPane.showMessageDialog(rootPane, "falta producto o cantidad");
        }
        else{
            String sql = "INSERT INTO "
                    + "`vendidos` (`id`, `id_producto`, `cantidad`, `fecha_inser`)"
                    + " VALUES (NULL, '"
                    + idString+"', '"
                    + cantidadString+"', '"
                    + fecha_inserString+"')";
            st = conection.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Producto vendido");
            jTextFieldId.setText("");
            jTextFieldNombre.setText("");
            jTextFieldPrecio.setText("");
            jTextFieldDescuento.setText("");
            jTextFieldTotal.setText("");
            jTextFieldCantidad.setText("");
        }
    }
}
