
class Imóvel {

    String tipo;
    boolean emVenda;
    Morada morada;
    int preço;
    java.time.LocalDate dataDeLicenciamento;

    Imóvel(String rua, int nr, int cpPrimário, int cpSecundário, String cidade) {
        morada = new Morada(rua, nr, cpPrimário, cpSecundário, cidade);
    }

}
