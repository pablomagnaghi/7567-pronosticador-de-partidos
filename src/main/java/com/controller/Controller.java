package com.controller;

import com.crawler.Constants;
import com.crawler.Spider;
import com.view.ResultView;
import com.view.StartView;

import com.drools.Evaluator;

public class Controller {
	
	private StartView vistaInicio;
	private Spider spider;
	private Integer currentFile = 1;
	
	public Controller(StartView inicioView) {
		this.vistaInicio = inicioView;
		this.spider = new Spider();
		this.spider.readNewData(Constants.ARCHIVO_1);
	}

	public void handleButtonVerResultado() {
		String local = String.valueOf(this.vistaInicio.getComboBox().getSelectedItem());
		String visita = String.valueOf(this.vistaInicio.getComboBox_1().getSelectedItem());
		if (local.equals(visita)){
			System.out.println("Son iguales");
		} else {			
			// ACA SE SACA INFORMACION DE DROOLS!!
			String result = Evaluator.evaluate(this.spider.getHandler().getEquipos().get(local),this.spider.getHandler().getEquipos().get(visita));
			ResultView resultView = new ResultView(local, visita, result);
			resultView.display();
		}
	}

	public void handleButtonRecargar() {
		if (currentFile < 4){
			if (currentFile == 1){
				this.spider.readNewData(Constants.ARCHIVO_2);
			} else if (currentFile == 2){
				this.spider.readNewData(Constants.ARCHIVO_3);
			} else {
				this.spider.readNewData(Constants.ARCHIVO_4);
			}
			currentFile++;
		} else {
			System.out.println("No hay mas archivos");
		}
	}

}
