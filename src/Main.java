public class Main{
    public static void main(String[] args){


        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lanaçamento: " + anoDeLancamento);

        //boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println(notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3 ;
        System.out.println(media);

        String sinopse = "Filme de aventura com ator dos anos 80";
        System.out.println(sinopse);
        System.out.println();
        // Formatar com text block
        String sinopseFormatada = """
                Escrevendo sobre o filme
                e pulando
                as linhas
                """ + anoDeLancamento;
        System.out.println(sinopseFormatada);

        int classificacao = (int) media / 2;
        System.out.println(classificacao);



        // praticando conversão de temperatura

        double grauCelsius = 17;
        int fahrenheit = (int) (grauCelsius * 1.8) + 32;

        System.out.println("-------------------------------------------------------------");
        System.out.println("Medidor de temperatura e converter de Graus para Fahrenheit ");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Hoje em joinville esta fazendo: " + grauCelsius + " graus de temperatura");
        System.out.println("Essa mesma temperatura em Nova York séria de: " + fahrenheit  + "F");
    }
}