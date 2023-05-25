import java.util.ArrayList;
import java.util.List;

import caminhao.Caminhao;
import carro.Carro;
import enuns.CorEnum;
import enuns.TpVeicuEnum;
import garagem.Garagem;
import moto.Moto;
import pessoa.Pessoa;
import veiculo.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pss1 = new Pessoa("Maria", "123456789", "F");
        Pessoa pss2 = new Pessoa("José", "987654321", "M");
        Pessoa pss3 = new Pessoa("Carlos", "1239873456", "M");

        
        Moto mt1 = new Moto(pss1, CorEnum.ROXO, "Mototeta", TpVeicuEnum.MOTO);
        Carro cr1 = new Carro(pss2, CorEnum.MARROM, "Carroteta", TpVeicuEnum.CARRO);
        Caminhao cm1 = new Caminhao(pss3, CorEnum.VERDE, "Caminhateta", TpVeicuEnum.CAMINHÃO);

        List<Object> lista = new ArrayList<>();

        lista.add(mt1);
        lista.add(cr1);
        lista.add(cm1);

        Garagem garagem = new Garagem();

        garagem.varrer(lista);
    }
}
