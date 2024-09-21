/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.model;

/**
 *
 * @author acer
 */
public class SauceExpression implements ToppingExpression {
    
    private String topping;
    
    public SauceExpression(String topping) {
        
        this.topping = topping;
    }
    
    @Override
    public CartItem interpret(CartItem cartItem, ToppingFactory toppingFactory) {
        Double price = 0.0;
        if (topping.equalsIgnoreCase("Sauce")) {
            price = 50.0;
        }
        
        return new CartItem.CartItemBuilder(cartItem).setTopping(toppingFactory.getTopping(topping)).setPrice(price).build();
        
    }
    
}
