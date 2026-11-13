import java.util.LinkedHashSet;

public class RecentProduct {
    public static void main(String[] args) {
        LinkedHashSet<String> products = new LinkedHashSet<>();
        products.add("laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("SmartWatch");
        products.add("Laptop");
        System.out.println("Products:"+products);
        products.remove("Headphones");
        products.add("Tablet");
        System.out.println("Mobile Exists:"+products.contains("Mobile"));
        System.out.println("Final Products:"+products);
    }
    
}
