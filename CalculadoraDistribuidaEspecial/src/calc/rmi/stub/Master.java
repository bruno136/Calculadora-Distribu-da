/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.rmi.stub;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Bruno
 */
public interface Master extends Remote {
	
	public boolean isOnline() throws RemoteException;
	
	public boolean registraEscravo(SlaveBasico slaveBasico) throws RemoteException;
	
	public boolean registraEscravo(SlaveEspecial slaveEspecial) throws RemoteException;
	
}
