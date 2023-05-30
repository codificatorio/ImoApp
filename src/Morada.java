
class Morada {

    String rua;
    int nr;
    char porta;
    int andar;
    Localidade localidade;

    Morada(String rua, int nr, int cpPrimário, int cpSecundário, String cidade) {
        this.rua = rua;
        this.nr = nr;
        this.localidade = new Localidade(cidade, cpPrimário, cpSecundário);

    }
    
    Morada(String freguesia) {
        this.localidade = new Localidade(freguesia);
                
    }

}
