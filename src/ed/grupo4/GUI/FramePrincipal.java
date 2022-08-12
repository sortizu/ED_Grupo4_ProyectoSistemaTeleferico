package ed.grupo4.GUI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
        btnControlDeCabinas = new PanelImagen("/ed/grupo4/resources/images/agregar3.png");
        btnAbordar = new PanelImagen("/ed/grupo4/resources/images/abordar.png");
        btnColas = new PanelImagen("/ed/grupo4/resources/images/cola.png");
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInicioMouseReleased(evt);
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAgregarPasajeroMouseReleased(evt);
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

        btnControlDeCabinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnControlDeCabinas.setPreferredSize(new java.awt.Dimension(60, 60));
        btnControlDeCabinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnControlDeCabinasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnControlDeCabinasLayout = new javax.swing.GroupLayout(btnControlDeCabinas);
        btnControlDeCabinas.setLayout(btnControlDeCabinasLayout);
        btnControlDeCabinasLayout.setHorizontalGroup(
            btnControlDeCabinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnControlDeCabinasLayout.setVerticalGroup(
            btnControlDeCabinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnAbordar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbordar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAbordar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAbordarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnAbordarLayout = new javax.swing.GroupLayout(btnAbordar);
        btnAbordar.setLayout(btnAbordarLayout);
        btnAbordarLayout.setHorizontalGroup(
            btnAbordarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnAbordarLayout.setVerticalGroup(
            btnAbordarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnColas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColas.setPreferredSize(new java.awt.Dimension(60, 60));
        btnColas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnColasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnColasLayout = new javax.swing.GroupLayout(btnColas);
        btnColas.setLayout(btnColasLayout);
        btnColasLayout.setHorizontalGroup(
            btnColasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnColasLayout.setVerticalGroup(
            btnColasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrador.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdministradorMouseReleased(evt);
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSalirMouseReleased(evt);
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
                .addComponent(btnControlDeCabinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnAbordar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnColas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btnControlDeCabinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAgregarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAbordar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnColas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        Fondo.add(Opciones, java.awt.BorderLayout.SOUTH);

        inicio1.setMinimumSize(new java.awt.Dimension(833, 500));
        inicio1.setName(""); // NOI18N
        inicio1.setPreferredSize(new java.awt.Dimension(1280, 475));
        Fondo.add(inicio1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseReleased

        ((PanelFondo)Fondo).moverLogoAlCentro();
    }//GEN-LAST:event_btnInicioMouseReleased

    private void btnAgregarPasajeroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPasajeroMouseReleased
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnAgregarPasajeroMouseReleased

    private void btnControlDeCabinasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlDeCabinasMouseReleased
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnControlDeCabinasMouseReleased

    private void btnAbordarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbordarMouseReleased
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnAbordarMouseReleased

    private void btnColasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColasMouseReleased
        ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
    }//GEN-LAST:event_btnColasMouseReleased

    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
        dispose();
    }//GEN-LAST:event_btnSalirMouseReleased

    private void btnAdministradorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministradorMouseReleased
        ((PanelFondo)Fondo).moverLogoAlCentro();
    }//GEN-LAST:event_btnAdministradorMouseReleased

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
    private javax.swing.JPanel btnAbordar;
    private javax.swing.JPanel btnAdministrador;
    private javax.swing.JPanel btnAgregarPasajero;
    private javax.swing.JPanel btnColas;
    private javax.swing.JPanel btnControlDeCabinas;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnSalir;
    private ed.grupo4.GUI.Inicio inicio1;
    // End of variables declaration//GEN-END:variables
}
