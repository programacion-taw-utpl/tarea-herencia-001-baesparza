package persona;

/**
 *
 * @author baesparza
 */
public class Persona {
    
    private String nombres, apellidos, cedula; 
    private short edad;
    
    public Persona() { }
    
    public Persona(String nombres, String apellidos, String cedula, short edad) {
        this.setNombre(nombres);
        this.setApellidos(apellidos);
        this.setCedula(cedula);
        this.setEdad(edad);
    }
    
    public void setNombre(String nombres) {
        this.nombres = nombres;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void setEdad(short edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombres;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }
    
    public String getCedula() {
        return this.cedula;
    }
    
    public short getEdad() {
        return this.edad;
    }
    
}
