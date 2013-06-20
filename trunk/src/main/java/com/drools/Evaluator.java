package com.drools;

import org.drools.runtime.StatefulKnowledgeSession;

import com.crawler.Constants;
import com.crawler.Equipo;


public class Evaluator {
	
	public static String evaluate(Equipo local, Equipo visita) {
		
		String resultado = "zig zig es EMPATE por lo menos asi lo veo yo";
		
		local.setEsLocal(true);
		local.setPuntaje(0);
		visita.setPuntaje(0);
		
		Integer puntajeLocal = evaluarEquipo(local);
		Integer puntajeVisita = evaluarEquipo(visita);
		
		System.out.println("Puntaje equipo local= " + puntajeLocal);
		System.out.println("Puntaje equipo visita= " + puntajeVisita);
		
		// Comparo el resultado de las evaluaciones 

		if (puntajeLocal > puntajeVisita) 
			resultado = "zig zig GANA " + local.getNombre() + " por lo menos asi lo veo yo";
		 
		if (puntajeLocal < puntajeVisita)
			resultado = "zig zig GANA " + visita.getNombre() + " por lo menos asi lo veo yo";
		
		return resultado;
	}

	private static Integer evaluarEquipo(Equipo equipo) {
		// Creo sesión de drools 
		StatefulKnowledgeSession kSession = Helper.createSession("src/main/rules/ReglasEquipo.drl");
		
		// Si quiero meter una variable global donde guardo el resultado
		//kSession.setGlobal("NOMBRE_VARIABLE", variable);
		
		// Inserto el equipo a evaluar 
		kSession.insert(equipo);

		// Ejecuto 
		kSession.fireAllRules();
		
		// Limpio sesión 
		kSession.dispose();
				
		return equipo.getPuntaje();
	}
}
