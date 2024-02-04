import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        float resultado;
    //primer numero
        System.out.println("Introducir un numero ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();


        System.out.println("Introducir otro numero ");
        float num2 = sc.nextFloat();

        System.out.println("Introducir operador \n " +
                "(+) suma \n "+
                "(-) resta \n "+
                "(*) multiplicacion \n" +
                "(/) division \n" );
        Scanner scu = new Scanner(System.in);
        String operator = scu.nextLine();


        switch (operator){

            case "+":
                resultado = num1 + num2;
                System.out.println("resultado de la suma = " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.println("resultado de la resta es = " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                System.out.println("restultado de la multiplicacion = " + resultado);
                break;

            case "/":
                resultado = num1 / num2;
                System.out.println("resultado de la division = " + resultado);
                break;

            default:
                System.out.println("opcion incorrecta");
                break;


        }



    }
}
