package com.crawler;

import java.util.HashMap;

public class DataHandler {

	private HashMap<String, Equipo> equipos;
	
	public DataHandler() {
		this.setEquipos(new HashMap<String, Equipo>());
	}
	
	public void addNewResult(String equipoLocal, String equipoVisitante, Integer golesLocal, Integer golesVisitante){
		Equipo local = agregarEquipo(equipoLocal);
		Equipo visita = agregarEquipo(equipoVisitante);
		local.agregarGolesAFavorLocal(golesLocal);
		local.agregarGolesEncontraLocal(golesVisitante);
		visita.agregarGolesAFavorVisitante(golesVisitante);
		visita.agregarGolesEncontraVisitante(golesLocal);
		if (golesLocal > golesVisitante){
			local.sumarPartidoGanadoLocal();
			visita.sumarPartidoPerdidoVisita();
		} else if (golesLocal.equals(golesVisitante)){
			local.sumarPartidoEmpatadoLocal();
			visita.sumarPartidoEmpatadoVisita();
		} else {
			local.sumarPartidoPerdidoLocal();
			visita.sumarPartidoGanadoVisita();
		}
		local.actualizarPromedios();
		visita.actualizarPromedios();
	}
	
	private Equipo agregarEquipo(String equipo){
		if (getEquipos().get(equipo.trim()) == null){
			Equipo nuevo = new Equipo(equipo);
			getEquipos().put(equipo.trim(), nuevo);
		}
		return getEquipos().get(equipo.trim());
	}

	public HashMap<String, Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(HashMap<String, Equipo> equipos) {
		this.equipos = equipos;
	}
	
}
