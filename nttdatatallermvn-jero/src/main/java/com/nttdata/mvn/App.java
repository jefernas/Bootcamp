package com.nttdata.mvn;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;


/**
 * Prueba de inyección de dependencias con maven + JavaDoc
 *
 */
public class App 
{
	/** metodo main */
    public static void main( String[] args )
    {
    	/** parámetros */
    	String mensaje = "Introduce un texto. Si introduces un texto tendrás 10 años de buena suerte. No dejes el texto sin introducir u ocurrirá una desgracia de nefastas consecuencias";
    	String msjVacio = "No has introducido nada, te has portado mal. Acabamos de informar telepáticamente a Papá Noel y los Reyes Magos";
		String msjLleno = "¡¡Aprovecha tus 10 años de buena suerte!!";
    	String datos = JOptionPane.showInputDialog(null, mensaje);
		
		/** Uso de la clase StringUtils de la librería commons lang importada con maven */
    	/*Detecta con la función .isNoneBlank de la clase StringUtils si el texto (no) introducido está en blanco, es nulo o ha introducido un espacio
    	*y muestra un mensaje en consecuencia*/
		if(!StringUtils.isNoneBlank(datos)) {
			JOptionPane.showMessageDialog(null, msjVacio);
		}else JOptionPane.showMessageDialog(null, msjLleno);
    }
}
