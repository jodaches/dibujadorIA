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
 * @author Juan Lopez 2
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

    void enviar(String content,String destino) {
        ACLMessage msg=new ACLMessage();
        msg.addReceiver(new AID(destino,AID.ISLOCALNAME));
        msg.setContent(content);
        this.send(msg);
    }
}
// Hola chino como estas, queria preguntar si tienes las respuestas de las preguntas que te hagan cada vez que alguien accede a solicitar tu ayudar por que 2 y 2 son 4, 4 y 2 son 6 pero nadie sabes cuanto es el modulo de 1 partido 29
