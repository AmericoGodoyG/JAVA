import java.time.LocalDate;

public class Carro {
    String modelo;
    int anoDoCarro;
    String cor;

    void fichaTecnica() {
        System.out.println(modelo);
        System.out.println(anoDoCarro);
        System.out.println(cor);
    }

    int idadeCarro() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoDoCarro;
    }

}
