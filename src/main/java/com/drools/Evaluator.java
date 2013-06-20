package com.drools;

import org.drools.runtime.StatefulKnowledgeSession;

import com.crawler.Constants;
import com.crawler.Equipo;


public class Evaluator {
	
	public static String evaluate(Equipo local, Equipo visita) {
		
	
		System.out.println("local " + local.getNombre());
		
		System.out.println("local goles " + local.getGolesAFavorLocal());
		
		System.out.println("visita " + visita.getNombre());
		
		String resultado = "no se sabe";
		
		
		
		Integer puntajeLocal = evaluarEquipo(local);
		Integer puntajeVisita = evaluarEquipo(visita);
		
		// Comparo el resultado de las evaluaciones 
		//return resultadoEquipoUno.compareTo(resultadoEquipoDos);
		if (puntajeLocal == 30)
			resultado = "gana local";
		return resultado;
	}

	private static Integer evaluarEquipo(Equipo equipo) {
		
		// Creo sesión de drools 
		StatefulKnowledgeSession kSession = Helper.createSession("src/main/rules/ReglasEquipo.drl");

		Integer puntaje = new Integer(0);
		
		// Meto la variable global donde guardo el resultado
		kSession.setGlobal("PUNTAJE_EQUIPO", puntaje);
		
		// Inserto el equipo a evaluar 
		kSession.insert(equipo);

		// Ejecuto 
		kSession.fireAllRules();
		
		// Limpio sesión 
		kSession.dispose();
		
		return puntaje;
	}
}
