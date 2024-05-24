package entidades;

import java.security.PublicKey;

// clase
public class Producto {
    // declarar Atributos

    private int idproducto;
    private String nombrePoducto;
    private String clasificacion;
    private double cantidaDisponible;
    private String localizacion;
    private double precio;
    private int idUnidComercializacion;


    // declaracion de metoodos get y set

    public Producto() {
    }

    public void Producto(int idproducto, String nombrePoducto, String clasificacion, double cantidaDisponible,
                         String localizacion, int precio, int idUnidComercializacion){

        this.idproducto = idproducto;
        this.nombrePoducto = nombrePoducto;
        this.clasificacion = clasificacion;
        this.cantidaDisponible = cantidaDisponible;
        this.localizacion = localizacion;
        this.precio = precio;
        this.idUnidComercializacion = idUnidComercializacion;
    }
// Declarar los metodos get y set para la clase

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int newIdProducto) {
        this.idproducto = newIdProducto;
    }

    public String getNombrePoducto() {
        return nombrePoducto;
    }

    public void setNombrePoducto(String newNombreProducto) {
        this.nombrePoducto = newNombreProducto;
    }

    public String getClasificaacion() {
        return clasificacion;
    }

    public void setClasificaacion(String newClasificacion) {
        this.clasificacion = newClasificacion;
    }

    public double getCantidaDisponible() {
        return cantidaDisponible;
    }

    public void setCantidaDisponible(double newCantidadDisponible) {
        this.cantidaDisponible = newCantidadDisponible;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String newLocalizacion) {
        this.localizacion = newLocalizacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double newPrecio) {

        this.precio = newPrecio;
    }

    public int getIdUnidComercializacion() {
        return idUnidComercializacion;
    }

    public void setIdUnidComercializacion(int newIdUnidComercializacion){
        this.idUnidComercializacion = newIdUnidComercializacion;
    }
    //  To string Metodo que devuelve un objeto legible para el usuario final
    @Override  // TODAS LAS ANOTACIONES INICIAN CON UN ARROBA @ - Anotacion Sobrecargar el metodo originalTostring de la clase padre objeto
    public String toString() {
        return "Producto{" +
                "idProducto:" + idproducto +
                "nombreProducto:" + nombrePoducto +
                "clasificacion:" + clasificacion +
                "cantidadProducto:" +cantidaDisponible +
                " localizacion:" + localizacion +
                "precio:" + precio +
                "idUnidComercializacion:"+ idUnidComercializacion +
                "}";



    }
}