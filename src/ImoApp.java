
import pt.remax.utilizador.GUI;
import pt.remax.dados.BaseDeDados;
import pt.remax.negócio.Imóvel;
import pt.remax.negócio.Imobiliária;


class ImoApp {
    
    static GUI interfaceGráfica;

    public static void main(String[] args) {
        System.out.println("Bem-vindos à ImoApp");
        // Preparação para posteriormente poder distribuir a app (em várias máquinas físicas)
        BaseDeDados db = new BaseDeDados(); // Data TIER (camada que permite guardar valores)
        Imobiliária remax = new Imobiliária(db); // Business TIER (camada de objetos e algoritmos do nosso negócio)
        interfaceGráfica = new GUI(remax); // Client TIER (camada de componentes gráficos, menus e ecrãs, utilizados pelo utilizador da app)
        // Tudo preparado. Agora vamos simular que alguem da imobiliária utiliza a app.
        simularUtilização();
    }
    
    static void simularUtilização() {
        // Simular que um utilizador preencheu campos no ecrã de novos imóveis e clicou no botão "Gerir novo imóvel"
        Imóvel emLisboa = interfaceGráfica.acionarGerirNovoImóvel("Praça da República", 23, 1000, 525, "Lisboa");
        Imóvel emFaro = interfaceGráfica.acionarGerirNovoImóvel("Rua do Prazer", 77, 2000, 325, "Faro");
        interfaceGráfica.acionarGerirNovoCliente("Elisabete", 351214587965L);
        // Simular que é atribuído um valor (preço de venda) a um desses imóveis
        interfaceGráfica.acionarValorizar(emLisboa, -100000);
        // Ups
        interfaceGráfica.acionarValorizar(emLisboa, 100000);
    }

}
