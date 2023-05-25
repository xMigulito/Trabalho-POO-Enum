package moto;

import enuns.CorEnum;
import enuns.TpVeicuEnum;
import pessoa.Pessoa;
import veiculo.Veiculo;

public class Moto extends Veiculo{

    public Moto(Pessoa dono, CorEnum cor, String placa, TpVeicuEnum tipoVeiculo) {
        super(dono, cor, placa, tipoVeiculo);
        this.setnRodas(2);
    }
    
}
