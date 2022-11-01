package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

//	public Map<String, Customer> getCustomers() {
//		return this.records;
//	}

//    public Map<String, Customer> getCustomers() {
//        HashMap<String, Customer> copy = new HashMap<>(this.records);
//        return copy;
//    }
    
//    public Map<String, Customer> getCustomers() {
////      return Collections.unmodifiableMap(records); Java 1.8+
//      return Map.copyOf(records);
//  }

    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }
    
    public ReadOnlyCustomer find(String name) {
        return new Customer(records.get(name));
    }
}
