package pt.remax.negócio;

class Morada {

    private String rua;
    private int nr;
    private char porta;
    private int andar;
    private Localidade localidade;
    private Coordenadas coordenadas;

    Morada(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        this.rua = rua;
        this.nr = nr;
        this.localidade = new Localidade(freguesia, cpPrimário, cpSecundário);
    }

    Morada(String freguesia) {
        this.localidade = new Localidade(freguesia);
    }

    Morada(String rua, int nr, char porta, int cpPrimário, int cpSecundário, String freguesia, double coordenadasX, double coordenadasY) {
        this(rua, nr, cpPrimário, cpSecundário, freguesia);
        this.porta = porta;
        coordenadas = new Coordenadas(coordenadasX, coordenadasY);
    }

    boolean éEm(String freguesia) {
        return localidade.éEm(freguesia);
    }

    @Override
    public String toString() {
        return "Morada{" + "rua=" + rua + ", nr=" + nr + ", localidade=" + localidade + '}';
    }

}
