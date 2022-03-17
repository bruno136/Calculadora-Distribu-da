/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.cliente.conn;

import java.io.IOException;

/**
 *
 * @author Bruno
 */

public class ConexaoSocket extends AbstractConexao {

    public ConexaoSocket(String host, int porta) throws IOException {
        super(host, porta);

    }

}
