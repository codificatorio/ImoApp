
import java.util.ArrayList;

class BaseDeDados {

    // abordagem antiquada (com arrays)
    // Imóvel[] tabelaImóveis; 
    // Cliente[] tabelaClientes;
    //
    // abordagem moderna/atual (com coleções)
    ArrayList<Imóvel> tabelaImóveis;
    ArrayList<Cliente> tabelaClientes;

    BaseDeDados() {
        tabelaImóveis = new ArrayList<>();
        tabelaClientes = new ArrayList<>();
        precarregarImóveis();
        precarregarClientes();
    }

    void precarregarImóveis() {
        tabelaImóveis.add(new Imóvel("Rua do Olival", 39, 1200, 739, "Lisboa"));
        tabelaImóveis.add(new Imóvel("Rua do Dragão", 51, 2200, 445, "Porto"));
        tabelaImóveis.add(new Imóvel("Rua Direita", 6, 'E', 2800, 100, "Almada", 38.67423167513273, -9.169060891300655));
    }

    void precarregarClientes() {
        tabelaClientes.add(new Cliente("Vasco", "vasco@fidelidade.pt", "Arroios"));
        tabelaClientes.add(new Cliente("Délia", "delia@fidelidade.pt"));
    }

    ArrayList<Imóvel> selectImóveis(String where) { // TODO: avaliar o "where" (em Java chama-se "Predicate")
        ArrayList<Imóvel> extrato = new ArrayList<>();
        extrato.addAll(tabelaImóveis);
        return extrato;
    }

    ArrayList<Cliente> selectClientes(String where) { // TODO: avaliar o "where"
        ArrayList<Cliente> extrato = new ArrayList<>();
        extrato.addAll(tabelaClientes);
        return extrato;
    }

}
