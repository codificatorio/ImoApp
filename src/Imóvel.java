
class Imóvel {

    String tipo;
    boolean emVenda;
    Morada morada;
    int preço;
    java.time.LocalDate dataDeLicenciamento;

    Imóvel(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        morada = new Morada(rua, nr, cpPrimário, cpSecundário, freguesia);
    }

    Imóvel(String rua, int nr, char porta, int cpPrimário, int cpSecundário, String freguesia, double coordenadasX, double coordenadasY) {
        morada = new Morada(rua, nr, porta, cpPrimário, cpSecundário, freguesia, coordenadasX, coordenadasY);
    }

}
