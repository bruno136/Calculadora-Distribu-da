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
public interface SlaveBasico extends Remote{

	public boolean isOnline() throws RemoteException;
	
	public double getSoma(double a, double b) throws RemoteException;
	
	public double getSubtracao(double a, double b) throws RemoteException;
	
	public double getMultiplicacao(double a, double b) throws RemoteException;
	
	public double getDivisao(double a, double b) throws RemoteException;
	
	
}
