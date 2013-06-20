package com.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ResultView extends JFrame {

	private JPanel contentPane;
	private String local;
	private String visitante;
	private String resultado;
	
	public ResultView(String local, String visita, String resultado){
		this.local = local;
		this.visitante = visita;
		this.resultado = resultado;
		initialize();
	}
	
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLocal = new JLabel(this.local);
		lblLocal.setBounds(44, 48, 115, 15);
		contentPane.add(lblLocal);
		
		JLabel lblVisita = new JLabel(this.visitante);
		lblVisita.setBounds(216, 48, 146, 15);
		contentPane.add(lblVisita);
		
		JTextArea textArea = new JTextArea();
		textArea.setText(this.resultado);
		textArea.setEditable(Boolean.FALSE);
		textArea.setBounds(44, 75, 334, 167);
		contentPane.add(textArea);
	}
	
	public void display(){
		this.setVisible(Boolean.TRUE);
	}
}
