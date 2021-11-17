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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;



import javax.swing.JEditorPane;
import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Font;

public class diaVentana implements ActionListener {
	private JLabel label;
	private JFrame frame, frame2;
	private JPanel panel, panel2;
	private JTextPane textPane;
	private JTextArea textArea;
	private JLabel d1=new JLabel(), d2=new JLabel(), d3=new JLabel(), d4=new JLabel(), d5=new JLabel(), d6=new JLabel(), d7=new JLabel();
	private JLabel d8=new JLabel(), d9=new JLabel(), d10=new JLabel(), d11=new JLabel(), d12=new JLabel(), d13=new JLabel(), d14=new JLabel();
	private JLabel d15=new JLabel(), d16=new JLabel(), d17=new JLabel(), d18=new JLabel(), d19=new JLabel(), d20=new JLabel(), d21=new JLabel();
	private JLabel d22=new JLabel(), d23=new JLabel(), d24=new JLabel(), d25=new JLabel(), d26=new JLabel(), d27=new JLabel(), d28=new JLabel();
	private JLabel d29=new JLabel(), d30=new JLabel(), d31=new JLabel(), d32=new JLabel(), d33=new JLabel(), d34=new JLabel(), d35=new JLabel();
	private JLabel d36=new JLabel(), d37=new JLabel(), d38=new JLabel(), d39=new JLabel(), d40=new JLabel(), d41=new JLabel(), d42=new JLabel();
	private JLabel lblNewLabel_7=new JLabel();
	
