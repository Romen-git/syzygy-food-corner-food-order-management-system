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
public class ToppingFactory {

    private Map<String, ToppingFlyWeight> toppingMap;

    public ToppingFactory() {
        this.toppingMap = new HashMap<>();
    }

    public ToppingFlyWeight getTopping(String name) {

        if (!toppingMap.containsKey(name)) {

            toppingMap.put(name, new ToppingFlyWeight(name));
        }
        
        return toppingMap.get(name);
    }
}
