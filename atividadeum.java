import java.util.Scanner;

public class atividadeum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do trangulo: ");
        int ladoum = scanner.nextInt();

        System.out.print("Digite o segundo lado do trangulo: ");
        int ladodois = scanner.nextInt();

        System.out.print("Digite o terceiro lado do trangulo: ");
        int ladotres = scanner.nextInt();

        if (ladoum == ladodois && ladoum == ladotres && ladodois == ladotres){
            System.out.print("o triangulo que voce inseriu é equilatero");
        }else if (ladoum == ladodois || ladoum == ladotres || ladotres == ladodois){
             System.out.print("o triangulo que voce inseriu é isosceles");
        }else{
            System.out.print("o triangulo que voce inseriu é escaleno");
        }
    }
}