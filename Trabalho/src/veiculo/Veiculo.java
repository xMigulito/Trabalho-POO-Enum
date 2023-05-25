package veiculo;

import enuns.CorEnum;
import enuns.TpVeicuEnum;
import pessoa.Pessoa;

public abstract class Veiculo {
    private int nRodas;
    private Pessoa dono;
    private CorEnum cor;
    private String placa;
    private TpVeicuEnum tipoVeiculo;

    public Veiculo(Pessoa dono, CorEnum cor, String placa, TpVeicuEnum tipoVeiculo) {
        this.setDono(dono);
        this.setCor(cor);
        this.setPlaca(placa);
        this.setTipoVeiculo(tipoVeiculo);

    }

    public int getnRodas() {
        return nRodas;
    }

    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public CorEnum getCor() {
        return cor;
    }

    public void setCor(CorEnum cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TpVeicuEnum getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TpVeicuEnum tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo [nRodas=" + nRodas + ", dono=" + dono + ", cor=" + cor + ", placa=" + placa + ", tipoVeiculo="
                + tipoVeiculo + "]";
    }

    
    
}
