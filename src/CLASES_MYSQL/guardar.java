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
public class guardar {
    CLASES_MYSQL.conexionMySQL bd = new CLASES_MYSQL.conexionMySQL();//se declara un alias bd que es igual que decir conexionMySQL	
        public void registrar_alumno(String id, String nombres, String apellidos, String edad, String direccion){	
            //aqui se halan las variables declaradas en el formulario de inicio que traen los valores de las cajas de texto	
            try{		
                bd.conectarBaseDeDatos();
                //conectamos	
                bd.sentencia.execute("insert into alumnos(id,nombres,apellidos,edad,direccion)values ("+id+",'"+nombres+"','"+apellidos+"','"+edad+"','"+direccion+"')");	
                //insertamos los datos 
                JOptionPane.showMessageDialog(null, "El Alumno Fue Registrado Correctamente", ".::MENSAJE::.", JOptionPane.INFORMATION_MESSAGE);	
            }catch(Exception e){}
                mostrar muestro = new mostrar();
                muestro.mostrar_datos();
        }
}//class guardar   