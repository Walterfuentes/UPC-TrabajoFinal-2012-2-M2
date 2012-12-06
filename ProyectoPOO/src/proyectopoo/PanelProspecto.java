/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walterfuentes
 */
public class PanelProspecto extends javax.swing.JFrame {

    /**
     * Creates new form PanelProspecto
     */
    
    private AdminProspecto auxiliar;

    
    public PanelProspecto() {
        initComponents();
        auxiliar = new AdminProspecto();
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
        EtiquetaNombre = new javax.swing.JLabel();
        EtiquetaPaterno = new javax.swing.JLabel();
        EtiquetaMaterno = new javax.swing.JLabel();
        EtiquetaDNI = new javax.swing.JLabel();
        EtiquetaCorreo = new javax.swing.JLabel();
        EtiquetaCelular = new javax.swing.JLabel();
        EtiquetaTelfijo = new javax.swing.JLabel();
        EtiquetaFecha = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        CampoApellidoPaterno = new javax.swing.JTextField();
        CampoApellidoMaterno = new javax.swing.JTextField();
        CampoDNI = new javax.swing.JTextField();
        CampoCorreo = new javax.swing.JTextField();
        CampoTelefonoFijo = new javax.swing.JTextField();
        CampoTelefonoCelular = new javax.swing.JTextField();
        CampoFechaIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelListaDatos = new javax.swing.JTable();
        BotonAltaProspecto = new javax.swing.JButton();
        CampoRespuestaAcciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        EtiquetaNombre.setText("Nombre");

        EtiquetaPaterno.setText("Apellido Paterno");

        EtiquetaMaterno.setText("Apellido Materno");

        EtiquetaDNI.setText("DNI");

        EtiquetaCorreo.setText("Correo");

        EtiquetaCelular.setText("Telefono Celular");

        EtiquetaTelfijo.setText("Telefono Fijo");

        EtiquetaFecha.setText("Fecha Ingreso");

        CampoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("MODULO PROSPECTO");

        PanelListaDatos.setBackground(new java.awt.Color(204, 204, 204));
        PanelListaDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelListaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. prospecto", "Nombre", "Apellido Paterno", "Apellido Materno", "DNI", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PanelListaDatos);

        BotonAltaProspecto.setText("Alta de Prospecto");
        BotonAltaProspecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaProspectoActionPerformed(evt);
            }
        });

        CampoRespuestaAcciones.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(42, 42, 42)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(EtiquetaNombre)
                            .add(EtiquetaPaterno)
                            .add(EtiquetaMaterno)
                            .add(EtiquetaDNI)
                            .add(EtiquetaCorreo)
                            .add(EtiquetaTelfijo)
                            .add(EtiquetaCelular)
                            .add(EtiquetaFecha))
                        .add(151, 151, 151)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(CampoNombre)
                            .add(CampoApellidoPaterno)
                            .add(CampoApellidoMaterno)
                            .add(CampoDNI)
                            .add(CampoCorreo)
                            .add(CampoTelefonoFijo)
                            .add(CampoTelefonoCelular)
                            .add(CampoFechaIngreso, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(217, 217, 217)
                        .add(jLabel1)))
                .addContainerGap())
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(BotonAltaProspecto)
                        .add(43, 43, 43))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(CampoRespuestaAcciones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 228, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(EtiquetaNombre)
                    .add(CampoNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(EtiquetaPaterno)
                    .add(CampoApellidoPaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(EtiquetaMaterno)
                    .add(CampoApellidoMaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(CampoDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(EtiquetaDNI))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(CampoCorreo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(EtiquetaCorreo))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(CampoTelefonoFijo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(EtiquetaTelfijo))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(CampoTelefonoCelular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(EtiquetaCelular))
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(EtiquetaFecha)
                    .add(CampoFechaIngreso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 221, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(BotonAltaProspecto)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                .add(CampoRespuestaAcciones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(23, 23, 23))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

     private void mostrarListadeAltaProspectos() {
        // Establecer el numero de filas del grid
        int totalFilas = auxiliar.getAlmacenaProspectos().size();
        DefaultTableModel model = (DefaultTableModel) PanelListaDatos.getModel();
        model.setRowCount(totalFilas);
        // Mostrar cada tipo de habitacion por fila
        int fila = 0;
        for (Clientes tipo : auxiliar.getAlmacenaProspectos()) {
            model.setValueAt(tipo.getCodigoCliente(), fila, 0);
            model.setValueAt(tipo.getNombre(), fila, 1);
            model.setValueAt(tipo.getApellidoPaterno(), fila, 2);
            model.setValueAt(tipo.getApellidoMaterno(), fila, 3);
            model.setValueAt(tipo.getDni(), fila, 4);
            model.setValueAt(tipo.getCorreo(), fila, 5);

            fila++;
        }
    }
    private void BotonAltaProspectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaProspectoActionPerformed
        String codigoProspecto;
        String nombre = this.CampoNombre.getText();
        String ApellidoPaterno = this.CampoApellidoPaterno.getText();
        String ApellidoMaterno = this.CampoApellidoMaterno.getText();
        String Correo = this.CampoCorreo.getText();
        String Dni = this.CampoDNI.getText();
        String telefonofijo = this.CampoTelefonoFijo.getText();
        String celular = this.CampoTelefonoCelular.getText();
        String fechaIngreso = this.CampoFechaIngreso.getText();
        
        auxiliar.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        mostrarListadeAltaProspectos();
        this.CampoRespuestaAcciones.setText(auxiliar.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni));
         
    }//GEN-LAST:event_BotonAltaProspectoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelProspecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelProspecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelProspecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelProspecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PanelProspecto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAltaProspecto;
    private javax.swing.JTextField CampoApellidoMaterno;
    private javax.swing.JTextField CampoApellidoPaterno;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoDNI;
    private javax.swing.JTextField CampoFechaIngreso;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoRespuestaAcciones;
    private javax.swing.JTextField CampoTelefonoCelular;
    private javax.swing.JTextField CampoTelefonoFijo;
    private javax.swing.JLabel EtiquetaCelular;
    private javax.swing.JLabel EtiquetaCorreo;
    private javax.swing.JLabel EtiquetaDNI;
    private javax.swing.JLabel EtiquetaFecha;
    private javax.swing.JLabel EtiquetaMaterno;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaPaterno;
    private javax.swing.JLabel EtiquetaTelfijo;
    private javax.swing.JTable PanelListaDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}