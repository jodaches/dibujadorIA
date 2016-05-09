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

    final int t = 20;
    int restador=6;
    int dimension=13;

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
        g.setColor(Color.cyan);
        if (i == 3) {            
            g.fillOval(x-t*2-restador, y-restador, dimension, dimension); 
        }
        if (a == 3) {            
            g.fillOval(x-restador, y-t*2-restador, dimension, dimension);                            
        }
        if (d == 3) {            
            g.fillOval(x+t*2-restador, y-restador, dimension, dimension);                            
        }
        if (ab == 3) {
            g.fillOval(x-restador, y+t*2-restador, dimension, dimension);                            
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
        g.drawLine(x - t, y - t + 1 , x + t, y - t + 1);
    }

    private void lineaAbajo(Graphics g, int x, int y) {
        g.drawLine(x - t, y + t, x + t, y + t);
        g.drawLine(x - t, y + t - 1 , x + t , y + t - 1);
    }

    private void lineaDerecha(Graphics g, int x, int y) {
        g.drawLine(x + t, y - t, x + t, y + t);
        g.drawLine(x + t+1, y - t, x + t +1, y + t);

    }

    private void lineaIzquierda(Graphics g, int x, int y) {
        g.drawLine(x - t, y - t, x - t, y + t);
        g.drawLine(x - t - 1, y - t, x - t - 1, y + t);
    }

}
