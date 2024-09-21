/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermanagementsystem.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author acer
 */
public class ItemFactory {

    private Map<String, ItemFlyWeight> itemMap;

    public ItemFactory() {
        this.itemMap = new HashMap<>();
    }

    public ItemFlyWeight getItem(String name, double price, int quantity) {

        if (!itemMap.containsKey(name)) {

            itemMap.put(name, new ItemFlyWeight(name, price, quantity));
        }

        return itemMap.get(name);
    }
}
