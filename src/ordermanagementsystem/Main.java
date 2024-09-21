/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import ordermanagementsystem.auth.Login;

/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        createRequiredFileIfDoesNotExist();

        Menu im = new Menu();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setVisible(true);
    }

    private static void createRequiredFileIfDoesNotExist() {
        String fileNames[];

        File rootDir = new File("storage");
        rootDir.mkdirs();

        fileNames = new String[]{"storage/item.txt",
            "storage/order.txt",
            "storage/orderLine.txt",
             "storage/chat.txt"};

        for (String fileName : fileNames) {
            File file = new File(fileName);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
