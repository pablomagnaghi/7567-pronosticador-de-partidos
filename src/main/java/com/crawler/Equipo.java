package com.crawler;

public class Equipo {
	
	private String nombre;
	private Integer golesAFavorLocal;
	private Integer golesAFavorVisitante;
	private Integer golesEncontraLocal;
	private Integer golesEncontraVisitante;
	private Integer partidosGanadosLocal;
	private Integer partidosGanadosVisitante;
	private Integer partidosEmpatadosLocal;
	private Integer partidosEmpatadosVisitante;
	private Integer partidosPerdidosLocal;
	private Integer partidosPerdidosVisitante;
	private Boolean esEquipoGrande = Boolean.FALSE;
	
	public Equipo(String nombre){
		this.nombre = nombre;
		this.setGolesAFavorLocal(0);
		this.setGolesAFavorVisitante(0);
		this.setGolesEncontraLocal(0);
		this.setGolesEncontraVisitante(0);
		this.partidosGanadosLocal = 0;
		this.partidosGanadosVisitante = 0;
		this.partidosEmpatadosLocal = 0;
		this.partidosEmpatadosVisitante = 0;
		this.partidosPerdidosLocal = 0;
		this.partidosPerdidosVisitante = 0;
		if (Constants.BOCA.equals(nombre.trim()) || Constants.RIVER.equals(nombre.trim()) || Constants.RACING.equals(nombre.trim())
				|| Constants.SAN_LORENZO.equals(nombre.trim())|| Constants.INDEPTE.equals(nombre.trim())){
			esEquipoGrande = Boolean.TRUE;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getPartidosGanadosLocal() {
		return partidosGanadosLocal;
	}
	
	public void setPartidosGanadosLocal(Integer partidosGanadosLocal) {
		this.partidosGanadosLocal = partidosGanadosLocal;
	}
	
	public Integer getPartidosGanadosVisitante() {
		return partidosGanadosVisitante;
	}
	
	public void setPartidosGanadosVisitante(Integer partidosGanadosVisitante) {
		this.partidosGanadosVisitante = partidosGanadosVisitante;
	}
	
	public Integer getPartidosEmpatadosLocal() {
		return partidosEmpatadosLocal;
	}
	
	public void setPartidosEmpatadosLocal(Integer partidosEmpatadosLocal) {
		this.partidosEmpatadosLocal = partidosEmpatadosLocal;
	}
	
	public Integer getPartidosEmpatadosVisitante() {
		return partidosEmpatadosVisitante;
	}
	
	public void setPartidosEmpatadosVisitante(Integer partidosEmpatadosVisitante) {
		this.partidosEmpatadosVisitante = partidosEmpatadosVisitante;
	}
	
	public Integer getPartidosPerdidosLocal() {
		return partidosPerdidosLocal;
	}
	
	public void setPartidosPerdidosLocal(Integer partidosPerdidosLocal) {
		this.partidosPerdidosLocal = partidosPerdidosLocal;
	}
	
	public Integer getPartidosPerdidosVisitante() {
		return partidosPerdidosVisitante;
	}
	
	public void setPartidosPerdidosVisitante(Integer partidosPerdidosVisitante) {
		this.partidosPerdidosVisitante = partidosPerdidosVisitante;
	}
	
	public Boolean getEsEquipoGrande() {
		return esEquipoGrande;
	}
	
	public void setEsEquipoGrande(Boolean esEquipoGrande) {
		this.esEquipoGrande = esEquipoGrande;
	}

	public Integer getGolesAFavorLocal() {
		return golesAFavorLocal;
	}

	public void setGolesAFavorLocal(Integer golesAFavorLocal) {
		this.golesAFavorLocal = golesAFavorLocal;
	}

	public Integer getGolesAFavorVisitante() {
		return golesAFavorVisitante;
	}

	public void setGolesAFavorVisitante(Integer golesAFavorVisitante) {
		this.golesAFavorVisitante = golesAFavorVisitante;
	}

	public Integer getGolesEncontraLocal() {
		return golesEncontraLocal;
	}

	public void setGolesEncontraLocal(Integer golesEncontraLocal) {
		this.golesEncontraLocal = golesEncontraLocal;
	}

	public Integer getGolesEncontraVisitante() {
		return golesEncontraVisitante;
	}

	public void setGolesEncontraVisitante(Integer golesEncontraVisitante) {
		this.golesEncontraVisitante = golesEncontraVisitante;
	}

	public void agregarGolesAFavorLocal(Integer golesLocal) {
		this.golesAFavorLocal += golesLocal;
	}

	public void agregarGolesEncontraLocal(Integer golesVisitante) {
		this.golesEncontraLocal += golesVisitante;
	}

	public void agregarGolesAFavorVisitante(Integer golesVisitante) {
		this.golesAFavorVisitante += golesVisitante;
	}

	public void agregarGolesEncontraVisitante(Integer golesLocal) {
		this.golesEncontraVisitante += golesLocal;
	}

	public void sumarPartidoGanadoLocal() {
		this.partidosGanadosLocal++;
	}

	public void sumarPartidoPerdidoVisita() {
		this.partidosPerdidosVisitante++;
	}

	public void sumarPartidoEmpatadoLocal() {
		this.partidosEmpatadosLocal++;
	}

	public void sumarPartidoEmpatadoVisita() {
		this.partidosEmpatadosVisitante++;
	}

	public void sumarPartidoPerdidoLocal() {
		this.partidosPerdidosLocal++;
	}

	public void sumarPartidoGanadoVisita() {
		this.partidosGanadosLocal++;
	}

	public Integer getPuntosTotales(){
		Integer partidosGanados = this.partidosGanadosLocal + this.partidosGanadosVisitante;
		Integer partidosEmpatados = this.partidosEmpatadosLocal + this.partidosEmpatadosVisitante;
		return (partidosGanados * 3) + (partidosEmpatados);
	}
}
