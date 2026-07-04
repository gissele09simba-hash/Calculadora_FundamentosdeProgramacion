import java.util.Objects;

public class Division {
    public static void main(String[] args) {
        dividir();
    }

    static void dividir() {
        IO.println("\n--- DIVISIÓN ---");
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
        if (numero2 == 0) {
            IO.println("Error: no se puede dividir para cero.");
            IO.readln("Presione Enter para volver al menú...");
            return;
        }
        int resultado = numero1 / numero2;
        IO.println(String.format("Resultado: %d / %d = %d", numero1, numero2, resultado));
        IO.readln("Presione Enter para volver al menú...");
    }
}