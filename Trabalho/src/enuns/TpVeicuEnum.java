package enuns;

public enum TpVeicuEnum {
    CARRO("Carro"),
    MOTO("Moto"),
    CAMINHÃO("Caminhão");

    private String tipo;

    private TpVeicuEnum(String tipo) {
        this.setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
