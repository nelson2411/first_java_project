package fiesta;

import fiesta.Fiesta;

public class Despedida {

  public static void main(String[] args) {
    Fiesta fiesta = new Fiesta();
    fiesta.setTipoFiesta("Despedida");
    fiesta.setDireccion("Calle cisne 37 03006 Alicante");
    fiesta.setBocadillos(50);
    fiesta.setBebidas(100);
    fiesta.setInvitados(25);
    fiesta.setFecha("12/12/2024");
    fiesta.setHora("21:00");
    System.out.println("Tipo de fiesta: " + fiesta.getTipoFiesta());
    System.out.println("Dirección: " + fiesta.getDireccion());
    System.out.println("Bocadillos: " + fiesta.getBocadillos());
    System.out.println("Bebidas: " + fiesta.getBebidas());
    System.out.println("Invitados: " + fiesta.getInvitados());
    System.out.println("Fecha: " + fiesta.getFecha());
    System.out.println("Hora: " + fiesta.getHora());

    fiesta.precioFiesta();
    fiesta.cancelar(4);
    fiesta.invitar(7);

    System.out.println("Precio de la fiesta: €" + fiesta.precioFiesta());
    System.out.println("Información de la fiesta: " + fiesta.toString());
    System.out.println("Numero final de Invitados: " + fiesta.getInvitados());

  }

}
