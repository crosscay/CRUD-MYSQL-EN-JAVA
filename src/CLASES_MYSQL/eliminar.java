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
public class eliminar {
    CLASES_MYSQL.conexionMySQL bd = new CLASES_MYSQL.conexionMySQL();  
    //De nuevo el alias a la conexion obvio hay que llamarla para conectar #D
    public void eliminar_alumno(String ide){	
        try{	
            bd.conectarBaseDeDatos();	
            bd.sentencia.execute("Delete From alumnos WHERE	id=('"+ide+"')");	
            //ejecutamos un simple SQL borrando de la tabla alumno donde la ide sea igual a la ide	
            JOptionPane.showMessageDialog(null,"El Alumno Fue Eliminado Correctamente",".::MENSAJE::.",JOptionPane.INFORMATION_MESSAGE);
        }catch	(Exception e){}	
            mostrar muestro = new mostrar();
            muestro.mostrar_datos();
    }	
}