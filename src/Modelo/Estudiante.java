package Modelo;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String correo;
    private int longitud;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();//mayuscula
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = apellido.replace('r', 'c');
        this.apellido = apellido.toLowerCase();//minusculas
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud() {
        this.longitud = nombre.length();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
