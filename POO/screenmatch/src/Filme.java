public class Filme {

    // ATRIBUTOS
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // MÉTODOS
    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: "  + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPLano);
        System.out.println("Total de total avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
