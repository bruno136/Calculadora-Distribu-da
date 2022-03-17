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
public interface SlaveEspecial  extends Remote {
	
	public boolean isOnline() throws RemoteException;
	
	public Double getPorcentagem(Double a) throws RemoteException;
	
	public Double getRaiz(Double a) throws RemoteException;

	public Double getPotenciacao(int a, int b) throws RemoteException;

}

