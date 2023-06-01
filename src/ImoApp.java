
public class ImoApp {

    public static void main(String[] args) {
        System.out.println("Bem-vindos à ImoApp");
        BaseDeDados db = new BaseDeDados(); // Data TIER (componente que permite guardar valores)
        Imobiliária remax = new Imobiliária(db); // Business TIER (algoritmos do nosso negócio)
        GUI interfaceGráfica = new GUI(remax); // Client TIER (componentes utilizados pelo utilizador da app)
        /*
        Imóvel emLisboa = new Imóvel("Rua do Olival", 39, 1200, 739, "Lisboa");
        emLisboa.preço = 100000;
        Imóvel noPorto = new Imóvel("Rua do Dragão", 51, 2200, 445, "Porto");
        Imóvel emAlmada = new Imóvel("Rua Direita", 6, 'E', 2800, 100, "Almada", 38.67423167513273, -9.169060891300655);
        Cliente vasco = new Cliente("Vasco", "vasco@fidelidade.pt", "Arroios");
        Cliente délia = new Cliente("Délia", "delia@fidelidade.pt");
         */
    }

}
