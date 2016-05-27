/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES_MYSQL;
import javax.swing.JOptionPane;
/**
 *
 * @author across-87
 */
public class actualizar {  
    CLASES_MYSQL.conexionMySQL bd = new CLASES_MYSQL.conexionMySQL();
    public void	actualizar_alumno(String elegir_id, String no, String ape, String ed, String dir){	
    //Estas variables vienen delformulario de inicio pronto las declararemos /D	
        try{	
            bd.conectarBaseDeDatos();		
            bd.sentencia.execute("UPDATE alumnos "
                + "SET nombres='"+no+"',apellidos='"+ape+"',edad='"+ed+"',direccion='"+dir+"' WHERE	id= '"+elegir_id+"'");	
            //hey!! Actualiza los datos donde id sea igual a elegir_id (H)	
            JOptionPane.showMessageDialog(null,"Los Datos Del Alumno Fueron Actualizados Correctamente",".::MENSAJE::.",JOptionPane.INFORMATION_MESSAGE);	
        }catch (Exception e){}	
            mostrar muestro = new mostrar();
            muestro.mostrar_datos();
    }
}