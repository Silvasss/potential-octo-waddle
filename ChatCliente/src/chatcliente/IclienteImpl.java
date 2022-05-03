/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatcliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Felip
 */

public class IclienteImpl extends UnicastRemoteObject implements Icliente{
    
    Ichat chat;    
    
    public IclienteImpl (Ichat chat) throws RemoteException {
        super();
        
        this.chat = chat;
    }
        
    @Override
    public void notificaCliente (String mensagem) throws RemoteException {
        System.out.println(mensagem);
    }
}
