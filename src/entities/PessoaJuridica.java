package entities;

// Classe que representa uma pessoa jurídica como contribuinte
public class PessoaJuridica extends Dados {
    private Integer numeroFuncionarios;

    // Construtor padrão vazio
    public PessoaJuridica() {
        super();
    }

    // Construtor que inicializa nome, renda anual e número de funcionários da pessoa jurídica
    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Método getter para obter o número de funcionários da pessoa jurídica
    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    // Método setter para definir o número de funcionários da pessoa jurídica
    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Método que calcula o total de impostos a serem pagos pela pessoa jurídica
    @Override
    public Double total() {
        if (getNumeroFuncionarios() > 10) {
            // Se a pessoa jurídica tiver mais de 10 funcionários, a taxa é de 14% da renda anual
            return super.getRendaAnual() * 14.0 / 100.0;
        } else {
            // Se a pessoa jurídica tiver 10 funcionários ou menos, a taxa é de 16% da renda anual
            return super.getRendaAnual() * 16.0 / 100.0;
        }
    }
}
