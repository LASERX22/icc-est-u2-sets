package models;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String toString(){
        return "Nombre: "+nombre+" || Apellido: "+apellido+" || Telefono: "+telefono;
    }

    // public boolean equals(Object obj){

    // }
    @Override
    public int hashCode(){
        return nombre.hashCode()+apellido.hashCode();
    }
}