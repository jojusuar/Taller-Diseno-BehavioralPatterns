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

        // Cambiar dinámicamente la estrategia
        logistica.setStrategy(automotriz);
        
        // Ejecutar la distribución con la estrategia actual
        int resultado = logistica.ejecutarDistribucion(10, 5);
        System.out.println("Resultado de la distribución: " + resultado);
    }
}
