package enuns;

public enum CorEnum {
    PRETO("Preto"),
    CINZA("Cinza"),
    VERMELHO("Vermelho"),
    MARROM("Marrom"),
    ROXO("Roxo"),
    VERDE("Verde");

    private String tipo;

    private CorEnum(String tipo) {
        this.setTipo(tipo);;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
