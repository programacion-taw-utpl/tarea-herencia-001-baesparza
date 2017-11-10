package empresa;

import persona.Trabajador;

/**
 *
 * @author baesparza
 */
public class EmpresaPrivada extends Empresa {
    
    private Double ventas_mensual_fijo;
    private int numero_sucursales;
    
    public EmpresaPrivada() {
        super("Nombre empresa indefinido", "n/a", "n/a", new Trabajador[] {});
        this.setVentas_mensual_fijo("0");
        this.setNumero_sucursales("0");
    }
    
    public EmpresaPrivada(String nombre, String siglas, String ciudad, Trabajador[] trabajadores) {
        super(nombre, siglas, ciudad, trabajadores);
        this.setVentas_mensual_fijo("0");
        this.setNumero_sucursales("0");
    }
    
    public EmpresaPrivada(String ventas_mensual_fijo, String numero_sucursales) {
        super("Nombre empresa indefinido", "n/a", "n/a", new Trabajador[] {});
        this.setVentas_mensual_fijo(ventas_mensual_fijo);
        this.setNumero_sucursales(numero_sucursales);
    }
    
    public EmpresaPrivada(
            String nombre, String siglas, String ciudad, Trabajador[] trabajadores,
            String ventas_mensual_fijo, String numero_sucursales
    ) {
        super(nombre, siglas, ciudad, trabajadores);
        this.setVentas_mensual_fijo(ventas_mensual_fijo);
        this.setNumero_sucursales(numero_sucursales);
    }
    
    public void setVentas_mensual_fijo(String ventas_mensual_fijo) {
        this.ventas_mensual_fijo = Double.valueOf(ventas_mensual_fijo);
    }
    
    public void setNumero_sucursales(String numero_sucursales) {
        this.numero_sucursales = Integer.valueOf(numero_sucursales);
    }
    
    public double getVentas_mensual_fijo() {
        return this.ventas_mensual_fijo;
    }
    
    public int getNumero_sucursales() {
        return this.numero_sucursales;
    }
    
    private String trabajadoresToString() {
        String message = "";
        for (Trabajador trabajador:this.trabajadores) message += "\n" + trabajador.toString();
        return message;
    }
    
    @Override
    public String toString() {
        return String.format("%s"
                + "Ventas: $%f\n"
                + "Sucursales: %d\n"
                + "Lista Trabajadores:%s", 
                super.toString(),
                this.getVentas_mensual_fijo(),
                this.getNumero_sucursales(),
                this.trabajadoresToString());
    }

}
