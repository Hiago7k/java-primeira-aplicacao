import java.util.Scanner;

public class loop
{
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacao do filme: ");
            nota = teclado.nextFloat();
            // para acumular essa variavel ir somando as notas
            // mediaAvaliacao vai receber oque ela ja tinha + o nota
            // mediaAvaliacao recebe mediaAvaliacao + nota
            mediaAvaliacao += nota;
        }
        System.out.println("A média das notas é: " + mediaAvaliacao/3);
    }
}
