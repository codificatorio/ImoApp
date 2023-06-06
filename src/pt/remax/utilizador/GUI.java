package pt.remax.utilizador;

import java.util.ArrayList;
import pt.remax.negócio.Imóvel;
import pt.remax.negócio.Imobiliária;

/**
 * Classe que representa um conjunto de ecrãs (nesta versão ecrãs imaginários).
 * Este classe consiste de métodos que serão executados aquando de cliques nos
 * botões nos ecrãs. Um botão clicado representa uma "ação" num ecrã, donde são
 * deduzidos os nomes dos métodos desta classe, que começam com o verbo
 * "acionar".
 */
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

    public void acionarGerirNovoCliente(String nome, String email) {
        // TODO validar valores antes de enviá-los à imobiliária
        imobiliaria.gerir(nome, email);
    }

    public void acionarValorizar(Imóvel valorizado, int valor) {
        imobiliaria.valorizar(valorizado, valor);
    }

    public ArrayList<Imóvel> acionarProcurarImóvel(String freguesia, int valorMínimo) {
        return imobiliaria.procurar(freguesia, valorMínimo);
    }

    public void acionarAbrirAgência(String rua, int nr, int cp0, int cp1, String freguesia, String email) {
        imobiliaria.abrir(rua, nr, cp0, cp1, freguesia, email);
    }

}
