/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatcliente;

import java.rmi.Naming;

/**
 *
 * @author Felip
 */

public class ChatCliente {

    static Ichat chat;

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            //Obter referÃªncia para o servidor.
            chat = (Ichat) Naming.lookup("//localhost/servidor");
            
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());

            System.exit(0);
        }       
        /*
        try {            
            new ThreadCli(chat).start();
            
        } catch (RemoteException e) {
            System.err.println("Erro: " + e.getMessage());

            System.exit(0);
        }   */             
                       
    }
    
}
