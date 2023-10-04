package entities;

// Classe que representa uma pessoa física como contribuinte
public class PessoaFisica extends Dados {
    private Double gastoSaude;

    // Construtor padrão vazio
    public PessoaFisica() {
        super();
    }

    // Construtor que inicializa nome, renda anual e gastos com saúde da pessoa física
    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    // Método getter para obter os gastos com saúde da pessoa física
    public Double getGastoSaude() {
        return gastoSaude;
    }

    // Método setter para definir os gastos com saúde da pessoa física
    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    // Método que calcula o total de impostos a serem pagos pela pessoa física
    @Override
    public Double total() {
        if (getRendaAnual() < 20000.0) {
            // Se a renda anual for menor que $20000, a taxa é de 15% da renda anual
            return super.getRendaAnual() * 15.0 / 100.0;
        } else {
            // Se a renda anual for maior ou igual a $2000, a taxa é de 25% da renda anual
            // menos 50% dos gastos com saúde
            return (super.getRendaAnual() * 25.0 / 100.0) - (getGastoSaude() * 50.0 / 100.0);
        }
    }
}
