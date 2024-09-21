/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.model;

/**
 *
 * @author acer
 */
public interface ToppingExpression {

    CartItem interpret(CartItem cartItem,ToppingFactory toppingFactory);
}
