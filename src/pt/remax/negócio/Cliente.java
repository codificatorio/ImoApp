package pt.remax.negócio;


public class Cliente {

    private String nome;
    private int NIF;
    private String email;
    private long telefone;
    private Morada morada;

    public Cliente(String nome, String email, String freguesia) {
        this(nome, email);
        morada = new Morada(freguesia);
    }

    public Cliente(String nome, String email) {
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
