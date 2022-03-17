/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.slave.util;

import calc.rmi.stub.Master;
import java.rmi.RemoteException;

/**
 *
 * @author Bruno
 */
public class VerificaMasterOnline implements Runnable {

    public Master master;

    public VerificaMasterOnline(Master master) {
        this.master = master;
    }

    @Override
    public void run() {
        try {

            while (master.isOnline()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (RemoteException e) {
            System.out.println("Conexão perdida com o Servidor Master");

        }

    }

}
