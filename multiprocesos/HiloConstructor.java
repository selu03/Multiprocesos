/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiprocesos;

/**
 *
 * @author Hp
 */
public class HiloConstructor {
   
    
    
     public static void main(String[] args) {
        int N = 10; // Puedes ajustar N según la cantidad de números de Fibonacci que desees calcular.

        FibonacciThread hilo = new FibonacciThread(N);
        hilo.start();
    }
}
    
    class FibonacciThread extends Thread {
    private int N;

    public FibonacciThread(int N) {
        this.N = N;
    }

    @Override
    public void run() {
        int a = 1, b = 1;
        System.out.println("Los primeros " + N + " números de la secuencia de Fibonacci son:");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

