package graficacion;

import graficacion.Punto;
import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import graficacion.Arco;
import graficacion.Circulo;

public class PlanoCartesiano extends javax.swing.JPanel {

    Arco a = new Arco(1, 1, 8, 8);
    Arco e = new Arco(-4, 0, 8, 4);
    
     
    Punto[] vp = {new Punto(1, 2), new Punto(2, 1), new Punto(3, 1), new Punto(4, 1), new Punto(5, 2), new Punto(5, 3), new Punto(4, 4), new Punto(3, 5), new Punto(2,6), new Punto(1, 7), new Punto(1, 8),
        new Punto(2, 9), new Punto(3, 9), new Punto(4, 9), new Punto(5, 8)};
    Punto[] vpl = {new Punto(3, 1), new Punto(3, 2), new Punto(0, 2), new Punto(0, 4), new Punto(3, 4), new Punto(3, 6), new Punto(6, 6), new Punto(6, 3), new Punto(9, 3), new Punto(9, 1)};
    //Arreglo de Lineas a Graficar
    Punto vlh[] = {new Punto(1, 5), new Punto(2, 5), new Punto(3, 5), new Punto(4, 5), new Punto(5, 5), new Punto(6, 5), new Punto(7, 5), new Punto(8, 5), new Punto(9, 5)};
    Punto vlv[] = {new Punto(5, 1), new Punto(5, 2), new Punto(5, 3), new Punto(5, 4), new Punto(5, 5), new Punto(5, 6), new Punto(5, 7), new Punto(5, 8)};
    Punto vld[] = {new Punto(1, 1), new Punto(2, 2), new Punto(3, 3), new Punto(4, 4), new Punto(5, 5), new Punto(6, 6), new Punto(7, 7), new Punto(8, 8)};
    Punto vc[] = {new Punto(4, 0),new Punto(3, 3), new Punto(0, 4), new Punto(-3, 3), new Punto(-4, 0), new Punto(-3, -3), new Punto(0, -4), new Punto(3, -3)};
    Punto va[] = {new Punto(9, 1),  new Punto(8, 4),new Punto(5, 5),  new Punto(2, 4),new Punto(1, 1)};
    Punto ve[] = {new Punto(4, 0),new Punto(2,2),new Punto(0, 2),new Punto(-2, 2),new Punto(-4,0),new Punto(-2, -2),new Punto(0, -2),new Punto(2, -2)};
    //Circulo a Graficar
    Circulo c = new Circulo(8, 0, 0);
    DecimalFormat df = new DecimalFormat("0.0000");
    //Origenes relativos
    int ox = 250, oy = 250, oxp, oyp;
    //Banderas para Graficar
    boolean flagGP = false, flagGLH = false, flagGLV = false, flagGLD = false, flagGC = false, flagGA = false, flagOI = false, flagGPP = false, flagGE = false, flagGPL = false, flagGPLP = false, flagGPLPR, flagGCT = false, flagGAT = false, flagGET;

