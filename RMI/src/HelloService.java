import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    public String printMessage() throws RemoteException;
    public int addNumber(int a,int b) throws RemoteException;
}
