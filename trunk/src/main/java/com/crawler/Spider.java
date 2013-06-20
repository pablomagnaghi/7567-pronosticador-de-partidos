package com.crawler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider {

	public static final Pattern obtenerFecha = Pattern.compile ("<h3>(.*?)</table>\\s*(?=<h[23]>|<!--)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	public static final Pattern obtenerPartidos = Pattern.compile ("<table[^>]*>(.*?)(?:</table>|$)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	public static final Pattern obtenerInfoPartido = Pattern.compile ("^\\s*<tr[^>]*>(.*?)<th[^>]*>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	public static final Pattern obtenerResultados = Pattern.compile ("<a\\s*href[^>]*>([^<]*)(?:<[^>]*>\\s*)+(\\d+:\\d+)\\s*.*?<a\\s*href[^>]*>([^<]*)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);

	private DataHandler handler = new DataHandler();

	public void readNewData(String fileName) {
		try {
			String html = loadPage(fileName);
			List<String> fechas = extractSetOfData(html, obtenerFecha);
			int i = 1;
			for (String fecha : fechas) {
				System.out.println(i);
				List<String> partidos = extractSetOfData(fecha, obtenerPartidos);
				int j = 1;
				for (String partido : partidos) {
					System.out.print(j + " - ");
					String infoImportante = getFirstGroup(partido, obtenerInfoPartido);
					Matcher m = obtenerResultados.matcher(infoImportante);
					if (m.find()){
						String equipoA = m.group(1);
						String goles = m.group(2);
						String equipoB = m.group(3);
						String golesEquipoA = goles.split(":")[0];
						String golesEquipoB = goles.split(":")[1];
						getHandler().addNewResult(equipoA, equipoB, new Integer(golesEquipoA.trim()), new Integer(golesEquipoB.trim()));
					}
					j++;
				}
				System.out.println();
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private List<String> extractSetOfData(String html, Pattern p) {
		List<String> fechas = new ArrayList<String>();
		Matcher m = p.matcher(html);
		while (m.find()){
			fechas.add(m.group(1));
		}
		return fechas;
	}

	private String getFirstGroup(String input, Pattern p){
		Matcher m = p.matcher(input);
		if (m.find()){
			return m.group(1);
		}
		return "";
	}

	private String loadPage(String fileName) throws IOException{
		BufferedReader reader = new BufferedReader( new FileReader (fileName));
		String         line = null;
		StringBuilder  stringBuilder = new StringBuilder();
		String         ls = System.getProperty("line.separator");
		while( ( line = reader.readLine() ) != null ) {
			stringBuilder.append( line );
			stringBuilder.append( ls );
		}
		return stringBuilder.toString();
	}

	public DataHandler getHandler() {
		return handler;
	}

	public void setHandler(DataHandler handler) {
		this.handler = handler;
	}

}
