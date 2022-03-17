/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.slave.controller;

import calc.slave.server.SlaveEspecialServer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class SlaveEspecialController {

    private ExecutorService executorService;
    private SlaveEspecialServer server;

    public SlaveEspecialController() {
        executorService = Executors.newFixedThreadPool(1);
    }

    public void sair() {
        int answer = JOptionPane.showConfirmDialog(null, "Quer mesmo sair?", "Fechando o Conexão com segurança...",
                JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            desligarServidor();
            System.exit(0);
        }
        return;
    }

    public String iniciarServidor(String host, String porta) {
        server = new SlaveEspecialServer(host, Integer.parseInt(porta));
        executorService.execute(server);
        return "OK!";
    }

    public SlaveEspecialServer getServer() {
        return server;
    }

    public String desligarServidor() {
        executorService.shutdown();
        server = null;
        return "ok!";
    }

}
