package pt.remax.negócio;

public class Imóvel extends Prédio {

    private String tipo;
    private boolean emVenda;
    //private Morada morada;
    private int valor;
    private java.time.LocalDate dataDeLicenciamento;
    //private int área;
    //private int divisões;
    //private Caderneta caderneta;

    public Imóvel(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        morada = new Morada(rua, nr, cpPrimário, cpSecundário, freguesia);
    }

    public Imóvel(String rua, int nr, char porta, int cpPrimário, int cpSecundário, String freguesia, double coordenadasX, double coordenadasY) {
        morada = new Morada(rua, nr, porta, cpPrimário, cpSecundário, freguesia, coordenadasX, coordenadasY);
    }

    public void valorizar(int valor) {
        // TODO aqui devemos validar
        if (valor < 50000) {
            System.out.println("Erro: nesta imobiliária o valor dos imóveis deve ser > 50000");
            return;
        }
        this.valor = valor;
    }

    boolean éEm(String freguesia) {
        return morada.éEm(freguesia);
    }

    boolean éMaisCaroQue(int mínimo) {
        return valor >= mínimo;
    }
    
    int getCódigoPostalPrimário() {
        return morada.getCódigoPostalPrimário();
    }

}
