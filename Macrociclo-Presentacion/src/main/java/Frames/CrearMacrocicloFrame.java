package Frames;

import autenticacion.IniciarSesionFrame;
import entidades.Macrociclo;
import java.util.ArrayList;
import java.util.function.Function;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CrearMacrocicloFrame extends javax.swing.JFrame {

    Macrociclo macro;

    String inicio;
    String fin;

    ArrayList<String> distribucionPreparativa = new ArrayList<>();
    ArrayList<String> ciclicidadPreparativa = new ArrayList<>();

    ArrayList<String> distribucionEspecial = new ArrayList<>();
    ArrayList<String> ciclicidadEspecial = new ArrayList<>();

    ArrayList<String> distribucionPrecom = new ArrayList<>();
    ArrayList<String> ciclicidadPrecom = new ArrayList<>();

    ArrayList<String> distribucionCompetitiva = new ArrayList<>();
    ArrayList<String> ciclicidadCompetitiva = new ArrayList<>();

    public CrearMacrocicloFrame(Macrociclo macrociclo, String inicio, String fin) {
        initComponents();

        this.inicio = inicio;
        this.fin = fin;
        this.macro = macrociclo;

        asignarValoresATxts();
        setLocationRelativeTo(null);
    }

    public CrearMacrocicloFrame() {
        initComponents();

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
        pnlSemanas = new javax.swing.JPanel();
        txtFin = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtSemanas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEsp = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPreComp = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaComp = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPrep = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarPrep = new javax.swing.JButton();
        btnEliminarPrep = new javax.swing.JButton();
        btnAgregarEsp = new javax.swing.JButton();
        btnEliminarEsp = new javax.swing.JButton();
        btnAgregarPreComp = new javax.swing.JButton();
        btnEliminarPreComp = new javax.swing.JButton();
        btnAgregarComp = new javax.swing.JButton();
        btnEliminarComp = new javax.swing.JButton();
        btnGuardarMacrociclo = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Macrociclo");

        jPanel4.setBackground(new java.awt.Color(23, 110, 181));

        lblBienvenida1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volver.png"))); // NOI18N

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
                .addContainerGap(19, Short.MAX_VALUE)
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

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Fila 1: Mesosiclos");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addComponent(pnlSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeneralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))))
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(txtJefeRama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnlSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetodologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tablaEsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "0"},
                {null, null}
            },
            new String [] {
                "1", "2"
            }
        ));
        jScrollPane1.setViewportView(tablaEsp);

        tablaPreComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "0"},
                {null, null}
            },
            new String [] {
                "1", "2"
            }
        ));
        jScrollPane2.setViewportView(tablaPreComp);

        tablaComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", null},
                {null, null}
            },
            new String [] {
                "1", "2"
            }
        ));
        jScrollPane3.setViewportView(tablaComp);

        tablaPrep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "0"},
                {"", null}
            },
            new String [] {
                "1", "2"
            }
        ));
        jScrollPane4.setViewportView(tablaPrep);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Tabla Especial");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Tabla PreCompetivia");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Tabla Preparativa");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Tabla Competitiva");

        btnAgregarPrep.setText("+");
        btnAgregarPrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPrepActionPerformed(evt);
            }
        });

        btnEliminarPrep.setText("-");
        btnEliminarPrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPrepActionPerformed(evt);
            }
        });

        btnAgregarEsp.setText("+");
        btnAgregarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEspActionPerformed(evt);
            }
        });

        btnEliminarEsp.setText("-");
        btnEliminarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEspActionPerformed(evt);
            }
        });

        btnAgregarPreComp.setText("+");
        btnAgregarPreComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPreCompActionPerformed(evt);
            }
        });

        btnEliminarPreComp.setText("-");
        btnEliminarPreComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPreCompActionPerformed(evt);
            }
        });

        btnAgregarComp.setText("+");
        btnAgregarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompActionPerformed(evt);
            }
        });

        btnEliminarComp.setText("-");
        btnEliminarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompActionPerformed(evt);
            }
        });

        btnGuardarMacrociclo.setBackground(new java.awt.Color(23, 110, 181));
        btnGuardarMacrociclo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarMacrociclo.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarMacrociclo.setText("Guardar Macrociclo");
        btnGuardarMacrociclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMacrocicloActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel32.setText("Fila 1: Mesosiclos");

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel33.setText("Fila 2: Microciclos");

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel34.setText("Fila 3: Ciclicidad");

        javax.swing.GroupLayout jpMacrocicloLayout = new javax.swing.GroupLayout(jpMacrociclo);
        jpMacrociclo.setLayout(jpMacrocicloLayout);
        jpMacrocicloLayout.setHorizontalGroup(
            jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                        .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(53, 53, 53)
                                        .addComponent(btnEliminarPrep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(btnAgregarPrep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnGuardarMacrociclo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel32)))
                                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(pnlPeriodosAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnValidarSemanas)))
                                .addGap(18, 18, 18)
                                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlOutPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlOutPeriodoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45)
                                .addComponent(btnEliminarComp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(btnAgregarComp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarPreComp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnAgregarPreComp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(92, 92, 92)
                                .addComponent(btnEliminarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btnAgregarEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpMacrocicloLayout.setVerticalGroup(
            jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                        .addComponent(pnlOutPeriodoPrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlOutPeriodoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpMacrocicloLayout.createSequentialGroup()
                        .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpMacrocicloLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(pnlPeriodosAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMacrocicloLayout.createSequentialGroup()
                                .addComponent(btnValidarSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMacrocicloLayout.createSequentialGroup()
                                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarPrep)
                                    .addComponent(btnAgregarPrep)
                                    .addComponent(btnGuardarMacrociclo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34))
                                .addGap(4, 4, 4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminarEsp)
                                .addComponent(btnAgregarEsp))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPreComp)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPreComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMacrocicloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnEliminarComp)
                    .addComponent(btnAgregarComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(jpMacrociclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAgregarPrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPrepActionPerformed
        agregarMesociclo(tablaPrep, 1);

    }//GEN-LAST:event_btnAgregarPrepActionPerformed

    private void btnEliminarPrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPrepActionPerformed
        eliminarMesociclo(tablaPrep, 1);
    }//GEN-LAST:event_btnEliminarPrepActionPerformed

    private void btnEliminarPreCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPreCompActionPerformed
        eliminarMesociclo(tablaPreComp, 3);
    }//GEN-LAST:event_btnEliminarPreCompActionPerformed

    private void btnAgregarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEspActionPerformed
        agregarMesociclo(tablaEsp, 2);
    }//GEN-LAST:event_btnAgregarEspActionPerformed

    private void btnEliminarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEspActionPerformed
        eliminarMesociclo(tablaEsp, 2);

    }//GEN-LAST:event_btnEliminarEspActionPerformed

    private void btnAgregarPreCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPreCompActionPerformed
        agregarMesociclo(tablaPreComp, 3);

    }//GEN-LAST:event_btnAgregarPreCompActionPerformed

    private void btnAgregarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompActionPerformed
        agregarMesociclo(tablaComp, 4);

    }//GEN-LAST:event_btnAgregarCompActionPerformed

    private void btnEliminarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompActionPerformed
        eliminarMesociclo(tablaComp, 4);
    }//GEN-LAST:event_btnEliminarCompActionPerformed

    private void btnGuardarMacrocicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMacrocicloActionPerformed

        if (distribucionEtapasValidarTodo() && validarCiclicidad()) {
            System.out.println("validaciones pasadas en distribución");
        }
    }//GEN-LAST:event_btnGuardarMacrocicloActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMacrocicloFrame().setVisible(true);
            }
        });
    }

    public void agregarMesociclo(JTable tabla, int numTabla) {
        //NUM 1, TABLA PREPARACION -  NUM 2, TABLA ESPECIAL - NUM 3, TABLA PRECOMPETITIVA - NUM 4, TABLA COMPETITIVA
        switch (numTabla) {
            case 1 ->
                this.btnEliminarPrep.setEnabled(true);
            case 2 ->
                this.btnEliminarEsp.setEnabled(true);
            case 3 ->
                this.btnEliminarPreComp.setEnabled(true);
            case 4 ->
                this.btnEliminarComp.setEnabled(true);
            default -> {
            }
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();

        //Si hay una columna, la siguiente sera la 2.
        //Si hay 4 columnas, la siguiente sera la 5
        int numInicial = modeloTabla.getColumnCount();
        int nuevoNum = numInicial + 1;

        //Agrego la columna
        modeloTabla.addColumn(nuevoNum);

        // Obtener el índice de la nueva columna
        int nuevaColumnaIndex = modeloTabla.getColumnCount() - 1;

        // Establecer el valor 0 en la nueva columna 
        modeloTabla.setValueAt(0, 0, nuevaColumnaIndex);

    }

    public void eliminarMesociclo(JTable tabla, int numTabla) {

        DefaultTableModel modeloTablaPreparacion = (DefaultTableModel) tabla.getModel();
        int totalColumnas = modeloTablaPreparacion.getColumnCount();

        if (totalColumnas >= 2) {
            modeloTablaPreparacion.setColumnCount(totalColumnas - 1);

        } else {
            modeloTablaPreparacion.setColumnCount(totalColumnas - 1);
            switch (numTabla) {
                case 1 ->
                    this.btnEliminarPrep.setEnabled(false);
                case 2 ->
                    this.btnEliminarEsp.setEnabled(false);
                case 3 ->
                    this.btnEliminarPreComp.setEnabled(false);
                case 4 ->
                    this.btnEliminarComp.setEnabled(false);
                default -> {
                }
            }
        }
    }

    public boolean distribucionEtapasValidarTodo() {

        // Obtener las semanas de cada etapa
        String semanasPrep = txtSemanasEtapaPrep.getText();
        String semanasEsp = txtSemanasEtapaEsp.getText();
        String semanasPreComp = txtSemanasPeriodoPreComp.getText();
        String semanasComp = txtSemanasPeriodoComp.getText();

        // Obtener modelos de tabla
        DefaultTableModel modeloPrep = (DefaultTableModel) tablaPrep.getModel();
        DefaultTableModel modeloEsp = (DefaultTableModel) tablaEsp.getModel();
        DefaultTableModel modeloPreComp = (DefaultTableModel) tablaPreComp.getModel();
        DefaultTableModel modeloComp = (DefaultTableModel) tablaComp.getModel();

        // Inicializar variables para las semanas de cada etapa
        int etapaPrep = 0;
        int etapaEsp = 0;
        int etapaPreComp = 0;
        int etapaComp = 0;

        try {
            // Convertir las semanas a enteros
            etapaPrep = Integer.parseInt(semanasPrep);
            etapaEsp = Integer.parseInt(semanasEsp);
            etapaPreComp = Integer.parseInt(semanasPreComp);
            etapaComp = Integer.parseInt(semanasComp);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Se detectaron valores no numéricos en las semanas.");
            return false;
        }

        // Definir una clase funcional para sumar los valores de una tabla
        Function<DefaultTableModel, Integer> sumarValoresTabla = (modelo) -> {
            int suma = 0;

            for (int i = 0; i < modelo.getColumnCount(); i++) {
                if (modelo.getValueAt(0, i) != null) {
                    try {
                        int valorCelda = Integer.parseInt(modelo.getValueAt(0, i).toString());
                        if (valorCelda <= 0) {
                            JOptionPane.showMessageDialog(this, "No pueden haber campos nulos o 0");
                            return -1;
                        }
                        suma += valorCelda;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "No pueden haber campos nulos o 0");
                        return -1;
                    }
                }
            }
            return suma;
        };

        // Calcular las sumas de cada etapa
        int sumaPrep = sumarValoresTabla.apply(modeloPrep);
        int sumaEsp = sumarValoresTabla.apply(modeloEsp);
        int sumaPreComp = sumarValoresTabla.apply(modeloPreComp);
        int sumaComp = sumarValoresTabla.apply(modeloComp);

        // Verificar si las sumas coinciden con las semanas establecidas
        if (sumaPrep != -1 && sumaEsp != -1 && sumaPreComp != -1 && sumaComp != -1) {
            if (sumaPrep == etapaPrep && sumaEsp == etapaEsp && sumaPreComp == etapaPreComp && sumaComp == etapaComp) {
                JOptionPane.showMessageDialog(this, "Etapas validas.");
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Verifique las semanas establecidas para que la suma coincida con las tablas.");
                return false;
            }
        }

        return false;
    }

    public boolean validarCiclicidad() {
        // Validar ciclicidad para cada tabla
        if (!validarCiclicidadTabla(tablaPrep, "preparación")) {
            return false;
        }
        if (!validarCiclicidadTabla(tablaEsp, "especial")) {
            return false;
        }
        if (!validarCiclicidadTabla(tablaPreComp, "precompetitiva")) {
            return false;
        }
        if (!validarCiclicidadTabla(tablaComp, "competitiva")) {
            return false;
        }

        JOptionPane.showMessageDialog(this, "La distribución de ciclicidad es válida");
        return true;
    }

    private boolean validarCiclicidadTabla(javax.swing.JTable tabla, String tipo) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ArrayList<String> ciclicidades = new ArrayList<>();
        ArrayList<String> semanas = new ArrayList<>();

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            String ciclicidad = "";
            String semanasMeso = "";

            try {
                ciclicidad = modelo.getValueAt(1, i).toString();
                semanasMeso = modelo.getValueAt(0, i).toString();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: Tabla , se dejó vacío semanas microciclo o ciclicidad en tabla " + tipo);
                return false;
            }

            if (!validarSemanasMeso(semanasMeso)) {
                return false;
            }

            int semanasEntero = Integer.parseInt(semanasMeso);

            if (semanasEntero == 1 || semanasEntero == 2) {
                ciclicidad = semanasMeso + ",0";
            } else {
                if (!validarFormatoCiclicidad(ciclicidad, semanasMeso)) {
                    return false;
                }
            }

            ciclicidades.add(ciclicidad);
            semanas.add(semanasMeso);
        }

        asignarDistribucionesCiclicidades(tipo, ciclicidades, semanas);
        return true;
    }

    private void asignarDistribucionesCiclicidades(String tipo, ArrayList<String> ciclicidades, ArrayList<String> semanas) {
        switch (tipo) {
            case "preparación" -> {
                this.distribucionPreparativa = semanas;
                this.ciclicidadPreparativa = ciclicidades;
            }
            case "especial" -> {
                this.distribucionEspecial = semanas;
                this.ciclicidadEspecial = ciclicidades;
            }
            case "precompetitiva" -> {
                this.distribucionPrecom = semanas;
                this.ciclicidadPrecom = ciclicidades;
            }
            case "competitiva" -> {
                this.distribucionCompetitiva = semanas;
                this.ciclicidadCompetitiva = ciclicidades;
            }
        }
    }

    /**
     * Método para validar que las semanas ingresadas dentro del mesociclo sean
     * números enteros.
     *
     * @param semanas la cadena de texto a la que se le comprobará si contiene
     * solo un número entero.
     * @return true si la cadena para la validación, false en caso contrario.
     */
    public boolean validarSemanasMeso(String semanas) {
        if (!semanas.matches("\\d+")) {
            mostrarError("Error: Tabla, El número de semanas no es un número entero");
            return false;
        }

        return true;
    }

    /**
     * Método para mostrar mensajes de error.
     *
     * @param mensaje el mensaje de error a mostrar.
     */
    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * Función que se encarga de validar el formato de ciclicidad ingresada como
     * parámetro, donde la primera n representa las semanas de trabajo y la
     * segunda n las semanas de descanso.
     *
     * @param ciclicidad el valor que se encuentra dentro de la celda de
     * ciclisidad.
     * @param meso el valor de las semanas que se encuentra ingresado en un
     * mesociclo.
     * @return true si la ciclicidad es válida, false en caso contrario.
     */
    public boolean validarFormatoCiclicidad(String ciclicidad, String meso) {
        if (!ciclicidad.matches("\\d+,\\d+")) {
            mostrarError("Favor de usar comas para separar las de trabajo con las de descanso. NO PUNTOS. ex. 1,1");
            return false;
        }

        String[] numeros = ciclicidad.split(",");
        int semanasTrabajo = Integer.parseInt(numeros[0]);
        int semanasDescanso = Integer.parseInt(numeros[1]);
        int semanasTotales = Integer.parseInt(meso);
        int semanasSuma = semanasTrabajo + semanasDescanso;

        if (semanasTotales != semanasSuma) {
            mostrarError("Las semanas no corresponden con el trabajo y descanso.");
            return false;
        }

        if (semanasTrabajo <= semanasDescanso) {
            mostrarError("Las semanas de trabajo son menores a las de descanso.");
            return false;
        }

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComp;
    private javax.swing.JButton btnAgregarEsp;
    private javax.swing.JButton btnAgregarPreComp;
    private javax.swing.JButton btnAgregarPrep;
    private javax.swing.JButton btnCalcularEtapa;
    private javax.swing.JButton btnCerrarSesion1;
    private javax.swing.JButton btnEditarEtapa;
    private javax.swing.JButton btnEliminarComp;
    private javax.swing.JButton btnEliminarEsp;
    private javax.swing.JButton btnEliminarPreComp;
    private javax.swing.JButton btnEliminarPrep;
    private javax.swing.JButton btnGuardarMacrociclo;
    private javax.swing.JButton btnValidarSemanas;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpMacrociclo;
    private javax.swing.JLabel lblBienvenida1;
    private javax.swing.JLabel lblNombreEntrenador1;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlOutPeriodoComp;
    private javax.swing.JPanel pnlOutPeriodoPrep;
    private javax.swing.JPanel pnlPeriodoComp;
    private javax.swing.JPanel pnlPeriodoPrep;
    private javax.swing.JPanel pnlPeriodos;
    private javax.swing.JPanel pnlPeriodosAmbos;
    private javax.swing.JPanel pnlSemanas;
    private javax.swing.JTable tablaComp;
    private javax.swing.JTable tablaEsp;
    private javax.swing.JTable tablaPreComp;
    private javax.swing.JTable tablaPrep;
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
