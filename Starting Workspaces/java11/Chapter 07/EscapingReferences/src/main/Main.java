package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();
        List<Customer> customers = new ArrayList<>();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));
        
        recursiva(0);

//        records.getCustomers().clear();
//        records.getCustomers().put("John", new Customer("Pepe"));

//        for (Customer next : records.getCustomers().values()) {
//            System.out.println(next);
//        }

//        Iterator<Customer> it = records.iterator();
//        it.next();
//        it.remove();
//        
//        for (Customer next : records) {
//            System.out.println(next);
//        }

//        Map<String, Customer> copia = records.getCustomers();
//        copia.put("Maria", new Customer("Maria"));
//        for (Customer next : copia.values()) {
//            System.out.println(next);
//        }

//        for (Customer next : records) {
//            System.out.println(next);
//        }
        
//        records.getCustomers().clear();
        
//        ReadOnlyCustomer c1 = records.find("John");
//        c1.setName("Maria");
//        customers.add(c1);
//        
//        for (Customer next : records) {
//            System.out.println(next);
//        }
        
        Customer c = new Customer("Pepe");
        c.id = 1;

    }
    
    public static void recursiva(int num) {
        Customer c = new Customer(num + "");
        if(num >= 1000) {
            return;
        }
        recursiva(num ++);
    }

}
