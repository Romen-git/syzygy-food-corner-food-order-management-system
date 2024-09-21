/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.order;

import ordermanagementsystem.model.Customer;
import ordermanagementsystem.model.SyzygyGroup;
import ordermanagementsystem.model.User;

/**
 *
 * @author acer
 */
public class ChatMediator {

    private User user;
    private ChatManagement chatManagement;

    public ChatMediator(User user, ChatManagement chatManagement) {
        this.user = user;
        this.chatManagement = chatManagement;
    }
    
    public void storeMessage(String message,String name){
    
        chatManagement.storeMessage(message,name);
    
    }

}
