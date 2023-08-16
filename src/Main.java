import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoFilas = 0; // Inicialización predeterminada
        int tamanhoColumnas = 0; // Inicialización predeterminada
        boolean tamanhoValido = false;

        while (!tamanhoValido) {
            System.out.print("Ingrese el número de filas que tendrá la matriz: ");
            tamanhoFilas = scanner.nextInt();

            if (tamanhoFilas > 0) {
                tamanhoValido = true;
            } else {
                System.out.println("Ingrese un número de filas válido. Mayor que cero.");
            }
        }

        tamanhoValido = false;

        while (!tamanhoValido) {
            System.out.print("Ingrese el número de columnas que tendrá la matriz: ");
            tamanhoColumnas = scanner.nextInt();

            if (tamanhoColumnas > 0) {
                tamanhoValido = true;
            } else {
                System.out.println("Ingrese un número de columnas válido. Mayor que cero.");
            }
        }

        rellenaArray(tamanhoFilas, tamanhoColumnas);
    }

    public static void rellenaArray(int tamanhoFilas, int tamanhoColumnas) {
        double[][] matrizLectura = new double[tamanhoFilas][tamanhoColumnas];

        for (int i = 0; i < tamanhoFilas; i++) {
            for (int j = 0; j < tamanhoColumnas; j++) {
                matrizLectura[i][j] = Math.random() * 100;
            }
        }

        System.out.println("La matriz generada es:");

        for (int i = 0; i < tamanhoFilas; i++) {
            for (int j = 0; j < tamanhoColumnas; j++) {
                System.out.print(matrizLectura[i][j] + " ");
            }
            System.out.println();
        }
    }
}
