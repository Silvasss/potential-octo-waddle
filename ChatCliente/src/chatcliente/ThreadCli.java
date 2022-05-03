 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatcliente;

import java.rmi.RemoteException;

/**
 *
 * @author Felip
 */

public class ThreadCli extends Thread{    
    Ichat chat;    
    Icliente cli; 
    
    public ThreadCli(Ichat chat) throws RemoteException {
       //Criar contato do cliente - para CallBack
       this.chat = chat;
       
       cli = new IclienteImpl(chat);
       
       //Envia para o servidor o contato, para que este possa enviar notificações
       chat.contatoCliente(cli);
    }
    
    public void run() {
        while (true) {
            //Fica em loop apenas para receber as notificações do srv
        }
    }
}
