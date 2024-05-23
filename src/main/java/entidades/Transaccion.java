package entidades;
// crear clase

public class Transaccion {
    private int idTransaccion;
    private String medioDePago;
    private String fecha;
    private int idVendedor;
    private int idComprador;

    // crear contructor
    public Transaccion() {
    }

    public void Transaccion(int idTransaccion, String medioDePago,
                            String fecha, int idVendedor, int idComprado) {
        this.idTransaccion = idTransaccion;
        this.medioDePago = medioDePago;
        this.fecha = fecha;
        this.idVendedor = idVendedor;
        this.idComprador = idComprado;

    }

    // declarar metodos get y set

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int newTransaccion) {
        this.idTransaccion = newTransaccion;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String newMedioDePago) {
        this.medioDePago = newMedioDePago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String newFecha) {
        this.fecha = newFecha;
    }

    public int getIdVendedor() {

        return idVendedor;
    }

    public void setIdVendedor(int newVendedor) {
        this.idVendedor = newVendedor;
    }

    public int getIdComprador() {
        return idComprador;
    }
    public void setIdComprador(int newComprador) {
        this.idComprador = newComprador;
    }

    // To string Metodo que devuelve un objeto legible para el usuario final
    @Override   // TODAS LAS ANOTACIONES INICIAN CON UN ARROBA @ - Anotacion Sobrecargar el metodo originalTostring de la clase padre objeto
    public String toString(){
        return "Transaccion{" +
                "idTransaccion: " + this.idTransaccion +
                "medioDePago: " + medioDePago +
                "fecha:"+ fecha+
                "idUComprador:"+ idComprador +
                "idVendedor:" + idVendedor+
                "}";









    }



















}


