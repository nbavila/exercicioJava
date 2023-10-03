package entities;

// Classe abstrata que representa dados de contribuintes
public abstract class Dados {
    private String nome;         // Nome do contribuinte
    private Double rendaAnual;   // Renda anual do contribuinte

    // Construtor padrão vazio
    public Dados() {
    }

    // Construtor que inicializa nome e renda anual
    public Dados(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    // Método getter para obter o nome do contribuinte
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do contribuinte
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a renda anual do contribuinte
    public Double getRendaAnual() {
        return rendaAnual;
    }

    // Método setter para definir a renda anual do contribuinte
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    // Método abstrato que deve ser implementado nas subclasses para calcular o total de impostos
    public abstract Double total();
}
