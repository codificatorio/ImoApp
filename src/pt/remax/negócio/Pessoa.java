package pt.remax.negócio;

public abstract class Pessoa {

    private String nome;
    private int NIF;
    //private String email;
    //private long telefone;
    private Contacto contacto;
    private Morada morada;

    Pessoa(String nome, String email, String freguesia) {
        this(nome, email);
        morada = new Morada(freguesia);
    }

    Pessoa(String nome, String email) {
        if (nome.length() < 5) {
            // não aceitar 
        }
        if (email.indexOf('@') == -1) {
            // nao aceitar
        }
        this.nome = nome;
        this.contacto = new Contacto(email);
    }
    
    String getEmail() {
        return contacto.getEmail();
    }

}
