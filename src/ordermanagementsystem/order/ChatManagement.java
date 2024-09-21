/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.order;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ordermanagementsystem.model.Item;
import ordermanagementsystem.model.OrderLine;
import ordermanagementsystem.service.ItemService;
import ordermanagementsystem.service.OrderService;

/**
 *
 * @author acer
 */
public class ChatManagement {

    public ChatManagement() {
    }

    public void storeMessage(String message, String name) {

        if (name.equalsIgnoreCase("Customer")) {

            create("Customer: " + message);

        } else if (name.equalsIgnoreCase("Syzygy Group")) {

            create("Syzygy Group: " + message);

        }

    }

    public void create(String message) {
        try ( PrintWriter pw = new PrintWriter(new FileOutputStream("storage/chat.txt", true))) {
            pw.println(message);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<String> getAllChats() {

        List<String> chats = new ArrayList<>();
        try ( Scanner scanner = new Scanner(new FileInputStream("storage/chat.txt"))) {
            while (scanner.hasNextLine()) {
                String chat = scanner.nextLine();

                chats.add(chat);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChatManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chats;
    }

}