	private JButton b1=new JButton();JButton b2=new JButton();JButton b3=new JButton();JButton b4=new JButton();JButton b5=new JButton();JButton b6=new JButton();JButton b7=new JButton();
	private JButton b8=new JButton();JButton b9=new JButton();JButton b10=new JButton();JButton b11=new JButton();JButton b12=new JButton();JButton b13=new JButton();JButton b14=new JButton();
	private JButton b15=new JButton();JButton b16=new JButton();JButton b17=new JButton();JButton b18=new JButton();JButton b19=new JButton();JButton b20=new JButton();JButton b21=new JButton();
	private JButton b22=new JButton();JButton b23=new JButton();JButton b24=new JButton();JButton b25=new JButton();JButton b26=new JButton();JButton b27=new JButton();JButton b28=new JButton();
	private JButton b29=new JButton();JButton b30=new JButton();JButton b31=new JButton();JButton b32=new JButton();JButton b33=new JButton();JButton b34=new JButton();JButton b35=new JButton();
	private JButton b36=new JButton();JButton b37=new JButton();JButton b38=new JButton();JButton b39=new JButton();JButton b40=new JButton();JButton b41=new JButton();JButton b42=new JButton();
	private JButton cvdp=new JButton(); //cvdp cambio ventana dia principal 
	int mescambio=0, mesactualaux, anioactualaux;
	String mesactual, archivotexto, txt;
	private int adias[]= new int [43];
	public diaVentana() {
		DateTimeFormatter imes = DateTimeFormatter.ofPattern("M"); //imes = import mes
		String mesactual;
		mesactual=imes.format(LocalDateTime.now());
		mesactualaux = Integer.parseInt(mesactual);
		DateTimeFormatter anio = DateTimeFormatter.ofPattern("u");
		String anioactual;
		anioactual=anio.format(LocalDateTime.now());
		anioactualaux= Integer.parseInt(anioactual);
		frame= new JFrame();
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 200, 50));
		frame.setBounds(0, 0, 800, 600);// Creacion de la ventana
		frame.getContentPane().setLayout(null);
		frame.setTitle("Mi diario");
		JLabel lblNewLabel = new JLabel("    LUNES"); lblNewLabel.setBounds(80, 100, 60, 20); frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("MARTES"); lblNewLabel_1.setBounds(170, 100, 60, 20); frame.getContentPane().add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("MIERCOLES"); lblNewLabel_2.setBounds(260, 100, 70, 20); frame.getContentPane().add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel("   JUEVES"); lblNewLabel_3.setBounds(350, 100, 60, 20); frame.getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("VIERNES"); lblNewLabel_4.setBounds(440, 100, 60, 20); frame.getContentPane().add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("SABADO"); lblNewLabel_5.setBounds(530, 100, 60, 20); frame.getContentPane().add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("DOMINGO"); lblNewLabel_6.setBounds(620, 100, 60, 20); frame.getContentPane().add(lblNewLabel_6);
		
		tabla(mesactualaux, mescambio);
		JButton atras = new JButton("Atras");
		
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesactualaux--;
				mescambio=-1;
				if(mesactualaux==0) {
					mesactualaux=12;
					anioactualaux--;
				}
				tabla(mesactualaux, mescambio);
				
			}
		});
		atras.setBounds(0, 254, 65, 23);
		frame.getContentPane().add(atras);
	    
		JButton adelante = new JButton("Adelante");
		adelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesactualaux++;
				mescambio++;
				if(mesactualaux==13) {
					mesactualaux=1;
					anioactualaux++;
				}
				tabla(mesactualaux, mescambio);
			}
		});
		adelante.setBounds(700, 254, 85, 23);
		frame.getContentPane().add(adelante);
	    
		//panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 200, 50));//x y ancho alto
		
		panel.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void tabla(int mesactualaux, int mescambio) {
		
		mesactual=String.valueOf(mesactualaux);
		
		if(Integer.parseInt(mesactual)==1) mesactual="Enero";
		else if(Integer.parseInt(mesactual)==2) mesactual="Febrero";
			else if(Integer.parseInt(mesactual)==3) mesactual="Marzo";
				else if(Integer.parseInt(mesactual)==4) mesactual="Abril";
					else if(Integer.parseInt(mesactual)==5) mesactual="Mayo";
						else if(Integer.parseInt(mesactual)==6) mesactual="Junio";
							else if(Integer.parseInt(mesactual)==7) mesactual="Julio";
								else if(Integer.parseInt(mesactual)==8) mesactual="Agosto";
									else if(Integer.parseInt(mesactual)==9) mesactual="Septiembre";
										else if(Integer.parseInt(mesactual)==10) mesactual="Octubre";
											else if(Integer.parseInt(mesactual)==11) mesactual="Noviembre";
												else if(Integer.parseInt(mesactual)==12) mesactual="Diciembre";
																	
		mesactual=mesactual.toUpperCase();
		

		lblNewLabel_7.setText(""+mesactual+" "+anioactualaux);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_7.setBounds(290, 23, 300, 59);
		frame.getContentPane().add(lblNewLabel_7);
		int i, cap=42;
		
		d1.setBounds(110, 150, 46, 14); frame.getContentPane().add(d1);
		d2.setBounds(190, 150, 46, 14); frame.getContentPane().add(d2);
		d3.setBounds(290, 150, 46, 14); frame.getContentPane().add(d3);
		d4.setBounds(380, 150, 46, 14); frame.getContentPane().add(d4);
		d5.setBounds(470, 150, 46, 14); frame.getContentPane().add(d5);
		d6.setBounds(560, 150, 46, 14); frame.getContentPane().add(d6);
		d7.setBounds(650, 150, 46, 14); frame.getContentPane().add(d7);
		d8.setBounds(110, 220, 46, 14); frame.getContentPane().add(d8);
		d9.setBounds(190, 220, 46, 14); frame.getContentPane().add(d9);
		d10.setBounds(290, 220, 46, 14); frame.getContentPane().add(d10);
		d11.setBounds(380, 220, 46, 14); frame.getContentPane().add(d11);
		d12.setBounds(470, 220, 46, 14); frame.getContentPane().add(d12);
		d13.setBounds(560, 220, 46, 14); frame.getContentPane().add(d13);
		d14.setBounds(650, 220, 46, 14); frame.getContentPane().add(d14);
		d15.setBounds(110, 290, 46, 14); frame.getContentPane().add(d15);
		d16.setBounds(190, 290, 46, 14); frame.getContentPane().add(d16);
		d17.setBounds(290, 290, 46, 14); frame.getContentPane().add(d17);
		d18.setBounds(380, 290, 46, 14); frame.getContentPane().add(d18);
		d19.setBounds(470, 290, 46, 14); frame.getContentPane().add(d19);
		d20.setBounds(560, 290, 46, 14); frame.getContentPane().add(d20);
		d21.setBounds(650, 290, 46, 14); frame.getContentPane().add(d21);
		d22.setBounds(110, 360, 46, 14); frame.getContentPane().add(d22);
		d23.setBounds(190, 360, 46, 14); frame.getContentPane().add(d23);
		d24.setBounds(290, 360, 46, 14); frame.getContentPane().add(d24);
		d25.setBounds(380, 360, 46, 14); frame.getContentPane().add(d25);
		d26.setBounds(470, 360, 46, 14); frame.getContentPane().add(d26);
		d27.setBounds(560, 360, 46, 14); frame.getContentPane().add(d27);
		d28.setBounds(650, 360, 46, 14); frame.getContentPane().add(d28);
		d29.setBounds(110, 430, 46, 14); frame.getContentPane().add(d29);
		d30.setBounds(190, 430, 46, 14); frame.getContentPane().add(d30);
		d31.setBounds(290, 430, 46, 14); frame.getContentPane().add(d31);
		d32.setBounds(380, 430, 46, 14); frame.getContentPane().add(d32);
		d33.setBounds(470, 430, 46, 14); frame.getContentPane().add(d33);
		d34.setBounds(560, 430, 46, 14); frame.getContentPane().add(d34);
		d35.setBounds(650, 430, 46, 14); frame.getContentPane().add(d35);
		d36.setBounds(110, 500, 46, 14); frame.getContentPane().add(d36);
		d37.setBounds(190, 500, 46, 14); frame.getContentPane().add(d37);
		d38.setBounds(290, 500, 46, 14); frame.getContentPane().add(d38);
		d39.setBounds(380, 500, 46, 14); frame.getContentPane().add(d39);
		d40.setBounds(470, 500, 46, 14); frame.getContentPane().add(d40);
		d41.setBounds(560, 500, 46, 14); frame.getContentPane().add(d41);
		d42.setBounds(650, 500, 46, 14); frame.getContentPane().add(d42);
		
		int numeromes[] = new int[13];
		numeromes[1]=31;numeromes[2]=28;numeromes[3]=31;numeromes[4]=30;numeromes[5]=31;numeromes[6]=30;numeromes[7]=31;numeromes[8]=31;numeromes[9]=30;numeromes[10]=31;numeromes[11]=30;numeromes[12]=31;
		
		DateTimeFormatter idia = DateTimeFormatter.ofPattern("d"); DateTimeFormatter dsem = DateTimeFormatter.ofPattern("e");
		
		String diaactual, diadesem;
		diaactual=idia.format(LocalDateTime.now());
		
		
		
		int dsemi, diaactuali, diaactualaux;
		
		diaactuali= Integer.parseInt(diaactual);
		LocalDateTime fechauxiliar=LocalDateTime.of(anioactualaux, mesactualaux, diaactuali, 01, 01);
		
		int superaux=fechauxiliar.getDayOfMonth() ;
		diadesem= dsem.format(LocalDateTime.of(anioactualaux, mesactualaux, diaactuali, 01, 01));
		
		dsemi=Integer.parseInt(diadesem);
		diaactuali=superaux;
		
		
		if(dsemi==1) 
			dsemi=7;
		else 
			dsemi--;
		diaactualaux=diaactuali;
		while(diaactualaux>7) 
			diaactualaux=diaactualaux-7;
		
		int dsemiaux, flag=0, caux=1;
		String auxc;
		for(i=1; i<=42; i++) {
			adias[i]=32;
		}
		if(diaactualaux>1) {
			dsemi--;
			diaactualaux--;
		}
		if(dsemi==0) {
			dsemi++;
		}
		
		for(i=1; i<=42; i++) {
			if(i==dsemi) {
				flag=1;
			}
			if(flag==0) {
				adias[i]=32;
				
			}else {
				adias[i]=caux;
				caux++;
			}
			if(caux-1>numeromes[mesactualaux]) {
				adias[i]=32;
			}
			
		}
	
		for(i=1; i<=42; i++) {
			auxc=String.valueOf(adias[i]);
			if(Integer.parseInt(auxc)==32) {
				auxc="";
			}
			if(i==1) d1.setText(auxc);
			else {if(i==2) d2.setText(auxc);
				else if(i==3) d3.setText(auxc);
					else if(i==4) d4.setText(auxc);
						else if(i==5) d5.setText(auxc);
							else if(i==6) d6.setText(auxc);
								else if(i==7) d7.setText(auxc);
									else if(i==8) d8.setText(auxc);
										else if(i==9) d9.setText(auxc);
											else if(i==10) d10.setText(auxc);
												else if(i==11) d11.setText(auxc);
													else if(i==12) d12.setText(auxc);
														else if(i==13) d13.setText(auxc);
															else if(i==14) d14.setText(auxc);
																else if(i==15) d15.setText(auxc);
																	else if(i==16) d16.setText(auxc);
																		else if(i==17) d17.setText(auxc);
																			else if(i==18) d18.setText(auxc);
																				else if(i==19) d19.setText(auxc);
																					else if(i==20) d20.setText(auxc);
																						else if(i==21) d21.setText(auxc);
																							else if(i==22) d22.setText(auxc);
																								else if(i==23) d23.setText(auxc);
																									else if(i==24) d24.setText(auxc);
																										else if(i==25) d25.setText(auxc);
																											else if(i==26) d26.setText(auxc);
																												else if(i==27) d27.setText(auxc);
																													else if(i==28) d28.setText(auxc);
																														else if(i==29) d29.setText(auxc);
																															else if(i==30) d30.setText(auxc);
																																else if(i==31) d31.setText(auxc);
																																	else if(i==32) d32.setText(auxc);
																																		else if(i==33) d33.setText(auxc);
																																			else if(i==34) d34.setText(auxc);
																																				else if(i==35) d35.setText(auxc);
																																					else if(i==36) d36.setText(auxc);
																																						else if(i==37) d37.setText(auxc);
																																							else if(i==38) d38.setText(auxc);
																																								else if(i==39) d39.setText(auxc);
																																									else if(i==40) d40.setText(auxc);
																																										else if(i==41) d41.setText(auxc);
																																											else if(i==42)d42.setText(auxc);	
			}	
		}
																																													
			botones();																																									
	}
	
	public void botones() {
		b1.setBounds(100, 165, 30, 15); frame.getContentPane().add(b1); b1.setEnabled(false); b1.setVisible(false);
		b2.setBounds(180, 165, 30, 15); frame.getContentPane().add(b2); b2.setEnabled(false); b2.setVisible(false);
		b3.setBounds(280, 165, 30, 15); frame.getContentPane().add(b3); b3.setEnabled(false); b3.setVisible(false);
		b4.setBounds(370, 165, 30, 15); frame.getContentPane().add(b4); b4.setEnabled(false); b4.setVisible(false);
		b5.setBounds(460, 165, 30, 15); frame.getContentPane().add(b5); b5.setEnabled(false); b5.setVisible(false);
		b6.setBounds(550, 165, 30, 15); frame.getContentPane().add(b6); b6.setEnabled(false); b6.setVisible(false);
		b7.setBounds(640, 165, 30, 15); frame.getContentPane().add(b7); b7.setEnabled(false); b7.setVisible(false);
		b8.setBounds(100, 235, 30, 15); frame.getContentPane().add(b8); b8.setEnabled(false); b8.setVisible(false);
		b9.setBounds(180, 235, 30, 15); frame.getContentPane().add(b9); b9.setEnabled(false); b9.setVisible(false);
		b10.setBounds(280, 235, 30, 15); frame.getContentPane().add(b10); b10.setEnabled(false); b10.setVisible(false);
		b11.setBounds(370, 235, 30, 15); frame.getContentPane().add(b11); b11.setEnabled(false); b11.setVisible(false);
		b12.setBounds(460, 235, 30, 15); frame.getContentPane().add(b12); b12.setEnabled(false); b12.setVisible(false);
		b13.setBounds(550, 235, 30, 15); frame.getContentPane().add(b13); b13.setEnabled(false); b13.setVisible(false);
		b14.setBounds(640, 235, 30, 15); frame.getContentPane().add(b14); b14.setEnabled(false); b14.setVisible(false);
		b15.setBounds(100, 305, 30, 15); frame.getContentPane().add(b15); b15.setEnabled(false); b15.setVisible(false);
		b16.setBounds(180, 305, 30, 15); frame.getContentPane().add(b16); b16.setEnabled(false); b16.setVisible(false);
		b17.setBounds(280, 305, 30, 15); frame.getContentPane().add(b17); b17.setEnabled(false); b17.setVisible(false);
		b18.setBounds(370, 305, 30, 15); frame.getContentPane().add(b18); b18.setEnabled(false); b18.setVisible(false);
		b19.setBounds(460, 305, 30, 15); frame.getContentPane().add(b19); b19.setEnabled(false); b19.setVisible(false);
		b20.setBounds(550, 305, 30, 15); frame.getContentPane().add(b20); b20.setEnabled(false); b20.setVisible(false);
		b21.setBounds(640, 305, 30, 15); frame.getContentPane().add(b21); b21.setEnabled(false); b21.setVisible(false);
		b22.setBounds(100, 375, 30, 15); frame.getContentPane().add(b22); b22.setEnabled(false); b22.setVisible(false);
		b23.setBounds(180, 375, 30, 15); frame.getContentPane().add(b23); b23.setEnabled(false); b23.setVisible(false);
		b24.setBounds(280, 375, 30, 15); frame.getContentPane().add(b24); b24.setEnabled(false); b24.setVisible(false);
		b25.setBounds(370, 375, 30, 15); frame.getContentPane().add(b25); b25.setEnabled(false); b25.setVisible(false);
		b26.setBounds(460, 375, 30, 15); frame.getContentPane().add(b26); b26.setEnabled(false); b26.setVisible(false);
		b27.setBounds(550, 375, 30, 15); frame.getContentPane().add(b27); b27.setEnabled(false); b27.setVisible(false);
		b28.setBounds(640, 375, 30, 15); frame.getContentPane().add(b28); b28.setEnabled(false); b28.setVisible(false);
		b29.setBounds(100, 445, 30, 15); frame.getContentPane().add(b29); b29.setEnabled(false); b29.setVisible(false);
		b30.setBounds(180, 445, 30, 15); frame.getContentPane().add(b30); b30.setEnabled(false); b30.setVisible(false);
		b31.setBounds(280, 445, 30, 15); frame.getContentPane().add(b31); b31.setEnabled(false); b31.setVisible(false);
		b32.setBounds(370, 445, 30, 15); frame.getContentPane().add(b32); b32.setEnabled(false); b32.setVisible(false);
		b33.setBounds(460, 445, 30, 15); frame.getContentPane().add(b33); b33.setEnabled(false); b33.setVisible(false);
		b34.setBounds(550, 445, 30, 15); frame.getContentPane().add(b34); b34.setEnabled(false); b34.setVisible(false);
		b35.setBounds(640, 445, 30, 15); frame.getContentPane().add(b35); b35.setEnabled(false); b35.setVisible(false);
		b36.setBounds(100, 515, 30, 15); frame.getContentPane().add(b36); b36.setEnabled(false); b36.setVisible(false);
		b37.setBounds(180, 515, 30, 15); frame.getContentPane().add(b37); b37.setEnabled(false); b37.setVisible(false);
		b38.setBounds(280, 515, 30, 15); frame.getContentPane().add(b38); b38.setEnabled(false); b38.setVisible(false);
		b39.setBounds(370, 515, 30, 15); frame.getContentPane().add(b39); b39.setEnabled(false); b39.setVisible(false);
		b40.setBounds(460, 515, 30, 15); frame.getContentPane().add(b40); b40.setEnabled(false); b40.setVisible(false);
		b41.setBounds(550, 515, 30, 15); frame.getContentPane().add(b41); b41.setEnabled(false); b41.setVisible(false);
		b42.setBounds(640, 515, 30, 15); frame.getContentPane().add(b42); b42.setEnabled(false); b42.setVisible(false);
		
		int i;
		String auxc;
		for(i=1; i<=42; i++) {
			auxc=String.valueOf(adias[i]);
			if(i==1 && Integer.parseInt(auxc)!=32){
				b1.setEnabled(true); b1.setVisible(true);
			}else {
				if(i==2 && Integer.parseInt(auxc)!=32){
					b2.setEnabled(true); b2.setVisible(true);
				}else {
					if(i==3 && Integer.parseInt(auxc)!=32){
						b3.setEnabled(true); b3.setVisible(true);
					}else {
						if(i==4 && Integer.parseInt(auxc)!=32){
							b4.setEnabled(true); b4.setVisible(true);
						}else {
							if(i==5 && Integer.parseInt(auxc)!=32){
								b5.setEnabled(true); b5.setVisible(true);
							}else {
								if(i==6 && Integer.parseInt(auxc)!=32){
									b6.setEnabled(true); b6.setVisible(true);
								}else {
									if(i==7 && Integer.parseInt(auxc)!=32){
										b7.setEnabled(true); b7.setVisible(true);
									}else {
										if(i==8 && Integer.parseInt(auxc)!=32){
											b8.setEnabled(true); b8.setVisible(true);
										}else {
											if(i==9 && Integer.parseInt(auxc)!=32){
												b9.setEnabled(true); b9.setVisible(true);
											}else {
												if(i==10 && Integer.parseInt(auxc)!=32){
													b10.setEnabled(true); b10.setVisible(true);
												}else {
													if(i==11 && Integer.parseInt(auxc)!=32){
														b11.setEnabled(true); b11.setVisible(true);
													}else {
														if(i==12 && Integer.parseInt(auxc)!=32){
															b12.setEnabled(true); b12.setVisible(true);
														}else {
															if(i==13 && Integer.parseInt(auxc)!=32){
																b13.setEnabled(true); b13.setVisible(true);
															}else {
																if(i==14 && Integer.parseInt(auxc)!=32){
																	b14.setEnabled(true); b14.setVisible(true);
																}else {
																	if(i==15 && Integer.parseInt(auxc)!=32){
																		b15.setEnabled(true); b15.setVisible(true);
																	}else {
																		if(i==16 && Integer.parseInt(auxc)!=32){
																			b16.setEnabled(true); b16.setVisible(true);
																		}else {
																			if(i==17 && Integer.parseInt(auxc)!=32){
																				b17.setEnabled(true); b17.setVisible(true);
																			}else {
																				if(i==18 && Integer.parseInt(auxc)!=32){
																					b18.setEnabled(true); b18.setVisible(true);
																				}else {
																					if(i==19 && Integer.parseInt(auxc)!=32){
																						b19.setEnabled(true); b19.setVisible(true);
																					}else {
																						if(i==20 && Integer.parseInt(auxc)!=32){
																							b20.setEnabled(true); b20.setVisible(true);
																						}else {
																							if(i==21 && Integer.parseInt(auxc)!=32){
																								b21.setEnabled(true); b21.setVisible(true);
																							}else {
																								if(i==22 && Integer.parseInt(auxc)!=32){
																									b22.setEnabled(true); b22.setVisible(true);
																								}else {
																									if(i==23 && Integer.parseInt(auxc)!=32){
																										b23.setEnabled(true); b23.setVisible(true);
																									}else {
																										if(i==24 && Integer.parseInt(auxc)!=32){
																											b24.setEnabled(true); b24.setVisible(true);
																										}else {
																											if(i==25 && Integer.parseInt(auxc)!=32){
																												b25.setEnabled(true); b25.setVisible(true);
																											}else {
																												if(i==26 && Integer.parseInt(auxc)!=32){
																													b26.setEnabled(true); b26.setVisible(true);
																												}else {
																													if(i==27 && Integer.parseInt(auxc)!=32){
																														b27.setEnabled(true); b27.setVisible(true);
																													}else {
																														if(i==28 && Integer.parseInt(auxc)!=32){
																															b28.setEnabled(true); b28.setVisible(true);
																														}else {
																															if(i==29 && Integer.parseInt(auxc)!=32){
																																b29.setEnabled(true); b29.setVisible(true);
																															}else {
																																if(i==30 && Integer.parseInt(auxc)!=32){
																																	b30.setEnabled(true); b30.setVisible(true);
																																}else {
																																	if(i==31 && Integer.parseInt(auxc)!=32){
																																		b31.setEnabled(true); b31.setVisible(true);
																																	}else {
																																		if(i==32 && Integer.parseInt(auxc)!=32){
																																			b32.setEnabled(true); b32.setVisible(true);
																																		}else {
																																			if(i==33 && Integer.parseInt(auxc)!=32){
																																				b33.setEnabled(true); b33.setVisible(true);
																																			}else {
																																				if(i==34 && Integer.parseInt(auxc)!=32){
																																					b34.setEnabled(true); b34.setVisible(true);
																																				}else {
																																					if(i==35 && Integer.parseInt(auxc)!=32){
																																						b35.setEnabled(true); b35.setVisible(true);
																																					}else {
																																						if(i==36 && Integer.parseInt(auxc)!=32){
																																							b36.setEnabled(true); b36.setVisible(true);
																																						}else {
																																							if(i==37 && Integer.parseInt(auxc)!=32){
																																								b37.setEnabled(true); b37.setVisible(true);
																																							}else {
																																								if(i==38 && Integer.parseInt(auxc)!=32){
																																									b38.setEnabled(true); b38.setVisible(true);
																																								}else {
																																									
																																								}if(i==39 && Integer.parseInt(auxc)!=32){
																																									b39.setEnabled(true); b39.setVisible(true);
																																								}else {
																																									if(i==40 && Integer.parseInt(auxc)!=32){
																																										b40.setEnabled(true); b40.setVisible(true);
																																									}else {
																																										if(i==41 && Integer.parseInt(auxc)!=32){
																																											b41.setEnabled(true); b41.setVisible(true);
																																										}else {
																																											if(i==42 && Integer.parseInt(auxc)!=32){
																																												b42.setEnabled(true); b42.setVisible(true);
																																											}else {
																																												
																																											}	
																																										}	
																																									}	
																																								}	
																																							}	
																																						}	
																																					}	
																																				}	
																																			}	
																																		}	
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}	
																				}	
																			}	
																		}	
																	}	
																}	
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(1);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(2);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(3);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(4);
			}
		});
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(5);
			}
		});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(6);
			}
		});
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(7);
			}
		});
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(8);
			}
		});
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(9);
			}
		});
		
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(10);
			}
		});
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(11);
			}
		});

		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(12);
			}
		});

		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(13);
			}
		});

		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(14);
			}
		});

		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(15);
			}
		});

		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(16);
			}
		});

		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(17);
			}
		});

		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(18);
			}
		});

		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(19);
			}
		});

		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(20);
			}
		});

		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(21);
			}
		});

		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(22);
			}
		});

		b23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(23);
			}
		});

		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(24);
			}
		});

		b25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(25);
			}
		});

		b26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(26);
			}
		});

		b27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(27);
			}
		});

		b28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(28);
			}
		});

		b29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(29);
			}
		});

		b30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(30);
			}
		});
		

		b31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(31);
			}
		});
		

		b32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(32);
			}
		});
		

		b33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(33);
			}
		});
		

		b34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(34);
			}
		});
		

		b35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(35);
			}
		});

		b36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(36);
			}
		});
		

		b37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(37);
			}
		});
		

		b38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(38);
			}
		});
		
		b39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(39);
			}
		});

		b40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(40);
			}
		});

		b41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(41);
			}
		});
		

		b42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indiatabla(42);
			}
		});
		
		
	}
	
	public void indiatabla(int a) {
		
		frame.setVisible(false);
		int bandera;
		//escribirArchivo(a);
		bandera=leerArchivo(a);
		String auxdia, auxanio;
		frame2= new JFrame();
		panel2 = new JPanel();
		
		panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 200, 50));
		frame2.setBounds(0, 0, 800, 600);// Creacion de la ventana
		frame2.getContentPane().setLayout(null);
		
		auxdia=String.valueOf(adias[a]);
		auxanio=String.valueOf(anioactualaux);
		JLabel vprin= new JLabel();
		JLabel textobandera= new JLabel();
		
		vprin.setText(auxdia+" DE "+mesactual+" DEL "+anioactualaux);
		vprin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		vprin.setBounds(220, 0, 400, 59);
		frame2.getContentPane().add(vprin);
		
		JTextArea texto= new JTextArea();
		JScrollPane scroll=new JScrollPane(texto);
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(200, 80, 400, 400);
		//texto.setBounds(200, 80, 400, 400);
		frame2.getContentPane().add(scroll);
		if(bandera==0) {
			textobandera.setText("Usted no ha escrito nada este día, escriba algo");
			textobandera.setBounds(200, -20, 400, 200);
			frame2.getContentPane().add(textobandera);
			scroll.setBounds(200, 100, 400, 400);
			//texto.setVisible(true);
			frame2.getContentPane().add(scroll);
		}else {
			texto.setText(archivotexto);
		}
		
		cvdp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				frame.setVisible(true);
				
			}
		});
		cvdp.setText("REGRESAR");
		cvdp.setBounds(0, 520, 105, 23);
		frame2.getContentPane().add(cvdp);
		
		JButton gdartexto = new JButton();
		gdartexto.setText("Guardar");
		gdartexto.setBounds(680, 520, 105, 23);
		frame2.getContentPane().add(gdartexto);
		
		gdartexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt=texto.getText();
				try {
					escribirArchivo(a);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		panel2.setLayout(null);
		frame2.setResizable(false);
		frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
	}
	
	int leerArchivo(int a) {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String diaarchivo, texto="";
	    diaarchivo=String.valueOf(adias[a])+String.valueOf(mesactualaux)+String.valueOf(anioactualaux)+".txt";
	    int bandera=0;
	    try {
	    	// Apertura del fichero y creacion de BufferedReader para poder
	        // hacer una lectura comoda (disponer del metodo readLine()).
	        archivo = new File (diaarchivo);
	        
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);

	        // Lectura del fichero

            int c=0;

            while(c!=-1) {
                c=fr.read();

                char letra=(char)c;

                texto+=letra;
            }
           texto=texto.substring(0, texto.length()-1);
           archivotexto=texto;
           bandera=1;
	    }
	    	
	    catch(Exception e){
	    	bandera=0;
	        //e.printStackTrace();
	    }finally{
	        // En el finally cerramos el fichero, para asegurarnos
	        // que se cierra tanto si todo va bien como si salta 
	        // una excepcion.
	    	try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	        }catch (Exception e2){ 
	            e2.printStackTrace();
	        }
	    	
	   }
	   return bandera;
	}
	public void escribirArchivo(int a) throws IOException {
		FileWriter fichero = null;
        PrintWriter pw = null;
        String diaarchivo;
	    diaarchivo=String.valueOf(adias[a])+String.valueOf(mesactualaux)+String.valueOf(anioactualaux)+".txt";
	    System.out.println("Dia archivo: "+diaarchivo);
	    BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(diaarchivo));
            bufferedWriter.write(txt);
            
        } catch (IOException e) {
            System.out.println("Ocurrio una Exception: " + e.getMessage());

        } finally {
            if (bufferedWriter != null)
                bufferedWriter.close();
        }
	    /*try
        {
            fichero = new FileWriter(diaarchivo);
            pw = new PrintWriter(fichero);
            
            while(txt.equalsIgnoreCase("\0")) {
            	
            }
            /*for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);
            //
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }*/
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
