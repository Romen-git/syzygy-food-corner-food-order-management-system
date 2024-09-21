/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ordermanagementsystem.model.Cart;
import ordermanagementsystem.model.CartItem;
import ordermanagementsystem.model.Chats;
import ordermanagementsystem.model.Item;
import ordermanagementsystem.model.OrderLine;

/**
 *
 * @author acer
 */
public class OrderService {

    private Cart cart;

    public OrderService() {
        this.cart = new Cart(new ArrayList<>(), 0);

    }

    public void addToCart(CartItem cartItem) {
        this.cart.addItemToCart(cartItem);
    }

    public void clearCart() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }

    public Cart getCart() {
        return this.cart;
    }

    public List<OrderLine> getAllOrders() {

        List<OrderLine> orderlines = new ArrayList<>();
        try ( Scanner scanner = new Scanner(new FileInputStream("storage/orderline.txt"))) {
            while (scanner.hasNextLine()) {
                String orderLine = scanner.nextLine();

                String orderInfo[] = orderLine.split(",");

                OrderLine orderLine1 = new OrderLine(Integer.parseInt(orderInfo[0]), orderInfo[1],
                        orderInfo[2], Integer.parseInt(orderInfo[3]), Double.parseDouble(orderInfo[4]));

                orderlines.add(orderLine1);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrderService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderlines;
    }

    public boolean clearOrder() {

        List<OrderLine> orderList = getAllOrders();

        orderList.remove(0);

        try {
            // Delete the entire file
            Files.delete(Paths.get("storage/orderline.txt"));
        } catch (IOException ex) {
            Logger.getLogger(OrderService.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Create a new file and write new data into the file
        try ( PrintWriter pw = new PrintWriter(new FileOutputStream("storage/orderline.txt"))) {
            orderList.forEach(order -> {
                pw.println(order.getOrderID() + "," + order.getName() + "," + order.getToppings() + "," + order.getQuantity() + "," + order.getPrice());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrderService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;

    }

    public OrderLine getFirstOrder() {

        List<OrderLine> orderList = getAllOrders();

        return orderList.get(0);

    }

}
