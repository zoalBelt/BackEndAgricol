package entidades;
// crear clase
public class UnidComercializacion{
    private int idUnidComercializacion;
    private String descripcion;
    private String nombre;

    // crear constructotes
public UnidComercializacion(){
}
public void UnidComercializacion(int idUnidComercializacion,String descripcion,String nombre)
{
    this.idUnidComercializacion = idUnidComercializacion;
    this.descripcion = descripcion;
    this.nombre = nombre;
}
    // declarar los metodos get y set


    public int getIdUnidComercializacion() {
        return idUnidComercializacion;
    }

    public void setIdUnidComercializacion(int newIdUnidadComercializacion) {
        this.idUnidComercializacion = newIdUnidadComercializacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String newDescripcion){

         this.descripcion = newDescripcion;
    }
    public String getNombre(){
        return  nombre;
    }
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    // To string Metodo que devuelve un objeto legible para el usuario final
    @Override   // TODAS LAS ANOTACIONES INICIAN CON UN ARROBA @ - Anotacion Sobrecargar el metodo originalTostring de la clase padre objeto
    public String toString(){
        return  "UnidComercializacion{" +
                "idUnidComercializacion:" + this. idUnidComercializacion +
                "descripcion:" + this.descripcion +
                "nombre:" + this. nombre +

                "}";

        
        
        
    
    }



}












