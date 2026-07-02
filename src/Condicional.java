public class Condicional {

    static void main() {
        int anoDeLancamento = 1999;
        boolean incluidoNoPlano = true;


        double notaDoFilme = 9.2;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2020)
        {
            System.out.println("Filme Lançamento");
        }else {
            System.out.println("Filme Retro");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Ta liberado assistir");
        }else {
            System.out.println("Tem que pagar o aluguel ");
        }
    }
}
