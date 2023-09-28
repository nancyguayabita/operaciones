package helloword;
import java.util.Scanner;
public class Helloword 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        System.out.println("hello word");
        System.out.println("ingresa tu nombre: ");
        String nombre = leer.nextLine();
        System.out.println("hola " + nombre + "bienvenido");
    }
    
}
