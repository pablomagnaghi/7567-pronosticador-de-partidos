package com.test;

import com.crawler.Constants;
import com.crawler.Equipo;
import com.crawler.Spider;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Spider s = new Spider();
		s.readNewData("archivos/apertura2012.html");
		Equipo equipo = s.getHandler().getEquipos().get(Constants.VELEZ);
		System.out.println(equipo.getPuntosTotales());
		
	}

}
