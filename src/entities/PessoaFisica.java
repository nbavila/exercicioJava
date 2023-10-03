package entities;

public class PessoaFisica extends Dados {
    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double total() {
        if (getRendaAnual() < 2000.0) {
            return super.getRendaAnual() * 15.0 / 100.0;
        } else {
            return (super.getRendaAnual() * 25.0 / 100.0) - (getGastoSaude() * 50.0 / 100.0);
        }
    }
}
