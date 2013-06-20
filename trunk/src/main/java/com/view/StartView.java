package com.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.controller.Controller;
import com.crawler.Constants;

public class StartView {

	private JFrame frame;
	private Controller controller;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartView window = new StartView();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartView() {
		this.setController(new Controller(this));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(200, 200, 450, 450);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblFallasI = new JLabel("Fallas I - Tp Final");
		lblFallasI.setBounds(140, 12, 162, 15);
		getFrame().getContentPane().add(lblFallasI);
		
		setComboBox(new JComboBox());
		getComboBox().setModel(new javax.swing.DefaultComboBoxModel(Constants.equipos));
		getComboBox().setBounds(25, 74, 153, 33);
		getFrame().getContentPane().add(getComboBox());
		
		setComboBox_1(new JComboBox());
		getComboBox_1().setModel(new javax.swing.DefaultComboBoxModel(Constants.equipos));
		getComboBox_1().setBounds(231, 74, 153, 33);
		getFrame().getContentPane().add(getComboBox_1());
		
		JLabel lblEquipoLocal = new JLabel("Equipo Local");
		lblEquipoLocal.setBounds(42, 51, 105, 25);
		getFrame().getContentPane().add(lblEquipoLocal);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setBounds(244, 43, 126, 40);
		getFrame().getContentPane().add(lblEquipoVisitante);
		
		JButton btnVerResultado = new JButton("Ver Resultado");
		btnVerResultado.setBounds(139, 174, 141, 40);
		btnVerResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getController().handleButtonVerResultado();
			}
		});
		getFrame().getContentPane().add(btnVerResultado);
		
		JButton btnRecargarData = new JButton("Recargar Data");
		btnRecargarData.setBounds(25, 375, 152, 40);
		btnRecargarData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getController().handleButtonRecargar();
			}
		});
		getFrame().getContentPane().add(btnRecargarData);
		
		JLabel lblVs = new JLabel("vs");
		lblVs.setBounds(196, 83, 70, 15);
		getFrame().getContentPane().add(lblVs);
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
