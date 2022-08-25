package ed.grupo4.GUI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    int indiceDeOpcionActual=0; //Almacena el identificador del panel actual por numero
    private boolean animando=false; //Se vuelve verdadera si se esta animando un panel
    private boolean modoAdministrador=false;
    JPanel panelActual;
    
    PanelInicio panelInicio=new PanelInicio();
    PanelAgregarPasajeros panelAgregarPasajeros=new PanelAgregarPasajeros();
    PanelControlDeCabinas panelControlDeCabinas=new PanelControlDeCabinas();
    PanelAbordarPasajeros panelAbordarPasajeros=new PanelAbordarPasajeros();
    PanelGestionDeColas panelGestionDeColas=new PanelGestionDeColas();
    PanelGestionDeCabinas panelGestionDeCabinas=new PanelGestionDeCabinas();
    
    public FramePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelInicio.setBounds(0, 0, 1280, 500);
        panelSlider.add(panelInicio);
        panelAgregarPasajeros.setBounds(1280, 0, 1280, 500);
        panelAgregarPasajeros.desactivarCampos();
        panelSlider.add(panelAgregarPasajeros);
        panelControlDeCabinas.setBounds(1280, 0, 1280, 500);
        panelSlider.add(panelControlDeCabinas);
        panelAbordarPasajeros.setBounds(1280, 0, 1280, 500);
        panelSlider.add(panelAbordarPasajeros);
        panelGestionDeColas.setBounds(1280, 0, 1280, 500);
        panelSlider.add(panelGestionDeColas);
        panelGestionDeCabinas.setBounds(0, 500, 1280, 500);
        panelSlider.add(panelGestionDeCabinas);
        panelActual=panelInicio;
        //inicio.setLocation(-640,0);
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
        btnControlDeCabinas = new PanelImagen("/ed/grupo4/resources/images/GestionDeCabina.png");
        btnAbordar = new PanelImagen("/ed/grupo4/resources/images/abordar.png");
        btnColas = new PanelImagen("/ed/grupo4/resources/images/cola.png");
        btnAdministrador = new PanelImagen("/ed/grupo4/resources/images/Administrador.png");
        btnSalir = new PanelImagen("/ed/grupo4/resources/images/Salir3.png");
        panelSlider = new ed.grupo4.GUI.PanelSlider();

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

        panelSlider.setBackground(new java.awt.Color(255, 255, 255,0));

        javax.swing.GroupLayout panelSliderLayout = new javax.swing.GroupLayout(panelSlider);
        panelSlider.setLayout(panelSliderLayout);
        panelSliderLayout.setHorizontalGroup(
            panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        panelSliderLayout.setVerticalGroup(
            panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Fondo.add(panelSlider, java.awt.BorderLayout.CENTER);

        getContentPane().add(Fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseReleased
        if(!animando){
            if(indiceDeOpcionActual==1) panelAgregarPasajeros.desactivarCampos();
            if(indiceDeOpcionActual!=0){
                moverPanelDerecha(panelActual, panelActual.getX(), 1280, 0.06, 1000*1/60);
                moverPanelDerecha(panelInicio, panelInicio.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelInicio;
                animando=true;
            }
            indiceDeOpcionActual=0;
            ((PanelFondo)Fondo).moverLogoAlCentro();
        }
    }//GEN-LAST:event_btnInicioMouseReleased

    private void btnAgregarPasajeroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPasajeroMouseReleased
        if(!animando){
            panelAgregarPasajeros.activarCampos();
            if(indiceDeOpcionActual<1){
                panelAgregarPasajeros.setLocation(1280, panelAgregarPasajeros.getY());
                moverPanelIzquierda(panelActual, panelActual.getX(), -1280, 0.06, 1000*1/60);
                moverPanelIzquierda(panelAgregarPasajeros, panelAgregarPasajeros.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelAgregarPasajeros;
                animando=true;
            }else if(indiceDeOpcionActual>1){
                panelAgregarPasajeros.setLocation(-1280, panelAgregarPasajeros.getY());
                moverPanelDerecha(panelActual, panelActual.getX(), 1280, 0.06, 1000*1/60);
                moverPanelDerecha(panelAgregarPasajeros, panelAgregarPasajeros.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelAgregarPasajeros;
                animando=true;
            }
            indiceDeOpcionActual=1;
            ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
        }
    }//GEN-LAST:event_btnAgregarPasajeroMouseReleased

    private void btnControlDeCabinasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlDeCabinasMouseReleased
        if(!animando){
            if(indiceDeOpcionActual==1) panelAgregarPasajeros.desactivarCampos();
            if(indiceDeOpcionActual<2){
                panelControlDeCabinas.setLocation(1280, panelAgregarPasajeros.getY());
                moverPanelIzquierda(panelActual, panelActual.getX(), -1280, 0.06, 1000*1/60);
                moverPanelIzquierda(panelControlDeCabinas, panelControlDeCabinas.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelControlDeCabinas;
                animando=true;
            }else if(indiceDeOpcionActual>2){
                panelControlDeCabinas.setLocation(-1280, panelAgregarPasajeros.getY());
                moverPanelDerecha(panelActual, panelActual.getX(), 1280, 0.06, 1000*1/60);
                moverPanelDerecha(panelControlDeCabinas, panelControlDeCabinas.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelControlDeCabinas;
                animando=true;
            }
            indiceDeOpcionActual=2;
            ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
        }
    }//GEN-LAST:event_btnControlDeCabinasMouseReleased

    private void btnAbordarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbordarMouseReleased
        if(!animando){
            if(indiceDeOpcionActual==1) panelAgregarPasajeros.desactivarCampos();
            if(indiceDeOpcionActual<3){
                panelAbordarPasajeros.setLocation(1280, panelAbordarPasajeros.getY());
                moverPanelIzquierda(panelActual, panelActual.getX(), -1280, 0.06, 1000*1/60);
                moverPanelIzquierda(panelAbordarPasajeros, panelAbordarPasajeros.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelAbordarPasajeros;
                animando=true;
            }else if(indiceDeOpcionActual>3){
                panelAbordarPasajeros.setLocation(-1280, panelAbordarPasajeros.getY());
                moverPanelDerecha(panelActual, panelActual.getX(), 1280, 0.06, 1000*1/60);
                moverPanelDerecha(panelAbordarPasajeros, panelAbordarPasajeros.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelAbordarPasajeros;
                animando=true;
            }
            indiceDeOpcionActual=3;
            ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
        }
    }//GEN-LAST:event_btnAbordarMouseReleased

    private void btnColasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColasMouseReleased
        if(!animando){
            if(indiceDeOpcionActual==1) panelAgregarPasajeros.desactivarCampos();
            if(indiceDeOpcionActual!=4){
                moverPanelIzquierda(panelActual, panelActual.getX(), -1280, 0.06, 1000*1/60);
                moverPanelIzquierda(panelGestionDeColas, panelGestionDeColas.getX(), 0, 0.06, 1000*1/60);
                panelActual=panelGestionDeColas;
                animando=true;
            }
            indiceDeOpcionActual=4;
            ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
        }
    }//GEN-LAST:event_btnColasMouseReleased

    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
        dispose();
    }//GEN-LAST:event_btnSalirMouseReleased

    private void btnAdministradorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministradorMouseReleased
        if(!animando){
            if(!modoAdministrador){
                if(indiceDeOpcionActual==1) panelAgregarPasajeros.desactivarCampos();
                panelGestionDeCabinas.activarCampos();
                modoAdministrador=true;
                ocultarBotonesDeMenu();
                ((PanelImagen)Opciones).setImagen("/ed/grupo4/resources/images/Menuopciones.png");
                moverPanelAbajo(panelActual, panelActual.getY(), -500, 0.06, 1000*1/60);
                moverPanelAbajo(panelGestionDeCabinas, panelGestionDeCabinas.getY(), 0, 0.06, 1000*1/60);
                //panelActual=panelGestionDeCabinas;
                animando=true;
                ((PanelFondo)Fondo).moverLogoAlCentro();
            }else{ 
                if(indiceDeOpcionActual==1) panelAgregarPasajeros.activarCampos();
                panelGestionDeCabinas.desactivarCampos();
                modoAdministrador=false;
                mostrarBotonesDeMenu();
                ((PanelImagen)Opciones).setImagen("/ed/grupo4/resources/images/Menuopc.png");
                moverPanelArriba(panelActual, panelActual.getY(), 0, 0.06, 1000*1/60);
                moverPanelArriba(panelGestionDeCabinas, panelGestionDeCabinas.getY(), 500, 0.06, 1000*1/60);
                //panelActual=panelGestionDeCabinas;
                animando=true;
                if(indiceDeOpcionActual!=0) ((PanelFondo)Fondo).moverLogoAEsquinaIzquierda();
            }
        }
        
    }//GEN-LAST:event_btnAdministradorMouseReleased
    
    public void moverPanelDerecha(JPanel panel,int posInicio, int posFin, double velocidad,long delay){
        if(!animando&&posInicio<posFin){
            new Thread(new Runnable() {
                    @Override
                    public void run() {
                        double rad=0;
                        int desp=posFin-posInicio;
                        while(rad<Math.PI/2){
                            rad+=velocidad;
                            rad=rad>Math.PI/2?Math.PI/2:rad;
                            panel.setLocation(posInicio+(int)(desp*Math.sin(rad)),panel.getY());
                            panel.repaint();
                            panelSlider.repaint();
                            repaint();
                            try {
                                Thread.sleep(delay);
                            } catch (InterruptedException ex) {
                            }
                        }
                        animando=false;
                    }
                }).start();
        }else{
            System.out.println("No en posicion de animar");
        }
    }
    public void moverPanelIzquierda(JPanel panel,int posInicio, int posFin, double velocidad,long delay){
        if(!animando&&posInicio>posFin){
            new Thread(new Runnable() {
                    @Override
                    public void run() {
                    double rad=Math.PI/2;
                    int desp=posInicio-posFin;
                    while(rad>0){
                        rad-=velocidad;
                        rad=rad<0?0:rad;
                        panel.setLocation(posInicio-(int)(desp*(Math.cos(rad))),panel.getY());
                        panel.repaint();
                        panelSlider.repaint();
                        repaint();
                        try {
                            Thread.sleep(delay);
                        } catch (InterruptedException ex) {
                        }
                    }
                    animando=false;
                }
                }).start();
        }else{
            System.out.println("No en posicion de animar");
        }
    }
    
    public void moverPanelArriba(JPanel panel,int posInicio, int posFin, double velocidad,long delay){
        if(!animando&&posInicio<posFin){
            new Thread(new Runnable() {
                    @Override
                    public void run() {
                        double rad=0;
                        int desp=posFin-posInicio;
                        while(rad<Math.PI/2){
                            rad+=velocidad;
                            rad=rad>Math.PI/2?Math.PI/2:rad;
                            panel.setLocation(panel.getX(),posInicio+(int)(desp*Math.sin(rad)));
                            panel.repaint();
                            panelSlider.repaint();
                            repaint();
                            try {
                                Thread.sleep(delay);
                            } catch (InterruptedException ex) {
                            }
                        }
                        animando=false;
                    }
                }).start();
        }else{
            System.out.println("No en posicion de animar");
        }
    }
    
    public void moverPanelAbajo(JPanel panel,int posInicio, int posFin, double velocidad,long delay){
        if(!animando&&posInicio>posFin){
            new Thread(new Runnable() {
                    @Override
                    public void run() {
                    double rad=Math.PI/2;
                    int desp=posInicio-posFin;
                    while(rad>0){
                        rad-=velocidad;
                        rad=rad<0?0:rad;
                        panel.setLocation(panel.getX(),posInicio-(int)(desp*(Math.cos(rad))));
                        panel.repaint();
                        panelSlider.repaint();
                        repaint();
                        try {
                            Thread.sleep(delay);
                        } catch (InterruptedException ex) {
                        }
                    }
                    animando=false;
                }
                }).start();
        }else{
            System.out.println("No en posicion de animar");
        }
    }
    
    public void ocultarBotonesDeMenu(){
        btnInicio.setVisible(false);
        btnAgregarPasajero.setVisible(false);
        btnControlDeCabinas.setVisible(false);
        btnAbordar.setVisible(false);
        btnColas.setVisible(false);
    }
    
    public void mostrarBotonesDeMenu(){
        btnInicio.setVisible(true);
        btnAgregarPasajero.setVisible(true);
        btnControlDeCabinas.setVisible(true);
        btnAbordar.setVisible(true);
        btnColas.setVisible(true);
    }
    
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
    private ed.grupo4.GUI.PanelSlider panelSlider;
    // End of variables declaration//GEN-END:variables
}
