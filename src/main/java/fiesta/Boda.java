package fiesta;

import fiesta.Fiesta;
import java.time.LocalDate;
import java.time.LocalTime;

public class Boda {
  public static void main(String[] args) {
    Fiesta fiesta = new Fiesta();
    fiesta.setTipoFiesta("Boda");
    fiesta.setDireccion("Calle Glorieta Llopis 1 03010 Alicante");
    fiesta.setBocadillos(175);
    fiesta.setBebidas(300);
    fiesta.setInvitados(125);
    fiesta.setFecha("30/11/2024");
    fiesta.setHora("21:00");
    System.out.println("Tipo de fiesta: " + fiesta.getTipoFiesta());
    System.out.println("Dirección: " + fiesta.getDireccion());
    System.out.println("Bocadillos: " + fiesta.getBocadillos());
    System.out.println("Bebidas: " + fiesta.getBebidas());
    System.out.println("Invitados: " + fiesta.getInvitados());
    System.out.println("Fecha: " + fiesta.getFecha());
    System.out.println("Hora: " + fiesta.getHora());

    fiesta.precioFiesta();
    fiesta.cancelar(3);
    fiesta.invitar(5);

    System.out.println("Precio de la fiesta: €" + fiesta.precioFiesta());
    System.out.println("Información de la fiesta: " + fiesta.toString());
    System.out.println("Numero final de Invitados: " + fiesta.getInvitados());

  }

}
