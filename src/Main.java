public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE LA PRÁCTICA DE RECURSIVIDAD ===");

        System.out.println("\n--- Ejercicio 1: Factorial ---");
        System.out.println("Factorial iterativo de 5: " + codigos.factorialIterativo(5));
        System.out.println("Factorial de cola de 5: " + codigos.factorialCola(5));

//        System.out.println("\n--- Ejercicio 3: Torres de Hanoi ---");
//        El profesor dijo que no había que programarlo.

        System.out.println("\n--- Ejercicio 4: Mutaciones de Código ---");
        System.out.println("Potencia Rápida (2^10): " + codigos.potenciaRapida(2, 10));
        System.out.println("Invertir Cadena Mejorado ('algoritmos'): " + codigos.invertirMejorado("algoritmos"));

        int[] arregloUnos = {0, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("Contar Unos Iterativo (debe dar 4): " + codigos.contarUnosIterativo(arregloUnos));
    }
}