package principal;

import empresa.EmpresaPrivada;
import persona.Trabajador;

/**
 *
 * @author baesparza
 */
public class Principal {

    public static void main(String[] args) {
        
        Trabajador[] trabajadores = new Trabajador[2];
        trabajadores[0] = new Trabajador(
                "Ana Luisa",
                "Velez Alcivar",
                "12903939",
                30,
                "100",
                "40",
                "10"
        );
        trabajadores[1] = new Trabajador(
                "Mario Anibal",
                "Vela Narvaez",
                "212889",
                35,
                "100",
                "50",
                "10"
        );
        
        
        EmpresaPrivada empresaPrivada = new EmpresaPrivada(
                "Soluciones Software",
                "SS's",
                "Loja",
                trabajadores,
                "200000",
                "12"
        );
        System.out.println(empresaPrivada);
    }
    
}
