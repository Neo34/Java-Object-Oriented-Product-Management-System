package service;

/**
 * Interface responsible for defining freight calculation behavior.
 * Not all products require shipping(e.g.,digital products),
 * therefore freight calculation is separated from the Product class
 * to respect the Single Responsability Principle.
 */
public interface FreteCalculavel {
    /**
     * Calculates the freight value for a product.
     *
     * @return freight cost
     */
    double calcularFrete();
}