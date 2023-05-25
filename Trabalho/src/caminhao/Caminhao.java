package caminhao;

import enuns.CorEnum;
import enuns.TpVeicuEnum;
import pessoa.Pessoa;
import veiculo.Veiculo;

public class Caminhao extends Veiculo {

    public Caminhao(Pessoa dono, CorEnum cor, String placa, TpVeicuEnum tipoVeiculo) {
        super(dono, cor, placa, tipoVeiculo);
        this.setnRodas(6);
    }
    
}
