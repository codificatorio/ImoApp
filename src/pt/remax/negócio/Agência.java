package pt.remax.negócio;

import java.util.ArrayList;

class Agência extends Prédio implements Destinatário {

    //private Morada morada;
    //private int área;
    //private int divisões;
    private ArrayList<Contacto> contactos;
    //private Caderneta caderneta;

    public Agência(String rua, int nr, int cpPrimário, int cpSecundário, String freguesia, String email) {
        morada = new Morada(rua, nr, cpPrimário, cpSecundário, freguesia);
        contactos = new ArrayList<>();
        contactos.add(new Contacto(email));
    }

    @Override
    public void remeter(String mensagem) {
        String email = contactos.get(0).getEmail();   }

}
