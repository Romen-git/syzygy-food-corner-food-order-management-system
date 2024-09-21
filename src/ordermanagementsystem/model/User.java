/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.model;

import ordermanagementsystem.order.ChatMediator;

/**
 *
 * @author acer
 */
public abstract class User {

    protected ChatMediator chatMediator;
    protected String name;

    public void setMediator(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }
    
    
}
