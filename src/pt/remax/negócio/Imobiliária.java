package pt.remax.negócio;

import pt.remax.dados.BaseDeDados;
import java.util.ArrayList;

public class Imobiliária {

    private ArrayList<Imóvel> cacheImóveis;
    private ArrayList<Cliente> cacheClientes;
    private ArrayList<Agência> agências; // TODO criar tabela na DB
    private BaseDeDados db;

    public Imobiliária(BaseDeDados db) {
        this.db = db;
        // precarregar alguns imóveis e clientes (nesta demonstração serão precarregados todos)
        cacheImóveis = db.selectImóveis("WHERE ..."); // ainda não funcional (analogia com bases de dados "SELECT FROM ... WHERE ...")
        cacheClientes = db.selectClientes("WHERE ...");
        agências = new ArrayList<>();
    }

    public Imóvel gerir(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        Imóvel gerido = new Imóvel(rua, nr, cpPrimário, cpSecundário, freguesia);
        cacheImóveis.add(gerido);
        return gerido;
        // TODO: sincronizar com a db
    }

    public void gerir(String nome, String email) {
        cacheClientes.add(new Cliente(nome, email));
    }
    
    public void abrir(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia, String email) {
        agências.add(new Agência(rua, nr, cpPrimário, cpSecundário, freguesia, email));
    }

    public void valorizar(Imóvel valorizado, int valor) {
        valorizado.valorizar(valor);
    }

    public ArrayList<Imóvel> procurar(String freguesia, int valorMínimo) {
        ArrayList<Imóvel> encontrados = new ArrayList<>();
        // iniciar a procura na coleção de todos os imóveis, com os critérios fornecidos
        for (Imóvel imóvel : cacheImóveis) {
            if (imóvel.éEm(freguesia) && imóvel.éMaisCaroQue(valorMínimo)) {
                encontrados.add(imóvel);
            }
        }
        return encontrados;
    }
    
    public ArrayList<Destinatário> listarDestinatários() {
        ArrayList<Destinatário> destinários = new ArrayList<>();
        destinários.addAll(cacheClientes);
        destinários.addAll(agências);
        return destinários;
    }

}
