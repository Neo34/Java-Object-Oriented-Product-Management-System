package application;

import cart.CarrinhoDeCompras;
import model.Livro;
import model.ProdutoDigital;

/**
 * Main class responsible for running the application.
 * Demonstrates the use of the domain classses by simulating
 * a simple purchase scenario.
 */
public class Program {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Livro livro = new Livro("Java Programming", 50.0, 2);
        ProdutoDigital ebook = new ProdutoDigital("Java Ebook", 30.0, 1);

        carrinho.adicionarProduto(livro);
        carrinho.adicionarProduto(ebook);

        System.out.println("Subtotal: " + carrinho.calcularSubtotal());
        System.out.println("Frete: " + carrinho.calcularFreteTotal());
        System.out.println("Total: " + carrinho.calcularTotal());
    }
}
