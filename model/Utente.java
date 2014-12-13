package it.project.libreria.model;

import it.project.libreria.dao.UtenteDAO;

public class Utente {

	private int ID;
	private String nome;
	private String cognome;
	private String username;
	private String password;
	
	public Utente(int iD, String nome, String cognome, String username,
			String password) {
		super();
		ID = iD;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean login() {
		int ID = UtenteDAO.getInstance().login(username, password);
		if(ID==-1) return false;
		this.ID = ID;
		return true;
	}
	
	public Utente() {
		
	}
	
}
