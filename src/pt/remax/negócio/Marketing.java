package pt.remax.negócio;

import java.util.ArrayList;

public class Marketing {

    private Marketing() {
    }

    public static void enviar(String mensagem, ArrayList<Destinatário> destinatários) {
        System.out.println("\nA mensagem \"" + mensagem + "\" será enviada a estes destinatários:\n");
        for (Destinatário destinatário : destinatários) {
            // simulação do envio
            System.out.println(destinatário.getDestino() + "· " + destinatário);
        }
    }

}
