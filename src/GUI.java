
public class GUI {

    Imobiliária imobiliaria;

    GUI(Imobiliária imobiliária) {
        this.imobiliaria = imobiliária;
    }

    void gerirNovoImóvel(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        imobiliaria.gerir(rua, nr, cpPrimário, cpSecundário, freguesia);
    }

    void gerirNovoCliente(String nome, long telefone) {
        imobiliaria.gerir(nome, telefone);
    }

}
