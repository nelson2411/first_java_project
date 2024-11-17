package fiesta;

import fiesta.Fiesta;

public class Graduacion {
  public static void main(String[] args) {
    Fiesta fiesta = new Fiesta("Graduación", "Calle Florida, 14 03007 Alicante", 200, 400, 100, "20/12/2024", "22:00");

    fiesta.invitar(14);
    fiesta.cancelar(5);

    System.out.println("El precio de la fiesta es: " + fiesta.precioFiesta());
    System.out.println("Info de la fiesta: " + fiesta.toString());

  }

}
