import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraApp {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion = -1;
        float a, b;

        // Ciclo que se repite hasta que el usuario decida salir
        while (true) {
            try {
                System.out.println("Seleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                opcion = Integer.parseInt(reader.readLine());

                // Si el usuario elige la opción 5, el ciclo termina
                if (opcion == 5) {
                    System.out.println("Saliendo de la calculadora...");
                    break;  // Sale del ciclo
                }

                // Si la opción no es válida, muestra un mensaje de error y continúa con el ciclo
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    continue;  // Repitirá el ciclo si la opción no es válida
                }

                // Solicitar los números para realizar la operación
                System.out.println("Ingrese el primer número:");
                a = Float.parseFloat(reader.readLine());
                System.out.println("Ingrese el segundo número:");
                b = Float.parseFloat(reader.readLine());

                // Realizar la operación seleccionada
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + calculadora.suma(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + calculadora.resta(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + calculadora.multiplicacion(a, b));
                        break;
                    case 4:
                        System.out.println("Resultado: " + calculadora.division(a, b));
                        break;
                    default:
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error al ingresar los datos.");
            }
        }
    }
}
