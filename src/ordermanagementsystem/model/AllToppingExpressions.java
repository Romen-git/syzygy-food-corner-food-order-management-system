/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.model;

/**
 *
 * @author acer
 */
public class AllToppingExpressions implements ToppingExpression {

    private final ToppingExpression[] toppingExpressions;

    public AllToppingExpressions(ToppingExpression... toppingExpressions) {
        this.toppingExpressions = toppingExpressions;
    }

    @Override
    public CartItem interpret(CartItem cartItem, ToppingFactory toppingFactory) {

        CartItem cartItem1 = cartItem;

        for (ToppingExpression toppingExpression : toppingExpressions) {

            cartItem1 = toppingExpression.interpret(cartItem1, toppingFactory);

        }

        return cartItem1;
    }

}
