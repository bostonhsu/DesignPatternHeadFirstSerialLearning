package cn.windssoft.rmiPattern.statePattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Administrator on 2017/6/22.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
