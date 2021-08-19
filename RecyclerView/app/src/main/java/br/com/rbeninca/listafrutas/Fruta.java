package br.com.rbeninca.listafrutas;


import java.math.BigDecimal;

public class Fruta {
    private String nome;
    private String descricao;
    private int imagem;
    private BigDecimal preco;
    private BigDecimal preco_venda;
    private int num_avaliacoes;
    private BigDecimal avaliacoes;
    private int codigo;

    public Fruta(String nome, String descricao, int imagem, BigDecimal preco, BigDecimal preco_venda, int num_avaliacoes, BigDecimal avaliacoes, int codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.preco = preco;
        this.preco_venda = preco_venda;
        this.num_avaliacoes = num_avaliacoes;
        this.avaliacoes = avaliacoes;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(BigDecimal preco_venda) {
        this.preco_venda = preco_venda;
    }

    public int getNum_avaliacoes() {
        return num_avaliacoes;
    }

    public void setNum_avaliacoes(int num_avaliacoes) {
        this.num_avaliacoes = num_avaliacoes;
    }

    public BigDecimal getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(BigDecimal avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
