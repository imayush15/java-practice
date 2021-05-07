package test;
import java.util.*;


public class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}
class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        String state = sc.nextLine();
        String country = sc.nextLine();
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        Address address1=new Address(city, state, country);


        Emp e=new Emp(id,name,address1);


        e.display();


    }
}