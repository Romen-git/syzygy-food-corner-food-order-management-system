/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.model;

/**
 *
 * @author acer
 */
public class Order {
    
    private int orderID;
    private double price;
    private String date;
    
    private Order(OrderBuilder orderBuilder) {
        this.orderID = orderBuilder.orderID;
        this.price = orderBuilder.price;
        this.date = orderBuilder.date;
    }
    
    public int getOrderID() {
        return orderID;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getDate() {
        return date;
    }
    
    public static class OrderBuilder {
        
        private int orderID;
        private double price;
        private String date;
        
        public OrderBuilder(){
        
        }
        
        public OrderBuilder setOrderID(int orderID) {
            this.orderID = orderID;
            return this;
        }
        
        public OrderBuilder setPrice(double price) {
            this.price = price;
            return this;
        }
        
        public OrderBuilder setDate(String date) {
            this.date = date;
            return this;
        }
        
        public Order build() {
            return new Order(this);
        }
        
    }
    
}
