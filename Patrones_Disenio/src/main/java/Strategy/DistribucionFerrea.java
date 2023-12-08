/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author davidsuarez
 */
public class DistribucionFerrea implements DistribucionStrategy {
    @Override
    public int distribuir(int a, int b) {
        // Lógica de distribución por vía férrea
        return a * b;
    }
    
}
