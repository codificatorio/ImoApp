package pt.remax.negócio;

class Localidade {

    private String distrito;
    private String concelho;
    private String freguesia;
    private CódigoPostal códigoPostal;  // p.ex. 1200-739

    public Localidade(String freguesia, int primário, int secundário) {
        this.freguesia = freguesia;
        this.códigoPostal = new CódigoPostal(primário, secundário);
    }

    public Localidade(String freguesia) {
        this.freguesia = freguesia;
    }

    boolean éEm(String freguesia) {
        return this.freguesia.equals(freguesia);
    }

    @Override
    public String toString() {
        return freguesia;
    }

    int getCódigoPostalPrimário() {
        return códigoPostal.primário;
    }
    
    

}
