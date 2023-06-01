
import java.util.ArrayList;

public class Imobiliária {

    ArrayList<Imóvel> cacheImóveis;
    ArrayList<Cliente> cacheClientes;
    BaseDeDados db;

    public Imobiliária(BaseDeDados db) {
        this.db = db;
        // precarregar alguns imóveis e clientes (nesta demonstração serão precarregados todos)
        cacheImóveis = db.selectImóveis("WHERE ..."); // ainda não funcional (analogia com bases de dados "SELECT FROM ... WHERE ...")
        cacheClientes = db.selectClientes("WHERE ..."); 
    }

    void gerir(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        cacheImóveis.add(new Imóvel(rua, nr, cpPrimário, cpSecundário, freguesia));
        // TODO: sincronizar com a db
    }

    void gerir(String nome, long telefone) {
        cacheClientes.add(new Cliente(nome, telefone));
        // TODO: sincronizar com a db
    }

}
