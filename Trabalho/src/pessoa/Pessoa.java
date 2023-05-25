package pessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private String sexo;

    public Pessoa(String nome, String cpf, String sexo) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
    }

    
    
}
