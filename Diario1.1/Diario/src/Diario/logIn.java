package Diario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
//import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;


public class logIn implements ActionListener{
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JTextPane textPane;
	private JTextArea textArea;
	
	public logIn() {
		frame= new JFrame();
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 200, 50));
		frame.setBounds(0, 0, 800, 800);// Creacion de la ventana
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("              Mi Diario");
		lblNewLabel.setBounds(281, 149, 121, 27);
		frame.getContentPane().add(lblNewLabel);
	
		//panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 200, 50));//x y ancho alto
		panel.setLayout(null);
		
		frame.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}



