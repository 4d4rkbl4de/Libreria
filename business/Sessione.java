package it.project.libreria.business;

import java.util.HashMap;

public class Sessione {

	private static Sessione instance;
	
	public HashMap<String, Object> mappa = new HashMap<String, Object>();
	
	public static Sessione getInstance() {
		if(instance == null)
			instance = new Sessione();
		return instance;
	}
	
	public void svuotaSessione() {
		mappa = new HashMap<String, Object>();
	}
}
