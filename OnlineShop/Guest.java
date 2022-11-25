package OnlineShop;

import java.util.ArrayList;

public class Guest {

    public ArrayList<Products> ViewProducts(Admin admin){
        return admin.ViewProducts();
    }

    public Customer Register(String name){
        Customer customer = new Customer(name);
        System.out.println("Register customer : " + customer.Name);
        return customer;
    }
}
