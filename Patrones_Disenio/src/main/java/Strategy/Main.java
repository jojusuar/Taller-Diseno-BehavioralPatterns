/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author davidsuarez
 */
public class Main {
    public static void main(String[] args) {
        //EJEMPLO DE USO DEL PATRON STRATEGY
        
        // Crear el contexto
        Logistica logistica = new Logistica();
        
        // Definir las estrategias
        DistribucionStrategy automotriz = new DistribucionAutomotriz();
        DistribucionStrategy ciclista = new DistribucionCiclista();
        DistribucionStrategy ferrea = new DistribucionFerrea();
        DistribucionStrategy aerea = new DistribucionAerea();
        DistribucionStrategy fluvial = new DistribucionFluvial();

        // Cambiar dinámicamente la estrategia y ejecutar
        logistica.setStrategy(automotriz);
        ejecutarDistribucion(logistica, 10, 5);

        logistica.setStrategy(ciclista);
        ejecutarDistribucion(logistica, 10, 5);

        logistica.setStrategy(ferrea);
        ejecutarDistribucion(logistica, 10, 5);

        logistica.setStrategy(aerea);
        ejecutarDistribucion(logistica, 10, 5);

        logistica.setStrategy(fluvial);
        ejecutarDistribucion(logistica, 10, 5);
    }
    private static void ejecutarDistribucion(Logistica logistica, int a, int b) {
        int resultado = logistica.ejecutarDistribucion(a, b);
        System.out.println("Resultado de la distribución: " + resultado);
    }
}
