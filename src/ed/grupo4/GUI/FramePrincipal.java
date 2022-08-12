package ed.grupo4.GUI;

import java.awt.Color;
import javax.swing.JPanel;

public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        /*JPanel appinfo=new PanelRedondeado(20, Color.WHITE);
        appinfo.setBounds(480,100,300,350);
        appinfo.setOpaque(false);
        Inicio.add(appinfo);*/
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new PanelFondo("/ed/grupo4/resources/images/Fondo.png");
        Opciones = new PanelImagen("/ed/grupo4/resources/images/Menuopc.png");
        btnInicio = new PanelImagen("/ed/grupo4/resources/images/inicio3.png");
        btnAgregarPasajero = new PanelImagen("/ed/grupo4/resources/images/agregar3.png");
        btnAgregarPasajero1 = new PanelImagen("/ed/grupo4/resources/images/agregar3.png");
        btnAgregarPasajero2 = new PanelImagen("/ed/grupo4/resources/images/abordar.png");
        btnAgregarPasajero3 = new PanelImagen("/ed/grupo4/resources/images/cola.png");
        btnAdministrador = new PanelImagen("/ed/grupo4/resources/images/Administrador.png");
        btnSalir = new PanelImagen("/ed/grupo4/resources/images/Salir3.png");
        inicio1 = new ed.grupo4.GUI.Inicio();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setLayout(new java.awt.BorderLayout());

        Opciones.setBackground(new java.awt.Color(204, 204, 204));
        Opciones.setPreferredSize(new java.awt.Dimension(1280, 220));

        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setPreferredSize(new java.awt.Dimension(60, 60));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnAgregarPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPasajero.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAgregarPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPasajeroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarPasajeroLayout = new javax.swing.GroupLayout(btnAgregarPasajero);
        btnAgregarPasajero.setLayout(btnAgregarPasajeroLayout);
        btnAgregarPasajeroLayout.setHorizontalGroup(
            btnAgregarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnAgregarPasajeroLayout.setVerticalGroup(
            btnAgregarPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnAgregarPasajero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPasajero1.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAgregarPasajero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPasajero1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarPasajero1Layout = new javax.swing.GroupLayout(btnAgregarPasajero1);
        btnAgregarPasajero1.setLayout(btnAgregarPasajero1Layout);
        btnAgregarPasajero1Layout.setHorizontalGroup(
            btnAgregarPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnAgregarPasajero1Layout.setVerticalGroup(
            btnAgregarPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnAgregarPasajero2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPasajero2.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAgregarPasajero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPasajero2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarPasajero2Layout = new javax.swing.GroupLayout(btnAgregarPasajero2);
        btnAgregarPasajero2.setLayout(btnAgregarPasajero2Layout);
        btnAgregarPasajero2Layout.setHorizontalGroup(
            btnAgregarPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnAgregarPasajero2Layout.setVerticalGroup(
            btnAgregarPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnAgregarPasajero3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPasajero3.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAgregarPasajero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPasajero3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarPasajero3Layout = new javax.swing.GroupLayout(btnAgregarPasajero3);
        btnAgregarPasajero3.setLayout(btnAgregarPasajero3Layout);
        btnAgregarPasajero3Layout.setHorizontalGroup(
            btnAgregarPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnAgregarPasajero3Layout.setVerticalGroup(
            btnAgregarPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrador.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministradorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAdministradorLayout = new javax.swing.GroupLayout(btnAdministrador);
        btnAdministrador.setLayout(btnAdministradorLayout);
        btnAdministradorLayout.setHorizontalGroup(
            btnAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnAdministradorLayout.setVerticalGroup(
            btnAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPreferredSize(new java.awt.Dimension(60, 60));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnAgregarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnAgregarPasajero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnAgregarPasajero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnAgregarPasajero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(540, 540, 540))
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesLayout.createSequentialGroup()
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpcionesLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnAgregarPasajero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAgregarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAgregarPasajero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregarPasajero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        Fondo.add(Opciones, java.awt.BorderLayout.SOUTH);

        inicio1.setMinimumSize(new java.awt.Dimension(833, 500));
        inicio1.setName(""); // NOI18N
        Fondo.add(inicio1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPasajeroMouseClicked
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnAgregarPasajeroMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        ((PanelFondo)Fondo).moverLogoAlCentro();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnAgregarPasajero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPasajero1MouseClicked
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnAgregarPasajero1MouseClicked

    private void btnAgregarPasajero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPasajero2MouseClicked
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnAgregarPasajero2MouseClicked

    private void btnAgregarPasajero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPasajero3MouseClicked
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnAgregarPasajero3MouseClicked

    private void btnAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministradorMouseClicked
        ((PanelFondo)Fondo).moverLogoAlCentro();
    }//GEN-LAST:event_btnAdministradorMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel btnAdministrador;
    private javax.swing.JPanel btnAgregarPasajero;
    private javax.swing.JPanel btnAgregarPasajero1;
    private javax.swing.JPanel btnAgregarPasajero2;
    private javax.swing.JPanel btnAgregarPasajero3;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnSalir;
    private ed.grupo4.GUI.Inicio inicio1;
    // End of variables declaration//GEN-END:variables
}
