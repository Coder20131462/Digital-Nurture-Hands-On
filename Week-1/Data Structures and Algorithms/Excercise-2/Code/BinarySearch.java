import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product search(Product[] products, String targetName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName)); // Ensure sorted

        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = products[mid].getProductName();

            int cmp = midName.compareToIgnoreCase(targetName);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
