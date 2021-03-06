/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendita_proyectofinal;

import Clase.conectorSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jvald
 */
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Reportes
     */
    public Reportes() throws SQLException {
        initComponents();
        cargarDatos();
    }
    
    public void cargarDatos() throws SQLException{
        Connection conection = conectorSQL.getInstance().getConnection();
        ResultSet rs = null;
        Statement st = null;
        /////////////////////////////////////////////////////////////////
        String sql_mas = "SELECT " +
        "ven.id_producto, " +
        "pro.nombre, " +
        "pro.precio, "+
        "pro.costo, " +
        "pro.descuento, " +
        "SUM(ven.cantidad) as ventas " +
        "from vendidos ven " +
        "LEFT JOIN producto pro " +
        "on ven.id_producto = pro.id " +
        "GROUP by id_producto   " +
        "ORDER BY ventas  DESC " +
        "limit 1";

        st = conection.createStatement();
        rs = st.executeQuery(sql_mas);
        DefaultTableModel modeloMas = new DefaultTableModel(new Object[][]{}, new String[]{"ID","NOMBRE","PRECIO","COSTO","DESCUENTO","VENTAS"});
        
        while (rs.next()) {
            modeloMas.addRow(new String[]{
                rs.getString("id_producto"),
                rs.getString("nombre"),
                rs.getString("precio"),
                rs.getString("costo"),
                rs.getString("descuento"),
                rs.getString("ventas")
            });
        }
        jTableMas.setModel(modeloMas);
        /////////////////////////////////////////////////////////////////
        String sql_menos = "SELECT " +
        "ven.id_producto, " +
        "pro.nombre, " +
        "pro.precio, "+
        "pro.costo, " +
        "pro.descuento, " +
        "SUM(ven.cantidad) as ventas " +
        "from vendidos ven " +
        "LEFT JOIN producto pro " +
        "on ven.id_producto = pro.id " +
        "GROUP by id_producto   " +
        "ORDER BY ventas  ASC " +
        "limit 1";
        
        st = conection.createStatement();
        rs = st.executeQuery(sql_menos);
        DefaultTableModel modeloMenos = new DefaultTableModel(new Object[][]{}, new String[]{"ID","NOMBRE","PRECIO","COSTO","DESCUENTO","VENTAS"});
        
        while (rs.next()) {
            modeloMenos.addRow(new String[]{
                rs.getString("id_producto"),
                rs.getString("nombre"),
                rs.getString("precio"),
                rs.getString("costo"),
                rs.getString("descuento"),
                rs.getString("ventas")
            });
        }
        jTableMenos.setModel(modeloMenos);
        /////////////////////////////////////////////////////////////////
        String sql_utilidad="SELECT id,nombre,(precio-costo-descuento) AS utilidad from producto " +
        "ORDER BY `utilidad`  DESC " +
        "LIMIT 1";
        st = conection.createStatement();
        rs = st.executeQuery(sql_utilidad);
        DefaultTableModel modeloUtilidad = new DefaultTableModel(new Object[][]{}, new String[]{"ID","NOMBRE","UTILIDAD"});
        while (rs.next()) {
            modeloUtilidad.addRow(new String[]{
                rs.getString("id"),
                rs.getString("nombre"),
                rs.getString("utilidad")
            });
        }
        jTableUtil.setModel(modeloUtilidad);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMenos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUtil = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mas vendido");

        jTableMas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableMas);

        jLabel2.setText("Menos vendido");

        jTableMenos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableMenos);

        jLabel3.setText("Mayor utilidad");

        jTableUtil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableUtil);

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu();
        menu.show();
        dispose();
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Reportes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMas;
    private javax.swing.JTable jTableMenos;
    private javax.swing.JTable jTableUtil;
    // End of variables declaration//GEN-END:variables
}
