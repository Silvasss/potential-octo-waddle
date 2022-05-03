/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatservidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Felip
 */

public class IservidorImpl extends UnicastRemoteObject implements Ichat{
    
    private Icliente cli;
    
    ArrayList<String> mensagens;

    
    public IservidorImpl() throws RemoteException {
        super();             
    }
    
    public void contatoCliente(Icliente cli) throws RemoteException {
        this.cli = cli;
        
        this.mensagens = new ArrayList<>();   
    }
            
    public String enviaMensagemParaServidor(String mensagem) throws RemoteException {
        cli.notificaCliente(mensagem);
        
        mensagens.add(mensagem);       
        
        return mensagem;
    }
    
    @Override
    public ArrayList<String> lerMensagem() throws RemoteException {               
        return mensagens;
    }
    
}
