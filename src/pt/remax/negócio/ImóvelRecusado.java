package pt.remax.negócio;

public class ImóvelRecusado extends Exception {

    public ImóvelRecusado(String problema) {
        super(problema);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + super.getMessage();
    }
    
    

}
