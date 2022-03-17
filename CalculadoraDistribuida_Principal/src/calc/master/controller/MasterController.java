/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.master.controller;

import calc.master.server.MasterServer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class MasterController  {
	
	private MasterServer masterServer;
	private ExecutorService executorService;

	
	public MasterController() {
		executorService = Executors.newCachedThreadPool();
	}
	
	public void iniciarServidor(int portaSocket, int portaRMI){
		masterServer = new MasterServer(portaSocket, portaRMI);
		executorService.execute(masterServer);
	}
	
	public void paraServidor() {
		masterServer.desligar();
		executorService.shutdownNow();
		System.exit(0);
		
	}
	
	public MasterServer getMasterServer() {
		return masterServer;
	}
	
	public void sair() {
		int answer = JOptionPane.showConfirmDialog(null, "Quer mesmo sair?", "Fechando o Conexão com segurança...",
				JOptionPane.YES_NO_OPTION);

		if (answer == JOptionPane.YES_OPTION) {
			paraServidor();
		}
		return;
		
	}	
}
