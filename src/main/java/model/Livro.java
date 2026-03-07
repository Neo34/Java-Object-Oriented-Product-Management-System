package model;

import entity.Produto;
import service.FreteCalculavel;

/**
 * Represents a physical book product.
 * Livro extends Produto becouse it is a specific type of a product
 * and implements FreteCalculavel becouse books require shipping.
 */
public class Livro extends Produto implements FreteCalculavel {

    /**
     * Fixed shipping cost per book unit.
     * Using a constant avoids magic numbers in the code and makes the freight rule easier to maintain
     * if the value changes.
     */
    private static final double FRETE_POR_UNIDADE = 5.0;

    /**
     * Constructor that initializes the book with name,price and quantity.
     */
    public Livro(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    /**
     * Calculates shipping cost for the book.
     * For this example,each unit adds a fixed shipping cost.
     */
    @Override
    public double calcularFrete() {
        return getQuantidade() * FRETE_POR_UNIDADE;
    }
}
