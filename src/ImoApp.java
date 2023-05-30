public class ImoApp {

    public static void main(String[] args) {
        System.out.println("Bem-vindos à ImoApp");
        Imóvel emLisboa = new Imóvel("Rua do Olival", 39, 1200, 739, "Lisboa");
        emLisboa.preço = 100000;
        Imóvel noPorto = new Imóvel("Rua do Dragão", 51, 2200, 445, "Porto");
        Cliente vasco = new Cliente("Vasco", "vasco@fidelidade.pt", "Arroios");
    }
    
}
