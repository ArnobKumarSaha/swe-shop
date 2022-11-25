package NoPaymentShop;

import java.util.ArrayList;

public class Guest {

    public ArrayList<Products> ViewProducts(){

        return admin.ViewProducts();
    }

    public Customer GetRegistered(String name){
        Customer customer = new Customer(name);
        System.out.println("Customer Registered as " + customer.Name);
        return customer;
    }
}
