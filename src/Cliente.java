
public class Cliente {

    String nome;
    int NIF;
    String email;
    Morada morada;

    Cliente(String nome, String email, String freguesia) {
        this.nome = nome;
        this.email = email;
        morada = new Morada(freguesia);
    }

}
