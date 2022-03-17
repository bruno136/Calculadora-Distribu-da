/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.cliente.exception;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno
 */
public class ConexaoRecusadaException extends RuntimeException {
	private static final long serialVersionUID = -3307189356179283383L;

	public ConexaoRecusadaException(String s) {
       super(s);

       JLabel lblMessage = new JLabel(s);
       Object[] texts = { lblMessage };
       JOptionPane.showMessageDialog(null, texts);
   }
}

