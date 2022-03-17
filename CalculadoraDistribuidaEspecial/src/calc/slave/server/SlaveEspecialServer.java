/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.slave.server;

import calc.rmi.stub.Master;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Bruno
 */
public class SlaveEspecialServer implements Runnable {

    private SlaveEspecialImple slave;
    private boolean conectado = false;

    private String host;
    private int porta;
    private Master master;

    public SlaveEspecialServer(String host, int porta) {
        this.host = host;
        this.porta = porta;
    }

    @Override
    public void run() {
        while (!conectado) {
            try {
                slave = new SlaveEspecialImple();
                master = (Master) Naming.lookup("rmi://" + host + ":" + porta + "/Master");
                conectado = master.registraEscravo(slave);
                slave.VerificaMasterOnline(master);
                System.out.println("Servidor slave Especial ONLINE");

            } catch (RemoteException e) {
                e.printStackTrace();
                System.out.println("Não foi possível se conectar ao Servidor Master");
            } catch (MalformedURLException e) {
                System.out.println("Verificaque a url, o Host ou a portas estão Invalidas!");
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        }
    }
}
