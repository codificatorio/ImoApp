package pt.remax.dados;

import pt.remax.negócio.Imóvel;
import pt.remax.negócio.Cliente;
import java.util.ArrayList;
import pt.remax.negócio.Agente;
import pt.remax.negócio.Cor;
import pt.remax.negócio.Pessoa;

public class BaseDeDados {

    // abordagem antiquada (com arrays)
    // Imóvel[] tabelaImóveis; 
    // Cliente[] tabelaClientes;
    //
    // abordagem moderna/atual (com coleções)
    private ArrayList<Imóvel> tabelaImóveis;
    //private ArrayList<Cliente> tabelaClientes;
    private ArrayList<Pessoa> tabelaPessoas;

    public BaseDeDados() {
        tabelaImóveis = new ArrayList<>();
        tabelaPessoas = new ArrayList<>();
        precarregarImóveis();
        precarregarPessoas();
    }

    private void precarregarImóveis() {
        tabelaImóveis.add(new Imóvel("Rua do Olival", 39, 1200, 739, "Lisboa"));
        tabelaImóveis.get(0).valorizar(120000);
        tabelaImóveis.get(0).setCor(Cor.VERMELHO);
        tabelaImóveis.add(new Imóvel("Rua da Pereira", 25, 1350, 213, "Lisboa"));
        tabelaImóveis.get(1).valorizar(75000);
        tabelaImóveis.add(new Imóvel("Rua dos Estrangeiros", 11, 1100, 544, "Lisboa"));
        tabelaImóveis.add(new Imóvel("Rua do Dragão", 51, 2200, 445, "Porto"));
        tabelaImóveis.add(new Imóvel("Rua Direita", 6, 'E', 2800, 100, "Almada", 38.67423167513273, -9.169060891300655));
    }

    private void precarregarPessoas() {
        tabelaPessoas.add(new Cliente("Vasco", "vasco@fidelidade.pt", "Arroios"));
        tabelaPessoas.add(new Cliente("Délia", "delia@fidelidade.pt"));
        tabelaPessoas.add(new Agente("Joao", "joao@remax.pt"));
    }

    public ArrayList<Imóvel> selectImóveis(String where) { // TODO: avaliar o "where" (em Java chama-se "Predicate")
        ArrayList<Imóvel> extrato = new ArrayList<>();
        extrato.addAll(tabelaImóveis);
        return extrato;
    }

    public ArrayList<Cliente> selectClientes(String where) { // TODO: avaliar o "where"
        ArrayList<Cliente> extrato = new ArrayList<>();
        //extrato.addAll(tabelaPessoas);
        for (Pessoa pessoa : tabelaPessoas) {
            if (pessoa instanceof Cliente) {
                extrato.add((Cliente) pessoa);
            }
        }
        return extrato;
    }

}
