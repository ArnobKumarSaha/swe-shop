package OnlineShop;

public class Payment {
    public int TotalPrice;

    public int Pay(int totalPrice){
        System.out.println("Total Price: " + totalPrice);
        return totalPrice;
    }
}
