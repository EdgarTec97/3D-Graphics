package graficacion;

import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class TransGeoSuc extends javax.swing.JFrame {

    Graf panel = new Graf();
    double valores[][] = new double[8][3];
    double[][] Punto = {{0, 1, 1}, {3, 4, 1},{0, 4, 1}, {0, 5, 1}, {4, 5, 1},{4, 4, 1},{1, 1, 1}};
    double R[][] = {{0, 1, 1}, {3, 4, 1},{0, 4, 1}, {0, 5, 1}, {4, 5, 1},{4, 4, 1},{1, 1, 1}};
    DecimalFormat form = new DecimalFormat("#.##");
    Color c= Color.BLUE;
    int a = 10;


    public TransGeoSuc() {
        initComponents();      
        setResizable(false);
        setLocationRelativeTo(null);
        PuntosR();
        this.setSize(new Dimension(930, 700));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton2 = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        pnl = new javax.swing.JPanel();
        cbo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sy = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sx = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnTras = new javax.swing.JButton();
        btnEsc = new javax.swing.JButton();
        btnRot = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        tx = new javax.swing.JTextField();
        javax.swing.JPanel pan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(935, 633));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Menú");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        encabezado.setBackground(new java.awt.Color(255, 255, 255));
        encabezado.setBorder(new javax.swing.border.MatteBorder(null));
        encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("TRANSFORMACIONES GEOMETRICAS 2D SUCESIVAS");
        encabezado.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 730, -1));

        lbl1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Graficación Básica por Computadora");
        encabezado.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 680, 30));

        title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezado.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1230, 20));

        getContentPane().add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, 120));

        pnl.setBackground(new java.awt.Color(153, 153, 255));
        pnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*** Seleccionar ***", "Traslación", "Escalación", "Rotación" }));
        cbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActionPerformed(evt);
            }
        });
        pnl.add(cbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Ty:");
        pnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Rotación");
        pnl.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        pnl.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 50, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Tx:");
        pnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Traslación");
        pnl.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Escalación");
        pnl.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Sy:");
        pnl.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        sy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syActionPerformed(evt);
            }
        });
        pnl.add(sy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("θ:");
        pnl.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Sx:");
        pnl.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        ang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angActionPerformed(evt);
            }
        });
        pnl.add(ang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 50, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Coordenadas de los Puntos");
        pnl.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 250, 20));

        sx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxActionPerformed(evt);
            }
        });
        pnl.add(sx, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, -1));
        pnl.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 210, 510, 20));

        btnTras.setText("Graficar");
        btnTras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasActionPerformed(evt);
            }
        });
        pnl.add(btnTras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 30));

        btnEsc.setText("Graficar");
        btnEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscActionPerformed(evt);
            }
        });
        pnl.add(btnEsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 30));

        btnRot.setText("Graficar");
        btnRot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotActionPerformed(evt);
            }
        });
        pnl.add(btnRot, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("<html>Transformación Geometrica:</html>");
        pnl.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

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

        pnl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 320, 160));
        pnl.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 130, 510, 20));
        pnl.add(tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 50, -1));

        getContentPane().add(pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 380, 500));

        //jPanel1 = new PlanoCarteciano();
        pan = panel;
        pan.setBackground(new java.awt.Color(237, 230, 230));
        pan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pan.setPreferredSize(new java.awt.Dimension(500, 500));
        pan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panMouseMoved(evt);
            }
        });
        pan.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                panMouseWheelMoved(evt);
            }
        });
        pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panMouseMoved
       
    }//GEN-LAST:event_panMouseMoved

    private void cboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActionPerformed
        // TODO add your handling code here:

        if (panel != null) {
            String gsr = (String) cbo.getSelectedItem();
            if (null != gsr) switch (gsr) {
                case "Traslación":
                    title.setText("Traslación");
                    vaciar();
                    repaint();
                    break;
                case "Escalación":
                    title.setText("Escalación");
                    vaciar();
                    repaint();
                    break;
                case "Rotación":
                    vaciar();
                    repaint();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_cboActionPerformed

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void syActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_syActionPerformed

    private void angActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angActionPerformed

    private void sxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sxActionPerformed

    private void btnTrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasActionPerformed
        // TODO add your handling code here:
        double[][] tras = {{1, 0, 0},
                          {0, 1, 0},
                          {(Double.parseDouble(tx.getText())), (Double.parseDouble(ty.getText())), 1}};

                for (int i = 0; i < R.length; i++) {
                    for (int j = 0; j < tras[0].length; j++) {
                        for (int k = 0; k < R[0].length; k++) {
                            // aquí se multiplica la matriz
                            valores[i][j] += R[i][k] * tras[k][j];
                        }
                    }
    }

        tx.setEditable(false); ty.setEditable(false); 
        PuntosR(); cambiar(); vaciar(); repaint();
    }//GEN-LAST:event_btnTrasActionPerformed

    private void btnEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscActionPerformed
        // TODO add your handling code here:
        double[][] esc = {{(Double.parseDouble(sx.getText())), 0, 0},
                          {0, (Double.parseDouble(sy.getText())), 0},
                          {0, 0, 1}};

                for (int i = 0; i < R.length; i++) {
                    for (int j = 0; j < esc[0].length; j++) {                        
                        for (int k = 0; k < R[0].length; k++) {
                            // aquí se multiplica la matriz
                            valores[i][j] += R[i][k] * esc[k][j];
                    }
                }
           }
        sx.setEditable(false); sy.setEditable(false); 
        PuntosR();cambiar(); vaciar(); repaint();

    }//GEN-LAST:event_btnEscActionPerformed

    private void btnRotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotActionPerformed
        // TODO add your handling code here:
        double s = Math.toRadians(Integer.parseInt(ang.getText()));
        double seno = Math.sin(s);
        double coseno = Math.cos(s);

        double rot[][] = {{coseno, seno, 0},
                          {(-(seno)), coseno, 0},
                          {0, 0, 1}};
                    for (int i = 0; i < R.length; i++) {
                        for (int j = 0; j < rot[0].length; j++) {
                            for (int k = 0; k < R[0].length; k++) {
                                // aquí se multiplica la matriz
                                valores[i][j] += R[i][k] * rot[k][j];
                                form.format(valores[i][j]);
                            }
                        }
                    }

        ang.setEditable(false); 
        PuntosR(); cambiar(); vaciar(); repaint();
    }//GEN-LAST:event_btnRotActionPerformed

    private void panMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_panMouseDragged

    private void panMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_panMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panMouseWheelMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        graficacion.MENU l = new graficacion.MENU();
        l.setVisible(true);
      this.dispose();  
    }//GEN-LAST:event_jButton2ActionPerformed
    public void PuntosR() {

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {" P1 ",  form.format(R[0][0]), form.format(R[0][1]),form.format(valores[0][0]), form.format(valores[0][1])},
                    {" P2 ",  form.format(R[1][0]), form.format(R[1][1]),form.format(valores[1][0]), form.format(valores[1][1])},
                    {" P3 ",  form.format(R[2][0]), form.format(R[2][1]),form.format(valores[2][0]), form.format(valores[2][1])},
                    {" P4",  form.format(R[3][0]), form.format(R[3][1]),form.format(valores[3][0]), form.format(valores[3][1])},
                    {" P5 ",  form.format(R[4][0]), form.format(R[4][1]),form.format(valores[4][0]), form.format(valores[4][1])},
                    {" P6",  form.format(R[5][0]), form.format(R[5][1]),form.format(valores[5][0]), form.format(valores[5][1])},
                    {" P7 ",  form.format(R[6][0]), form.format(R[6][1]),form.format(valores[6][0]), form.format(valores[6][1])},},
                new String[]{
                    
                    " Puntos ", " X ", " Y ", "X'", "Y'"
                }
        ));

    }

    private void cambiar() {


        R[0][0] = valores[0][0]; R[0][1] = valores[0][1]; R[1][0] = valores[1][0]; R[1][1] = valores[1][1];
        R[2][0] = valores[2][0]; R[2][1] = valores[2][1]; R[3][0] = valores[3][0]; R[3][1] = valores[3][1];
        R[4][0] = valores[4][0]; R[4][1] = valores[4][1]; R[5][0] = valores[5][0]; R[5][1] = valores[5][1];
        R[6][0] = valores[6][0]; R[6][1] = valores[6][1];
    }
        private void vaciar() {

        valores[0][0] = 0; valores[0][1] = 0; valores[1][0] = 0; valores[1][1] = 0; valores[2][0] = 0; valores[2][1] = 0; valores[3][0] = 0; valores[3][1] = 0;
        valores[4][0] = 0; valores[4][1] = 0; valores[5][0] = 0; valores[5][1] = 0; valores[6][0] = 0; valores[6][1] = 0;
    }



        public class Graf extends JPanel {

        int contador = 0;
        int escala = 10;
        //Tamaño del punto de Origen 
        int Tamaño_punto_origen = 8;
        //Distancia de los numeros 
        int distancia = 20;
        //Numero en los ejes
        int cNumeros = escala;
        Graphics2D g2, p, l, t;


   
        public void paint(Graphics g) {
            super.paint(g);
            g2 = (Graphics2D) g;
            p = (Graphics2D) g;
            l = (Graphics2D) g;
            t = (Graphics2D) g;

            //Espacio_entre_numeros
            int espacio = 250 / escala;
            g2.setStroke(new BasicStroke(.5f));
            
            //Lineas en EjeX
            g2.setColor(Color.lightGray);
            for (int i = -cNumeros; i < cNumeros; i++) {
                g2.drawLine(this.getWidth() / 2 + i * espacio, this.getHeight(), this.getWidth() / 2 + i * espacio, 0);
            }
            //Lineas en EjeY
            for (int i = -cNumeros; i < cNumeros; i++) {
                g2.drawLine(0, this.getHeight() / 2 + (i * espacio), this.getWidth(), this.getHeight() / 2 + (i * espacio));
            }
            //Final Dibujar Cuadricula
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(1));
            g2.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
            g2.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
            //</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Ejes XY"> 
            g2.setColor(Color.DARK_GRAY);
            // Dibujar punto de Origen (X,Y,ancho,alto)
            g2.fillOval(this.getWidth() / 2 - (Tamaño_punto_origen / 2), this.getHeight() / 2 - (Tamaño_punto_origen / 2), Tamaño_punto_origen, Tamaño_punto_origen);

            //Dibujar Numeros y lines en EJEX
            //Cuadrante +
            for (int i = -cNumeros + 1; i < cNumeros; i++) {
                g2.drawLine((this.getWidth() / 2) + (i * espacio),
                        (this.getHeight() / 2 + 5), (this.getWidth() / 2) + (i * espacio), (this.getHeight() / 2 - 5));
                if (escala<20) {
                    g2.drawString(Integer.toString(-1 * i), ((this.getHeight() / 2) - (i * espacio)), ((this.getHeight() / 2) + 15));
                }
            }

            //Dibujar Numeros y lines en EJEY
            for (int i = -cNumeros - 1; i < cNumeros; i++) {
                g2.drawLine((this.getWidth() / 2) - 5, (this.getHeight() / 2) - (i * espacio), (this.getWidth() / 2) + 5, (this.getHeight() / 2) - (i * espacio));
                 if (escala<20) {
                    g2.drawString(Integer.toString(-1 * i), ((this.getWidth() / 2) - 20), ((this.getWidth() / 2)) + (i * espacio));
                }
            }
            g2.setColor(Color.LIGHT_GRAY);
            

               //Lineas de la Figura
            l.setColor(c);
            l.setStroke(new BasicStroke(2));
            l.drawLine((int) ((250 / escala) * R[0][0] + (250)),(int) ((-((250 / escala) * R[0][1])) + (250)),
                      (int) ((250 / escala) * R[1][0] + (250)), (int) ((-((250 / escala) * R[1][1])) + (250)));

            l.drawLine((int) ((250 / escala) * R[1][0] + (250)),(int) ((-((250 / escala) * R[1][1])) + (250)),
                      (int) ((250 / escala) * R[2][0] + (250)), (int) ((-((250 / escala) * R[2][1])) + (250)));

            l.drawLine((int) ((250 / escala) * R[2][0] + (250)),(int) ((-((250 / escala) * R[2][1])) + (250)),
                      (int) ((250 / escala) * R[3][0] + (250)), (int) ((-((250 / escala) * R[3][1])) + (250)));

            l.drawLine((int) ((250 / escala) * R[3][0] + (250)),(int) ((-((250 / escala) * R[3][1])) + (250)),
                      (int) ((250 / escala) * R[4][0] + (250)), (int) ((-((250 / escala) * R[4][1])) + (250)));

            l.drawLine((int) ((250 / escala) * R[4][0] + (250)),(int) ((-((250 / escala) * R[4][1])) + (250)),
                      (int) ((250 / escala) * R[5][0] + (250)), (int) ((-((250 / escala) * R[5][1])) + (250)));

            l.drawLine((int) ((250 / escala) * R[5][0] + (250)),(int) ((-((250 / escala) * R[5][1])) + (250)),
                      (int) ((250 / escala) * R[6][0] + (250)), (int) ((-((250 / escala) * R[6][1])) + (250)));
            
                        p.setColor(Color.BLACK);
            p.fillOval((int) ((250 / escala) * R[0][0] + (245)),(int) ((-((250 / escala) * R[0][1])) + (245)), a, a);
            p.fillOval((int) ((250 / escala) * R[1][0] + (245)),(int) ((-((250 / escala) * R[1][1])) + (245)), a, a);
            p.fillOval((int) ((250 / escala) * R[2][0] + (245)),(int) ((-((250 / escala) * R[2][1])) + (245)), a, a);
            p.fillOval((int) ((250 / escala) * R[3][0] + (245)),(int) ((-((250 / escala) * R[3][1])) + (245)), a, a);
            p.fillOval((int) ((250 / escala) * R[4][0] + (245)),(int) ((-((250 / escala) * R[4][1])) + (245)), a, a);
            p.fillOval((int) ((250 / escala) * R[5][0] + (245)),(int) ((-((250 / escala) * R[5][1])) + (245)), a, a);
            p.fillOval((int) ((250 / escala) * R[6][0] + (245)),(int) ((-((250 / escala) * R[6][1])) + (245)), a, a);

        }

    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransGeoSuc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ang;
    private javax.swing.JButton btnEsc;
    private javax.swing.JButton btnRot;
    private javax.swing.JButton btnTras;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JPanel encabezado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField sx;
    private javax.swing.JTextField sy;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField tx;
    private javax.swing.JTextField ty;
    // End of variables declaration//GEN-END:variables
}
