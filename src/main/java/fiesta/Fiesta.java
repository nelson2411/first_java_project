package fiesta;

import java.time.LocalDate;
import java.time.LocalTime;

public class Fiesta {

  // Se declaran las variables que se van a utilizar en la clase Fiesta

  private String tipoFiesta; // Tipo de fiesta, por ejemplo: Cumpleaños, Despedida, etc.
  private String direccion; // Dirección de la fiesta, en el formato: Calle Gaudi, 12 03005 Alicante
  private int bocadillos; // Número de bocadillos que se van a servir en la fiesta
  private int bebidas; // Número de bebidas que se van a servir en la fiesta
  private int invitados; // Número de invitados que van a asistir a la fiesta
  private String fecha; // Fecha de la fiesta, por ejemplo: 12/12/2020
  private String hora; // Hora de la fiesta, por ejemplo: 20:00

  public String getTipoFiesta() {
    return tipoFiesta; // Devuelve el tipo de fiesta, por ejemplo: Cumpleaños
  }

  // La variable tipoFiesta es de tipo String y se le asigna el valor que
  // se le pase como parámetro
  // por ejemplo: fiesta.setTipoFiesta("Cumpleaños");
  public void setTipoFiesta(String tipoFiesta) {
    this.tipoFiesta = tipoFiesta;
  }

  // Se crea un método get para obtener el valor de dirección
  // por ejemplo: fiesta.getDireccion();
  // Devuelve la dirección de la fiesta, como carrer Gaudi, 12 03005 Alicante
  public String getDireccion() {
    return direccion;
  }

  // Se crea un método set para asignar un valor a la variable dirección
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public int getBocadillos() {
    return bocadillos;
  }

  public void setBocadillos(int bocadillos) {
    this.bocadillos = bocadillos;
  }

  public int getBebidas() {
    return bebidas;
  }

  public void setBebidas(int bebidas) {
    this.bebidas = bebidas;
  }

  public int getInvitados() {
    return invitados;
  }

  public void setInvitados(int invitados) {
    this.invitados = invitados;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  /*
   * Generamos dos constructores, uno vacío y otro con todos los atributos de la
   * clase Fiesta
   * 
   */

  public Fiesta() {
    // Constructor vacío
  }

  // Metodos:
  // Generamos un metodo "invitar" que sumara un invitado a la fiesta
  public void invitar() {
    invitados++;
  }

  // Generamos un metodo "cancelar" que restara un invitado a la fiesta
  public void cancelar() {
    invitados--;
  }

  // sobrecarga del metodo "cancelar" que restara un determinado numero de
  // invitados a la fiesta
  public void cancelar(int numInvitados) {
    invitados -= numInvitados;
  }

  // sobrecargar el metodo invitar para que se pueda invitar a un numero
  // determinado de invitados
  public void invitar(int numInvitados) {
    invitados += numInvitados;
  }

  /*
   * Crearemos un metodo precio fiesta que calculara el precio de la fiesta
   * calculado de la siguiente forma:
   * 5 euros por invit
   * 2 euros por bebida
   * 3 euros por bocadillo
   */
  public double precioFiesta() {
    return invitados * 5 + bebidas * 2 + bocadillos * 3;
  }

  // Constructor con todos los atributos de la clase Fiesta
  public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
      // Constructor con todos los atributos de la clase Fiesta
      String hora) {
    this.tipoFiesta = tipoFiesta;
    this.direccion = direccion;
    this.bocadillos = bocadillos;
    this.bebidas = bebidas;
    this.invitados = invitados;
    this.fecha = fecha;
    this.hora = hora;
  }

  @Override
  public String toString() {
    return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos + ", bebidas="
        + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
  }

  /*
   * 
   * Todas las instancias de la clase Fiesta se realizaron en otros ficheros.
   * 
   * 
   */

}
