/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author acer
 */
public class CartItem {

    private ItemFlyWeight item;
    private List<ToppingFlyWeight> topping;
    private int quantity;
    private double price;

    private CartItem(CartItem.CartItemBuilder cartItemBuilder) {
        this.item = cartItemBuilder.item;
        this.quantity = cartItemBuilder.quantity;
        this.price = cartItemBuilder.price;
        this.topping = cartItemBuilder.topping;
    }

    public ItemFlyWeight getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public List<ToppingFlyWeight> getTopping() {
        return topping;
    }

    public static class CartItemBuilder {

        private ItemFlyWeight item;
        private List<ToppingFlyWeight> topping;
        private int quantity;
        private double price;

        public CartItemBuilder() {
            this.topping = new ArrayList<>();
        }

        public CartItemBuilder(CartItem cartItem) {
            this.item = cartItem.item;
            this.topping = cartItem.topping;
            this.quantity = cartItem.quantity;
            this.price = cartItem.price;
        }

        public CartItemBuilder setItem(ItemFlyWeight item) {
            this.item = item;
            return this;
        }

        public CartItemBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public CartItemBuilder setPrice(double price) {
            this.price = this.price + price;
            return this;
        }

        public CartItemBuilder setTopping(ToppingFlyWeight topping1) {

            topping.add(topping1);
            return this;
        }

        public CartItem build() {

            return new CartItem(this);
        }
    }

}
