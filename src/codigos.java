public class codigos {
    public static long factorialIterativo(int n) {
        // Primero, verifico si el número que me entregaron es 0 o 1
        // simplemente devuelvo 1 porque ese es su factorial
        if (n <= 1) {
            return 1;
        }
        long resultado = 1;
        // Arranco mi ciclo desde el 2 (ya que multiplicar por 1 en la primera vuelta es redundante)
        // y me detengo justo cuando alcanzo el número 'n' que me pidieron
        for (int i = 2; i <= n; i++) {
            // En cada iteración, tomo lo que ya tengo acumulado en 'resultado'
            resultado *= i;
        }
        // Al terminar el ciclo, ya hice todas las multiplicaciones de una sola vez
        return resultado;
    }

    public static long factorialCola(int n) {
        return auxFactorial(n, 1);
    }

    // Esta es mi función recursiva real, donde llevo el estado en el parámetro 'acumulador'
    private static long auxFactorial(int n, long acumulador) {
        // Si llego al final de mi cuenta regresiva (0 o 1), ya no tengo que devolver 1,
        // sino que devuelvo todo lo que fui reuniendo en mi acumulador
        if (n <= 1) {
            return acumulador;
        }
        // Realizo la multiplicación (n * acumulador) y le paso ese nuevo valor a la siguiente llamada
        // Al hacer return DIRECTO de la función, no dejo absolutamente nada pendiente en mi memoria
        return auxFactorial(n - 1, n * acumulador);
    }

    public static long contarHanoi(int n) {
        return (long) Math.pow(2, n) - 1;
    }

    public static int potenciaRapida(int x, int n) {
        if (n == 0) return 1;
        // Calculamos la mitad una sola vez
        int mitad = potenciaRapida(x, n / 2);

        // Si es par, multiplicamos la mitad por sí misma
        if (n % 2 == 0) {
            return mitad * mitad;
        } else {
            // Si es impar, compensamos multiplicando por 'x' una vez más
            return x * mitad * mitad;
        }
    }

    public static String invertirMejorado(String s) {
        char[] caracteres = s.toCharArray();
        String resultado = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado += caracteres[i]; // Aunque el + sigue aquí, evitamos el substring recursivo
        }
        return resultado;
        // Nota: Usar StringBuilder sería aún mejor para hacerlo estrictamente O(n).
    }

    public static int contarUnosIterativo(int[] a) {
        int cuenta = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                cuenta++;
            }
        }
        return cuenta;
    }
}
