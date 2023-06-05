package pt.remax.negócio;

public class Imóvel {

    private String tipo;
    private boolean emVenda;
    private Morada morada;
    private int valor;
    private java.time.LocalDate dataDeLicenciamento;

    public Imóvel(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        morada = new Morada(rua, nr, cpPrimário, cpSecundário, freguesia);
    }

    public Imóvel(String rua, int nr, char porta, int cpPrimário, int cpSecundário, String freguesia, double coordenadasX, double coordenadasY) {
        morada = new Morada(rua, nr, porta, cpPrimário, cpSecundário, freguesia, coordenadasX, coordenadasY);
    }

    void valorizar(int valor) {
        // TODO aqui devemos validar
        if (valor < 50000) {
            System.out.println("Aviso: nesta imobiliária o valor dos imóveis deve ser > 500000");
            return;
        }
        this.valor = valor;
    }

}
