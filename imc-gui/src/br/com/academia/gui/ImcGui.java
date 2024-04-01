package br.com.academia.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ImcGui {
	
	public void desenharTela() {
		
		Color cor = new Color(255,165,0);
		Font titulo = new Font("Consolas", Font.BOLD, 28);
		Font fonte = new Font("Consolas",0,28);
		Font fonteBotao = new Font("Consolas",0,14);
		Font fonteNumber = new Font("Consolas",0,56);
		
		JFrame telaPrincipal = new JFrame();
		telaPrincipal.setSize(700,330);
		telaPrincipal.setTitle("Calculadora IMC");
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaPrincipal.getContentPane().setBackground(cor);
		telaPrincipal.setLayout(null);
		
		JLabel tituloImc = new JLabel();
		tituloImc.setBounds(10,10,100,30);
		tituloImc.setFont(titulo);
		tituloImc.setText("IMC");
		telaPrincipal.getContentPane().add(tituloImc);
		
		JLabel subTituloImc = new JLabel();
		subTituloImc.setBounds(10,50,500,30);
		subTituloImc.setFont(fonte);
		subTituloImc.setText("Indice de Massa Corporal");
		telaPrincipal.getContentPane().add(subTituloImc);
		
		// T�tulo do primeiro campo
		
		JLabel tituloCampoPeso = new JLabel();
		tituloCampoPeso.setBounds(10,90,500,30);
		tituloCampoPeso.setFont(fonte);
		tituloCampoPeso.setText("Qual � o seu peso?");
		telaPrincipal.getContentPane().add(tituloCampoPeso);
		
		// Primeiro campo
		
		JTextField campoPeso = new JTextField();
		campoPeso.setBounds(10,120,50,30);
		campoPeso.setHorizontalAlignment(JTextField.RIGHT);
		telaPrincipal.getContentPane().add(campoPeso);
		
		// T�tulo do segundo campo
		
		JLabel tituloCampoAltura = new JLabel();
		tituloCampoAltura.setBounds(10,160,500,30);
		tituloCampoAltura.setFont(fonte);
		tituloCampoAltura.setText("Qual � a sua altura?");
		
		telaPrincipal.getContentPane().add(tituloCampoAltura);
		
		// Segundo campo
		
		JTextField campoAltura = new JTextField();
		campoAltura.setBounds(10,190,50,30);
		campoAltura.setHorizontalAlignment(JTextField.RIGHT);
		telaPrincipal.getContentPane().add(campoAltura);
		
		
		// Bot�o de c�lculo
		
		JButton botaoCalcular = new JButton();
		botaoCalcular.setBounds(10,230,100,30);
		botaoCalcular.setText("Calcular");
		botaoCalcular.setFont(fonteBotao);
		telaPrincipal.getContentPane().add(botaoCalcular);
		
		// N�mero do c�lculo
		
		JLabel numeroResultado = new JLabel();
		numeroResultado.setBounds(500,50,200,200);
		numeroResultado.setText("33");
		numeroResultado.setFont(fonteNumber);
		telaPrincipal.getContentPane().add(numeroResultado);
		
		// Frase sob o t�tulo
		
		JLabel sobNumero = new JLabel();
		sobNumero.setBounds(460,150,1000,100);
		sobNumero.setText("Peso ideal");
		sobNumero.setFont(fonte);
		telaPrincipal.getContentPane().add(sobNumero);
		
		telaPrincipal.setVisible(true);
		
		// *** Ouvintes de eventos ***
		
		botaoCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double weight = Double.parseDouble(campoPeso.getText());
				double height = Double.parseDouble(campoAltura.getText());
				double imc = calcularImc(weight, height);
				
				numeroResultado.setText(String.format("%.1f", imc));
				
				sobNumero.setText(statusImc(imc));
				
			}
		});
		
		campoPeso.addKeyListener(new KeyListener() {
		
			public void keyTyped(KeyEvent e) {
			
				
			}
			
			public void keyReleased(KeyEvent e) {
			
			
			}
			
			public void keyPressed(KeyEvent e) {
			
				//System.out.println(e.getKeyCode());
				//System.out.println(e.getKeyChar());
				
				if (e.getKeyCode() == 10) {
				
					campoAltura.requestFocus();
					
				}
			}
		});
		
		campoAltura.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
				
			}
			
			public void keyReleased(KeyEvent e) {
			
			}
	
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == 10) {
					
					botaoCalcular.requestFocus();
					
				}
			}
		});

		
		
	}	// Fim do m�todo desenhar tela
	
	private double calcularImc(double weight, double height) {
		
		return weight / Math.pow(height, 2);
	}
	
	public String statusImc(double imc) {
		
		if (imc < 30) {
			if (imc < 18.5) {
				return "Abaixo do peso";
			}
			else if (imc < 25) {
				return"Peso ideal (parab�ns)";
			}
			else {
				return "Levemente acima do peso";
			}
		}
		else {
			if (imc > 40) {
				return "Obesidade III (m�rbida)";
			}
			else if (imc > 35) {
				return "Obesiade grau II (severa)";
			}
			
			else {
				return"Obesidade grau I";
			}
		}
	};
	
}	// Fim da classe ImcGui
