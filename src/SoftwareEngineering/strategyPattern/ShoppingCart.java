/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SoftwareEngineering.strategyPattern;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
  List<Item> items;  
  
  public ShoppingCart(){
      this.items= new ArrayList<>();
      }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public int calculateTotal(){
        int sum=0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
