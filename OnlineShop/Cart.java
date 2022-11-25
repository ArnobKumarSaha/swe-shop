package OnlineShop;

import java.util.ArrayList;

public class Cart {
    private int Price;
    private int TotalPrice;

    public ArrayList<Products> cart = new ArrayList<Products>();



    public void AddToCart(Products product){
        cart.add(product);
    }

    public void DeleteFromCart(int id){
        cart.remove(id);
    }

    public ArrayList<Products> ViewCart(){
        System.out.println("The list of card items are : ");
        for (Products product : cart) {
             System.out.println(product.Name + " " + product.Group+ " " + product.Price);
        }
        return cart;
    }
    public int SumTotalPrice (){
        int total = 0;
        for (Products product : cart) {
            total+= product.Price;
        }
        return total;
    }

}
