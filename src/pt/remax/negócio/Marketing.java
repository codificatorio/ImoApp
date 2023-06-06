package pt.remax.negócio;

import java.util.ArrayList;

public class Marketing {

    private Marketing() {
    }

    public static void enviar(String mensagem, ArrayList<Destinatário> destinatários) {
        for (Destinatário destinatário : destinatários) {
            destinatário.remeter(mensagem);
        }
    }

}
