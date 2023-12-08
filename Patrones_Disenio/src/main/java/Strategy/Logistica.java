/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author davidsuarez
 */
public class Logistica {
    
    private DistribucionStrategy strategy;

    public void setStrategy(DistribucionStrategy strategy) {
        this.strategy = strategy;
    }

    public int ejecutarDistribucion(int a, int b) {
        return strategy.distribuir(a, b);
    }
}
