/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.cliente.conn;

import calc.socket.model.Mensagem;
import java.io.IOException;
/**
 *
 * @author Bruno
 */
public interface Conexao{

    public void iniciaConn() throws IOException;

    public void closeConn() throws IOException;

    public void enviar(Mensagem mensagem) throws IOException;

    public Mensagem receber() throws IOException, ClassNotFoundException;

    public Mensagem testeConexao() throws IOException, ClassNotFoundException;

}
