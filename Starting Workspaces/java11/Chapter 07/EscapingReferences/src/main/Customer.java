package main;

public class Customer implements ReadOnlyCustomer {
    private String name;
    public Integer id;

    public Customer(String name) {
        this.name = name;
    }
    
    public Customer(Customer c) {
        this.name = c.name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
