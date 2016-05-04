/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_laberinto;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author chino
 */
public class Dibujador {

    final int t = 15;

    void dibujar(Graphics g, Punto p, int i, int a, int d, int ab, String direccion) {
        int x = p.getX();
        int y = p.getY();        

        if (i == 1) {
            lineaIzquierda(g, x, y);
        }
        if (a == 1) {
            lineaArriba(g, x, y);
        }
        if (d == 1) {
            lineaDerecha(g, x, y);
        }
        if (ab == 1) {
            lineaAbajo(g, x, y);
        }
        g.setColor(Color.YELLOW);
        if (i == 2) {
            lineaIzquierda(g, x, y);
        }
        if (a == 2) {
            lineaArriba(g, x, y);
        }
        if (d == 2) {
            lineaDerecha(g, x, y);
        }
        if (ab == 2) {
            lineaAbajo(g, x, y);
        }        
        
        

//        switch(direccion){
//            case "ARRIBA":
//                if(i==1) lineaIzquierda(g,x,y);
//                if(a==1) lineaArriba(g,x,y);
//                if(d==1) lineaDerecha(g,x,y);
//                break;
//            case "DERECHA":
//                if(i==1) lineaArriba(g,x,y);
//                if(a==1) lineaDerecha(g,x,y);
//                if(d==1) lineaAbajo(g,x,y);
//                break;
//            case "IZQUIERDA":
//                if(i==1) lineaAbajo(g,x,y);
//                if(a==1) lineaIzquierda(g,x,y);
//                if(d==1) lineaArriba(g,x,y);
//                break;
//            case "ABAJO":
//                if(i==1) lineaDerecha(g,x,y);
//                if(a==1) lineaAbajo(g,x,y);
//                if(d==1) lineaIzquierda(g,x,y);
//                break;
//        }
    }

    private void lineaArriba(Graphics g, int x, int y) {        
        g.drawLine(x - t, y - t, x + t, y - t);
    }

    private void lineaAbajo(Graphics g, int x, int y) {
        g.drawLine(x - t, y + t, x + t, y + t);
    }

    private void lineaDerecha(Graphics g, int x, int y) {
        g.drawLine(x + t, y - t, x + t, y + t);

    }

    private void lineaIzquierda(Graphics g, int x, int y) {
        g.drawLine(x - t, y - t, x - t, y + t);
    }

}
