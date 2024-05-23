package entidades;
//Crear clases

public class Usuario {
    // declarar Atributos
     private int idUsuario;
     private String nombre;
     private String apellido;
     private String direccion;
     private String email;
     private int telefono;
     private String contrasena;
     private int idRol ;
     // crear constructor
    public Usuario(){
    }

    public void Usuario( int idUsuario,String nombre,String apellido,String direccion,String email,
                         int telefono,String contrasena,int idRol){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.contrasena =contrasena;
        this.idRol = idRol;
    }

     // declarra metodos get set

    public int getIdUsuario(){
         return idUsuario ;
     }

    public void setIdUsuario(int newIdUsuario){
         this.idUsuario = newIdUsuario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
         this.nombre = newNombre;
     }

     public String getApellido(){
         return apellido;
     }

     public void setApellido(String newApellido){
         this.apellido = newApellido;
     }

     public String getdireccion(){
         return direccion;
     }

     public void setDireccion(String newDireccion){
         this.direccion = newDireccion;
     }

     public String getEmail(){
         return email;
     }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public int getTelefono(){
         return telefono;
     }

     public void setTelefono(int newTelefono){
         this.telefono = newTelefono;
     }

     public String getContrasena(){
         return contrasena;
     }

     public void setContrasena(String newContrasena){
         this.contrasena = newContrasena;
     }

     public int getIdRol(){
         return idRol;
     }

    public void setIdRol(int newIdRol) {
        this.idRol= newIdRol;
    }

    // To string Metodo que devuelve un objeto legible para el usuario final
    @Override   // TODAS LAS ANOTACIONES INICIAN CON UN ARROBA @ - Anotacion Sobrecargar el metodo originalTostring de la clase padre objeto
    public String toString(){
        return "Usuario{" +
                "idUsuario: " + this.idUsuario +
                "Nombre: " + nombre +
                "apellido:"+ apellido +
                "direccion:"+ direccion +
                "email:" + email+
                "telefono:"+ telefono+
                "contrasena:"+ contrasena +
                "idRol:" +idRol +
                "}";


    }

}



