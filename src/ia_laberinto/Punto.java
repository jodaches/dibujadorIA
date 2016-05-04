/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_laberinto;

/**
 *
 * @author chino
 */
public class Punto {
    int x,y;    

    public int getX() {
        return x;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }
    
   
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;        
    }
    
}
