import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServant extends UnicastRemoteObject implements HelloService{
    protected HelloServant() throws RemoteException {
        super();
    }

    @Override
    public String printMessage() throws RemoteException {
        return "Hey this is a message";
    }

    @Override
    public int addNumber(int a,int b) throws RemoteException {
        return (a+b);
    }
}
