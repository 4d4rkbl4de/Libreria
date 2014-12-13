package it.project.libreria.listeners;

import it.project.libreria.business.Sessione;
import it.project.libreria.business.UtenteManager;
import it.project.libreria.model.Utente;
import it.project.libreria.view.PannelloLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {

	PannelloLogin pLogin;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String username = pLogin.getTxt_username().getText();
		char[] password = pLogin.getTxt_password().getPassword();
		
		Utente u = UtenteManager.getInstance().login(username, new String(password));
		if(u == null)
			JOptionPane.showMessageDialog(null,"Caro utente non esisti, registrati!");
		else {
			JOptionPane.showMessageDialog(null,"Bentornato! Il tuo ID e' "+u.getID());
		}

	}
	
	public LoginListener(PannelloLogin pLogin) {
		this.pLogin = pLogin;
	}

}
