package Examen1P;

import javax.swing.JOptionPane;

/**
 *
 * Programa que calcula la raíz cuadrada de los números introducidos.
 * Calcula la suma de todas las raíces calculadas.
 * Calcula el cubo de las raíces cuadradas calculadas
 * 
 * @author Felipe Albuerne
 * @version 1.00
 */
public class RaizCuadrada {

    public static void main(String[] args) {

        String teclado;
        double num = 0.0;
        double operacion = 0.0;
        double raizCuadrada = 0.0;
        double total = 0;

        do {
            teclado = JOptionPane.showInputDialog("Introduce un número (0 para terminar)");
            num = Double.parseDouble(teclado);

            if (num != 0) {

                raizCuadrada = Math.sqrt(num);
                total += raizCuadrada;
                operacion = Math.pow(raizCuadrada, 3);

            }

        } while (num != 0);

    }

}
