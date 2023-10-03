package entities;

public class PessoaJuridica extends Dados {
    private Integer numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double total() {
        if (getNumeroFuncionarios() > 10) {
            return super.getRendaAnual() * 14.0 / 100.0;
        } else {
            return super.getRendaAnual() * 16.0 / 100.0;
        }
    }
}
