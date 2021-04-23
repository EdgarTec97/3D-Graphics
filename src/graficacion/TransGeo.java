package graficacion;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class TransGeo extends javax.swing.JFrame {

    Graf panel = new Graf();
    boolean linea = false;
    int grosor = 0;
    boolean banIni = true;
    boolean banDibujar = false;
    boolean traslacion, escalacion, rotacion = false;
    int T[][] = new int[7][3];
    int E[][] = new int[7][3];
    double R[][] = new double[7][3];
    double[][] p1 = {{0, 1, 1}, {3, 4, 1}, {0, 4, 1}, {0, 5, 1}, {4, 5, 1}, {4, 4, 1}, {1, 1, 1}};
    DecimalFormat form = new DecimalFormat("#.##");

    public TransGeo() {
        initComponents();
        tx.setEditable(false);
        ty.setEditable(false);
        sx.setEditable(false);
        sy.setEditable(false);
        ang.setEditable(false);
        setLocationRelativeTo(null);
        btnTras.setEnabled(false);
        btnEsc.setEnabled(false);
        btnRot.setEnabled(false);
        Puntos();
        this.setSize(1200, 705);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel pabelGraficacion = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        coo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ty = new javax.swing.JTextField();
        tx = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sy = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ang = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sx = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        btnTras = new javax.swing.JButton();
        btnEsc = new javax.swing.JButton();
        btnRot = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pabelGraficacion = new Graf();
        pabelGraficacion = panel;
        pabelGraficacion.setBackground(new java.awt.Color(255, 255, 255));
        pabelGraficacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pabelGraficacion.setPreferredSize(new java.awt.Dimension(500, 500));
        pabelGraficacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pabelGraficacionMouseMoved(evt);
            }
        });
        pabelGraficacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pabelGraficacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 600, 600));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, 20, 20));
        getContentPane().add(coo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Traslación", "Escalación", "Rotación" }));
        cbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActionPerformed(evt);
            }
        });
        jPanel3.add(cbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ty:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rotación");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        jPanel3.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, -1));

        tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txActionPerformed(evt);
            }
        });
        jPanel3.add(tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tx:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Traslación");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Escalación");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sy:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        sy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syActionPerformed(evt);
            }
        });
        jPanel3.add(sy, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 50, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, -1));

        ang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angActionPerformed(evt);
            }
        });
        jPanel3.add(ang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 50, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("θ:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Sx:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        sx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxActionPerformed(evt);
            }
        });
        jPanel3.add(sx, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Coordenadas");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 40, 130));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 20, 130));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 470, 20));

        table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setAutoscrolls(false);
        table.setEnabled(false);
        table.setFocusable(false);
        table.setGridColor(new java.awt.Color(204, 204, 255));
        table.setRowSelectionAllowed(false);
        table.setSelectionBackground(new java.awt.Color(255, 102, 51));
        table.setSelectionForeground(new java.awt.Color(153, 153, 255));
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 150));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Transformación Geometrica:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, -1));

        btnTras.setText("Graficar");
        btnTras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasActionPerformed(evt);
            }
        });
        jPanel3.add(btnTras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        btnEsc.setText("Graficar");
        btnEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscActionPerformed(evt);
            }
        });
        jPanel3.add(btnEsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        btnRot.setText("Graficar");
        btnRot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotActionPerformed(evt);
            }
        });
        jPanel3.add(btnRot, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, 410));

        encabezado.setBackground(new java.awt.Color(255, 255, 255));
        encabezado.setBorder(new javax.swing.border.MatteBorder(null));
        encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("TRANSFORMACIONES GEOMETRICAS 2D SUCESIVAS");
        encabezado.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 730, -1));

        lbl1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Graficación Básica por Computadora");
        encabezado.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 680, 30));

        title1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezado.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1230, 20));

        title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezado.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 440, 30));

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton2.setText("Menú");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        encabezado.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1180, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pabelGraficacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pabelGraficacionMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        coo.setText(String.format("X: [%d] Y: [%d]", x, y));
    }//GEN-LAST:event_pabelGraficacionMouseMoved

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txActionPerformed

    private void syActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_syActionPerformed

    private void angActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angActionPerformed

    private void sxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sxActionPerformed
    public void Puntos() {

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {" P1 ", " 0 ", " 1 "},
                    {" P2 ", " 3 ", " 4 "},
                    {" P3 ", " 0 ", " 4 "},
                    {" P4 ", " 0 ", " 5 "},
                    {" P5 ", " 4 ", " 5 "},
                    {" P6 ", " 4 ", " 4 "},
                    {" P7 ", " 1 ", " 1 "},},
                new String[]{
                    " Puntos ", " X ", " Y ",}
        ));
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);

        //table.getColumnModel().getColumn(0).
    }

    public void PuntosT() {

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {" P1 ", " 0 ", " 1 ", T[0][0], T[0][1]},
                    {" P2 ", " 3 ", " 4 ", T[1][0], T[1][1]},
                    {" P3 ", " 0 ", " 4 ", T[2][0], T[2][1]},
                    {" P4 ", " 0 ", " 5 ", T[3][0], T[3][1]},
                    {" P5 ", " 4 ", " 5 ", T[4][0], T[4][1]},
                    {" P6 ", " 4 ", " 4 ", T[5][0], T[5][1]},
                    {" P7 ", " 1 ", " 1 ", T[6][0], T[6][1]},},
                new String[]{
                    " Puntos ", " X ", " Y ", "X'", "Y'"
                }
        ));
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
        //table.getColumnModel().getColumn(0).
    }

    public void PuntosE() {

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {" P1 ", " 0 ", " 1 ", E[0][0], E[0][1]},
                    {" P2 ", " 3 ", " 4 ", E[1][0], E[1][1]},
                    {" P3 ", " 0 ", " 4 ", E[2][0], E[2][1]},
                    {" P4 ", " 0 ", " 5 ", E[3][0], E[3][1]},
                    {" P5 ", " 4 ", " 5 ", E[4][0], E[4][1]},
                    {" P6 ", " 4 ", " 4 ", E[5][0], E[5][1]},
                    {" P7 ", " 1 ", " 1 ", E[6][0], E[6][1]},},
                new String[]{
                    " Puntos ", " X ", " Y ", "X'", "Y'"
                }
        ));
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
        //table.getColumnModel().getColumn(0).
    }

    public void PuntosR() {

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {" P1 ", " 0 ", " 1 ", form.format(R[0][0]), form.format(R[0][1])},
                    {" P2 ", " 3 ", " 4 ", form.format(R[1][0]), form.format(R[1][1])},
                    {" P3 ", " 0 ", " 4 ", form.format(R[2][0]), form.format(R[2][1])},
                    {" P4 ", " 0 ", " 5 ", form.format(R[3][0]), form.format(R[3][1])},
                    {" P5 ", " 4 ", " 5 ", form.format(R[4][0]), form.format(R[4][1])},
                    {" P6 ", " 4 ", " 4 ", form.format(R[5][0]), form.format(R[5][1])},
                    {" P7 ", " 1 ", " 1 ", form.format(R[6][0]), form.format(R[6][1])},},
                new String[]{
                    " Puntos ", " X ", " Y ", "X'", "Y'"
                }
        ));
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
        table.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
        //table.getColumnModel().getColumn(0).
    }

    private void cboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActionPerformed
        // TODO add your handling code here:

        if (panel != null) {
            String gsr = (String) cbo.getSelectedItem();
            if (gsr == "Traslación") {
                title.setText("Traslación");
                sx.setEditable(false);
                sy.setEditable(false);
                ang.setEditable(false);
                tx.setEditable(true);
                ty.setEditable(true);
                //traslacion = true;
                rotacion = false;
                escalacion = false;
                btnTras.setEnabled(true);
                Puntos();
                sx.setText("");
                sy.setText("");
                ang.setText("");
                repaint();

            } else if (gsr == "Escalación") {
                title.setText("Escalación");
                tx.setEditable(false);
                ty.setEditable(false);
                ang.setEditable(false);
                sx.setEditable(true);
                sy.setEditable(true);
                btnEsc.setEnabled(true);
                traslacion = false;
                rotacion = false;
                tx.setText("");
                ty.setText("");
                ang.setText("");
                Puntos();
                repaint();

            } else if (gsr == "Rotación") {
                title.setText("Rotación");
                ang.setEditable(true);
                tx.setEditable(false);
                ty.setEditable(false);
                sx.setEditable(false);
                sy.setEditable(false);
                btnRot.setEnabled(true);
                traslacion = false;
                escalacion = false;
                rotacion = false;
                tx.setText("");
                ty.setText("");
                sx.setText("");
                sy.setText("");
                Puntos();
                repaint();
            }
        }
    }//GEN-LAST:event_cboActionPerformed

    private void btnTrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasActionPerformed
        // TODO add your handling code here:
        int[][] tras = {{1, 0, 0},
        {0, 1, 0},
        {(Integer.parseInt(tx.getText())), (Integer.parseInt(ty.getText())), 1}};

        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < tras[0].length; j++) {
                for (int k = 0; k < p1[0].length; k++) {
                    // aquí se multiplica la matriz
                    T[i][j] += p1[i][k] * tras[k][j];
                }
            }
        }
        tx.setEditable(false);
        ty.setEditable(false);
        traslacion = true;
        PuntosT();
        repaint();
    }//GEN-LAST:event_btnTrasActionPerformed

    private void btnEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscActionPerformed
        // TODO add your handling code here:
        int[][] esc = {{(Integer.parseInt(sx.getText())), 0, 0},
        {0, (Integer.parseInt(sy.getText())), 0},
        {0, 0, 1}};
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < esc[0].length; j++) {
                for (int k = 0; k < p1[0].length; k++) {
                    // aquí se multiplica la matriz
                    E[i][j] += p1[i][k] * esc[k][j];
                }
            }
        }
        sx.setEditable(false);
        sy.setEditable(false);
        escalacion = true;
        PuntosE();
        repaint();


    }//GEN-LAST:event_btnEscActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        btnTras.setEnabled(false);
        btnEsc.setEnabled(false);
        btnRot.setEnabled(false);
        traslacion = false;
        escalacion = false;
        rotacion = false;
        tx.setText("");
        ty.setText("");
        sx.setText("");
        sy.setText("");
        ang.setText("");
        Puntos();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotActionPerformed
        // TODO add your handling code here:
        double s = Math.toRadians(Integer.parseInt(ang.getText()));
        double seno = Math.sin(s);
        double coseno = Math.cos(s);

        if (s == 90) {
            seno = 1;
            coseno = 0;
        } else if (s == 180) {
            seno = 0;
            coseno = -1;
        } else if (s == 270) {
            seno = -1;
            coseno = 0;
        }

        double rot[][] = {{coseno, seno, 0},
        {(-(seno)), coseno, 0},
        {0, 0, 1}};
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < rot[0].length; j++) {
                for (int k = 0; k < p1[0].length; k++) {
                    // aquí se multiplica la matriz
                    R[i][j] += p1[i][k] * rot[k][j];
                }
            }
        }
        rotacion = true;
        ang.setEditable(false);
        repaint();
        PuntosR();

    }//GEN-LAST:event_btnRotActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        graficacion.MENU m = new graficacion.MENU();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public class Graf extends JPanel {

        public Graf() {
            super.setSize(500, 500);
            super.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        }
        // <editor-fold defaultstate="collapsed" desc="Variables"> 
        int contador = 0;
        int escala = 13;
        float dash[] = {escala + 1};
        //Tamaño del punto de Origen 
        int Tamaño_punto_origen = 8;
        //Distancia de los numeros 
        int Distancia_numeros_de_linea = 20;
        //Numero en los ejes
        int total_numerosXY = escala;
        Graphics2D g2, p, l, t;

        //</editor-fold>
        public void paint(Graphics g) {

            super.paint(g);
            g2 = (Graphics2D) g;
            p = (Graphics2D) g;
            l = (Graphics2D) g;
            t = (Graphics2D) g;
            
            // <editor-fold defaultstate="collapsed" desc="Plano Cartesiano">

            //Espacio_entre_numeros
            int Espacio_entre_numeros = 300 / escala;
            g2.setStroke(new BasicStroke(.5f));

            // Inicio Dibujar cuadricula
            //Lineas en EjeX
            g2.setColor(Color.LIGHT_GRAY);
            for (int i = -total_numerosXY; i < total_numerosXY; i++) {
                g2.drawLine(this.getWidth() / 2 + i * Espacio_entre_numeros, this.getHeight(), this.getWidth() / 2 + i * Espacio_entre_numeros, 0);
            }
            //Lineas en EjeY
            for (int i = -total_numerosXY; i < total_numerosXY; i++) {
                g2.drawLine(0, this.getHeight() / 2 + (i * Espacio_entre_numeros), this.getWidth(), this.getHeight() / 2 + (i * Espacio_entre_numeros));
            }
            //Final Dibujar Cuadricula
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(1));
            g2.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
            g2.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());

            g2.setColor(Color.DARK_GRAY);
            // Dibujar punto de Origen (X,Y,ancho,alto)
            g2.fillOval(this.getWidth() / 2 - (Tamaño_punto_origen / 2), this.getHeight() / 2 - (Tamaño_punto_origen / 2), Tamaño_punto_origen, Tamaño_punto_origen);

            //Dibujar Numeros y lines en EJEX
            //Cuadrante +
            for (int i = -total_numerosXY + 1; i < total_numerosXY; i++) {
                g2.drawLine((this.getWidth() / 2) + (i * Espacio_entre_numeros), (this.getHeight() / 2 + 5), (this.getWidth() / 2) + (i * Espacio_entre_numeros), (this.getHeight() / 2 - 5));
                if (escala < 20) {
                    g2.drawString(Integer.toString(-1 * i), ((this.getHeight() / 2) - (i * Espacio_entre_numeros)), ((this.getHeight() / 2) + 15));
                }

            }

            //Dibujar Numeros y lines en EJEY
            for (int i = -total_numerosXY - 1; i < total_numerosXY; i++) {
                g2.drawLine((this.getWidth() / 2) - 5, (this.getHeight() / 2) - (i * Espacio_entre_numeros), (this.getWidth() / 2) + 5, (this.getHeight() / 2) - (i * Espacio_entre_numeros));

                if (escala < 20) {
                    g2.drawString(Integer.toString(-1 * i), ((this.getWidth() / 2) - 20), ((this.getWidth() / 2)) + (i * Espacio_entre_numeros));
                }

            }
            g2.setColor(Color.LIGHT_GRAY);

            g2.setColor(Color.lightGray);
            g2.setStroke(new BasicStroke(.05f, BasicStroke.CAP_BUTT, BasicStroke.CAP_ROUND, 5.0f, dash, 0.0f));
            g2.drawLine(0, this.getHeight(), this.getWidth(), 0);
            g2.drawLine(0, 0, this.getWidth(), this.getHeight());
            //</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Figura Original"> 
            //GraficarPuntos
            p.setColor(Color.GREEN);
            p.fillOval(((300 / panel.escala) * 0 + (295)),
                    ((-((300 / panel.escala) * 1)) + (295)), 10, 10);
          
            p.fillOval(((300 / panel.escala) * 3 + (295)),
                    ((-((300 / panel.escala) * 4)) + (295)), 10, 10);
           
            p.fillOval(((300 / panel.escala) * 0 + (295)),
                    ((-((300 / panel.escala) * 4)) + (295)), 10, 10);
           
            p.fillOval(((300 / panel.escala) * 0 + (295)),
                    ((-((300 / panel.escala) * 5)) + (295)), 10, 10);
           
            p.fillOval(((300 / panel.escala) * 4 + (295)),
                    ((-((300 / panel.escala) * 5)) + (295)), 10, 10);
           
            p.fillOval(((300 / panel.escala) * 4 + (295)),
                    ((-((300 / panel.escala) * 4)) + (295)), 10, 10);
           
            p.fillOval(((300 / panel.escala) * 1 + (295)),
                    ((-((300 / panel.escala) * 1)) + (295)), 10, 10);

            //GraficarLineas
            l.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(2));
            l.drawLine(((300 / panel.escala) * 0 + (300)),
                    ((-((300 / panel.escala) * 1)) + (300)),
                    ((300 / panel.escala) * 3 + (300)),
                    ((-((300 / panel.escala) * 4)) + (300)));
          
            l.drawLine(((300 / panel.escala) * 3 + (300)),
                    ((-((300 / panel.escala) * 4)) + (300)),
                    ((300 / panel.escala) * 0 + (300)),
                    ((-((300 / panel.escala) * 4)) + (300)));
           
            l.drawLine(((300 / panel.escala) * 0 + (300)),
                    ((-((300 / panel.escala) * 4)) + (300)),
                    ((300 / panel.escala) * 0 + (300)),
                    ((-((300 / panel.escala) * 5)) + (300)));
           
            l.drawLine(((300 / panel.escala) * 0 + (300)),
                    ((-((300 / panel.escala) * 5)) + (300)),
                    ((300 / panel.escala) * 4 + (300)),
                    ((-((300 / panel.escala) * 5)) + (300)));
           
            l.drawLine(((300 / panel.escala) * 4 + (300)),
                    ((-((300 / panel.escala) * 5)) + (300)),
                    ((300 / panel.escala) * 4 + (300)),
                    ((-((300 / panel.escala) * 4)) + (300)));
           
            l.drawLine(((300 / panel.escala) * 4 + (300)),
                    ((-((300 / panel.escala) * 4)) + (300)),
                    ((300 / panel.escala) * 1 + (300)),
                    ((-((300 / panel.escala) * 1)) + (300)));
            //</editor-fold>  
            
            // <editor-fold defaultstate="collapsed" desc="Puntos Originales String"> 
            //GraficarPuntos
            //PUNTOS string
           g.drawString("P1",((300 / panel.escala) * 0 + (295)),
                    ((-((300 / panel.escala) * 1)) + (295)));
          
            g.drawString("P2",((300 / panel.escala) * 3 + (295)),
                    ((-((300 / panel.escala) * 4)) + (295)));
           
            g.drawString("P3",((300 / panel.escala) * 0 + (295)),
                    ((-((300 / panel.escala) * 4)) + (295)));
           
            g.drawString("P4",((300 / panel.escala) * 0 + (295)),
                    ((-((300 / panel.escala) * 5)) + (295)));
           
            g.drawString("P5",((300 / panel.escala) * 4 + (295)),
                    ((-((300 / panel.escala) * 5)) + (295)));
           
            g.drawString("P6",((300 / panel.escala) * 4 + (295)),
                    ((-((300 / panel.escala) * 4)) + (295)));
           
            g.drawString("P7",((300 / panel.escala) * 1 + (295)),
                    ((-((300 / panel.escala) * 1)) + (295)));
            //</editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="Traslacion"> 
            if (traslacion == true) {

                p.setColor(Color.BLACK);
                
                
                p.setColor(Color.RED);
                p.fillOval(((300 / panel.escala) * T[0][0] + (295)),
                        ((-((300 / panel.escala) * T[0][1])) + (295)), 10, 10);
               
                p.fillOval(((300 / panel.escala) * T[1][0] + (295)),
                        ((-((300 / panel.escala) * T[1][1])) + (295)), 10, 10);
                
                p.fillOval(((300 / panel.escala) * T[2][0] + (295)),
                        ((-((300 / panel.escala) * T[2][1])) + (295)), 10, 10);
               
                p.fillOval(((300 / panel.escala) * T[3][0] + (295)),
                        ((-((300 / panel.escala) * T[3][1])) + (295)), 10, 10);
               
                p.fillOval(((300 / panel.escala) * T[4][0] + (295)),
                        ((-((300 / panel.escala) * T[4][1])) + (295)), 10, 10);
               
                p.fillOval(((300 / panel.escala) * T[5][0] + (295)),
                        ((-((300 / panel.escala) * T[5][1])) + (295)), 10, 10);
              
                p.fillOval(((300 / panel.escala) * T[6][0] + (295)),
                        ((-((300 / panel.escala) * T[6][1])) + (295)), 10, 10);
                //String 
                p.setColor(Color.BLACK);
                
                
                p.setColor(Color.BLUE);
                p.drawString("P1'",((300 / panel.escala) * T[0][0] + (295)),
                        ((-((300 / panel.escala) * T[0][1])) + (295)));
               
                p.drawString("P2'",((300 / panel.escala) * T[1][0] + (295)),
                        ((-((300 / panel.escala) * T[1][1])) + (295)));
                
                p.drawString("P3'",((300 / panel.escala) * T[2][0] + (295)),
                        ((-((300 / panel.escala) * T[2][1])) + (295)));
               
                p.drawString("P4'",((300 / panel.escala) * T[3][0] + (295)),
                        ((-((300 / panel.escala) * T[3][1])) + (295)));
               
                p.drawString("P5'",((300 / panel.escala) * T[4][0] + (295)),
                        ((-((300 / panel.escala) * T[4][1])) + (295)));
               
                p.drawString("P6'",((300 / panel.escala) * T[5][0] + (295)),
                        ((-((300 / panel.escala) * T[5][1])) + (295)));
              
                p.drawString("P7'",((300 / panel.escala) * T[6][0] + (295)),
                        ((-((300 / panel.escala) * T[6][1])) + (295)));

                //Lineas de la Figura
                l.setColor(Color.BLUE);
                l.drawLine(((300 / panel.escala) * T[0][0] + (300)),
                        ((-((300 / panel.escala) * T[0][1])) + (300)),
                        ((300 / panel.escala) * T[1][0] + (300)),
                        ((-((300 / panel.escala) * T[1][1])) + (300)));

                l.drawLine(((300 / panel.escala) * T[1][0] + (300)),
                        ((-((300 / panel.escala) * T[1][1])) + (300)),
                        ((300 / panel.escala) * T[2][0] + (300)),
                        ((-((300 / panel.escala) * T[2][1])) + (300)));

                l.drawLine(((300 / panel.escala) * T[2][0] + (300)),
                        ((-((300 / panel.escala) * T[2][1])) + (300)),
                        ((300 / panel.escala) * T[3][0] + (300)),
                        ((-((300 / panel.escala) * T[3][1])) + (300)));

                l.drawLine(((300 / panel.escala) * T[3][0] + (300)),
                        ((-((300 / panel.escala) * T[3][1])) + (300)),
                        ((300 / panel.escala) * T[4][0] + (300)),
                        ((-((300 / panel.escala) * T[4][1])) + (300)));

                l.drawLine(((300 / panel.escala) * T[4][0] + (300)),
                        ((-((300 / panel.escala) * T[4][1])) + (300)),
                        ((300 / panel.escala) * T[5][0] + (300)),
                        ((-((300 / panel.escala) * T[5][1])) + (300)));

                l.drawLine(((300 / panel.escala) * T[5][0] + (300)),
                        ((-((300 / panel.escala) * T[5][1])) + (300)),
                        ((300 / panel.escala) * T[6][0] + (300)),
                        ((-((300 / panel.escala) * T[6][1])) + (300)));


 //               Lineas Punteadas
                l.setColor(Color.BLACK);
                l.setStroke(new BasicStroke(.05f, BasicStroke.CAP_BUTT, BasicStroke.CAP_ROUND, 5.0f, dash, 0.0f));
                l.drawLine(((300 / panel.escala) * 0 + (300)),
                        ((-((300 / panel.escala) * 1)) + (300)),
                        ((300 / panel.escala) * T[0][0] + (300)),
                        ((-((300 / panel.escala) * T[0][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 3 + (300)),
                        ((-((300 / panel.escala) * 4)) + (300)),
                        ((300 / panel.escala) * T[1][0] + (300)),
                        ((-((300 / panel.escala) * T[1][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 0 + (300)),
                        ((-((300 / panel.escala) * 4)) + (300)),
                        ((300 / panel.escala) * T[2][0] + (300)),
                        ((-((300 / panel.escala) * T[2][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 0 + (300)),
                        ((-((300 / panel.escala) * 5)) + (300)),
                        ((300 / panel.escala) * T[3][0] + (300)),
                        ((-((300 / panel.escala) * T[3][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 4 + (300)),
                        ((-((300 / panel.escala) * 5)) + (300)),
                        ((300 / panel.escala) * T[4][0] + (300)),
                        ((-((300 / panel.escala) * T[4][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 4 + (300)),
                        ((-((300 / panel.escala) * 4)) + (300)),
                        ((300 / panel.escala) * T[5][0] + (300)),
                        ((-((300 / panel.escala) * T[5][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 1 + (300)),
                        ((-((300 / panel.escala) * 1)) + (300)),
                        ((300 / panel.escala) * T[6][0] + (300)),
                        ((-((300 / panel.escala) * T[6][1])) + (300)));

            }
            //</editor-fold>  
            
            // <editor-fold defaultstate="collapsed" desc="Escalacion">
            if (escalacion == true) {
                p.setColor(Color.RED);
                p.fillOval(((300 / panel.escala) * E[0][0] + (295)),
                        ((-((300 / panel.escala) * E[0][1])) + (295)), 10, 10);
                p.fillOval(((300 / panel.escala) * E[1][0] + (295)),
                        ((-((300 / panel.escala) * E[1][1])) + (295)), 10, 10);
                p.fillOval(((300 / panel.escala) * E[2][0] + (295)),
                        ((-((300 / panel.escala) * E[2][1])) + (295)), 10, 10);
                p.fillOval(((300 / panel.escala) * E[3][0] + (295)),
                        ((-((300 / panel.escala) * E[3][1])) + (295)), 10, 10);
                p.fillOval(((300 / panel.escala) * E[4][0] + (295)),
                        ((-((300 / panel.escala) * E[4][1])) + (295)), 10, 10);
                p.fillOval(((300 / panel.escala) * E[5][0] + (295)),
                        ((-((300 / panel.escala) * E[5][1])) + (295)), 10, 10);
                p.fillOval(((300 / panel.escala) * E[6][0] + (295)),
                        ((-((300 / panel.escala) * E[6][1])) + (295)), 10, 10);
                //String Puntos
                p.setColor(Color.BLUE);
                p.drawString("P1'",((300 / panel.escala) * E[0][0] + (295)),
                        ((-((300 / panel.escala) * E[0][1])) + (295)));
                p.drawString("P2'",((300 / panel.escala) * E[1][0] + (295)),
                        ((-((300 / panel.escala) * E[1][1])) + (295)));
                p.drawString("P3'",((300 / panel.escala) * E[2][0] + (295)),
                        ((-((300 / panel.escala) * E[2][1])) + (295)));
                p.drawString("P4'",((300 / panel.escala) * E[3][0] + (295)),
                        ((-((300 / panel.escala) * E[3][1])) + (295)));
                p.drawString("P5'",((300 / panel.escala) * E[4][0] + (295)),
                        ((-((300 / panel.escala) * E[4][1])) + (295)));
                p.drawString("P6'",((300 / panel.escala) * E[5][0] + (295)),
                        ((-((300 / panel.escala) * E[5][1])) + (295)));
                p.drawString("P7'",((300 / panel.escala) * E[6][0] + (295)),
                        ((-((300 / panel.escala) * E[6][1])) + (295)));
                //Lineas de la Figura
                l.setColor(Color.BLUE);
                l.drawLine(((300 / panel.escala) * E[0][0] + (300)),
                        ((-((300 / panel.escala) * E[0][1])) + (300)),
                        ((300 / panel.escala) * E[1][0] + (300)),
                        ((-((300 / panel.escala) * E[1][1])) + (300)));

                l.drawLine(((300 / panel.escala) * E[1][0] + (300)),
                        ((-((300 / panel.escala) * E[1][1])) + (300)),
                        ((300 / panel.escala) * E[2][0] + (300)),
                        ((-((300 / panel.escala) * E[2][1])) + (300)));

                l.drawLine(((300 / panel.escala) * E[2][0] + (300)),
                        ((-((300 / panel.escala) * E[2][1])) + (300)),
                        ((300 / panel.escala) * E[3][0] + (300)),
                        ((-((300 / panel.escala) * E[3][1])) + (300)));

                l.drawLine(((300 / panel.escala) * E[3][0] + (300)),
                        ((-((300 / panel.escala) * E[3][1])) + (300)),
                        ((300 / panel.escala) * E[4][0] + (300)),
                        ((-((300 / panel.escala) * E[4][1])) + (300)));

                l.drawLine(((300 / panel.escala) * E[4][0] + (300)),
                        ((-((300 / panel.escala) * E[4][1])) + (300)),
                        ((300 / panel.escala) * E[5][0] + (300)),
                        ((-((300 / panel.escala) * E[5][1])) + (300)));

                l.drawLine(((300 / panel.escala) * E[5][0] + (300)),
                        ((-((300 / panel.escala) * E[5][1])) + (300)),
                        ((300 / panel.escala) * E[6][0] + (300)),
                        ((-((300 / panel.escala) * E[6][1])) + (300)));

                //Lineas punteadas 
                
                l.setColor(Color.BLACK);
                l.setStroke(new BasicStroke(.05f, BasicStroke.CAP_BUTT, BasicStroke.CAP_ROUND, 5.0f, dash, 0.0f));
                l.drawLine(((300 / panel.escala) * 0 + (300)),
                        ((-((300 / panel.escala) * 1)) + (300)),
                        ((300 / panel.escala) * E[0][0] + (300)),
                        ((-((300 / panel.escala) * E[0][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 3 + (300)),
                        ((-((300 / panel.escala) * 4)) + (300)),
                        ((300 / panel.escala) * E[1][0] + (300)),
                        ((-((300 / panel.escala) * E[1][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 0 + (300)),
                        ((-((300 / panel.escala) * 4)) + (300)),
                        ((300 / panel.escala) * E[2][0] + (300)),
                        ((-((300 / panel.escala) * E[2][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 0 + (300)),
                        ((-((300 / panel.escala) * 5)) + (300)),
                        ((300 / panel.escala) * E[3][0] + (300)),
                        ((-((300 / panel.escala) * E[3][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 4 + (300)),
                        ((-((300 / panel.escala) * 5)) + (300)),
                        ((300 / panel.escala) * E[4][0] + (300)),
                        ((-((300 / panel.escala) * E[4][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 4 + (300)),
                        ((-((300 / panel.escala) * 4)) + (300)),
                        ((300 / panel.escala) * E[5][0] + (300)),
                        ((-((300 / panel.escala) * E[5][1])) + (300)));
                l.drawLine(((300 / panel.escala) * 1 + (300)),
                        ((-((300 / panel.escala) * 1)) + (300)),
                        ((300 / panel.escala) * E[6][0] + (300)),
                        ((-((300 / panel.escala) * E[6][1])) + (300)));

            }
            //</editor-fold>
            
            // <editor-fold defaultstate="collapsed" desc="Rotacion"> 
            if (rotacion == true) {
                p.setColor(Color.BLACK);
                p.fillOval((int) ((300 / panel.escala) * R[0][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[0][1])) + (295)), 10, 10);
                p.fillOval((int) ((300 / panel.escala) * R[1][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[1][1])) + (295)), 10, 10);
                p.fillOval((int) ((300 / panel.escala) * R[2][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[2][1])) + (295)), 10, 10);
                p.fillOval((int) ((300 / panel.escala) * R[3][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[3][1])) + (295)), 10, 10);
                p.fillOval((int) ((300 / panel.escala) * R[4][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[4][1])) + (295)), 10, 10);
                p.fillOval((int) ((300 / panel.escala) * R[5][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[5][1])) + (295)), 10, 10);
                p.fillOval((int) ((300 / panel.escala) * R[6][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[6][1])) + (295)), 10, 10);
                //String Puntos
                p.setColor(Color.BLUE);
                p.drawString("P1'",(int) ((300 / panel.escala) * R[0][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[0][1])) + (295)));
                p.drawString("P2'",(int) ((300 / panel.escala) * R[1][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[1][1])) + (295)));
                p.drawString("P3'",(int) ((300 / panel.escala) * R[2][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[2][1])) + (295)));
                p.drawString("P4'",(int) ((300 / panel.escala) * R[3][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[3][1])) + (295)));
                p.drawString("P5'",(int) ((300 / panel.escala) * R[4][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[4][1])) + (295)));
                p.drawString("P6'",(int) ((300 / panel.escala) * R[5][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[5][1])) + (295)));
                p.drawString("P7'",(int) ((300 / panel.escala) * R[6][0] + (295)),
                        (int) ((-((300 / panel.escala) * R[6][1])) + (295)));
                //Lineas de la Figura
                l.setColor(Color.BLUE);
                l.drawLine((int) ((300 / panel.escala) * R[0][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[0][1])) + (300)),
                        (int) ((300 / panel.escala) * R[1][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[1][1])) + (300)));

                l.drawLine((int) ((300 / panel.escala) * R[1][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[1][1])) + (300)),
                        (int) ((300 / panel.escala) * R[2][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[2][1])) + (300)));

                l.drawLine((int) ((300 / panel.escala) * R[2][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[2][1])) + (300)),
                        (int) ((300 / panel.escala) * R[3][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[3][1])) + (300)));

                l.drawLine((int) ((300 / panel.escala) * R[3][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[3][1])) + (300)),
                        (int) ((300 / panel.escala) * R[4][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[4][1])) + (300)));

                l.drawLine((int) ((300 / panel.escala) * R[4][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[4][1])) + (300)),
                        (int) ((300 / panel.escala) * R[5][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[5][1])) + (300)));

                l.drawLine((int) ((300 / panel.escala) * R[5][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[5][1])) + (300)),
                        (int) ((300 / panel.escala) * R[6][0] + (300)),
                        (int) ((-((300 / panel.escala) * R[6][1])) + (300)));

                //</editor-fold>
            }
        }

        public void setEscala(int e) {
            escala = e;
            total_numerosXY = e + 1;
            contador = 0;
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransGeo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ang;
    private javax.swing.JButton btnEsc;
    private javax.swing.JButton btnRot;
    private javax.swing.JButton btnTras;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JLabel coo;
    private javax.swing.JPanel encabezado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JTextField sx;
    private javax.swing.JTextField sy;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField tx;
    private javax.swing.JTextField ty;
    // End of variables declaration//GEN-END:variables
}
