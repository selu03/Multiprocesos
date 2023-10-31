/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiprocesos;

import java.io.IOException;

public class BlocNotas {

    public static void main(String[] args) {
        try {
            
            Process process = Runtime.getRuntime().exec("notepad.exe");
            System.out.println("Bloc de notas iniciado.");
            boolean isRunningBeforeSleep = process.isAlive();
            System.out.println("¿El Bloc de notas está en ejecución antes de la pausa? " + isRunningBeforeSleep); 
            Thread.sleep(20000);
            boolean isRunningAfterSleep = process.isAlive();
            System.out.println("¿El Bloc de notas está en ejecución después de la pausa? " + isRunningAfterSleep);
            process.destroy();
            boolean isRunningAfterDestroy = process.isAlive();
            System.out.println("¿El Bloc de notas está en ejecución después de destruirlo? " + isRunningAfterDestroy);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    

