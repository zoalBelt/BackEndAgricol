package entidades;
// se crea la clase

public class Rol {

    // se declaran los atributoa

    private int idRol;
    private String nombreRol;

    // se crean los constructores

    public Rol (){
    }
    public void Rol(int idRol, String nombreRol){
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }
        // declarar metodos get y   set
    public int getIdRol(){
        return idRol;
    }
    public void setIdRol(int newIdRol){
        this.idRol = newIdRol;
    }
    public String getNombreRol(){
        return nombreRol;
    }
    public void setNombreRol(String newNombreRol){
        this.nombreRol = newNombreRol;
    }

    // To string Metodo que devuelve un objeto legible para el usuario final
    @Override   // TODAS LAS ANOTACIONES INICIAN CON UN ARROBA @ - Anotacion Sobrecargar el metodo originalTostring de la clase padre objeto
    public String toString() {
        return "Rol{"+
                "idRol:" + idRol+
                "nombreRol:" + nombreRol+
                "}";













    }






}
