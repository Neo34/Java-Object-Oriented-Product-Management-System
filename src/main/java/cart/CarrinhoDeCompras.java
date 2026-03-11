package cart;

import entity.Produto;
import service.FreteCalculavel;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping cart containing products.
 * <p>
 * Demonstrates composition by holding a list of Produto objects.
 */
public class CarrinhoDeCompras {

    private List<Produto> produtos = new ArrayList<>();

    /**
     * Adds a product to the cart.
     */
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    /**
     * Calculates subtotal of all products in the cart.
     */
    public double calcularSubtotal() {

        double total = 0;

        for (Produto produto : produtos) {
            total += produto.calcularSubtotal();
        }

        return total;
    }

    /**
     * Calculates total shipping cost.
     * Only products implementing FreteCalculavel will contribute.
     */
    public double calcularFreteTotal() {

        double total = 0;

        for (Produto produto : produtos) {

            if (produto instanceof FreteCalculavel) {
                FreteCalculavel frete = (FreteCalculavel) produto;
                total += frete.calcularFrete();
            }

        }

        return total;
    }

    /**
     * Calculates final total including shipping.
     */
    public double calcularTotal() {
        return calcularSubtotal() + calcularFreteTotal();
    }
}