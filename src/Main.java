import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    //scaner
        Scanner teclado = new Scanner(System.in);

    //objeto creado desde el constructor vacio
    Cuenta c1 = new Cuenta();
    c1.setNumCuenta("654654");
    c1.setFranquicia("Mastercard");
    c1.setSaldo(500000);
    System.out.println(c1.toString());
        System.out.println("nuevo saldo" + c1.depositar(111));
    //crear un objeto con el constructor con parametros
        Cuenta c2 = new Cuenta("132123", "Visa", 15000);
        System.out.println(c2.toString());
    // crear objeto con datos ingresados por el usuario
    Cuenta c3 = new Cuenta();
    System.out.println("ingrese numero de cuenta: ");
    c3.setNumCuenta(teclado.next());
    System.out.println("ingrese franquisia: ");
    c3.setFranquicia(teclado.next());
    System.out.println("ingrese saldo: ");
    c3.setSaldo(teclado.nextDouble());
    System.out.println(c3.toString());
    //sumar el saldo de las 3 cuentas
    double sumaSaldo = c1.getSaldo() + c2.getSaldo() + c3. getSaldo();
    System.out.println("el saldo de las 3 cuentas suman: " + sumaSaldo);
    }

}
