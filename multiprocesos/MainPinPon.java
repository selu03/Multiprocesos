/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiprocesos;

/**
 *
 * @author Hp
 */
public class MainPinPon {
      public static void main(String[] args) {
        Pin hiloPin = new Pin();
        Pon hiloPon = new Pon();

        hiloPin.start();
        hiloPon.start();
    }
}

