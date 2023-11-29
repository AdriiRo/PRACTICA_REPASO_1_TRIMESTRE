public class Estudiante {
    private String nombre;
    private String apellido; 
    private int edad; // Tendrá que ser un random entre 18 y 99
    private String email;
    
    public Estudiante(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellidos: " + apellido + " Edad: " + edad + " Email: " + email;
    }
}
