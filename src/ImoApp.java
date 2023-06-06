
import java.util.ArrayList;
import java.util.List;
import pt.remax.utilizador.GUI;
import pt.remax.dados.BaseDeDados;
import pt.remax.negócio.Destinatário;
import pt.remax.negócio.Imóvel;
import pt.remax.negócio.Imobiliária;
import pt.remax.negócio.Marketing;

class ImoApp {

    static GUI interfaceGráfica;

    public static void main(String[] args) {
        System.out.println("Bem-vindos à ImoApp\n");
        // Preparação para posteriormente poder distribuir a app (em várias máquinas físicas)
        BaseDeDados db = new BaseDeDados(); // Data TIER (camada que permite guardar valores)
        Imobiliária remax = new Imobiliária(db); // Business TIER (camada de objetos e algoritmos do nosso negócio)
        interfaceGráfica = new GUI(remax); // Client TIER (camada de componentes gráficos, menus e ecrãs, utilizados pelo utilizador da app)
        // Tudo preparado. Agora vamos simular que alguem da imobiliária utiliza a app.
        simularUtilização();
        simularPromoção(
                "Nesta época natalícia reduzimos a nossa comissão com 0.5%",
                remax.listarDestinatários()
        );
    }

    /**
     * Este método simula o uso da app por um funcionário imobiliário
     */
    static void simularUtilização() {

        // Simular que um utilizador preencheu campos no ecrã de novos imóveis e clicou no botão "Gerir novo imóvel"
        Imóvel emLisboa = interfaceGráfica.acionarGerirNovoImóvel("Praça da República", 23, 1000, 525, "Lisboa");
        Imóvel emFaro = interfaceGráfica.acionarGerirNovoImóvel("Rua do Prazer", 77, 2000, 325, "Faro");
        interfaceGráfica.acionarGerirNovoCliente("Elisabete", "elisabete@fidelidade.pt");

        // Simular que é atribuído um valor (preço de venda) a um desses imóveis
        try {
            interfaceGráfica.acionarValorizar(emLisboa, -100000); // valor será validado e não aceite
            interfaceGráfica.acionarValorizar(emLisboa, 100000); // 2a tentativa que será aceite (valor positivo)
        } catch (Exception problema) {
            System.out.println(problema);
        }

        // Simular uma procura (um agente preenche um critério de procura num ecrã)
        System.out.println("\nIniciamos uma procura dos imóveis em Lisboa > €100000");
        List<Imóvel> encontrados = interfaceGráfica.acionarProcurarImóvel("Lisboa", 100000);
        System.out.println("Encontrámos os seguintes imóveis:");
        //System.out.println(encontrados);
        for (Imóvel imóvel : encontrados) {
            System.out.println(imóvel.toString());
        }

        // Simular outra procura, com a sintaxe das "lambdas"
        System.out.println("\nIniciamos uma procura dos imóveis cujo código postal entre 2000 e 3000");
        encontrados = interfaceGráfica.acionarProcurarImóvel(2000, 3000);
        //encontrados.forEach(imóvel -> System.out.println(imóvel)); // sintaxe lambda (alternativa a for loops)
        encontrados.forEach(System.out::println); // sintaxe "method reference" (alternativa à sintaxe lambda)

        // Simular que num outro ecrã, é feito o registo de uma nova agência
        interfaceGráfica.acionarAbrirAgência("Rua Alexandre Herculano", 33, 1100, 546, "São Mamede", "saomamede@remax.pt");

    }

    static void simularPromoção(String mensagem, ArrayList<Destinatário> destinatários) {
        // new Marketing(); // instanciação impossível por ter um construtor privado
        // imaginemos que temos o email de um diretor, a quem tabém queremos enviar esta mensagem
        destinatários.add(new Destinatário() { // instanciar interface é permitido, se fornecer uma implementação dos seus métodos
            @Override
            public String getDestino() {
                return "diretor.alves@remax.pt";
            }

        });
        destinatários.add(() -> "gerente.porto@remax.pt"); // sintaxe lambda que permite instanciar interfaces
        Marketing.enviar(mensagem, destinatários);
    }
}
