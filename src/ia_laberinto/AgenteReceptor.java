/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_laberinto;
import jade.core.*;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
/**
 *
 * @author chino
 */
public class AgenteReceptor extends Agent {
    
    @Override
    public void setup(){
        Principal p = new Principal(this);                
        p.show();
        addBehaviour(new CyclicBehaviour(){
            @Override
            public void action() {
                ACLMessage msg = receive();
                if(msg!=null){
                    System.out.println(msg.getContent());                    
                    p.dibujar(msg.getContent());
                }else{
                    block();
                }
            }            
        });
    }
    private int[] map(String a){
        String[] arr = a.split(",");
        int[] ret = new int[2];
        switch(arr[0]){
            case "izquierda":ret[0]=1;break;
            case "derecha":ret[0]=2;break;                
            case "recto":ret[0]=3;break;                
            case "doble":ret[0]=4;break;                
            case "izqRecto":ret[0]=5;break;                
            case "derRecto":ret[0]=6;break;                
            case "todos":ret[0]=7;break;                
            case "tope":ret[0]=8;break;                
        }
        switch(arr[1]){
            case "izquierda": ret[1]=1; break;
            case "adelante": ret[1]=2; break;
            case "derecha": ret[1]=3; break;
            case "atras": ret[1]=4; break;
        }        
        return ret;
    }

    void enviar(String content,String destino) {
        ACLMessage msg=new ACLMessage();
        msg.addReceiver(new AID(destino,AID.ISLOCALNAME));
        msg.setContent(content);
        this.send(msg);
    }
}
// Hola chino como estas, queria preguntar si tienes las respuestas de las preguntas que te hagan cada vez que alguien accede a solicitar tu ayudar por que 2 y 2 son 4, 4 y 2 son 6 pero nadie sabes cuanto es el modulo de 1 partido 29
