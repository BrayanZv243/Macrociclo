package Frames;

import autenticacion.RegistroFrame;
import entidades.Entrenador;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class semanasFrame extends javax.swing.JFrame {

    Entrenador entrenador;

    public semanasFrame(Entrenador entrenador) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.entrenador = entrenador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblNombreEntrenador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dateChooserInicio = new com.toedter.calendar.JDateChooser();
        dateChooserFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        totalSemanasCalculadas = new javax.swing.JTextField();
        indicacionesLbl = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear macrociclo | Calcular Semanas");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(23, 110, 181));

        lblBienvenida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));

        lblNombreEntrenador.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombreEntrenador.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEntrenador.setText("Hugo Sanchez");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volver.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreEntrenador)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBienvenida)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNombreEntrenador)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Inicio del Plan");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Fin del Plan");

        dateChooserFin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserFinPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Semanas");

        totalSemanasCalculadas.setEditable(false);
        totalSemanasCalculadas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalSemanasCalculadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalSemanasCalculadas.setEnabled(false);

        indicacionesLbl.setBackground(new java.awt.Color(51, 51, 51));
        indicacionesLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        indicacionesLbl.setForeground(new java.awt.Color(51, 51, 51));
        indicacionesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicacionesLbl.setText("Calculadora de semanas");
        indicacionesLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnConfirmar.setBackground(new java.awt.Color(23, 110, 181));
        btnConfirmar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicacionesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(totalSemanasCalculadas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChooserInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(indicacionesLbl)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(dateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalSemanasCalculadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateChooserFinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserFinPropertyChange
        if (dateChooserFin.getDate() != null) {
            if (validaciones()) {
                totalSemanasCalculadas.setText(Integer.toString(calcularSemanas(dateChooserInicio.getDate(), dateChooserFin.getDate())));
            }
        }
    }//GEN-LAST:event_dateChooserFinPropertyChange

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        
        if (validaciones()) {
            JOptionPane.showMessageDialog(
                    null, // Componente padre (en este caso, ninguno)
                    "Se registró el macrociclo de forma exitosa.",
                    "Registro Exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );
            dispose();
            new CrearMCFrame(entrenador, Integer.parseInt(totalSemanasCalculadas.getText())).setVisible(true);

        } else {
            JOptionPane.showMessageDialog(
                    null, // Componente padre (en este caso, ninguno)
                    "Ocurrió un error inesperado al registrar las semanas.",
                    "Error al registrar las semanas",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        dispose();
        new CrearMCFrame(entrenador, Integer.parseInt(totalSemanasCalculadas.getText())).setVisible(true);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private boolean validaciones() {
        totalSemanasCalculadas.setText("");
        if (dateChooserInicio.getDate() == null) {
            JOptionPane.showMessageDialog(
                    null, // Componente padre (en este caso, ninguno)
                    "Primero se ingresa la fecha de inicio del plan.",
                    "Error!!",
                    JOptionPane.ERROR_MESSAGE
            );
            dateChooserFin.setDate(null);
            return false;
        }
        // Validar que la fecha de inicio sea anterior a la fecha de fin
        if (dateChooserInicio.getDate().after(dateChooserFin.getDate())) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio del plan debe ser anterior a la fecha de fin del plan.");
            dateChooserFin.setDate(null);
            return false;
        }

        // Validar que el período sea de al menos 7 días
        long diferenciaEnMillis = dateChooserFin.getDate().getTime() - dateChooserInicio.getDate().getTime();
        long diferenciaEnDias = diferenciaEnMillis / (24 * 60 * 60 * 1000);
        if (diferenciaEnDias < 7) {
            JOptionPane.showMessageDialog(null, "El período debe ser de al menos 7 días.");
            dateChooserFin.setDate(null);
            return false;
        }

        return true;
    }

    private int calcularSemanas(Date inicio, Date fin) {
        // Crear un objeto Calendar para las fechas
        Calendar calInicio = Calendar.getInstance();
        Calendar calFin = Calendar.getInstance();
        calInicio.setTime(inicio);
        calFin.setTime(fin);

        // Calcular la diferencia en milisegundos
        long diferenciaEnMillis = calFin.getTimeInMillis() - calInicio.getTimeInMillis();

        // Convertir la diferencia en semanas y retornamos.
        return (int) (diferenciaEnMillis / (7 * 24 * 60 * 60 * 1000));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private com.toedter.calendar.JDateChooser dateChooserFin;
    private com.toedter.calendar.JDateChooser dateChooserInicio;
    private javax.swing.JLabel indicacionesLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblNombreEntrenador;
    private javax.swing.JTextField totalSemanasCalculadas;
    // End of variables declaration//GEN-END:variables
}
