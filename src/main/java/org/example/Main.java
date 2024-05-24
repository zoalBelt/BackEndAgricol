package org.example;

import controladores.ProductoControlador;
import database.Conexion;
import entidades.Producto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductoControlador productoControlador = new ProductoControlador();

        Producto producto = new Producto();
        producto.setPrecio(200);
        producto.setLocalizacion("Medellin");
        producto.setIdUnidComercializacion(1);
        producto.setCantidaDisponible(10);
        producto.setNombrePoducto("Producto Prueba");
        producto.setClasificaacion("Clasificacion Prueba");

        Producto prducto2 = new  Producto("Prueba2", "Clasificacion2", 10, "medellin", 12.21, 1);

        productoControlador.crearNuevo(producto);
        productoControlador.crearNuevo(prducto2);

    }
}