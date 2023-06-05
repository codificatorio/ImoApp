package pt.remax.utilizador;


import pt.remax.negócio.Imóvel;
import pt.remax.negócio.Imobiliária;


public class GUI {

    private Imobiliária imobiliaria;

    public GUI(Imobiliária imobiliária) {
        this.imobiliaria = imobiliária;
    }

    public Imóvel acionarGerirNovoImóvel(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        // TODO validar valores antes de enviá-los à imobiliária
        return imobiliaria.gerir(rua, nr, cpPrimário, cpSecundário, freguesia);
        // na realidade, estes valores irão ser enviados a um servidor via a rede
        // nesse servidor, em geral, a validação é repetida
    }

    public void acionarGerirNovoCliente(String nome, long telefone) {
        // TODO validar valores antes de enviá-los à imobiliária
        imobiliaria.gerir(nome, telefone);
    }
    
    public void acionarValorizar(Imóvel valorizado, int valor) {
     imobiliaria.valorizar(valorizado, valor);
    }

}
