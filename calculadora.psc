Algoritmo Calculadora
    Definir op, n1, n2, resultado Como Entero
    Escribir "BIENVENIDO A LA CALCULADORA"
    op = -1
    Mientras op <> 0 Hacer
        Escribir "1. Suma"
        Escribir "2. Resta"
        Escribir "3. Multiplicacion"
        Escribir "4. Division"
        Escribir "0. Salir"
        Escribir "Ingrese opcion:"
        Leer op
        Si op = 1 Entonces
            Escribir "Ingrese numero 1:"
            Leer n1
            Escribir "Ingrese numero 2:"
            Leer n2
            resultado = n1 + n2
            Escribir "La suma es: ", resultado
            Esperar Tecla 
        FinSi
        Si op = 2 Entonces
            Escribir "Ingrese numero 1:"
            Leer n1
            Escribir "Ingrese numero 2:"
            Leer n2
            resultado = n1 - n2
            Escribir "La resta es: ", resultado
            Esperar Tecla 
        FinSi
        Si op = 3 Entonces
            Escribir "Ingrese numero 1:"
            Leer n1
            Escribir "Ingrese numero 2:"
            Leer n2
            resultado = n1 * n2
            Escribir "La multiplicacion es: ", resultado
            Esperar Tecla 
        FinSi
        Si op = 4 Entonces
            Escribir "Ingrese numero 1:"
            Leer n1
            Escribir "Ingrese numero 2:"
            Leer n2
            Si n2 <> 0 Entonces
                resultado = n1 / n2
                Escribir "La division es: ", resultado
            Sino
                Escribir "Error: No se puede dividir entre 0"
            FinSi
            Esperar Tecla 
        FinSi
        Si op = 0 Entonces
            Escribir "Saliendo del programa..."
        FinSi
        Si op < 0 o op > 4 Entonces
            Escribir "Opcion invalida"
            Esperar Tecla 
        FinSi
    FinMientras
FinAlgoritmo