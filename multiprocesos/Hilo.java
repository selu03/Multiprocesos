/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiprocesos;

/**
 *
 * @author Hp
 */
public class Hilo {
    public static void main(String[] args) {
        HolaMundo hilo1 = new HolaMundo();
        HolaMundo hilo2 = new HolaMundo();
        HolaMundo hilo3 = new HolaMundo();
        HolaMundo hilo4 = new HolaMundo();
        HolaMundo hilo5 = new HolaMundo();

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }
}

