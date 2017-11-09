package persona;

/**
 *
 * @author baesparza
 */
public class Trabajador extends Persona{
    
    private String costo_seguro, horas_trabajadas, costo_por_hora;
    
    public Trabajador() {
        super(
                "Nombre no definido",
                "Apellido no definido",
                "0000000000",
                0
        );
        this.setCosto_seguro("0");
        this.setHoras_trabajadas("0");
        this.setCosto_por_hora("0");
    }
    
    public Trabajador(String costo_seguro, String horas_trabajadas, String costo_por_hora) {
        super(
                "Nombre no definido",
                "Apellido no definido",
                "0000000000",
                0
        );
        this.setCosto_seguro(costo_seguro);
        this.setHoras_trabajadas(horas_trabajadas);
        this.setCosto_por_hora(costo_por_hora);
    }
    
    public Trabajador(String nombre, String apellido, String cedula, int edad) {
        super(
                nombre,
                apellido,
                cedula,
                edad
        );
        this.setCosto_seguro("0");
        this.setHoras_trabajadas("0");
        this.setCosto_por_hora("0");
    }
    
    public Trabajador(
            String nombre, String apellido, String cedula, int edad, 
            String costo_seguro, String horas_trabajadas, String costo_por_hora
    ) {
        super(nombre, apellido, cedula, edad);
        this.setCosto_seguro(costo_seguro);
        this.setHoras_trabajadas(horas_trabajadas);
        this.setCosto_por_hora(costo_por_hora);
    }
    
    private void setCosto_seguro(String costo_seguro) {
        this.costo_seguro = costo_seguro;
    }
    
    private void setHoras_trabajadas(String horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }
    
    private void setCosto_por_hora(String costo_por_hora) {
        this.costo_por_hora = costo_por_hora;
    }
    
    private String getCosto_seguro() {
        return this.costo_seguro;
    }
    
    private String getHoras_trabajadas() {
        return this.horas_trabajadas;
    }
    
    private String getCosto_por_hora() {
        return this.costo_por_hora;
    }
    
}
