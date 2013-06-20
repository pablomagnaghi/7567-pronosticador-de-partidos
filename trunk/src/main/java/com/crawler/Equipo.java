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
	//
	private Double promedioPartidoGanadoLocal;
	private Double promedioPartidoEmpatadoLocal;
	private Double promedioPartidoPerdidoLocal;
	//
	private Double promedioPartidoGanadoVisita;
	private Double promedioPartidoEmpatadoVisita;
	private Double promedioPartidoPerdidoVisita;
	//
	private Double promedioGolesAFavorLocal;
	private Double promedioGolesAFavorVisita;
	private Double promedioGolesEncontraLocal;
	private Double promedioGolesEncontraVisita;
	//
	private Double promedioPuntosLocal;
	private Double promedioPuntosVisita;
	private Double promedioPuntosTotales;
	//
	private Boolean esEquipoGrande = Boolean.FALSE;
	private Boolean esBoca = Boolean.FALSE;
	private Boolean esRiver = Boolean.FALSE;
	private Boolean esLocal = Boolean.FALSE;
	
	private Integer puntaje;
	
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
		if (Constants.BOCA.equals(nombre.trim())){
			setEsBoca(Boolean.TRUE);
		} else if (Constants.RIVER.equals(nombre.trim())){
			setEsRiver(Boolean.TRUE);
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
		this.partidosGanadosVisitante++;
	}

	public Integer getPuntosTotales(){
		Integer partidosGanados = this.partidosGanadosLocal + this.partidosGanadosVisitante;
		Integer partidosEmpatados = this.partidosEmpatadosLocal + this.partidosEmpatadosVisitante;
		return (partidosGanados * 3) + (partidosEmpatados);
	}

	public Integer getPartidosJugados() {
		return this.partidosEmpatadosLocal + this.partidosEmpatadosVisitante + this.partidosPerdidosLocal + this.partidosPerdidosVisitante + 
					this.partidosGanadosLocal + this.partidosGanadosVisitante;
	}

	private Double promedio(Integer numerador, Integer divisor){
		double x = numerador.doubleValue();
		double y = divisor.doubleValue();
		return (x/y);
	}
	
	public Integer getCantPartidosLocal(){
		return this.partidosGanadosLocal + this.partidosEmpatadosLocal + this.partidosPerdidosLocal;
	}
	
	public Integer getCantPartidosVisita(){
		return this.partidosGanadosVisitante + this.partidosEmpatadosVisitante + this.partidosPerdidosVisitante;
	}
	
	public void actualizarPromedios(){
		this.setPromedioPartidoGanadoLocal(calcularPromedioPartidoGanadoLocal());
		this.setPromedioPartidoEmpatadoLocal(calcularPromedioPartidoEmpatadoLocal());
		this.setPromedioPartidoPerdidoLocal(calcularPromedioPartidoPerdidoLocal());
		this.setPromedioPartidoGanadoVisita(calcularPromedioPartidoGanadoVisita());
		this.setPromedioPartidoEmpatadoVisita(calcularPromedioPartidoEmpatadoVisita());
		this.setPromedioPartidoPerdidoVisita(calcularPromedioPartidoPerdidoVisita());
		this.setPromedioGolesAFavorLocal(calcularPromedioGolesAFavorLocal());
		this.setPromedioGolesAFavorVisita(calcularPromedioGolesAFavorVisita());
		this.setPromedioGolesEncontraLocal(calcularPromedioGolesEncontraLocal());
		this.setPromedioGolesEncontraVisita(calcularPromedioGolesEncontraVisita());
		this.setPromedioPuntosLocal(calcularPromedioPuntosLocal());
		this.setPromedioPuntosVisita(calcularPromedioPuntosVisita());
		this.setPromedioPuntosTotales(calcularPromedioPuntosTotales());
	}
	
	public Double calcularPromedioPartidoGanadoLocal(){
		Integer partidosLocal = this.getCantPartidosLocal();
		return this.promedio(this.partidosGanadosLocal, partidosLocal);
	}
	
	public Double calcularPromedioPartidoEmpatadoLocal(){
		Integer partidosLocal = this.getCantPartidosLocal();
		return this.promedio(this.partidosEmpatadosLocal, partidosLocal);
	}

	public Double calcularPromedioPartidoPerdidoLocal(){
		Integer partidosLocal = this.getCantPartidosLocal();
		return this.promedio(this.partidosPerdidosLocal, partidosLocal);
	}

	public Double calcularPromedioPartidoGanadoVisita(){
		Integer partidosVisita = this.getCantPartidosVisita();
		return this.promedio(this.partidosGanadosVisitante, partidosVisita);
	}
	
	public Double calcularPromedioPartidoEmpatadoVisita(){
		Integer partidosVisita = this.getCantPartidosVisita();
		return this.promedio(this.partidosEmpatadosVisitante, partidosVisita);
	}

	public Double calcularPromedioPartidoPerdidoVisita(){
		Integer partidosVisita = this.getCantPartidosVisita();
		return this.promedio(this.partidosPerdidosVisitante, partidosVisita);
	}
	
	public Double calcularPromedioGolesAFavorLocal(){
		Integer partidosLocal = this.getCantPartidosLocal();
		return this.promedio(this.golesAFavorLocal, partidosLocal);
	}
	
	public Double calcularPromedioGolesAFavorVisita(){
		Integer partidosVisita = this.getCantPartidosVisita();
		return this.promedio(this.golesAFavorVisitante, partidosVisita);
	}
	
	public Double calcularPromedioGolesEncontraLocal(){
		Integer partidosLocal = this.getCantPartidosLocal();
		return this.promedio(this.golesEncontraLocal, partidosLocal);
	}
	
	public Double calcularPromedioGolesEncontraVisita(){
		Integer partidosVisita = this.getCantPartidosVisita();
		return this.promedio(this.golesEncontraVisitante, partidosVisita);
	}
	
	public Double calcularPromedioPuntosLocal(){
		Integer puntosTotalesLocal = (this.partidosGanadosLocal * 3) + (this.partidosEmpatadosLocal);
		Integer partidosLocal = this.getCantPartidosLocal();
		return this.promedio(puntosTotalesLocal, partidosLocal);
	}
	
	public Double calcularPromedioPuntosVisita(){
		Integer puntosTotalesVisita = (this.partidosGanadosVisitante * 3) + (this.partidosEmpatadosVisitante);
		Integer partidosVisita = this.getCantPartidosVisita();
		return this.promedio(puntosTotalesVisita, partidosVisita);
	}
	
	public Double calcularPromedioPuntosTotales(){
		return this.promedio(this.getPuntosTotales(), this.getPartidosJugados());
	}

	public Double getPromedioPartidoGanadoLocal() {
		return promedioPartidoGanadoLocal;
	}

	public void setPromedioPartidoGanadoLocal(Double promedioPartidoGanadoLocal) {
		this.promedioPartidoGanadoLocal = promedioPartidoGanadoLocal;
	}

	public Double getPromedioPartidoEmpatadoLocal() {
		return promedioPartidoEmpatadoLocal;
	}

	public void setPromedioPartidoEmpatadoLocal(
			Double promedioPartidoEmpatadoLocal) {
		this.promedioPartidoEmpatadoLocal = promedioPartidoEmpatadoLocal;
	}

	public Double getPromedioPartidoPerdidoLocal() {
		return promedioPartidoPerdidoLocal;
	}

	public void setPromedioPartidoPerdidoLocal(
			Double promedioPartidoPerdidoLocal) {
		this.promedioPartidoPerdidoLocal = promedioPartidoPerdidoLocal;
	}

	public void setPromedioPartidoGanadoVisita(
			Double promedioPartidoGanadoVisita) {
		this.promedioPartidoGanadoVisita = promedioPartidoGanadoVisita;
	}
	
	public Double getPromedioPartidoGanadoVisita() {
		return this.promedioPartidoGanadoVisita;
	}


	public Double getPromedioPartidoEmpatadoVisita() {
		return promedioPartidoEmpatadoVisita;
	}

	public void setPromedioPartidoEmpatadoVisita(
			Double promedioPartidoEmpatadoVisita) {
		this.promedioPartidoEmpatadoVisita = promedioPartidoEmpatadoVisita;
	}

	public Double getPromedioPartidoPerdidoVisita() {
		return promedioPartidoPerdidoVisita;
	}

	public void setPromedioPartidoPerdidoVisita(
			Double promedioPartidoPerdidoVisita) {
		this.promedioPartidoPerdidoVisita = promedioPartidoPerdidoVisita;
	}

	public Double getPromedioGolesAFavorVisita() {
		return promedioGolesAFavorVisita;
	}

	public void setPromedioGolesAFavorVisita(Double promedioGolesAFavorVisita) {
		this.promedioGolesAFavorVisita = promedioGolesAFavorVisita;
	}

	public Double getPromedioGolesAFavorLocal() {
		return promedioGolesAFavorLocal;
	}

	public void setPromedioGolesAFavorLocal(Double promedioGolesAFavorLocal) {
		this.promedioGolesAFavorLocal = promedioGolesAFavorLocal;
	}

	public Double getPromedioGolesEncontraLocal() {
		return promedioGolesEncontraLocal;
	}

	public void setPromedioGolesEncontraLocal(Double promedioGolesEncontraLocal) {
		this.promedioGolesEncontraLocal = promedioGolesEncontraLocal;
	}

	public Double getPromedioGolesEncontraVisita() {
		return promedioGolesEncontraVisita;
	}

	public void setPromedioGolesEncontraVisita(
			Double promedioGolesEncontraVisita) {
		this.promedioGolesEncontraVisita = promedioGolesEncontraVisita;
	}

	public Double getPromedioPuntosLocal() {
		return promedioPuntosLocal;
	}

	public void setPromedioPuntosLocal(Double promedioPuntosLocal) {
		this.promedioPuntosLocal = promedioPuntosLocal;
	}

	public Double getPromedioPuntosVisita() {
		return promedioPuntosVisita;
	}

	public void setPromedioPuntosVisita(Double promedioPuntosVisita) {
		this.promedioPuntosVisita = promedioPuntosVisita;
	}

	public Double getPromedioPuntosTotales() {
		return promedioPuntosTotales;
	}

	public void setPromedioPuntosTotales(Double promedioPuntosTotales) {
		this.promedioPuntosTotales = promedioPuntosTotales;
	}

	public Boolean getEsBoca() {
		return esBoca;
	}

	public void setEsBoca(Boolean esBoca) {
		this.esBoca = esBoca;
	}

	public Boolean getEsRiver() {
		return esRiver;
	}

	public void setEsRiver(Boolean esRiver) {
		this.esRiver = esRiver;
	}
	
	public Boolean getEsLocal() {
		return esLocal;
	}

	public void setEsLocal(Boolean esLocal) {
		this.esLocal = esLocal;
	}
	
	public void sumarPuntaje (Integer puntaje) {
		this.puntaje += puntaje;
	}


	public void restarPuntaje (Integer puntaje) {
		this.puntaje -= puntaje;
	}
	
	public Integer getPuntaje () {
		return this.puntaje;
	}
	
	public void setPuntaje (Integer puntaje) {
		this.puntaje = puntaje;
	}
	
}
