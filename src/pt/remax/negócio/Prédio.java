package pt.remax.negócio;

abstract class Prédio extends Object {

    protected Morada morada;
    private int área;
    private int divisões;
    private Caderneta caderneta;
    private Cor cor;

    public void setÁrea(int área) {
        // TODO validar
        this.área = área;
    }

    public void setDivisões(int divisões) {
        this.divisões = divisões;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " · " + morada.toString();
    }

}
