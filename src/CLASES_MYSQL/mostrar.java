/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES_MYSQL;
// import Connections.Conexion;
import java.sql.ResultSet;
// import javax.servlet.jsp.jstl.sql.Result;
// import javax.servlet.jsp.jstl.sql.ResultSupport;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author across-87
 */
public class mostrar {
    CLASES_MYSQL.conexionMySQL bd = new CLASES_MYSQL.conexionMySQL();
    //el famoso alias alusivo a la conexion
    int i=0;
    int j=0;
    public ResultSet showResult;
    //variable i para el control de ciclo while	
    public void mostrar_datos(){	
        try{	
            bd.conectarBaseDeDatos();
            bd.resultado = bd.sentencia.executeQuery("SELECT * FROM alumnos");	
            //seleccionamos todos de la tabla alumnos	
            if(bd.resultado != null){
                //si la consulta no biene vacia	
                // clases.conexionMySQL db = new clases.conexionMySQL();
                /*db.conectarBaseDeDatos();	
                db.resultado = db.sentencia.executeQuery("SELECT count(*) as id FROM alumnos"); 
                showResult = db.resultado;*/
                Object[][] Campos = new Object[][]{
                };
                String[] Titulos = new String[] {
                "Id", "Nombres", "Apellidos", "Edad", "Direccion"
                };
                DefaultTableModel Grid = new DefaultTableModel(Campos,Titulos);
                for(i=0; bd.resultado.next(); i++){
                    Grid.addRow(new Object[]{bd.resultado.getString("id"),bd.resultado.getString("nombres"),bd.resultado.getString("apellidos"),bd.resultado.getString("edad"),bd.resultado.getString("direccion")});      
                }
                for(j=0; j<4; j++ ){
                    Grid.addRow(new Object[]{null,null,null,null,null});
                }
                CRUD_MYSQL_GUI.inicio.Mitabla.setModel(Grid);
                /*while(bd.resultado.next()){       
                bd.resultado.getString("id");
                proyecto_conexion.inicio.Mitabla.setValueAt(""+bd.resultado.getString("nombres"),i,1);
                proyecto_conexion.inicio.Mitabla.setValueAt(""+bd.resultado.getString("apellidos"),i,2);
                proyecto_conexion.inicio.Mitabla.setValueAt(""+bd.resultado.getString("edad"),i,3);	
                proyecto_conexion.inicio.Mitabla.setValueAt(""+bd.resultado.getString("direccion"),i,4);
                // }
                //i=i+1;	
                }*/
                //  Remover una fila
                // Grid.removeRow(Grid.getRowCount()-1);
            }	
        }catch(Exception e){}	
    }   // close funtion
 }    //close class