package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addItem("microondas", 599.90, 30);
        cart.addItem("xiaomi", 999.90, 40);
        cart.showItems();
        cart.calcTotalValue();
    }

    //giving to the class the attribute type
    private List<Item> cart;

    public Cart(){
        this.cart = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        cart.add(new Item(name, price, quantity));
    }

    public void removeItemByName(String productName){
        List<Item> itemsToRemove = new ArrayList<>();

        if(!cart.isEmpty()){
            for(Item i: cart){
                if(i.getProductInfo().equalsIgnoreCase(productName)){
                    itemsToRemove.add(i);
                }
            }
            cart.removeAll(itemsToRemove);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcTotalValue(){
        double totalValue = 0.0;

        for(Item item: cart){
            totalValue += item.getProductPrice() * item.getProductQuantity();
        }

        return totalValue;
    }

    public void showItems(){
        System.out.println(cart);
    }
}
