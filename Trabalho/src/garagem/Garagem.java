package garagem;

import java.security.cert.CRL;
import java.util.ArrayList;
import java.util.List;
import moto.Moto;
import caminhao.Caminhao;
import carro.Carro;

import veiculo.Veiculo;

public class Garagem {
    Veiculo[] vagas = new Veiculo[10];

    public Garagem() {
    }

    List<Moto> moto = new ArrayList<>();
    List<Caminhao> caminhao = new ArrayList<>();
    List<Carro> carro = new ArrayList<>();


    public void varrer(List lista){
        for(Object obj : lista){
            if (obj instanceof Moto){
                Moto var = (Moto) obj;
                moto.add(var);
            }else if(obj instanceof Carro){
                Carro var = (Carro) obj;
                carro.add(var);
            }else if(obj instanceof Caminhao){
                Caminhao var = (Caminhao) obj;
                caminhao.add(var);
            }
        }
        System.out.println(moto);
        System.out.println(carro);
        System.out.println(caminhao);
    }


    public Garagem(Veiculo[] vagas) {
        this.setVagas(vagas);
    }

    public Veiculo[] getVagas() {
        return vagas;
    }

    public void setVagas(Veiculo[] vagas) {
        this.vagas = vagas;
    }

    
}
