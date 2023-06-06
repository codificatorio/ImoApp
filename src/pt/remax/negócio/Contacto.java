package pt.remax.negócio;

class Contacto {

    private String email;
    private int telefone;

    public Contacto(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

}
