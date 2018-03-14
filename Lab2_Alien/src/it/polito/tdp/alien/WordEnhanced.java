package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class WordEnhanced {
	
	private String alienWord;
	private List<String> listaTraduzioni; 
	
	public WordEnhanced(String alienWord, String primaTrad)
	{
		this.alienWord=alienWord;
		listaTraduzioni=new ArrayList<>();
		listaTraduzioni.add(primaTrad);
	}
	
	public void setTranslation(String trad)
	{
		if(!listaTraduzioni.contains(trad))
		listaTraduzioni.add(trad);
	}

	public String toString() {
		StringBuilder sb=new StringBuilder();
		//sb.append("Traduzioni parola aliena: \n");
		
		for(String s:listaTraduzioni)
		{
			sb.append(s+"\n");
		}
	return sb.toString();	
	}
	
	
	
	
	
	

}
