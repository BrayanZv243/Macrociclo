package Frames;

import autenticacion.IniciarSesionFrame;
import entidades.Entrenador;
import entidades.Macrociclo;
import javax.swing.JOptionPane;

/**
 *
 * @author alanf
 */
public class DatosMacrocicloFrame extends javax.swing.JFrame {

    Entrenador entrenador;
    int semanas;
    Macrociclo macro;
    String inicio;
    String fin;

    /**
     * Creates new form CrearMCFrame
     *
     * @param entrenador
     * @param semanas
     */
//    public DatosMacrocicloFrame(){
//        initComponents();
//        lblNombreEntrenador.setText("Prueba");
//        init();
//        setLocationRelativeTo(null);
//    }
    public DatosMacrocicloFrame(Entrenador entrenador, String inicio, String fin, int semanas) {
        initComponents();
        lblNombreEntrenador.setText(entrenador.getNombre());
        this.inicio = inicio;
        this.fin = fin;
        this.semanas = semanas;
        this.entrenador = entrenador;
        this.semanas = semanas;
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        txtMetodologo = new javax.swing.JTextField();
        metodologoLbl = new javax.swing.JLabel();
        siguienteBtn = new javax.swing.JButton();
        deporteLbl = new javax.swing.JLabel();
        ramaLbl = new javax.swing.JLabel();
        txtRama = new javax.swing.JTextField();
        jefeDeRamaLbl = new javax.swing.JLabel();
        txtJefeRama = new javax.swing.JTextField();
        comboDeporte = new javax.swing.JComboBox<>();
        indicacionesLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblNombreEntrenador = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear macrociclo | Información Principal");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        metodologoLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        metodologoLbl.setForeground(new java.awt.Color(51, 51, 51));
        metodologoLbl.setText("Metodólogo");

        siguienteBtn.setBackground(new java.awt.Color(23, 110, 181));
        siguienteBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        siguienteBtn.setForeground(new java.awt.Color(255, 255, 255));
        siguienteBtn.setText("Siguiente");
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBtnActionPerformed(evt);
            }
        });

        deporteLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deporteLbl.setForeground(new java.awt.Color(51, 51, 51));
        deporteLbl.setText("Deporte");

        ramaLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ramaLbl.setForeground(new java.awt.Color(51, 51, 51));
        ramaLbl.setText("Rama");

        txtRama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRamaActionPerformed(evt);
            }
        });

        jefeDeRamaLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jefeDeRamaLbl.setForeground(new java.awt.Color(51, 51, 51));
        jefeDeRamaLbl.setText("Jefe de rama");

        comboDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un deporte", "Judo", "Basquetbol", "Futbol", "Voleibol", "Hockey", "Karate", "Taekwondo" }));

        indicacionesLbl.setBackground(new java.awt.Color(51, 51, 51));
        indicacionesLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        indicacionesLbl.setForeground(new java.awt.Color(51, 51, 51));
        indicacionesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicacionesLbl.setText("Llenar todas las opciones para crear el macrociclo.");
        indicacionesLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(indicacionesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMetodologo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(deporteLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboDeporte, javax.swing.GroupLayout.Alignment.LEADING, 0, 279, Short.MAX_VALUE))
                    .addComponent(metodologoLbl))
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ramaLbl)
                    .addComponent(txtRama, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJefeRama, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jefeDeRamaLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(indicacionesLbl)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deporteLbl)
                    .addComponent(ramaLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboDeporte, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txtRama))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(metodologoLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetodologo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jefeDeRamaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJefeRama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(23, 110, 181));

        lblBienvenida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setText("Bienvenido entrenador,");

        lblNombreEntrenador.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombreEntrenador.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEntrenador.setText("Hugo Sanchez");

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreEntrenador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBienvenida)
                    .addComponent(lblNombreEntrenador)
                    .addComponent(btnCerrarSesion))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBtnActionPerformed

        if (validarCampos()){
            dispose();
            new CrearMacrocicloFrame(macro, inicio, fin).setVisible(true);
        }
        
    }//GEN-LAST:event_siguienteBtnActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        new IniciarSesionFrame().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void txtRamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRamaActionPerformed

    public boolean validarCampos() {
        String deporte = comboDeporte.getSelectedItem().toString();
        String rama = txtRama.getText();
        String metodologo = txtMetodologo.getText();
        String jefeRama = txtJefeRama.getText();

        // Realiza las validaciones
        if(deporte.equals("Seleccione un deporte")){
            mostrarMensajeError("Por favor, selecciona un deporte.");
            return false;
        }
        
        if (esStringVacioONulo(deporte)) {
            mostrarMensajeError("Por favor, selecciona un deporte.");
            return false;
        }

        if (esStringVacioONulo(rama)) {
            mostrarMensajeError("Por favor, ingresa la rama.");
            return false;
        }

        if (esStringVacioONulo(metodologo)) {
            mostrarMensajeError("Por favor, ingresa el nombre del metodólogo.");
            return false;
        }

        if (esStringVacioONulo(jefeRama)) {
            mostrarMensajeError("Por favor, ingresa el nombre del jefe de rama.");
            return false;
        }

        try {
            macro = new Macrociclo(deporte, rama, jefeRama, jefeRama, metodologo, semanas);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return true;
    }

    private boolean esStringVacioONulo(String str) {
        return str == null || str.trim().isEmpty();
    }

    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error de Entrada", JOptionPane.ERROR_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JComboBox<String> comboDeporte;
    private javax.swing.JLabel deporteLbl;
    private javax.swing.JLabel indicacionesLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jefeDeRamaLbl;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblNombreEntrenador;
    private javax.swing.JLabel metodologoLbl;
    private javax.swing.JLabel ramaLbl;
    private javax.swing.JButton siguienteBtn;
    private javax.swing.JTextField txtJefeRama;
    private javax.swing.JTextField txtMetodologo;
    private javax.swing.JTextField txtRama;
    // End of variables declaration//GEN-END:variables
}