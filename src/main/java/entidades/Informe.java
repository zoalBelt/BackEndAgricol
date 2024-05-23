package entidades;

// crear clase

public class Informe {
    //declarar atributos

    private int idInforme;
    private double total;
    private  double comisionTotal;
    private String fechaGeneracion;
    private int idTransapcion;

    // crear constructores

    public void Informe(){
    }

    public void Informe(int idInforme,double total, double comisionTotal,String fechaGeneracion,
                        int idTransapcion){

        this.idInforme = idInforme;
        this.total = total;
        this.comisionTotal = comisionTotal;
        this.fechaGeneracion = fechaGeneracion;
        this.idTransapcion = idTransapcion;

    }
    //crear metodos get y set

    public int  getIdInforme(){
        return idInforme;
    }
    public void setIdInforme( int newIdInforme){
        this.idInforme = newIdInforme;
    }

    public double getTotal(){
        return total;
    }
    public void setTotal( double newTotal){
        this.total = newTotal;
    }
    public double getComisionTotal(){
        return comisionTotal;
    }

    public void setComisionTotal(double newComisionTotal){
         this.comisionTotal = newComisionTotal;
    }

    public String getFechaGeneracion(){
        return fechaGeneracion;
    }
    public void setFechaGeneracion(String newFechaGeneracion){
        this.fechaGeneracion = newFechaGeneracion;
    }
    public int gerIdTransapcion( ){
        return idTransapcion;
    }
    public void setIdTransapcion(int newIdTransapcion){
        this.idTransapcion = newIdTransapcion;
    }
    // To string Metodo que devuelve un objeto legible para el usuario final
    @Override   // TODAS LAS ANOTACIONES INICIAN CON UN ARROBA @ - Anotacion Sobrecargar el metodo originalTostring de la clase padre objeto
    public String toString(){
        return "Informe{"+
                " idInforme:"+ idInforme+
                "total:" + total +
                "comisionTotal:" + comisionTotal+
                "fechaGeneracion:" + fechaGeneracion+
                "idTransapcion:" + idTransapcion+

        "{";
    }


}





