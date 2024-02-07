import java.util.Random;
import java.util.Scanner;

public class numeroAleatorio {

    public static void main(String[] args) {

        Random rm = new Random();
        int random = rm.nextInt(10);


        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa un numero");

        int ingreso_usuario = sc.nextInt();

        while (random != ingreso_usuario){

            if (ingreso_usuario < random) {
                System.out.println("El numero aleatorio es mayor");
                ingreso_usuario = sc.nextInt();
            }


            else if (ingreso_usuario > random) {
                System.out.println("el numero aleatorio es menor");
                ingreso_usuario = sc.nextInt();
            }
        }

        System.out.println("acerto!! el numero era " + random );

    }
}
