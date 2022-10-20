package com.nttdata.mvn;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;


/**
 * Prueba de inyección de dependencias con maven
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String mensaje = "Introduce un texto. Si introduces un texto tendrás 10 años de buena suerte. No dejes el texto sin introducir u ocurrirá una desgracia de nefastas consecuencias";
    	String msjVacio = "No has introducido nada, te has portado mal. Acabamos de informar telepáticamente a Papá Noel y los Reyes Magos";
		String msjLleno = "¡¡Aprovecha tus 10 años de buena suerte!!";
    	String datos = JOptionPane.showInputDialog(null, mensaje);
		
		//Uso de la clase StringUtils de la librería commons lang importada con maven
		if(StringUtils.isEmpty(datos)) {
			JOptionPane.showMessageDialog(null, msjVacio);
		}else JOptionPane.showMessageDialog(null, msjLleno);
    }
}
