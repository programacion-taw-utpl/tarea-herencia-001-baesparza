package empresa;

import persona.Trabajador;

/**
 *
 * @author baesparza
 */
public class EmpresaPrivada extends Empresa {
    
    private int numero_sucursales, ventas_mensual_fijo;
    
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
        this.ventas_mensual_fijo = Integer.valueOf(ventas_mensual_fijo);
    }
    
    public void setNumero_sucursales(String numero_sucursales) {
        this.numero_sucursales = Integer.valueOf(numero_sucursales);
    }
    
    public int getVentas_mensual_fijo() {
        return this.ventas_mensual_fijo;
    }
    
    public int getNumero_sucursales() {
        return this.numero_sucursales;
    }
    
    private String trabajadoresToString() {
        String message = "";
        for (int i = 0; i < this.trabajadores.length; i++) message += (i + 1) + ")" + this.trabajadores[i].toString();
        return message;
    }
    
    @Override
    public String toString() {
        return String.format("%s"
                + "Ventas: $%d\n"
                + "Sucursales: %d\n"
                + "Lista Trabajadores:\n\n%s", 
                super.toString(),
                this.getVentas_mensual_fijo(),
                this.getNumero_sucursales(),
                this.trabajadoresToString());
    }

}
