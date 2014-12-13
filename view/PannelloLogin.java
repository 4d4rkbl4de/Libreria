package it.project.libreria.view;

import it.project.libreria.business.Sessione;
import it.project.libreria.listeners.LoginListener;
import it.project.libreria.model.Utente;
import it.project.libreria.view.*;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PannelloLogin extends JFrame {

	private JTextField txt_username;
	private JPasswordField txt_password;
	private JButton btn_login;
	
	public PannelloLogin() {
		super("Libreria - Effettua login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		txt_username=new JTextField("username",20);
		txt_password = new JPasswordField("password",20);
		btn_login=new JButton("Effettua il login");
		
		btn_login.addActionListener(new LoginListener(this));
		
		c.add(txt_username);
		c.add(txt_password);
		c.add(btn_login);
		
		pack();
		setVisible(true);
		setSize(350, 200);
		
	}
	

	public JTextField getTxt_username() {
		return txt_username;
	}

	public void setTxt_username(JTextField txt_username) {
		this.txt_username = txt_username;
	}

	public JPasswordField getTxt_password() {
		return txt_password;
	}

	public void setTxt_password(JPasswordField txt_password) {
		this.txt_password = txt_password;
	}
	
	
}