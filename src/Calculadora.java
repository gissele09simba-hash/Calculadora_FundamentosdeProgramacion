import java.util.Objects;

void main() {

    // Bienvenida
    IO.println("==========================================");
    IO.println("      BIENVENIDO A LA CALCULADORA");
    IO.println("==========================================");
    IO.println("Nombre: Angie Simba");
    IO.println("Materia: Fundamentos de Programación");
    IO.println("Esta calculadora permite realizar operaciones");
    IO.println("básicas mediante un menú interactivo.");

    String opcion = "";

    while (!Objects.equals(opcion, "0")) {

        IO.println("");
        IO.println("========= MENÚ =========");
        IO.println("1. Suma");
        IO.println("2. Resta");
        IO.println("3. Multiplicación");
        IO.println("4. División");
        IO.println("0. Salir");

        opcion = IO.readln("Ingrese una opción: ");

        switch (opcion) {

            case "1":
                sumar();
                break;

            case "2":
                restar();
                break;

            case "3":
                multiplicar();
                break;

            case "4":
                dividir();
                break;

            case "0":
                IO.println("Gracias por utilizar la calculadora.");
                break;

            default:
                IO.println("Opción no válida. Intente nuevamente.");
        }
    }
}

// =================== MÉTODO SUMAR ===================

void sumar() {

    IO.println("\n--- SUMA ---");

    String texto;

    texto = IO.readln("Ingrese el primer número: ");

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

    int resultado = numero1 + numero2;

    IO.println(String.format(
            "Resultado: %d + %d = %d",
            numero1,
            numero2,
            resultado));

    IO.readln("Presione Enter para volver al menú...");
}

// =================== MÉTODO RESTAR ===================

void restar() {

    IO.println("\n--- RESTA ---");

    String texto;

    texto = IO.readln("Ingrese el primer número: ");

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

    IO.println(String.format(
            "Resultado: %d - %d = %d",
            numero1,
            numero2,
            resultado));

    IO.readln("Presione Enter para volver al menú...");
}

// =================== MÉTODO MULTIPLICAR ===================

void multiplicar() {

    IO.println("\n--- MULTIPLICACIÓN ---");

    String texto;

    texto = IO.readln("Ingrese el primer número: ");

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

    int resultado = numero1 * numero2;

    IO.println(String.format(
            "Resultado: %d x %d = %d",
            numero1,
            numero2,
            resultado));

    IO.readln("Presione Enter para volver al menú...");
}

// =================== MÉTODO DIVIDIR ===================

void dividir() {

    IO.println("\n--- DIVISIÓN ---");

    String texto;

    texto = IO.readln("Ingrese el primer número: ");

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

    IO.println(String.format(
            "Resultado: %d / %d = %d",
            numero1,
            numero2,
            resultado));

    IO.readln("Presione Enter para volver al menú...");