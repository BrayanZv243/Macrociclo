package Frames;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class InicioFrame extends javax.swing.JFrame {

    public InicioFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateChooserFin = new com.toedter.calendar.JDateChooser();
        dateChooserInicio = new com.toedter.calendar.JDateChooser();
        totalSemanasCalculadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Macrociclos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Fin del Plan");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Inicio del Plan");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Semanas");

        dateChooserFin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserFinPropertyChange(evt);
            }
        });

        totalSemanasCalculadas.setEditable(false);
        totalSemanasCalculadas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalSemanasCalculadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalSemanasCalculadas.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChooserFin, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(dateChooserInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalSemanasCalculadas))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(dateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalSemanasCalculadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateChooserFinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserFinPropertyChange
        if (dateChooserFin.getDate() != null) {
            if (validaciones()) totalSemanasCalculadas.setText(Integer.toString(calcularSemanas(dateChooserInicio.getDate(), dateChooserFin.getDate())));
        }
    }//GEN-LAST:event_dateChooserFinPropertyChange

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
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioFrame().setVisible(true);
            }
        });
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
    private com.toedter.calendar.JDateChooser dateChooserFin;
    private com.toedter.calendar.JDateChooser dateChooserInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField totalSemanasCalculadas;
    // End of variables declaration//GEN-END:variables
}
