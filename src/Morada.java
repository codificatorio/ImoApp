
class Morada {

    String rua;
    int nr;
    char porta;
    int andar;
    Localidade localidade;
    Coordenadas coordenadas;

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

}
