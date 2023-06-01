
public class Cliente {

    String nome;
    int NIF;
    String email;
    long telefone;
    Morada morada;

    Cliente(String nome, String email, String freguesia) {
        this(nome, email);
        morada = new Morada(freguesia);
    }

    Cliente(String nome, String email) {
        if (nome.length() < 5) {
            // não aceitar 
        }
        if (email.indexOf('@') == -1) {
            // nao aceitar
        }
        this.nome = nome;
        this.email = email;
    }

    Cliente(String nome, long telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

}
