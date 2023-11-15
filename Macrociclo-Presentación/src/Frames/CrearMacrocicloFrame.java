package Frames;

import autenticacion.IniciarSesionFrame;
import entidades.Macrociclo;
import javax.swing.JOptionPane;

public class CrearMacrocicloFrame extends javax.swing.JFrame {

    Macrociclo macro;

    String inicio;
    String fin;

    public CrearMacrocicloFrame(Macrociclo macrociclo, String inicio, String fin) {
        initComponents();

        this.inicio = inicio;
        this.fin = fin;
        this.macro = macrociclo;

        asignarValoresATxts();
        setLocationRelativeTo(null);

    }

    private void asignarValoresATxts() {

        // Se asignan los valores del macrociclo.
        txtDeporte.setText(macro.getDeporte());
        txtRama.setText(macro.getRama());
        txtJefeRama.setText(macro.getJefeDeRama());
        txtMetodologo.setText(macro.getMetodologo());

        txtInicio.setText(inicio);
        txtFin.setText(fin);
        txtSemanas.setText("" + macro.getSemanas());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lblBienvenida1 = new javax.swing.JLabel();
        lblNombreEntrenador1 = new javax.swing.JLabel();
        btnCerrarSesion1 = new javax.swing.JButton();
        jpMacrociclo = new javax.swing.JPanel();
        btnValidarSemanas = new javax.swing.JButton();
        pnlSemanas = new javax.swing.JPanel();
        txtFin = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtSemanas = new javax.swing.JTextField();
        pnlGeneral = new javax.swing.JPanel();
        txtRama = new javax.swing.JTextField();
        txtJefeRama = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDeporte = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtMetodologo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        pnlPeriodosAmbos = new javax.swing.JPanel();
        pnlPeriodos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPorcentajePrep = new javax.swing.JTextField();
        txtSemanasPrep = new javax.swing.JTextField();
        txtPorcentajeComp = new javax.swing.JTextField();
        txtSemanasComp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEditarEtapa = new javax.swing.JButton();
        btnCalcularEtapa = new javax.swing.JButton();
        pnlOutPeriodoComp = new javax.swing.JPanel();
        pnlPeriodoComp = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPorcentajePeriodoPreComp = new javax.swing.JTextField();
        txtSemanasPeriodoPreComp = new javax.swing.JTextField();
        txtPorcentajeEtapaComp = new javax.swing.JTextField();
        txtSemanasPeriodoComp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnlOutPeriodoPrep = new javax.swing.JPanel();
        pnlPeriodoPrep = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPorcentajeEtapaPrep = new javax.swing.JTextField();
        txtSemanasEtapaPrep = new javax.swing.JTextField();
        txtPorcentajeEtapaEsp = new javax.swing.JTextField();
        txtSemanasEtapaEsp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Macrociclo");

        jPanel4.setBackground(new java.awt.Color(23, 110, 181));

        lblBienvenida1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volver.png"))); // NOI18N

        lblNombreEntrenador1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombreEntrenador1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEntrenador1.setText("Hugo Sanchez");

        btnCerrarSesion1.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion1.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion1.setText("Cerrar Sesión");
        btnCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblBienvenida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreEntrenador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreEntrenador1)
                        .addComponent(btnCerrarSesion1)))
                .addGap(10, 10, 10))
        );

        jpMacrociclo.setBackground(new java.awt.Color(255, 255, 255));
        jpMacrociclo.setEnabled(false);

        btnValidarSemanas.setBackground(new java.awt.Color(23, 110, 181));
        btnValidarSemanas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnValidarSemanas.setForeground(new java.awt.Color(255, 255, 255));
        btnValidarSemanas.setText("Validar Semanas");
        btnValidarSemanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarSemanasActionPerformed(evt);
            }
        });

        pnlSemanas.setBackground(new java.awt.Color(255, 255, 255));

        txtFin.setEditable(false);
        txtFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFin.setEnabled(false);

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel30.setText("Total de semanas");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel24.setText("Fin del plan ");

        txtInicio.setEditable(false);
        txtInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInicio.setEnabled(false);
        txtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel23.setText("Inicio del plan ");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Semanas");

        txtSemanas.setEditable(false);
        txtSemanas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSemanas.setEnabled(false);
        txtSemanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemanasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSemanasLayout = new javax.swing.GroupLayout(pnlSemanas);
        pnlSemanas.setLayout(pnlSemanasLayout);
        pnlSemanasLayout.setHorizontalGroup(
            pnlSemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSemanasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSemanasLayout.createSequentialGroup()
                        .addGroup(pnlSemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24)
                            .addComponent(txtFin)
                            .addComponent(jLabel23)
                            .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(pnlSemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(txtSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlSemanasLayout.setVerticalGroup(
            pnlSemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSemanasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSemanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSemanasLayout.createSequentialGroup()
                        .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSemanasLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        pnlGeneral.setBackground(new java.awt.Color(255, 255, 255));

        txtRama.setEnabled(false);

        txtJefeRama.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel26.setText("Rama");

        txtDeporte.setEnabled(false);
        txtDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeporteActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel29.setText("Metodólogo");

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Información general");

        txtMetodologo.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel25.setText("Deporte");

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel27.setText("Jefe de rama");

        javax.swing.GroupLayout pnlGeneralLayout = new javax.swing.GroupLayout(pnlGeneral);
        pnlGeneral.setLayout(pnlGeneralLayout);
        pnlGeneralLayout.setHorizontalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJefeRama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMetodologo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDeporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJefeRama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMetodologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlPeriodosAmbos.setBackground(new java.awt.Color(23, 110, 181));

        pnlPeriodos.setBackground(new java.awt.Color(255, 255, 255));
        pnlPeriodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setText("Periodo competitivo");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setText("Periodo preparativo ");

        txtPorcentajePrep.setEnabled(false);

        txtPorcentajeComp.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("%");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Semanas");

        javax.swing.GroupLayout pnlPeriodosLayout = new javax.swing.GroupLayout(pnlPeriodos);
        pnlPeriodos.setLayout(pnlPeriodosLayout);
        pnlPeriodosLayout.setHorizontalGroup(
            pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeriodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPeriodosLayout.createSequentialGroup()
                        .addGroup(pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPeriodosLayout.createSequentialGroup()
                                .addComponent(txtPorcentajeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSemanasComp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPeriodosLayout.createSequentialGroup()
                                .addComponent(txtPorcentajePrep, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSemanasPrep, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(pnlPeriodosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        pnlPeriodosLayout.setVerticalGroup(
            pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeriodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPorcentajePrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemanasPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPorcentajeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemanasComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnEditarEtapa.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarEtapa.setForeground(new java.awt.Color(51, 51, 51));
        btnEditarEtapa.setText("Editar Etapas");
        btnEditarEtapa.setEnabled(false);
        btnEditarEtapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEtapaActionPerformed(evt);
            }
        });

        btnCalcularEtapa.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcularEtapa.setForeground(new java.awt.Color(51, 51, 51));
        btnCalcularEtapa.setText("Calcular Etapas");
        btnCalcularEtapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularEtapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPeriodosAmbosLayout = new javax.swing.GroupLayout(pnlPeriodosAmbos);
        pnlPeriodosAmbos.setLayout(pnlPeriodosAmbosLayout);
        pnlPeriodosAmbosLayout.setHorizontalGroup(
            pnlPeriodosAmbosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeriodosAmbosLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(pnlPeriodosAmbosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeriodosAmbosLayout.createSequentialGroup()
                        .addComponent(btnEditarEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcularEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        pnlPeriodosAmbosLayout.setVerticalGroup(
            pnlPeriodosAmbosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeriodosAmbosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPeriodosAmbosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEtapa)
                    .addComponent(btnCalcularEtapa))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlOutPeriodoComp.setBackground(new java.awt.Color(23, 110, 181));

        pnlPeriodoComp.setBackground(new java.awt.Color(255, 255, 255));
        pnlPeriodoComp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Periodo competitivo");

        jLabel12.setText("Precompetitivo");

        txtPorcentajePeriodoPreComp.setEnabled(false);

        txtPorcentajeEtapaComp.setEnabled(false);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("%");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Semanas");

        jLabel19.setText("Competitivo");

        javax.swing.GroupLayout pnlPeriodoCompLayout = new javax.swing.GroupLayout(pnlPeriodoComp);
        pnlPeriodoComp.setLayout(pnlPeriodoCompLayout);
        pnlPeriodoCompLayout.setHorizontalGroup(
            pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeriodoCompLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeriodoCompLayout.createSequentialGroup()
                        .addGroup(pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPeriodoCompLayout.createSequentialGroup()
                                .addComponent(txtPorcentajePeriodoPreComp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtSemanasPeriodoPreComp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPeriodoCompLayout.createSequentialGroup()
                                .addComponent(txtPorcentajeEtapaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtSemanasPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeriodoCompLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        pnlPeriodoCompLayout.setVerticalGroup(
            pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeriodoCompLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorcentajePeriodoPreComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemanasPeriodoPreComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(pnlPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorcentajeEtapaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemanasPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlOutPeriodoCompLayout = new javax.swing.GroupLayout(pnlOutPeriodoComp);
        pnlOutPeriodoComp.setLayout(pnlOutPeriodoCompLayout);
        pnlOutPeriodoCompLayout.setHorizontalGroup(
            pnlOutPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutPeriodoCompLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlOutPeriodoCompLayout.setVerticalGroup(
            pnlOutPeriodoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutPeriodoCompLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlOutPeriodoPrep.setBackground(new java.awt.Color(23, 110, 181));

        pnlPeriodoPrep.setBackground(new java.awt.Color(255, 255, 255));
        pnlPeriodoPrep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("Etapa especial");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Periodo preparativo ");

        txtPorcentajeEtapaPrep.setEnabled(false);

        txtPorcentajeEtapaEsp.setEnabled(false);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("%");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Semanas");

        jLabel20.setText("Etapa preparación");

        javax.swing.GroupLayout pnlPeriodoPrepLayout = new javax.swing.GroupLayout(pnlPeriodoPrep);
        pnlPeriodoPrep.setLayout(pnlPeriodoPrepLayout);
        pnlPeriodoPrepLayout.setHorizontalGroup(
            pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeriodoPrepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPeriodoPrepLayout.createSequentialGroup()
                        .addGroup(pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPeriodoPrepLayout.createSequentialGroup()
                                .addComponent(txtPorcentajeEtapaPrep, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtSemanasEtapaPrep, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPeriodoPrepLayout.createSequentialGroup()
                                .addComponent(txtPorcentajeEtapaEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtSemanasEtapaEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(pnlPeriodoPrepLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        pnlPeriodoPrepLayout.setVerticalGroup(
            pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeriodoPrepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorcentajeEtapaPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemanasEtapaPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(pnlPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPorcentajeEtapaEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemanasEtapaEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlOutPeriodoPrepLayout = new javax.swing.GroupLayout(pnlOutPeriodoPrep);
        pnlOutPeriodoPrep.setLayout(pnlOutPeriodoPrepLayout);
        pnlOutPeriodoPrepLayout.setHorizontalGroup(
            pnlOutPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutPeriodoPrepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPeriodoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlOutPeriodoPrepLayout.setVerticalGroup(
            pnlOutPeriodoPrepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutPeriodoPrepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPeriodoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpMacrocicloLayout = new javax.swing.GroupLayout(jpMacrociclo);
        jpMacrociclo.setLayout(jpMacrocicloLayout);
        jpMacrocicloLayout.setHorizontalGroup(
            jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMacrocicloLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(pnlSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                        .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnValidarSemanas))
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(pnlPeriodosAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlOutPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlOutPeriodoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(61, Short.MAX_VALUE))))
        );
        jpMacrocicloLayout.setVerticalGroup(
            jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                        .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(303, 303, 303))
                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                        .addComponent(pnlSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(pnlPeriodosAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMacrocicloLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlOutPeriodoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlOutPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnValidarSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpMacrociclo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpMacrociclo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeporteActionPerformed

    private void btnCalcularEtapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularEtapaActionPerformed
        try {
            if (validarPeriodos()) {
                calcularPorcentajePeriodos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se introdujo un valor válido en los periodos");
            resetearCamposPeriodos();
        }

    }//GEN-LAST:event_btnCalcularEtapaActionPerformed

    private void btnValidarSemanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarSemanasActionPerformed

        try {
            if (validarEtapas()) {
                btnValidarSemanas.setEnabled(false);
                btnEditarEtapa.setEnabled(false);

                JOptionPane.showMessageDialog(this, "Validaciones exitosas.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "No se introdujo un valor válido en los periodos");
            resetearCamposPeriodos();
        }
    }//GEN-LAST:event_btnValidarSemanasActionPerformed

    private void btnEditarEtapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEtapaActionPerformed

        this.btnCalcularEtapa.setEnabled(true);

        this.txtSemanasEtapaPrep.setText("");
        this.txtSemanasEtapaEsp.setText("");
        this.txtSemanasPeriodoPreComp.setText("");
        this.txtSemanasPeriodoComp.setText("");

        this.txtSemanasPrep.setEnabled(true);
        this.txtSemanasComp.setEnabled(true);

        this.btnEditarEtapa.setEnabled(false);
    }//GEN-LAST:event_btnEditarEtapaActionPerformed

    private void btnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new IniciarSesionFrame().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesion1ActionPerformed

    private void txtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioActionPerformed

    private void txtSemanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemanasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemanasActionPerformed

    public boolean validarPeriodos() {

        int etapaPrep = Integer.parseInt(txtSemanasPrep.getText());
        int etapaComp = Integer.parseInt(txtSemanasComp.getText());

        int total = etapaPrep + etapaComp;

        if (total != macro.getSemanas()) {
            JOptionPane.showMessageDialog(this, "La suma de las semanas que se ingresó tiene que ser igual a las semanas totales");

            resetearCamposPeriodos();
            return false;
        }

        if (etapaPrep <= etapaComp) {

            JOptionPane.showMessageDialog(this, "Error. la semana preparativa debe contenes mas semanas que la semana competitiva");

            resetearCamposPeriodos();
            return false;
        }

        this.btnCalcularEtapa.setEnabled(false);
        this.btnEditarEtapa.setEnabled(true);
        this.txtSemanasPrep.setEnabled(false);
        this.txtSemanasComp.setEnabled(false);

        return true;
    }

    public void resetearCamposPeriodos() {
        txtSemanasPrep.setText("");
        txtSemanasComp.setText("");
        txtSemanasEtapaPrep.setText("");
        txtSemanasEtapaEsp.setText("");
        txtSemanasPeriodoComp.setText("");
        txtSemanasPeriodoPreComp.setText("");
    }

    public void calcularPorcentajePeriodos() {

        int etapaPrep = Integer.parseInt(txtSemanasPrep.getText());
        int etapaComp = Integer.parseInt(txtSemanasComp.getText());

        int porcentajePreparativa = (etapaPrep * 100) / macro.getSemanas();
        int porcentajeCompetitiva = (etapaComp * 100) / macro.getSemanas();

        txtPorcentajePrep.setText(String.valueOf(porcentajePreparativa));
        txtPorcentajeComp.setText(String.valueOf(porcentajeCompetitiva));

    }

    public boolean validarEtapas() {

        int prep = Integer.parseInt(txtSemanasPrep.getText());
        int comp = Integer.parseInt(txtSemanasComp.getText());

        int etapaPrep;
        int etapaEsp;
        int etapaPreComp = 0;
        int etapaComp;
        int total;

        int totalPrep;
        int totalComp;

        String preComp = txtSemanasPeriodoPreComp.getText();

        if (preComp.equalsIgnoreCase("") || preComp.equalsIgnoreCase("0")) {

            etapaPrep = Integer.parseInt(txtSemanasPrep.getText());

            etapaEsp = Integer.parseInt(txtSemanasEtapaEsp.getText());
            etapaComp = Integer.parseInt(txtSemanasPeriodoComp.getText());

            total = etapaPrep + etapaEsp + etapaComp;
            totalPrep = etapaPrep + etapaEsp;
            totalComp = etapaComp;
        } else {
            etapaPrep = Integer.parseInt(txtSemanasEtapaPrep.getText());
            etapaEsp = Integer.parseInt(txtSemanasEtapaEsp.getText());

            etapaPreComp = Integer.parseInt(txtSemanasPeriodoPreComp.getText());
            etapaComp = Integer.parseInt(txtSemanasPeriodoComp.getText());

            total = etapaPrep + etapaEsp + etapaPreComp + etapaComp;
            totalPrep = etapaPrep + etapaEsp;
            totalComp = etapaComp + etapaPreComp;
        }

        if (total != macro.getSemanas()) {
            JOptionPane.showMessageDialog(this, "La suma de semanas tiene que ser igual a las semanas totales");
            resetearPeriodos();
            return false;
        }

        if (totalPrep > prep) {
            JOptionPane.showMessageDialog(this, "La suma de semanas de prep que ingresó debe ser igual a las semanas totales");
            resetearPeriodos();
            return false;
        }

        if (totalComp > comp) {
            JOptionPane.showMessageDialog(this, "La suma de semanas comp debe ser igual a las semanas totales");
            resetearPeriodos();
            return false;
        }
        desactivarCamposEdicion();

        return true;
    }

    public void resetearPeriodos() {
        txtSemanasEtapaPrep.setText("");
        txtSemanasEtapaEsp.setText("");
        txtSemanasPeriodoComp.setText("");
        txtSemanasPeriodoPreComp.setText("");
    }

    public void desactivarCamposEdicion() {

        txtSemanasComp.setEnabled(false);
        txtSemanasEtapaEsp.setEnabled(false);
        txtSemanasPeriodoComp.setEnabled(false);
        txtSemanasPeriodoPreComp.setEnabled(false);
        txtSemanasPrep.setEnabled(false);
        txtSemanasEtapaPrep.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularEtapa;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCerrarSesion1;
    private javax.swing.JButton btnEditarEtapa;
    private javax.swing.JButton btnValidarSemanas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpMacrociclo;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblBienvenida1;
    private javax.swing.JLabel lblNombreEntrenador;
    private javax.swing.JLabel lblNombreEntrenador1;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlOutPeriodoComp;
    private javax.swing.JPanel pnlOutPeriodoPrep;
    private javax.swing.JPanel pnlPeriodoComp;
    private javax.swing.JPanel pnlPeriodoPrep;
    private javax.swing.JPanel pnlPeriodos;
    private javax.swing.JPanel pnlPeriodosAmbos;
    private javax.swing.JPanel pnlSemanas;
    private javax.swing.JTextField txtDeporte;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtJefeRama;
    private javax.swing.JTextField txtMetodologo;
    private javax.swing.JTextField txtPorcentajeComp;
    private javax.swing.JTextField txtPorcentajeEtapaComp;
    private javax.swing.JTextField txtPorcentajeEtapaEsp;
    private javax.swing.JTextField txtPorcentajeEtapaPrep;
    private javax.swing.JTextField txtPorcentajePeriodoPreComp;
    private javax.swing.JTextField txtPorcentajePrep;
    private javax.swing.JTextField txtRama;
    private javax.swing.JTextField txtSemanas;
    private javax.swing.JTextField txtSemanasComp;
    private javax.swing.JTextField txtSemanasEtapaEsp;
    private javax.swing.JTextField txtSemanasEtapaPrep;
    private javax.swing.JTextField txtSemanasPeriodoComp;
    private javax.swing.JTextField txtSemanasPeriodoPreComp;
    private javax.swing.JTextField txtSemanasPrep;
    // End of variables declaration//GEN-END:variables
}
