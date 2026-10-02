import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(10, 5, 8, 3, 15, 20, 7, 12, 4, 9);

        System.out.println("=== 9.1 Programacion Estructurada ===");

        System.out.println("\nEjercicio 1: Mostrar números");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nEjercicio 2: Mostrar mayores que 10");
        for (Integer num : numeros) {
            if (num > 10) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("\nEjercicio 3: Mostrar pares");
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("\nEjercicio 4: Mostrar impares");
        for (Integer num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("\nEjercicio 5: Cada numero por 2");
        for (Integer num : numeros) {
            System.out.print((num * 2) + " ");
        }
        System.out.println();


        System.out.println("\n\n=== 10. Lambdas y Streams ===");

        System.out.println("\nEjercicio 6: Coleccion de numeros mayores a 8");
        List<Integer> mayoresOIgualesA8 = numeros.stream()
                .filter(n -> n >= 8)
                .toList();
        System.out.println(mayoresOIgualesA8);

        System.out.println("\nEjercicio 7: Coleccion de numeros pares");
        List<Integer> paresStream = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(paresStream);

        System.out.println("\nEjercicio 8: Menor a mayor");
        List<Integer> ordenadosMenorAMayor = numeros.stream()
                .sorted()
                .toList();
        System.out.println(ordenadosMenorAMayor);

        System.out.println("\nEjercicio 9: Mayor a menor");
        List<Integer> ordenadosMayorAMenor = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(ordenadosMayorAMenor);

        System.out.println("\nEjercicio 10: Valor maximo");
        int maximo = numeros.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println(maximo);

        System.out.println("\nEjercicio 11: Valor minimo");
        int minimo = numeros.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println(minimo);

        System.out.println("\nEjercicio 12: Suma numeros");
        int suma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(suma);

        System.out.println("\nEjercicio 13: Promedio");
        double promedio = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(promedio);

        System.out.println("\nEjercicio 14: Cuantos son mayores que 10");
        long cantidadMayoresQue10 = numeros.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println(cantidadMayoresQue10);

        System.out.println("\nEjercicio 15: Impares de menor a mayor");
        List<Integer> imparesOrdenados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .toList();
        System.out.println(imparesOrdenados);
    }
}