package com.mycompany.POO;
import javax.swing.JOptionPane;

public class IMC {
//esse programa demonstra o calculo do IMC usando o JOptionPane
	public static void main(String[] args) {
		//IMC = Peso / (Altura * Altura) 
		
		String pesoStr; //Variável peso em String 
		String alturaStr; //Variável altura em String
		
		double Peso; //Variável peso em double
		double Altura; //Variável Altura em double
		double IMC;
		
		pesoStr = JOptionPane.showInputDialog("Digite o seu Peso: ");
		alturaStr = JOptionPane.showInputDialog("Digite sua altura: ");
		
		Peso = Double.parseDouble(pesoStr); //converte de String para double
		Altura = Double.parseDouble(alturaStr); //converte de String para double
		
		//Resultado do Calculo
		
		IMC = Peso / (Altura * Altura);
		
		if(IMC >= 30) {
			JOptionPane.showMessageDialog(null, "O Calculo do seu IMC e: " + IMC, "Voce Está Magrinho!", JOptionPane.PLAIN_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"O calculo do seu IMC e: " + IMC, "Voce está Gordinho!", JOptionPane.PLAIN_MESSAGE);
		}
		
	}

}
