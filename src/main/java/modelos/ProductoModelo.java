package modelos;


import database.Conexion;
import entidades.Producto;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoModelo {

    public boolean guardarNuevoProducto(Producto newProoducto) {
        Conexion conexion = new Conexion();
        conexion.openConexion();
        String query = "INSERT INTO producto (nombre, clasificacion, cantidaDisponibles, localizacion, precio,idComercializacion) VALUES (?,?,?,?,?,?);";
        try {
            conexion.pstm = conexion.dbConnection.prepareStatement(query);
            conexion.pstm.setString(1, newProoducto.getNombrePoducto());
            conexion.pstm.setString(2, newProoducto.getClasificaacion());
            conexion.pstm.setDouble(3, newProoducto.getCantidaDisponible());
            conexion.pstm.setString(4, newProoducto.getLocalizacion());
            conexion.pstm.setDouble(5, newProoducto.getPrecio());
            conexion.pstm.setInt(6, newProoducto.getIdUnidComercializacion());
            int lineasInsertadas = conexion.pstm.executeUpdate();
            if (lineasInsertadas > 0) {
                System.out.println("Producto Creado");
                conexion.closeConexion();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Producto> conSeguirTodos() {
        Conexion conexion = new Conexion();
        conexion.openConexion();
        List<Producto> listAll = new ArrayList<>();
        try {
            String query = "Select * from producto";
            conexion.pstm = conexion.dbConnection.prepareStatement(query);
            ResultSet resp = conexion.pstm.executeQuery();
            while (resp.next()){
                Producto objTemp = new Producto();
                objTemp.setIdproducto(resp.getInt("Idproducto"));
                objTemp.setNombrePoducto(resp.getString("nombre"));
                objTemp.setCantidaDisponible(resp.getDouble("cantidaDisponibles"));
                objTemp.setClasificaacion(resp.getString("clasificacion"));
                objTemp.setLocalizacion(resp.getString("localizacion"));
                objTemp.setPrecio(resp.getDouble("precio"));
                objTemp.setIdproducto(resp.getInt("idComercializacion"));
                listAll.add(objTemp);
            }
            conexion.closeConexion();
            return listAll;
        }catch (Exception e){
            System.out.println("Error getting all Clients" + e.getMessage());
            return null;
        }
    }

    public Producto conSeguirUnoPorId(int id) {
        Conexion conexion = new Conexion();
        conexion.openConexion();
        Producto producto= new Producto();
        System.out.println(id);
        try {
            String query = "Select * from producto WHERE Idproducto = ?";
            conexion.pstm = conexion.dbConnection.prepareStatement(query);
            conexion.pstm.setInt(1, id);
            ResultSet resp = conexion.pstm.executeQuery();
            while (resp.next()){
                Producto objTemp = new Producto();
                objTemp.setIdproducto(resp.getInt("Idproducto"));
                objTemp.setNombrePoducto(resp.getString("nombre"));
                objTemp.setCantidaDisponible(resp.getDouble("cantidaDisponibles"));
                objTemp.setClasificaacion(resp.getString("clasificacion"));
                objTemp.setLocalizacion(resp.getString("localizacion"));
                objTemp.setPrecio(resp.getDouble("precio"));
                objTemp.setIdUnidComercializacion(resp.getInt("idComercializacion"));
                producto = objTemp;
            }
            conexion.closeConexion();
            return producto;
        }catch (Exception e){
            System.out.println("Error consiguiendo todos los productos" + e.getMessage());
            return null;
        }
    }

    public boolean actualizarUno(Producto updateProducto){
        Conexion conexion = new Conexion();
        conexion.openConexion();
        System.out.println(updateProducto.toString());
        try{
            String query = "UPDATE producto SET nombre = ?, clasificacion = ?,cantidaDisponibles =?, localizacion = ?, precio =?, idComercializacion = ? WHERE Idproducto = ?;";
            conexion.pstm= conexion.dbConnection.prepareStatement(query);
            conexion.pstm.setString(1, updateProducto.getNombrePoducto());
            conexion.pstm.setString(2, updateProducto.getClasificaacion());
            conexion.pstm.setDouble(3, updateProducto.getCantidaDisponible());
            conexion.pstm.setString(4, updateProducto.getLocalizacion());
            conexion.pstm.setDouble(5, updateProducto.getPrecio());
            conexion.pstm.setInt(   6,updateProducto.getIdUnidComercializacion());
            conexion.pstm.setInt(   7,updateProducto.getIdproducto());
            int lineasInsertadas = conexion.pstm.executeUpdate();
            if (lineasInsertadas > 0) {
                System.out.println("Producto Creado");
                conexion.closeConexion();
                return true;
            } else {
                System.out.println(lineasInsertadas);
                System.out.println("No se creo");
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    };

    public boolean eliminarUnoPorId(int id){
        Conexion conexion = new Conexion();
        conexion.openConexion();
        try{

            String query = "DELETE FROM producto WHERE Idproducto = ?;";
            conexion.pstm= conexion.dbConnection.prepareStatement(query);
            conexion.pstm.setInt(1,id);

            int lineasInsertadas = conexion.pstm.executeUpdate();
            if (lineasInsertadas > 0) {
                System.out.println("Producto Eliminado");
                conexion.closeConexion();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    };

}
