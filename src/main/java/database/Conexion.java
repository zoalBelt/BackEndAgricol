package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexion {

    public  Connection dbConnection;
    public  PreparedStatement pstm;

    public Conexion() {
        dbConnection = null;
    }
    /**
     * El uso de esta función sera el poder crear la conexión con la BD.
     * */

   public void openConexion(){
        //La conexion a la bas de datos debe comenzar nula
       if(dbConnection ==null){
           String user = "root";
           String password = "";
           String uriLike = "jdbc:mysql://127.0.0.1:3306/bdfinalagricol";

           try{
               dbConnection = DriverManager.getConnection(uriLike, user, password);
               System.out.println("Te has conectado de manera correcta");
           }catch (Exception error){
               System.out.println(error.getMessage());
           }

       }else{
           System.out.println("Ya hay una conexion a base de datos activa");
       }
   }

   public void closeConexion(){

       try {
           //PARA CERRAR UNA CONEXION DEBE ESTAR ABIERTA Y POR LO TANTO NO DEBE SER NULA
           if (dbConnection != null ){
               dbConnection.close();
               System.out.println("Desconectado con Exito");
           }else{
               System.out.println("La conexion aun no se ha establecido");
           }

       }catch (Exception e){
           System.out.println("Error" + e.toString());
       }

   }






}


