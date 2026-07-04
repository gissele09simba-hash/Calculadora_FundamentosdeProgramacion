import java.util.Objects;

public class Resta {
    public static void main(String[] args) {
        restar();
    }

    static void restar() {
        IO.println("\n--- RESTA ---");
        String texto = IO.readln("Ingrese el primer número: ");
        if (!texto.matches("-?\\d+")) {
            IO.println("Error: debe ingresar solo números.");
            IO.readln("Presione Enter para volver al menú...");
            return;
        }
        int numero1 = Integer.parseInt(texto);
        texto = IO.readln("Ingrese el segundo número: ");
        if (!texto.matches("-?\\d+")) {
            IO.println("Error: debe ingresar solo números.");
            IO.readln("Presione Enter para volver al menú...");
            return;
        }
        int numero2 = Integer.parseInt(texto);
        int resultado = numero1 - numero2;
        IO.println(String.format("Resultado: %d - %d = %d", numero1, numero2, resultado));
        IO.readln("Presione Enter para volver al menú...");
    }
}