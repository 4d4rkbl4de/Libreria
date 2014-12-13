package it.project.libreria.dao;

import java.util.Vector;

import it.project.libreria.dbinterface.DbConnection;

public class UtenteDAO {
	
	private static UtenteDAO instance;
	
	public static UtenteDAO getInstance() {
		if(instance == null)
			instance=new UtenteDAO();
		return instance;
	}
	
	public int login(String username, String password) {
		Vector<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT ID FROM UTENTE WHERE username='"+username+"' AND password='"+password+"'");
		if(risultato.size() == 0) return -1;
		return Integer.parseInt(risultato.get(0)[0].toString());
	}
}
