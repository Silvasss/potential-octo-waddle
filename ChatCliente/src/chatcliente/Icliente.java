
package chatcliente;
import java.rmi.Remote;

public interface Icliente extends Remote{
    public void notificaCliente(String mensagem) throws java.rmi.RemoteException;      
}
