package controladores;

import entidades.Producto;
import modelos.ProductoModelo;

import java.util.List;

public class ProductoControlador {
    ProductoModelo productoModelo = new ProductoModelo();

    public void crearNuevo(Producto nuevoProducto){
        productoModelo.guardarNuevoProducto(nuevoProducto);
    }

    public void borrarProductoDeBaseDatos(int id){
        Producto existeElId = productoModelo.conSeguirUnoPorId(id);
        if(existeElId != null){
            productoModelo.eliminarUnoPorId(id);
        }else{
            System.out.println("No se encontro Id para eliminar");
        }
    }

    public void conseguirTodos(){
        StringBuilder mensajeSalida = new StringBuilder();
        List<Producto> productos = productoModelo.conSeguirTodos();
        productos.forEach(producto -> mensajeSalida.append( producto.toString() + "\n"));
        System.out.println(mensajeSalida.toString());
    }

    public Producto conseguirUnoPorId(int id){
        Producto producto = productoModelo.conSeguirUnoPorId(id);
        if(producto != null){
            System.out.println(producto.toString());
            return producto;
        }else{
            System.out.println("No se encontro Id para eliminar");
            return null;
        }

    }

    public void eliminarunoPorId(int id){
        this.conseguirUnoPorId(id);
        productoModelo.eliminarUnoPorId(id);
    }

    public void actualizar(Producto updateProducto, int id){
        Producto searchedProducto = this.conseguirUnoPorId(id);
        updateProducto.setIdproducto(id);
        if (searchedProducto != null){
            productoModelo.actualizarUno(updateProducto);
        }
    }
}
