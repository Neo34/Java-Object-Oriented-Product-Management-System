package model;

import entity.Produto;

/**
 * Represents a digital product such as an e-book or software.
 * Digital products do not require shipping.
 * therefore they do not implement FreteCalculavel.
 */
public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }
}
