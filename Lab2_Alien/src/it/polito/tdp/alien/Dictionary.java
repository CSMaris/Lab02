package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class Dictionary {
	
	private HashMap <String,WordEnhanced> elencoA;
	
	
	
	public Dictionary()
	{
		elencoA=new HashMap<>();
		
	}
	
	
	public void setWord(String pAliena,String pTerrestre)
	{
		
	
		if(!elencoA.containsKey(pAliena))
		{
		elencoA.put(pAliena,new WordEnhanced(pAliena,pTerrestre));
		}
		else
		{
			elencoA.get(pAliena).setTranslation(pTerrestre);
		}
		}
		
	
	
	public String getWord(String pAliena)
	{
    	return "Elenco traduzioni \n"+elencoA.get(pAliena).toString();
	}
	
	public String getWord(String pAliena1,String pAliena2)
	{
		StringBuilder sb=new StringBuilder();
		sb.append("Elenco traduzioni \n");
		for(String s:elencoA.keySet())
		{
			if(Pattern.matches(pAliena1+"."+pAliena2, s))// il punto è come ? in SQL
			{
			sb.append(elencoA.get(s).toString());		
			}
			
			
		}
		
    	return sb.toString();
	}

}
