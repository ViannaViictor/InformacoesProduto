package Entidade;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


    public void setNome(String nome) {

        this.nome = nome;
    }


    public void setPreco(double preco) {

        this.preco = preco;
    }


    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public double valorTotal() {

        return preco * quantidade;
    }

    public void adicaoProduto(int quantidade) {

        this.quantidade += quantidade;
    }

    public void remocaoProduto(int quantidade) {

        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", R$"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$ "
                + String.format("%.2f", valorTotal());
    }

}