    public void paint(Graphics g) {
        super.paint(g);
        int ix = -9;
        int iy = 9;
        //Dibujar el plano
        for (int i = getWidth() / 20; i <= getWidth(); i += getWidth() / 20) {
            g.setColor(Color.BLACK);
            if (ix != 0) {
                g.drawString(Integer.toString(ix), i - 5, getWidth() / 2 + 20);
            }
            g.drawLine(i, getWidth() / 2 - 5, i, getWidth() / 2 + 5);

            ix++;
        }
        
        for (int i = getHeight() / 20; i < getHeight(); i += getHeight() / 20) {
            g.setColor(Color.BLACK);
            if (iy != 0) {
                g.drawString(Integer.toString(iy), getWidth() / 2 + 10, i + 5);
            }
            g.drawLine(getHeight() / 2 - 5, i, getHeight() / 2 + 5, i);
            iy -= 1;
        }
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g.setColor(Color.blue);
        g.fillOval(ox - 4, oy - 4, 8, 8);
        g.setColor(Color.red);
        g.drawString("Origen", ox + 10, oy - 10);
    //Dibujar el Plano
        //dibujarPuntos
        if (flagGP == true) {
            int radio = 8;
            for (int i = 0; i < vp.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vp[i].getX()) - radio / 2, getyenPanelRel(vp[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.BLACK);
                g.drawString("P" + (i + 1), getxenPanelRel(vp[i].getX()) - 10, getyenPanelRel(vp[i].getY()) - 10);

            }
            flagGP = false;
        } else if (flagGPP == true) {
            int radio = 8;

            for (int i = 0; i < vp.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vp[i].getX()) - radio / 2, getyenPanelRel(vp[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.BLUE);
                g.drawLine(ox, oy, getxenPanelRel(vp[i].getX()), getyenPanelRel(vp[i].getY()));
                g.setColor(Color.BLACK);
                g.drawString("P" + (i + 1), getxenPanelRel(vp[i].getX()) - 10, getyenPanelRel(vp[i].getY()) - 10);
                //intento de angulo g.drawArc(getxenPanel(ox),getyenPanel(oy),getxenPanel(vp[i].getX())/2, getyenPanel(vp[i].getY())/2,0, (int)getR(getxenPanel(ox),getyenPanel(oy)));
            }
            flagGPP = false;
        }
        if (flagGLH == true) {
            int radio = 8;
            g.setColor(Color.orange);
            for (int i = 0; i < vlh.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vlh[i].getX()) - radio / 2, getyenPanelRel(vlh[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.black);
                g.drawString("P" + (i + 1), getxenPanelRel(vlh[i].getX()) - 10, getyenPanelRel(vlh[i].getY()) - 10);
            }

            g.setColor(Color.BLUE);
            g.drawLine(getxenPanelRel(vlh[0].getX()), getyenPanelRel(vlh[0].getY()), getxenPanelRel(vlh[vlh.length - 1].getX()), getyenPanelRel(vlh[vlh.length - 1].getY()));
            flagGLH = false;
        } else if (flagGLV == true) {
            int radio = 8;
            for (int i = 0; i < vlv.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vlv[i].getX()) - radio / 2, getyenPanelRel(vlv[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.black);
                g.drawString("P" + (i + 1), getxenPanelRel(vlv[i].getX()) + 10, getyenPanelRel(vlv[i].getY()));
            }

            g.setColor(Color.pink);
            g.drawLine(getxenPanelRel(vlv[0].getX()), getyenPanelRel(vlv[0].getY()), getxenPanelRel(vlv[vlv.length - 1].getX()), getyenPanelRel(vlv[vlv.length - 1].getY()));
            flagGLV = false;

        } else if (flagGLD == true) {
            int radio = 8;
            for (int i = 0; i < vld.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vld[i].getX()) - radio / 2, getyenPanelRel(vld[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.black);
                g.drawString("P" + (i + 1), getxenPanelRel(vld[i].getX()) + 10, getyenPanelRel(vld[i].getY()));

            }

            g.setColor(Color.BLUE);
            g.drawLine(getxenPanelRel(vld[0].getX()), getyenPanelRel(vld[0].getY()), getxenPanelRel(vld[vld.length - 1].getX()), getyenPanelRel(vld[vld.length - 1].getY()));
            flagGLD = false;

        } else if (flagGC == true) {
            int radio = 8;
            g.setColor(Color.BLUE);
            g.drawOval(getxenPanelRel(c.getOrigenx()) - (c.getDiametro() * getWidth() / 20) / 2, getyenPanelRel((c.getOrigeny())) - (c.getDiametro() * getHeight() / 20) / 2, c.getDiametro() * getWidth() / 20, c.getDiametro() * getHeight() / 20);
            //trigonometrico    
            g.setColor(Color.red);
            g.fillOval(getxenPanelRel(vc[0].getX()) - radio / 2, getyenPanelRel(vc[0].getY()) - radio / 2, radio, radio);
            g.fillOval(getxenPanelRel(vc[4].getX()) - radio / 2, getyenPanelRel(vc[4].getY()) - radio / 2, radio, radio);
            g.setColor(Color.BLACK);
            g.drawString("P1", getxenPanelRel(vc[0].getX()) - radio / 2, getyenPanelRel(vc[0].getY()) - radio / 2);
            g.drawString("P2", getxenPanelRel(vc[4].getX()) - radio / 2, getyenPanelRel(vc[4].getY()) - radio / 2);

            flagGC = false;
        } else if (flagGCT == true) {
            int radio = 8;
            g.setColor(Color.BLUE);
            g.drawOval(getxenPanelRel(c.getOrigenx()) - (c.getDiametro() * getWidth() / 20) / 2, getyenPanelRel((c.getOrigeny())) - (c.getDiametro() * getHeight() / 20) / 2, c.getDiametro() * getWidth() / 20, c.getDiametro() * getHeight() / 20);
            //trigonometrico    
            g.setColor(Color.red);
            g.fillOval(getxenPanelRel(vc[0].getX()) - radio / 2, getyenPanelRel(vc[0].getY()) - radio / 2, radio, radio);
            g.fillOval(getxenPanelRel(vc[1].getX()) - radio / 2 -5, getyenPanelRel(vc[1].getY()) - radio / 2 +5, radio, radio);
            g.fillOval(getxenPanelRel(vc[2].getX()) - radio / 2, getyenPanelRel(vc[2].getY()) - radio / 2, radio, radio);
            g.fillOval(getxenPanelRel(vc[3].getX()) - radio / 2 +5, getyenPanelRel(vc[3].getY()) - radio / 2 +5, radio, radio);
            g.fillOval(getxenPanelRel(vc[4].getX()) - radio / 2, getyenPanelRel(vc[4].getY()) - radio / 2, radio, radio);
            g.fillOval(getxenPanelRel(vc[5].getX()) - radio / 2 +5, getyenPanelRel(vc[5].getY()) - radio / 2 -5, radio, radio);
            g.fillOval(getxenPanelRel(vc[6].getX()) - radio / 2, getyenPanelRel(vc[6].getY()) - radio / 2, radio, radio);
            g.fillOval(getxenPanelRel(vc[7].getX()) - radio / 2 -5, getyenPanelRel(vc[7].getY()) - radio / 2 -5, radio, radio);
            g.setColor(Color.BLACK);
            g.drawString("P1", getxenPanelRel(vc[0].getX()) - radio / 2, getyenPanelRel(vc[0].getY()) - radio / 2);
            g.drawString("P2", getxenPanelRel(vc[1].getX()) - radio / 2 + 5, getyenPanelRel(vc[1].getY()) - radio / 2 + 5);
            g.drawString("P3", getxenPanelRel(vc[2].getX()) - radio / 2, getyenPanelRel(vc[2].getY()) - radio / 2);
            g.drawString("P4", getxenPanelRel(vc[3].getX()) - radio / 2 - 5, getyenPanelRel(vc[3].getY()) - radio / 2 + 5);
            g.drawString("P5", getxenPanelRel(vc[4].getX()) - radio / 2, getyenPanelRel(vc[4].getY()) - radio / 2);
            g.drawString("P6", getxenPanelRel(vc[5].getX()) - radio / 2 - 5, getyenPanelRel(vc[5].getY()) - radio / 2 - 5);
            g.drawString("P7", getxenPanelRel(vc[6].getX()) - radio / 2, getyenPanelRel(vc[6].getY()) - radio / 2);
            g.drawString("P8", getxenPanelRel(vc[7].getX()) - radio / 2 + 5, getyenPanelRel(vc[7].getY()) - radio / 2 - 5);
            flagGCT = false;
        } else if (flagGA == true) {
            int radio = 8;
            g.setColor(Color.BLUE);
            //g.drawArc(getxenPanel(a.getX()) ,getyenPanel(a.getY()) -(getxenPanel(a.getAncho()) - getxenPanel(a.getAltura())), getxenPanel(a.getAncho()) - getxenPanel(a.getX()) ,(getxenPanel(a.getAltura()) - getxenPanel(a.getY()))*2  , 0, 180);
            g.drawArc(getxenPanelRel(a.getX()), getyenPanelRel(a.getY()) - (a.getAltura() * getHeight() / 20) / 2, (a.getAncho() * getWidth() / 20), (a.getAltura() * getHeight() / 20), 0, 180);
            flagGA = false;
            g.setColor(Color.red);
            g.fillOval(getxenPanelRel(va[0].getX()) - radio / 2, getyenPanelRel(va[0].getY()) - radio / 2, radio, radio);
            g.fillOval(getxenPanelRel(va[2].getX()) - radio / 2, getyenPanelRel(va[2].getY()) - radio / 2, radio, radio);
            g.setColor(Color.BLACK);
            g.drawString("P1", getxenPanelRel(va[0].getX()) - radio / 2, getyenPanelRel(va[0].getY()) - radio / 2);
            g.drawString("P2", getxenPanelRel(va[2].getX()) - radio / 2, getyenPanelRel(va[2].getY()) - radio / 2);
        } else if (flagGAT == true) {
            int radio = 8;
            g.setColor(Color.BLUE);
            //g.drawArc(getxenPanel(a.getX()) ,getyenPanel(a.getY()) -(getxenPanel(a.getAncho()) - getxenPanel(a.getAltura())), getxenPanel(a.getAncho()) - getxenPanel(a.getX()) ,(getxenPanel(a.getAltura()) - getxenPanel(a.getY()))*2  , 0, 180);
            g.drawArc(getxenPanelRel(a.getX()), getyenPanelRel(a.getY()) - (a.getAltura() * getHeight() / 20) / 2, (a.getAncho() * getWidth() / 20), (a.getAltura() * getHeight() / 20), 0, 180);
            flagGAT = false;
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(va[0].getX()) - radio / 2, getyenPanelRel(va[0].getY()) - radio / 2, radio, radio);
                g.fillOval(getxenPanelRel(va[1].getX()) - radio / 2-5, getyenPanelRel(va[1].getY()) - radio / 2+5, radio, radio);
                g.fillOval(getxenPanelRel(va[2].getX()) - radio / 2, getyenPanelRel(va[2].getY()) - radio / 2, radio, radio);
                g.fillOval(getxenPanelRel(va[3].getX()) - radio / 2+5, getyenPanelRel(va[3].getY()) - radio / 2+5, radio, radio);
                g.fillOval(getxenPanelRel(va[4].getX()) - radio / 2, getyenPanelRel(va[4].getY()) - radio / 2, radio, radio);
                g.setColor(Color.BLACK);
                g.drawString("P" + Integer.toString( 1), getxenPanelRel(va[0].getX()) - radio / 2, getyenPanelRel(va[0].getY()) - radio / 2);
                g.drawString("P" + Integer.toString( 2), getxenPanelRel(va[1].getX()) - radio / -5, getyenPanelRel(va[1].getY()) - radio / 2+5);
                g.drawString("P" + Integer.toString( 3), getxenPanelRel(va[2].getX()) - radio / 2, getyenPanelRel(va[2].getY()) - radio / 2);
                g.drawString("P" + Integer.toString(4), getxenPanelRel(va[3].getX()) - radio / 2+5, getyenPanelRel(va[3].getY()) - radio / 2+5);
                g.drawString("P" + Integer.toString(5), getxenPanelRel(va[4].getX()) - radio / 2, getyenPanelRel(va[4].getY()) - radio / 2);
            
        } else if (flagGE == true) {
            int radio = 8;
            g.setColor(Color.BLUE);
            //g.drawArc(getxenPanel(a.getX()) ,getyenPanel(a.getY()) -(getxenPanel(a.getAncho()) - getxenPanel(a.getAltura())), getxenPanel(a.getAncho()) - getxenPanel(a.getX()) ,(getxenPanel(a.getAltura()) - getxenPanel(a.getY()))*2  , 0, 180);
            g.drawArc(getxenPanelRel(a.getX()), getyenPanelRel(a.getY()) - (a.getAltura() * getHeight() / 20) / 2, (a.getAncho() * getWidth() / 20), (a.getAltura() * getHeight() / 20), 0, 360);
            flagGE = false;
            g.setColor(Color.red);
            g.fillOval(getxenPanelRel(ve[0].getX()) - radio / 2, getyenPanelRel(ve[0].getY()) - radio / 2, radio, radio);
            g.fillOval(getxenPanelRel(ve[2].getX()) - radio / 2, getyenPanelRel(ve[2].getY()) - radio / 2, radio, radio);
            g.setColor(Color.BLACK);
            g.drawString("P1", getxenPanelRel(ve[0].getX()) - radio / 2, getyenPanelRel(ve[0].getY()) - radio / 2);
            g.drawString("P1", getxenPanelRel(ve[2].getX()) - radio / 2, getyenPanelRel(ve[2].getY()) - radio / 2);
        } else if (flagGET == true) {
            int radio = 8;
            g.setColor(Color.BLUE);
            //g.drawArc(getxenPanel(a.getX()) ,getyenPanel(a.getY()) -(getxenPanel(a.getAncho()) - getxenPanel(a.getAltura())), getxenPanel(a.getAncho()) - getxenPanel(a.getX()) ,(getxenPanel(a.getAltura()) - getxenPanel(a.getY()))*2  , 0, 180);
            g.drawArc(getxenPanelRel(e.getX()), getyenPanelRel(e.getY()) - (e.getAltura() * getHeight() / 20) / 2, (e.getAncho() * getWidth() / 20), (e.getAltura() * getHeight() / 20), 0, 360);
            flagGET = false;
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(ve[0].getX()) - radio / 2, getyenPanelRel(ve[0].getY()) - radio / 2, radio, radio);
                g.fillOval(getxenPanelRel(ve[1].getX()) - radio / 2-5, getyenPanelRel(ve[1].getY()) - radio / 2+5, radio, radio);
                g.fillOval(getxenPanelRel(ve[2].getX()) - radio / 2, getyenPanelRel(ve[2].getY()) - radio / 2, radio, radio);
                g.fillOval(getxenPanelRel(ve[3].getX()) - radio / 2+5, getyenPanelRel(ve[3].getY()) - radio / 2+5, radio, radio);
                g.fillOval(getxenPanelRel(ve[4].getX()) - radio / 2, getyenPanelRel(ve[4].getY()) - radio / 2, radio, radio);
                g.fillOval(getxenPanelRel(ve[5].getX()) - radio / 2+5, getyenPanelRel(ve[5].getY()) - radio / 2-5, radio, radio);
                g.fillOval(getxenPanelRel(ve[6].getX()) - radio / 2, getyenPanelRel(ve[6].getY()) - radio / 2, radio, radio);
                g.fillOval(getxenPanelRel(ve[7].getX()) - radio / 2-5, getyenPanelRel(ve[7].getY()) - radio / 2-5, radio, radio);
                g.setColor(Color.BLACK);
                g.drawString("P" + Integer.toString( 1), getxenPanelRel(ve[0].getX()) - radio / 2, getyenPanelRel(ve[0].getY()) - radio / 2);
                g.drawString("P" + Integer.toString( 2), getxenPanelRel(ve[1].getX()) - radio / 2+5, getyenPanelRel(ve[1].getY()) - radio / 2+5);
                g.drawString("P" + Integer.toString( 3), getxenPanelRel(ve[2].getX()) - radio / 2, getyenPanelRel(ve[2].getY()) - radio / 2);
                g.drawString("P" + Integer.toString( 4), getxenPanelRel(ve[3].getX()) - radio / 2+5, getyenPanelRel(ve[3].getY()) - radio / 2-5);
                g.drawString("P" + Integer.toString( 5), getxenPanelRel(ve[4].getX()) - radio / 2, getyenPanelRel(ve[4].getY()) - radio / 2);
                g.drawString("P" + Integer.toString( 6), getxenPanelRel(ve[5].getX()) - radio / 2+5, getyenPanelRel(ve[5].getY()) - radio / 2-5);
                g.drawString("P" + Integer.toString( 7), getxenPanelRel(ve[6].getX()) - radio / 2, getyenPanelRel(ve[6].getY()) - radio / 2);
                g.drawString("P" + Integer.toString( 8), getxenPanelRel(ve[7].getX()) - radio / 2-5, getyenPanelRel(ve[7].getY()) - radio / 2-5);
            

        } else if (flagGPL == true) {
            int radio = 8;

            for (int i = 0; i < vpl.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vpl[i].getX()) - radio / 2, getyenPanelRel(vpl[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.BLACK);
                g.drawString("P" + (i + 1), getxenPanelRel(vpl[i].getX()) - 10, getyenPanelRel(vpl[i].getY()) - 10);
                if (i + 1 != vpl.length) {
                    g.drawLine(getxenPanelRel(vpl[i].getX()), getyenPanelRel(vpl[i].getY()), getxenPanelRel(vpl[i + 1].getX()), getyenPanelRel(vpl[i + 1].getY()));;
                }
                g.drawLine(getxenPanelRel(vpl[0].getX()), getyenPanelRel(vpl[0].getY()), getxenPanelRel(vpl[vpl.length-1].getX()), getyenPanelRel(vpl[vpl.length-1].getY()));
                //intento de angulo g.drawArc(getxenPanel(ox),getyenPanel(oy),getxenPanel(vp[i].getX())/2, getyenPanel(vp[i].getY())/2,0, (int)getR(getxenPanel(ox),getyenPanel(oy)));
            }
            flagGPL = false;
        } else if (flagGPLP == true) {
            int radio = 8;

            for (int i = 0; i < vpl.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vpl[i].getX()) - radio / 2, getyenPanelRel(vpl[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.BLACK);
                g.drawString("P" + (i + 1), getxenPanelRel(vpl[i].getX()) - 10, getyenPanelRel(vpl[i].getY()) - 10);
                if (i + 1 != vpl.length) {
                    g.drawLine(getxenPanelRel(vpl[i].getX()), getyenPanelRel(vpl[i].getY()), getxenPanelRel(vpl[i + 1].getX()), getyenPanelRel(vpl[i + 1].getY()));;
                }
                g.setColor(Color.BLUE);
                g.drawLine(ox, oy, getxenPanelRel(vpl[i].getX()), getyenPanelRel(vpl[i].getY()));
                //intento de angulo g.drawArc(getxenPanel(ox),getyenPanel(oy),getxenPanel(vp[i].getX())/2, getyenPanel(vp[i].getY())/2,0, (int)getR(getxenPanel(ox),getyenPanel(oy)));
            }
            flagGPLP = false;
        } else if (flagGPLPR == true) {
            int radio = 8;

            for (int i = 0; i < vpl.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vpl[i].getX()) - radio / 2, getyenPanelRel(vpl[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.BLACK);
                g.drawString("P" + (i + 1), getxenPanelRel(vpl[i].getX()) - 10, getyenPanelRel(vpl[i].getY()) - 10);
                if (i + 1 != vpl.length) {
                    g.setColor(Color.blue);
                    g.drawLine(getxenPanelRel(vpl[i].getX()), getyenPanelRel(vpl[i].getY()), getxenPanelRel(vpl[i + 1].getX()), getyenPanelRel(vpl[i + 1].getY()));;
                }
                g.setColor(Color.BLUE);
                g.drawLine(ox, oy, getxenPanelRel(vpl[0].getX()), getyenPanelRel(vpl[0].getY()));
                //intento de angulo g.drawArc(getxenPanel(ox),getyenPanel(oy),getxenPanel(vp[i].getX())/2, getyenPanel(vp[i].getY())/2,0, (int)getR(getxenPanel(ox),getyenPanel(oy)));
            }
            flagGPLPR = false;
        } else if (flagGPLPR == true) {
            int radio = 8;

            for (int i = 0; i < vpl.length; i++) {
                g.setColor(Color.red);
                g.fillOval(getxenPanelRel(vpl[i].getX()) - radio / 2, getyenPanelRel(vpl[i].getY()) - radio / 2, radio, radio);
                g.setColor(Color.BLACK);
                g.drawString("P" + (i + 1), getxenPanelRel(vpl[i].getX()) - 10, getyenPanelRel(vpl[i].getY()) - 10);
                if (i + 1 != vpl.length) {
                    g.setColor(Color.blue);
                    g.drawLine(getxenPanelRel(vpl[i].getX()), getyenPanelRel(vpl[i].getY()), getxenPanelRel(vpl[i + 1].getX()), getyenPanelRel(vpl[i + 1].getY()));;
                }
                g.setColor(Color.BLUE);
                g.drawLine(ox, oy, getxenPanelRel(vpl[0].getX()), getyenPanelRel(vpl[0].getY()));
                //intento de angulo g.drawArc(getxenPanel(ox),getyenPanel(oy),getxenPanel(vp[i].getX())/2, getyenPanel(vp[i].getY())/2,0, (int)getR(getxenPanel(ox),getyenPanel(oy)));
            }
            flagGPLPR = false;
        }
    }

    public void limpiarPantalla() {
        repaint();
    }

    public String graficarPuntos() {
        flagGP = true;
        String s = "Lista de Puntos Pn(x,y)\n\n";
        for (int i = 0; i < vp.length; i++) {
            s += "P" + (i + 1) + " (" + (vp[i].getX()) + ", " + (vp[i].getY()) + ")\n";
        }
        repaint();
        return s;
    }

    public String graficarPuntosPolares() {
        flagGPP = true;
        String s = "Lista de Puntos Pn (r,θ)\n\n";
        for (int i = 0; i < vp.length; i++) {
            s += "P" + (i + 1) + " (" + df.format(getR(vp[i].getX(), vp[i].getY())) + ", " + df.format(getTheta(vp[i].getX(), vp[i].getY())) + "°)\n";
        }
        repaint();
        return s;
    }

    public String graficarLineas(int c) {
        String s = "Linea n(x1,y1,x2,y2)\n\n";
        switch (c) {
            case 0:
                flagGLH = true;
                //s += "Linea Horizontal (" +vl[0].getX() + ", " + vl[0].getY() + ", " + vl[0].getX()+ ", " + vl[0].getY() + ")";
                break;
            case 1:
                flagGLV = true;
                //s += "Linea Vertical(" +vl[1].getX() + ", " + vl[1].getY() + ", " + vl[1].getX()+ ", " + vl[1].getY() + ")";
                break;
            case 2:
                flagGLD = true;
                //s += "Linea Diagonal(" +vl[2].getX() + ", " + vl[2].getY() + ", " + vl[2].getX()+ ", " + vl[2].getY() + ")";
                break;
        }
        repaint();
        return s;
    }

    public String graficarCirculo() {
        flagGC = true;
        String s = "";
        s = "Datos del Circulo\n\n x =" + c.getOrigenxs() + "\ny = " + c.getOrigenys() + "\nRadio = " + c.getDiametro() / 2 + "\nDiametro = " + c.getDiametro();
        repaint();
        return s;
    }

    public String graficarCirculoT() {
        flagGCT = true;
        String s = "";
        s = "Datos del Circulo\n\n x =" + c.getOrigenxs() + "\ny = " + c.getOrigenys() + "\nRadio = " + c.getDiametro() / 2 + "\nDiametro = " + c.getDiametro();
        repaint();
        return s;
    }

    public String graficarArco() {
        flagGA = true;
        String s = "Datos del Arco\n\nx = " + a.getX() + " \ny = " + a.getY() + "\n ancho = " + a.getAncho() + "\n alto = " + a.getAltura() / 2;

        repaint();
        return s;
    }

    public String graficarArcoT() {
        flagGAT = true;
        String s = "Datos del Arco\n\nx = " + a.getX() + " \ny = " + a.getY() + "\n ancho = " + a.getAncho() + "\n alto = " + a.getAltura() / 2;

        repaint();
        return s;
    }

    public String graficarElipse() {
        flagGE = true;
        String s = "Datos de la Elipse\n\n" + a.getX() + " \ny = " + a.getY() + "\n ancho = " + a.getAncho() + "\n alto = " + a.getAltura() / 2;
        repaint();
        return s;
    }

    public String graficarElipseT() {
        flagGET = true;
        String s = "Datos de la Elipse\n\n" + a.getX() + " \ny = " + a.getY() + "\n ancho = " + a.getAncho() + "\n alto = " + a.getAltura() / 2;
        repaint();
        return s;
    }

    public String graficarPolilineas() {
        flagGPL = true;
        String s = "Lista de Puntos Pn(x,y)\n\n";
        for (int i = 0; i < vpl.length; i++) {
            s += "P" + (i + 1) + " (" + (vpl[i].getX()) + ", " + (vpl[i].getY()) + ")\n";
        }
        repaint();
        return s;
    }

    public String graficarPolilineasPolares() {
        flagGPLP = true;
        String s = "Lista de Puntos Pn (r,θ)\n\n";
        for (int i = 0; i < vpl.length; i++) {
            s += "P" + (i + 1) + " (" + df.format(getR(vp[i].getX(), vp[i].getY())) + ", " + df.format(getTheta(vp[i].getX(), vp[i].getY())) + "°)\n";
        }
        repaint();
        return s;
    }

    public String graficarPolilineasRel() {
        flagGPLPR = true;
        String s = "Lista de Puntos Pn(x,y)\n\n";
        for (int i = 0; i < vpl.length; i++) {

            if (i == 0) {
                try {
                    vpl[i].setXs(vpl[i].getX());
                    vpl[i].setYs(vpl[i].getY());
                } catch (Exception e) {

                }
            } else {
                try {
                    vpl[i].setXs(vpl[i].getX() - vpl[i - 1].getX());
                    vpl[i].setYs(vpl[i].getY() - vpl[i - 1].getY());
                } catch (Exception e) {

                }
            }
            s += "P" + (i + 1) + " (" + (vpl[i].getXs()) + ", " + (vpl[i].getYs()) + ")\n";
        }
        repaint();
        return s;
    }

    public String graficarPolilineasPolaresRel() {
        flagGPLPR = true;
        String s = "Lista de Puntos Pn (r,θ)\n\n";
        for (int i = 0; i < vpl.length; i++) {
            if (i == 0) {
                try {
                    vpl[i].setXs(vpl[i].getX());
                    vpl[i].setYs(vpl[i].getY());
                } catch (Exception e) {

                }
            } else {
                try {
                    vpl[i].setXs(vpl[i].getX() - vpl[i - 1].getX());
                    vpl[i].setYs(vpl[i].getY() - vpl[i - 1].getY());
                } catch (Exception e) {

                }
            }
            s += "P" + (i + 1) + " (" + df.format(getR(vpl[i].getXs(), vpl[i].getYs())) + ", " + df.format(getTheta(vpl[i].getXs(), vpl[i].getYs())) + "°)\n";

        }
        repaint();
        return s;
    }

    public int getxCartesianoAbs(int x) {
        int var = 0;
        if (x == 250) {
            var = 0;
        } else if (x > 250) {
            var = (x - 250) / 20;
        }
        return var;
    }

    public int getyCartesianoAbs(int y) {
        int var = 0;
        if (y == 0) {
            var = getHeight() / 2;
        }
        if (y != 0) {
            var = getHeight() / 2 - (y * getHeight() / 20);
        }

        return var;
    }

    public int getxenPanel(int x) {
        int var = 0;
        if (x == 0) {
            var = this.getWidth() / 2;
        }
        if (x != 0) {
            var = this.getWidth() / 2 + (x * getWidth() / 20);
        }
        return var;
    }

    public int getyenPanel(int y) {
        int var = 0;
        if (y == 0) {
            var = getHeight() / 2;
        }
        if (y != 0) {
            var = getHeight() / 2 - (y * getHeight() / 20);
        }

        return var;
    }

    public int getxenPanelRel(int x) {
        int var = 0;
        if (x == 0) {
            var = ox;
        }
        if (x != 0) {
            var = ox + (x * getWidth() / 20);
        }
        return var;
    }

    public int getyenPanelRel(int y) {
        int var = 0;
        if (y == 0) {
            var = oy;
        }
        if (y != 0) {
            var = oy - (y * getHeight() / 20);

        }
        return var;
    }

    public double getR(int x, int y) {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public double getTheta(int x, int y) {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public int getOyp() {
        return oyp;
    }

    public int getOxp() {
        return oxp;
    }

    public void setOyp(int oyp) {
        this.oyp = oyp;
    }

    public void setOxp(int oxp) {
        this.oxp = oxp;
    }

    public int getOy() {
        return oy;
    }

    public int getOx() {
        return ox;
    }

    public void setOy(int oy) {
        this.oy = oy;
    }

    public void setOx(int ox) {
        this.ox = ox;
    }

    public PlanoCartesiano() {
        initComponents();
        //inicializar arraylist de puntos
        this.setBounds(0,0,500,500);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblma10 = new javax.swing.JLabel();
        lblma12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblma10.setBackground(new java.awt.Color(255, 255, 255));
        lblma10.setText("Eje X");

        lblma12.setBackground(new java.awt.Color(255, 255, 255));
        lblma12.setText("Eje Y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblma12)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblma10)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblma12)
                .addGap(204, 204, 204)
                .addComponent(lblma10)
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblma10;
    private javax.swing.JLabel lblma12;
    // End of variables declaration//GEN-END:variables
}
