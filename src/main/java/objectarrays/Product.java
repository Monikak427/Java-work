package objectarrays;

public class Product implements Comparable<Product> {
    private int id;
    private double weight;
    private double price;


    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    
    @Override
    public int compareTo(Product otherProduct) {
      
        return Double.compare(this.price, otherProduct.price);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", weight=" + weight + ", price=" + price + '}';
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, 0.5, 25.99);
        Product product2 = new Product(2, 0.8, 19.99);
        Product product3 = new Product(3, 0.3, 29.99);

        int result = product1.compareTo(product2);

        if (result < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (result > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " and " + product2 + " have the same price");
        }
    }
}

