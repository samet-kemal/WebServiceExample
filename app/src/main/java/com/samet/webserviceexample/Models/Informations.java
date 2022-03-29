package com.samet.webserviceexample.Models;

import java.util.List;

public class Informations{
	private List<InformationsItem> informations;

	public List<InformationsItem> getInformations(){
		return informations;
	}

	@Override
 	public String toString(){
		return 
			"Informations{" + 
			"informations = '" + informations + '\'' + 
			"}";
		}
}