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
public class buscar {
    CLASES_MYSQL.conexionMySQL bd = new CLASES_MYSQL.conexionMySQL();//Esta linea es la protagonista de la pelicula xD  
    int i=0;
    public void buscar_alumno(String buscar_id){	
        try{	
            bd.conectarBaseDeDatos();	
            bd.resultado = bd.sentencia.executeQuery("SELECT * FROM alumnos WHERE id = '"+buscar_id+"'");	
            if(bd.resultado != null){		
                //while(bd.resultado.next()){
                for(i=0; bd.resultado.next(); i++){
                    CRUD_MYSQL_GUI.inicio.i.setText(""+bd.resultado.getString("id"));
                    CRUD_MYSQL_GUI.inicio.n.setText(""+bd.resultado.getString("nombres"));	
                    CRUD_MYSQL_GUI.inicio.a.setText(""+bd.resultado.getString("apellidos"));	
                    CRUD_MYSQL_GUI.inicio.e.setText(""+bd.resultado.getString("edad"));	
                    CRUD_MYSQL_GUI.inicio.d.setText(""+bd.resultado.getString("direccion"));	
                }
                if(i==0){
                    JOptionPane.showMessageDialog(null,"Ningun dato Encontrado","Mensaje de Informacion",JOptionPane.PLAIN_MESSAGE);
                } 
            }
        }catch(Exception e){}	
    }	
}