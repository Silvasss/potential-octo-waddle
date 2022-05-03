/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatcliente;

import java.rmi.Remote;
import java.util.ArrayList;

/** 
 *
 * @author Felip
 */

public interface Ichat extends Remote{
    public String enviaMensagemParaServidor(String mensagem) throws java.rmi.RemoteException;  
        
    public ArrayList<String>lerMensagem() throws java.rmi.RemoteException;
    
    //Contato usado para o CallBack
    public void contatoCliente(Icliente cli) throws java.rmi.RemoteException;
}
