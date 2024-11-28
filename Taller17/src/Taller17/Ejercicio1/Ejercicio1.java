package Taller17.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }
}
