package com.nttdata.mvn;

import javax.swing.JOptionPane;

/**
 * Hello world! + Git
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	saludo();
    	
    }
    
    private static void saludo() {
    	
    	String mensaje = "Por favor, introduce tu nombre";
    	String nombre = JOptionPane.showInputDialog(null, mensaje);
    	String saludo = "Hola "+ nombre;
    	
    	JOptionPane.showMessageDialog(null, saludo);
    }
}


