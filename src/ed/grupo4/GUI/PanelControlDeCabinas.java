/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ed.grupo4.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author USER
 */
public class PanelControlDeCabinas extends javax.swing.JPanel {

    /**
     * Creates new form PanelControlDeCabinas
     */
    
    DefaultTableCellRenderer nuevoCellRenderer = new DefaultTableCellRenderer(){
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            
            if(value instanceof JButton){
                JButton boton=(JButton) value;
                return boton;
            }
            
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    };
    DefaultTableModel modeloDeListaDeControlDeCabina;
    
    public PanelControlDeCabinas() {
        initComponents();
        modeloDeListaDeControlDeCabina=(DefaultTableModel)listaDeControlDeCabinas.getModel();
        setBackground(new Color(0,0,0,0));
        
        nuevoCellRenderer.setHorizontalAlignment(JLabel.CENTER);
        listaDeControlDeCabinas.setDefaultRenderer(Object.class, nuevoCellRenderer);
        listaDeControlDeCabinas.getTableHeader().setDefaultRenderer(new RenderDeCabecera(listaDeControlDeCabinas.getTableHeader().getDefaultRenderer()));
        listaDeControlDeCabinas.getTableHeader().setBackground(Color.WHITE);
        listaDeControlDeCabinas.getTableHeader().setReorderingAllowed(false);
        listaDeControlDeCabinas.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
        listaDeControlDeCabinas.getTableHeader().setForeground(new Color(0,51,102,255));

        jScrollPane2.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        //modeloDeListaDeControlDeCabina.setValueAt(new JButton("Partir"), 0, 4);
        for (int i = 2; i < 10; i++) modeloDeListaDeControlDeCabina.addRow(new Object[]{"Cabina "+i,"C","0/20","0:40",new JButton("Partir")});
        //modeloDeListaDeControlDeCabina.addRow(new Object[]{"Cabina 1","C","0/20","0:40",new JButton("Partir")});
       
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelImagen("/ed/grupo4/resources/images/Interfaz03/Panel03.1.png");
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDeControlDeCabinas = new javax.swing.JTable();
        jPanel2 = new PanelImagen("/ed/grupo4/resources/images/Interfaz03/Panel03.1.png");

        setPreferredSize(new java.awt.Dimension(1280, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(376, 376));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Control de Cabinas");

        listaDeControlDeCabinas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        listaDeControlDeCabinas.setForeground(new java.awt.Color(0, 51, 102));
        listaDeControlDeCabinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Indentificador", "Destino", "Pasajeros", "Retorno", " "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaDeControlDeCabinas.setFocusable(false);
        listaDeControlDeCabinas.setGridColor(new java.awt.Color(255, 255, 255));
        listaDeControlDeCabinas.setRowHeight(36);
        listaDeControlDeCabinas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        listaDeControlDeCabinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaDeControlDeCabinasMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listaDeControlDeCabinas);
        if (listaDeControlDeCabinas.getColumnModel().getColumnCount() > 0) {
            listaDeControlDeCabinas.getColumnModel().getColumn(0).setPreferredWidth(100);
            listaDeControlDeCabinas.getColumnModel().getColumn(1).setPreferredWidth(55);
            listaDeControlDeCabinas.getColumnModel().getColumn(2).setPreferredWidth(70);
            listaDeControlDeCabinas.getColumnModel().getColumn(3).setPreferredWidth(55);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(501, 376));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeControlDeCabinasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDeControlDeCabinasMouseReleased
        if(listaDeControlDeCabinas.getSelectedColumn()==4){
            JButton boton=(JButton)modeloDeListaDeControlDeCabina.getValueAt(listaDeControlDeCabinas.getSelectedRow(), listaDeControlDeCabinas.getSelectedColumn());
            boton.doClick();
        }
    }//GEN-LAST:event_listaDeControlDeCabinasMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaDeControlDeCabinas;
    // End of variables declaration//GEN-END:variables
}
