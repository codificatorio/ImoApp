package pt.remax.negócio;

import pt.remax.dados.BaseDeDados;
import java.util.ArrayList;

public class Imobiliária {

    private ArrayList<Imóvel> cacheImóveis;
    private ArrayList<Cliente> cacheClientes;
    private BaseDeDados db;

    public Imobiliária(BaseDeDados db) {
        this.db = db;
        // precarregar alguns imóveis e clientes (nesta demonstração serão precarregados todos)
        cacheImóveis = db.selectImóveis("WHERE ..."); // ainda não funcional (analogia com bases de dados "SELECT FROM ... WHERE ...")
        cacheClientes = db.selectClientes("WHERE ...");
    }

    public Imóvel gerir(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia) {
        Imóvel gerido = new Imóvel(rua, nr, cpPrimário, cpSecundário, freguesia);
        cacheImóveis.add(gerido);
        return gerido;
        // TODO: sincronizar com a db
    }

    public void gerir(String nome, long telefone) {
        cacheClientes.add(new Cliente(nome, telefone));
        // TODO: sincronizar com a db
    }

    public void valorizar(Imóvel valorizado, int valor) {
        valorizado.valorizar(valor);
    }

    public ArrayList<Imóvel> procurar(String freguesia, int valorMínimo) {
        ArrayList<Imóvel> resultado = new ArrayList<>();
        // TODO instruções que procuram na coleção de todos os imóveis
        for (Imóvel imóvel : cacheImóveis) {
            if(imóvel.éEm(freguesia) && imóvel.éMaisCaroQue(valorMínimo))
                resultado.add(imóvel);
        }
        return resultado;
    }

}
