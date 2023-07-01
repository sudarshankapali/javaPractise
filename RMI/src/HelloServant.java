import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class HelloServant extends UnicastRemoteObject implements HelloService{
    Scanner inp = new Scanner(System.in);
    protected HelloServant() throws RemoteException {
        super();
    }

    @Override
    public String printMessage() throws RemoteException {
        return "Hey this is a message";
    }

    @Override
    public int addNumber(int a,int b) throws RemoteException {
        System.out.println("enter 2 number");
        int c = inp.nextInt();
        int d = inp.nextInt();
//        System.out.println(c+d);
        return(c+d);

//        return (a+b);
    }
}
