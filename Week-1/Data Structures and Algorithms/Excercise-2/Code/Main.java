public class Main 
{
    public static void main(String[] args) 
    {
        Product[] products = 
        {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "T-shirt", "Clothing")
        };

        Product result1 = LinearSearch.search(products, "Phone");
        System.out.println("Linear Search Result: " + result1);

        Product result2 = BinarySearch.search(products, "T-shirt");
        System.out.println("Binary Search Result: " + result2);
    }
}
