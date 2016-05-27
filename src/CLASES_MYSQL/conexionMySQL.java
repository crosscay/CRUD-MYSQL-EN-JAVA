/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES_MYSQL;
import java.security.Principal;	
import java.sql.Connection;	
import java.sql.DriverManager;	
import java.sql.ResultSet;	
import java.sql.SQLException;
/**
 *
 * @author across-87
 */
import java.sql.Statement;	
public class conexionMySQL {	
    public static Connection conexion;	
    public Statement sentencia;	
    private Principal prin;	
    public ResultSet resultado;
    public void conectarBaseDeDatos(){	
        try {	
            final String CONTROLADOR = "org.gjt.mm.mysql.Driver";	
            //Al igual que en el ejemplo anterior Declaramos que driver vamos a utilizar 
            Class.forName(CONTROLADOR);		
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/db_alumnos","root","");	
            //hacemos la conexion en este caso en localhost por que la bd esta en nuestro pc	
            //especificando usuario y contraseña	
            sentencia = conexion.createStatement();	
            //variable sentencia encargada de las funciones hacia la db	
        }catch(ClassNotFoundException ex1){		
            ex1.printStackTrace();	
            javax.swing.JOptionPane.showMessageDialog(null,"Error Carga	Driver");	
            //encaso de errores referentes a driver error de carga, no encontrarlo etc	
            System.exit(1);	
        }catch(SQLException ex){	
            ex.printStackTrace();	
            javax.swing.JOptionPane.showMessageDialog(null,"Error Creacion Statement");	
            //encaso de no encontrar la bd	
            System.exit(1);	
        }	
    }	
    public void desconectarBaseDeDatos(){	
        // metodo de desconexion	
        try {	
            if (conexion != null) {	
                if(sentencia != null){	
                //si la conexion devuelve valores nulos	
                sentencia.close();	
                }	
                conexion.close();	
            }	
        }catch(SQLException ex){ex.printStackTrace();}	
    }	
}	 