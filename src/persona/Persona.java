package persona;

/**
 *
 * @author baesparza
 */
public class Persona {
    
    private String nombres, apellidos, cedula; 
    private int edad;
    
    public Persona(String nombres, String apellidos, String cedula, int edad) {
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
    
    public void setEdad(int edad) {
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
    
    public Integer getEdad() {
        return this.edad;
    }
    
    @Override
    public String toString() {
        return String.format("\t%s %s\n" 
                + "\t%d años de edad\n" 
                + "\tCI: %s\n",
                this.getNombre(), this.getApellidos(),
                this.getEdad(),
                this.getCedula());
    }
}
