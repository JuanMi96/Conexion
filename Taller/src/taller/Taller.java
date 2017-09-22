/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiantes
 */
public class Taller {

    
    
    
    public static void main(String[] args) {
 
        Connection conexion;
        
        String url="jdbc:mysql//localhost:3306/javadb";
        String usuario="root";
        String clave="mysql2017";
        
   
        
        try {
            conexion = DriverManager.getConnection(url,usuario,clave);
            System.out.println("por fin");
            String cadena="INSERT INTO ejemplo(idEjemplo,dato)Values(1,1)";
            
             Statement sentencia;
        
        sentencia = conexion.createStatement();
        sentencia.execute(cadena);
       
            
        } catch (SQLException ex) {
            System.out.println("no me conecte");
        }
         
        
             
        
    
    
             
             
             
         }
          
          
    }