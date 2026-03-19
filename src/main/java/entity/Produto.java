package entity;

import exception.InvalidProductException;

/**
 * Abstract base class that represents a generic product in the system.
 * This class defines the common attributes shared by all product types,
 * such as name,price and quantity.
 * It does NOT define freight behavior,since not every product
 * necessarily has shipping costs(e.g.,digital products).
 * Subclasses should extend this class to represent specific product types.
 */

public abstract class Produto {
    /**
     * Product name.
     */
    private String nome;

    /**
     * Unit price of the product.
     */

    private double preco;

    /**
     * Quantity of the product in the order.
     */
    private int quantidade;

    /**
     * Constructs a product with required attributes.
     *
     * @param nome       the product name
     * @param preco      the unit price
     * @param quantidade the quantity selected
     */
    public Produto(String nome, double preco, int quantidade) {
        if (nome == null || nome.isBlank()) {
            throw new InvalidProductException("Product name cannot be empty.");
        }
        if (preco <= 0) {
            throw new InvalidProductException("Price must be greater than zero.");
        }
        if (quantidade <= 0) {
            throw new InvalidProductException("Quantity must be greater than zero.");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * @return the product name
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the unit price of the product
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @return the quantity selected
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Calculates the subtotal of the product
     * (unit price multiplied by quantity).
     * This method represents shared behavior among all product types.
     *
     * @return subtotal value
     */
    public double calcularSubtotal() {
        return preco * quantidade;
    }
}