package pt.remax.negócio;

import java.util.ArrayList;

public class Cliente extends Pessoa implements Destinatário {

    // campos agora definidos na super classe
    /*private String nome;
    private int NIF;
    private String email;
    private long telefone;
    private Contacto contacto;
    private Morada morada;*/
    private ArrayList<Imóvel> propriedades;

    //
    public Cliente(String nome, String email, String freguesia) {
        super(nome, email, freguesia);
    }

    public Cliente(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void remeter(String mensagem) {
        String email = getEmail();
    }

}
