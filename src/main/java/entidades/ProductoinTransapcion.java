package entidades;
// crear class

public class ProductoinTransapcion{
    // Declarra atributos

    private int idProducto;
    private int idTransapcion;
    private String cantidadComprada;
    private double comision;

    // crear constructores
    public ProductoinTransapcion(){
    }
    public void ProductoinTransacpcion(int idProducto,int idTransapcion,String cantidadComprada,
                                       double comision){
        this.idProducto = idProducto;
        this.idTransapcion = idTransapcion;
        this.cantidadComprada = cantidadComprada;
        this.comision = comision;
    }

    // declarar los merodos get y set

    public int getIdProducto(){
        return idProducto;
    }
    public void setIdProducto(int newIdProducto){
        this.idProducto = newIdProducto;
    }

    public int getIdTransapcion(){
        return idTransapcion;
    }

    public void setIdTransapcion(int newIdTransapcion){
        this.idTransapcion = newIdTransapcion;
    }
    public String getCantidadComprada(){
        return cantidadComprada;
    }

    public void setCantidadComprada(String newCantidadComprada){
        this.cantidadComprada = newCantidadComprada;
    }
    public double getComision(){
        return comision;
    }
    public void setComision(double newComision){
        this.comision = newComision;
    }

    // To string Metodo que devuelve un objeto legible para el usuario final
    @Override   // TODAS LAS ANOTACIONES INICIAN CON UN ARROBA @ - Anotacion Sobrecargar el metodo originalTostring de la clase padre objeto
    public String toString() {
      return   "ProductoinTransapcion{" +
                "idProducto:"+ idProducto+
                "idTransapcion:" + idTransapcion +
                "cantidadComprada:" + cantidadComprada +
                "comision:" + comision +
              "}";
    }



}

