package carro;

import enuns.CorEnum;
import enuns.TpVeicuEnum;
import pessoa.Pessoa;
import veiculo.Veiculo;

public class Carro extends Veiculo {

    public Carro(Pessoa dono, CorEnum cor, String placa, TpVeicuEnum tipoVeiculo) {
        super(dono, cor, placa, tipoVeiculo);
        this.setnRodas(4);
    }
    
}
