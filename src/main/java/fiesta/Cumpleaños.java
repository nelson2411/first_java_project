package fiesta;

import fiesta.Fiesta;

public class Cumpleaños {
  public static void main(String[] args) {
    Fiesta fiesta = new Fiesta();
    fiesta.setTipoFiesta("Cumpleaños");
    fiesta.setDireccion("Calle Gaudi, 12 03005 Alicante");
    fiesta.setBocadillos(100);
    fiesta.setBebidas(200);
    fiesta.setInvitados(50);
    fiesta.setFecha("12/12/2020");
    fiesta.setHora("20:00");
    System.out.println("Tipo de fiesta: " + fiesta.getTipoFiesta());
    System.out.println("Dirección: " + fiesta.getDireccion());
    System.out.println("Bocadillos: " + fiesta.getBocadillos());
    System.out.println("Bebidas: " + fiesta.getBebidas());
    System.out.println("Invitados: " + fiesta.getInvitados());
    System.out.println("Fecha: " + fiesta.getFecha());
    System.out.println("Hora: " + fiesta.getHora());

    fiesta.precioFiesta();
    fiesta.cancelar(2);
    fiesta.invitar(3);

    System.out.println("Precio de la fiesta: €" + fiesta.precioFiesta());
    System.out.println("Información de la fiesta: " + fiesta.toString());
    System.out.println("Numero final de Invitados: " + fiesta.getInvitados());

  }

}
