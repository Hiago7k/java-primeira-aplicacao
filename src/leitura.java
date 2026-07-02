import java.util.Scanner;

public class leitura {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome favorito: ");
        String filme = teclado.next();
        System.out.println("Qual ano de lancamento desse filme?");
        int anoDelancamento = teclado.nextInt();
        System.out.println("Qual sua nota pro filme?");
        double nota = teclado.nextDouble();
        System.out.println(filme + " " + anoDelancamento + " " + nota);

    }
}
