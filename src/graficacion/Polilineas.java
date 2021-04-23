package graficacion;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Polilineas extends javax.swing.JFrame {

    DefaultTableModel relativa = new DefaultTableModel();
    DecimalFormat form = new DecimalFormat("#.##");
    PlanoCarteciano panel = new PlanoCarteciano();
    Puntos[] puntosrt = new Puntos[7];
    Puntos[] puntosab = new Puntos[7];
    double Puntossr[][] = new double[7][3];
    boolean polaresA = false;
    boolean banIni = true;
    boolean polaresR = false;
    boolean banDibujar = false;
    int aux = 0;
    Color clr = Color.RED;

    public Polilineas() {
        initComponents();
        this.setTitle("Polilíneas");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.rt.setModel(relativa);
        relativa.addColumn("  ");
        relativa.addColumn("  ");
        relativa.addColumn("  ");
        this.setSize(new Dimension(1000, 700));
        rt.getTableHeader().setReorderingAllowed(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rt = new javax.swing.JTable();
        cbo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel.setBackground(new java.awt.Color(153, 153, 255));
        Jpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 10));
        Jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Graficación Básica por Computadora");
        jLabel2.setFocusable(false);
        Jpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 466, 41));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Polilíneas");
        jLabel3.setFocusable(false);
        Jpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 436, 29));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo-TecNM-2017.png"))); // NOI18N
        Jpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 151, 140));

        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Jpanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, -1, -1));

        jPanel1 = new PlanoCarteciano();
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("  y");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("    x");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Jpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rt.setBorder(new javax.swing.border.MatteBorder(null));
        rt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        rt.setEnabled(false);
        jScrollPane2.setViewportView(rt);

        cbo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbo.setForeground(new java.awt.Color(0, 0, 153));
        cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Coordenadas Cartecianas Absolutas", "Coordenadas Cartecianas Relativas", "Coordenadas  Polares Absolutas", "Coordenadas  Polares Relativas" }));
        cbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Tipo de Coordenadas que Desea Visualizar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        Jpanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 400, 280));

        getContentPane().add(Jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 930, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActionPerformed
        // TODO add your handling code here:
        if (panel != null) {
            String poli = (String) cbo.getSelectedItem();
            if (poli == "Coordenadas Cartecianas Absolutas") {
                CarA();
                aux++;

                rt.getColumnModel().getColumn(0).setHeaderValue(" Puntos ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(1).setHeaderValue(" X ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(2).setHeaderValue(" Y ");
                rt.getTableHeader().resizeAndRepaint();
                if (aux > 1) {
                    for (int i = 0; i < puntosrt.length; i++) {
                        relativa.removeRow(0);
                    }
                }

                //Polares absolutas....................
                puntosab[0] = new Puntos(0, 1);
                puntosab[1] = new Puntos(3, 4);
                puntosab[2] = new Puntos(0, 4);
                puntosab[3] = new Puntos(0, 5);
                puntosab[4] = new Puntos(4, 5);
                puntosab[5] = new Puntos(4, 4);
                puntosab[6] = new Puntos(1, 1);
                
                String[] valores = new String[3];

                for (int i = 0; i < puntosab.length; i++) {
                    valores[0] = "" + (i + 1);
                    valores[1] = "" + puntosab[i].getX();
                    valores[2] = "" + puntosab[i].getY();
                    relativa.addRow(valores);
                    DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
                    modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
                    rt.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
                }

            } else if (poli == "Coordenadas Cartecianas Relativas") {
                CarR();
                aux++;
                rt.getColumnModel().getColumn(0).setHeaderValue(" Puntos ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(1).setHeaderValue(" X ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(2).setHeaderValue(" Y ");
                double xp = 0;
                double yp = 0;
                if (aux > 1) {
                    for (int i = 0; i < puntosrt.length; i++) {
                        relativa.removeRow(0);
                    }
                }

                //Puntos relativas
                puntosrt[0] = new Puntos(0, 1);
                puntosrt[1] = new Puntos(3, 3);
                puntosrt[2] = new Puntos(-3, 0);
                puntosrt[3] = new Puntos(0, 1);
                puntosrt[4] = new Puntos(4, 0);
                puntosrt[5] = new Puntos(0, -1);
                puntosrt[6] = new Puntos(-3, -3);

                String[] valores = new String[3];

                for (int i = 0; i < puntosrt.length; i++) {
                    valores[0] = " " + (i + 1);
                    valores[1] = " " + puntosrt[i].getX();
                    valores[2] = " " + puntosrt[i].getY();
                    relativa.addRow(valores);
                    DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
                    modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
                    rt.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
                }

            } else if (poli == "Coordenadas  Polares Absolutas") {

                PolA();
                aux++;
                double xp = 0;
                double yp = 0;
                rt.getColumnModel().getColumn(0).setHeaderValue(" Puntos ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(1).setHeaderValue(" r ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(2).setHeaderValue(" θ ");
                rt.getTableHeader().resizeAndRepaint();

                if (aux > 1) {
                    for (int i = 0; i < puntosrt.length; i++) {
                        relativa.removeRow(0);
                    }
                }
                puntosab[0] = new Puntos(0, 1);
                puntosab[1] = new Puntos(3, 4);
                puntosab[2] = new Puntos(0, 4);
                puntosab[3] = new Puntos(0, 5);
                puntosab[4] = new Puntos(4, 5);
                puntosab[5] = new Puntos(4, 4);
                puntosab[6] = new Puntos(1, 1);

                for (int i = 0; i < puntosab.length; i++) {
                    xp = puntosab[i].getX();
                    yp = puntosab[i].getY();
                    double r = Math.sqrt((xp * xp) + (yp * yp));
                    Puntossr[i][0] = r;
                    //double rt = yp/xp;
                    double teta = Math.atan2(yp, xp);
                    double t1 = Math.toDegrees(teta);
                    Puntossr[i][1] = t1;
                    aux++;
                }

                String[] valoresx = new String[3];

                for (int i = 0; i < puntosab.length; i++) {
                    valoresx[0] = "" + (i + 1);
                    valoresx[1] = "" + form.format(Puntossr[i][0]);
                    valoresx[2] = "" + form.format(Puntossr[i][1]);
                    relativa.addRow(valoresx);

                    DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
                    modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
                    rt.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
                }
            } else if (poli == "Coordenadas  Polares Relativas") {
                PolR();
                aux++;
                double xp = 0;
                double yp = 0;
                rt.getColumnModel().getColumn(0).setHeaderValue(" Puntos ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(1).setHeaderValue(" r ");
                rt.getTableHeader().resizeAndRepaint();
                rt.getColumnModel().getColumn(2).setHeaderValue(" θ ");
                rt.getTableHeader().resizeAndRepaint();
                if (aux > 1) {
                    for (int i = 0; i < puntosrt.length; i++) {
                        relativa.removeRow(0);
                    }
                }
                puntosrt[0] = new Puntos(0, 1);
                puntosrt[1] = new Puntos(3, 3);
                puntosrt[2] = new Puntos(-3, 0);
                puntosrt[3] = new Puntos(0, 1);
                puntosrt[4] = new Puntos(4, 0);
                puntosrt[5] = new Puntos(0, -1);
                puntosrt[6] = new Puntos(-3, -3);

                for (int i = 0; i < puntosrt.length; i++) {
                    xp = puntosrt[i].getX();
                    yp = puntosrt[i].getY();
                        double r = Math.sqrt((xp * xp) + (yp * yp));
                        Puntossr[i][0] = r;
                        //double rt = yp/xp;
                        double teta = Math.atan2(yp, xp);
                        double t1 = Math.toDegrees(teta);
                        Puntossr[i][1] = t1;
                        aux++;
                    
                }

                String[] valoresx = new String[3];

                for (int i = 0; i < puntosab.length; i++) {
                    valoresx[0] = "" + (i + 1);
                    valoresx[1] = "" + form.format(Puntossr[i][0]);
                    valoresx[2] = "" + form.format(Puntossr[i][1]);
                    relativa.addRow(valoresx);

                    DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
                    modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
                    rt.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
                    rt.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
                }

            }

        }

    }//GEN-LAST:event_cboActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        graficacion.MENU m = new graficacion.MENU();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    class PlanoCarteciano extends JPanel {

        double ajuste = 410;
        int margenI = 30;
        int escala = 10;
        float dash[] = {escala + 1};
        int PuntosIniciales_XY = margenI;
        int puntos_finales_XY = (int) ajuste;
        // Eje Y configuracion
        int Posicion_EjeX_en_EjeY = (int) ajuste;
        // Eje Y configuracion 
        int Posicion_EjeY_en_EjeX = margenI;
        // Tamaño de las lineas en los ejes
        int Tamaño_linea_ejes = 5;
        //Tamaño del punto de Origen 
        int Tamaño_punto_origen = 8;
        //Distancia de los numeros 
        int Distancia_numeros_de_linea = 20;
        //Numero en los ejes
        int Numeros_en_EjesXY = escala + 1;

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D graf = (Graphics2D) g;
            graf.setColor(Color.GRAY);
            // Dibujar Eje X (X1,Y1,X2,Y2) (X1,Y2)= el punto mas bajo de X (X2,Y2)=punto mas alto de X
            graf.drawLine(PuntosIniciales_XY, Posicion_EjeX_en_EjeY, puntos_finales_XY, Posicion_EjeX_en_EjeY);
            //Espacios entre los numeros
            // Dibujar Eje Y (X1,Y1,X2,Y2) (X1,Y2)= el punto mas alto de Y (X2,Y2)=punto mas bajo de Y
            graf.drawLine(Posicion_EjeY_en_EjeX, PuntosIniciales_XY, Posicion_EjeY_en_EjeX, puntos_finales_XY);
            // Dibujar punto de Origen (X,Y,ancho,alto)
            graf.fillOval(PuntosIniciales_XY - (Tamaño_punto_origen / 2), puntos_finales_XY - (Tamaño_punto_origen / 2), Tamaño_punto_origen, Tamaño_punto_origen);
            //Espacio_entre_numeros
            int Espacio_entre_numeros = (puntos_finales_XY - PuntosIniciales_XY) / escala;
            //Dibujar Numeros y lines en EJEX
            for (int i = 1; i < Numeros_en_EjesXY; i++) {
                graf.drawLine(PuntosIniciales_XY + (i * Espacio_entre_numeros), Posicion_EjeX_en_EjeY - Tamaño_linea_ejes, PuntosIniciales_XY + (i * Espacio_entre_numeros), Posicion_EjeX_en_EjeY + Tamaño_linea_ejes);
                graf.drawString(Integer.toString(i), PuntosIniciales_XY + (i * Espacio_entre_numeros) - 3, Posicion_EjeX_en_EjeY + Distancia_numeros_de_linea);
            }
            //Dibujar Numeros y lines en EJEY
            for (int i = 1; i < Numeros_en_EjesXY; i++) {
                graf.drawLine(Posicion_EjeY_en_EjeX - Tamaño_linea_ejes, puntos_finales_XY
                        - (i * Espacio_entre_numeros), Posicion_EjeY_en_EjeX + Tamaño_linea_ejes, puntos_finales_XY
                        - (i * Espacio_entre_numeros));
                graf.drawString(Integer.toString(i), Posicion_EjeY_en_EjeX - Distancia_numeros_de_linea, puntos_finales_XY
                        - (i * Espacio_entre_numeros));
            }
            // Inicio Dibujar cuadricula
            //Lineas en EjeX
            graf.setColor(Color.GRAY);
            for (int i = 1; i < Numeros_en_EjesXY; i++) {
                graf.drawLine(PuntosIniciales_XY + (i * Espacio_entre_numeros), Posicion_EjeX_en_EjeY - (puntos_finales_XY - margenI), PuntosIniciales_XY + (i * Espacio_entre_numeros), Posicion_EjeX_en_EjeY);
            }
            //Lineas en EjeY
            for (int i = 1; i < Numeros_en_EjesXY; i++) {
                graf.drawLine(Posicion_EjeY_en_EjeX, puntos_finales_XY - (i * Espacio_entre_numeros), Posicion_EjeY_en_EjeX + (puntos_finales_XY - margenI), puntos_finales_XY - (i * Espacio_entre_numeros));
            }
            //Puntos
            graf.setStroke(new BasicStroke(3));
            //Punto 1
            graf.fillOval(24, 366, 13, 13);
            //Punto 2
            graf.fillOval(139, 251, 13, 13);
            //Punto 3
            graf.fillOval(24, 251, 13, 13);
            //Punto 4
            graf.fillOval(24, 213, 13, 13);
             //Punto 5
            graf.fillOval(179, 213, 13, 13);
            //Punto 6
            graf.fillOval(179, 251, 13, 13);
            //Punto 7
            graf.fillOval(65, 366, 13, 13);
            //graf.setColor(jColorChooser1.getColor());  repaint();
            //Lineas
            graf.setColor(clr);
            graf.drawLine(31, 218, 31, 257); //Linea 1            
            graf.drawLine(31, 218, 182, 218); //Linea 2
            graf.drawLine(184, 218, 184, 257); //Linea 3     
            graf.drawLine(69, 372, 184, 257); //Linea 4         
            graf.drawLine(31, 258, 144, 258); //Linea 5                 
            graf.drawLine(31, 372, 144, 259); //Linea 6             
            //Nombre de los puntos 
            graf.setColor(Color.BLUE);
            graf.drawString("P3, (x,y)", 24, 251);
            graf.drawString("P4, (x,y)", 24, 213);
            graf.drawString("P5, (x,y)", 179, 213);
            graf.drawString("P6, (x,y)", 184, 251);
            graf.drawString("P2, (x,y)", 139, 251);
            graf.drawString("P1, (x,y)", 24, 366);
            graf.drawString("P7, (x,y)", 100, 366);

        }

        public void setEscala(int e) {
            escala = e;
            Numeros_en_EjesXY = e + 1;
        }

        public void setMargen(int m) {
            margenI = m;
        }

        public void setAjuste(int a) {
            ajuste = a;
        }
    }

    public void paint(Graphics gh) {

        if (banIni == true) {
            super.paint(gh);
            banIni = false;
        }

        if (polaresA == true) {

            Graphics2D g2 = (Graphics2D) gh;
            g2.setColor(Color.BLACK);
            int ancho = 8;
            float dash[] = {ancho};
            g2.setStroke(new java.awt.BasicStroke(1.05f, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_MITER, 5.0f, dash, 0.0f));

            //Rayas punteadas-relativas
            g2.drawLine(30, 410, 30, 366); //Punto 1
            g2.drawLine(30, 410, 144, 258); //Punto 2
            g2.drawLine(30, 410, 30, 258); //Punto 3
            g2.drawLine(30, 410, 30, 218); //Punto 4
            g2.drawLine(30, 410, 184, 258); //Punto 5
            g2.drawLine(30, 410, 184, 218); //Punto 6
            g2.drawLine(30, 410, 70, 372); //Punto 7
            
            g2.setColor(Color.black);
            g2.drawString("P1, (r,θ)", 1, 396);
            g2.drawString("P2, (r,θ)", 61, 290);
            g2.drawString("P3, (r,θ)", 34, 313);
            g2.drawString("P4, (r,θ)", 34, 236);
            g2.drawString("P5, (r,θ)", 124, 238);
            g2.drawString("P6, (r,θ)", 149, 306);
            g2.drawString("P7, (r,θ)", 70, 396);

            banDibujar = false;
        }
        if (polaresR == true) {

            Graphics2D g2 = (Graphics2D) gh;
            g2.setColor(Color.white);
            g2.setStroke(new BasicStroke(6));
            int ancho = 8;
            float dash[] = {ancho};
            g2.setStroke(new java.awt.BasicStroke(2.05f, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_MITER, 5.0f, dash, 0.0f));

            //el que lo sigue 
            g2.drawLine(30, 410, 30, 366); //Hacua el p1
            g2.drawLine(31, 218, 182, 218); //Linea 2
            g2.drawLine(184, 218, 184, 257); //Linea 3     
            g2.drawLine(69, 372, 184, 257); //Linea 4         
            g2.drawLine(31, 258, 144, 258); //Linea 5                 
            g2.drawLine(31, 372, 144, 259); //Linea 6    
            g2.drawLine(31, 218, 31, 257); //Linea 7
         
            g2.setColor(Color.GREEN);
            g2.drawString("P1, (r,θ)", 34, 396);
            g2.drawString("P2, (r,θ)", 41, 320);
            g2.drawString("P3, (r,θ)", 89, 251);
            g2.drawString("P4, (r,θ)", 24, 236);
            g2.drawString("P5, (r,θ)", 74, 213);
            g2.drawString("P6, (r,θ)", 179, 236);
            g2.drawString("P7, (r,θ)", 130, 340);
            
            banDibujar = false;
        }

    }

    public void PolA() {
        banDibujar = true;
        polaresA = true;
        polaresR = false;
        jPanel1.paint(jPanel1.getGraphics());
        paint(jPanel1.getGraphics());
    }

    public void PolR() {
        banDibujar = true;
        polaresA = false;
        polaresR = true;
        jPanel1.paint(jPanel1.getGraphics());
        paint(jPanel1.getGraphics());
    }

    public void CarA() {
        
        polaresA = false;
        polaresR = false;
        jPanel1.paint(jPanel1.getGraphics());
        paint(jPanel1.getGraphics());
    }

    public void CarR() {
        polaresA = false;
        polaresR = false;
        jPanel1.paint(jPanel1.getGraphics());
        paint(jPanel1.getGraphics());
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
            java.util.logging.Logger.getLogger(Polilineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polilineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polilineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polilineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polilineas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable rt;
    // End of variables declaration//GEN-END:variables
}
