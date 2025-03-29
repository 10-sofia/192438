## Ejercicio 2 – **La Notablísima Prueba™**

> El Ministerio de Evaluaciones Sin Sentido ha encargado un sistema para evaluar estudiantes, pero el programador que lo hizo estaba más enfocado en su café que en la lógica. Este programa:
> 
1. Recibe **3 notas por estudiante**.
2. Calcula el promedio.
3. Si el promedio es **mayor o igual a 3.0**, el estudiante aprueba.
4. Se evalúan exactamente **4 estudiantes**.
5. Al final, se imprime cuántos aprobaron.

Para realizar este programa empezamos con un scanner para que lea nuestro codigo , utilizamos el system para asignar las notas ,tambien utilizamos el float para ingresarla , se promedio las tres notas y por ultimo se imprime el resultado.

import java.util.Scanner;
public class LaNotanlisimaPrueba{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primera nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("segunda nota:");
        float nota2 = scanner.nextFloat();
        System.out.print("tercera nota:");
        float nota3 = scanner.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 3.0) {
            System.out.println("aprueba");
        }
          scanner.close();
    }

}
