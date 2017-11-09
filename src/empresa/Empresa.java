package empresa;

import persona.Trabajador;

/**
 *
 * @author baesparza
 */
public class Empresa {
    private String nombre, siglas, ciudad;
    Trabajador[] trabajadores;
    
    public Empresa(String nombre, String siglas, String ciudad, Trabajador[] trabajadores) {
        this.setNombre(nombre);
        this.setSiglas(siglas);
        this.setCiudad(ciudad);
        this.setTrabajadores(trabajadores);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getSiglas() {
        return this.siglas;
    }
    
    public String getCiudad() {
        return this.ciudad;
    }
    
    public Trabajador[] getTrabajadores() {
        return this.trabajadores;
    }
    
    public Trabajador getTrabajadore(int index) {
        return this.trabajadores[index];
    }
    
}
