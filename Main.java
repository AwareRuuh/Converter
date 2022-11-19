import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner (System.in);
    
    System.out.println("Digite um número : ");
    String numero = sc1.nextLine();
    int convertNumero = Integer.parseInt(numero);;
    System.out.println("Número inteiro: " +numero);
  }
}