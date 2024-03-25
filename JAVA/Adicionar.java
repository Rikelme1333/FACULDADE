package com.mycompany.POO;

import javax.swing.JOptionPane;

public class Adicionar {

	public static void main(String[] args) {
		String firstnumber; //primeiro numero
		String secondnumber;// segundo numero
		int number1; 
		int number2;
		int soma;
		
		firstnumber = JOptionPane.showInputDialog("Insira o primeiro numero: ","Numero 1");
		secondnumber = JOptionPane.showInputDialog("Insira o segundo numero: ","Numero 2");
		
		number1 = Integer.parseInt(firstnumber); //converte caixa 1 para inteiro 
		number2 = Integer.parseInt(secondnumber); // converte caixa 2 para inteiro 
		
		//soma
		soma = number1 + number2; 
		//resultado
		JOptionPane.showMessageDialog(null, "A soma e: " + soma, "Resultado", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}
}
