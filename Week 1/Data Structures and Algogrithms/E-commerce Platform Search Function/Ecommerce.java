import java.util.*;

enum Category {
    ELECTRONICS,
    BOOKS,
    FURNITURE,
    CLOTHING,
    TOYS
}

class Product {
    long productId;
    String productName;
    Category category;

    Product(long productId, String productName, Category category) {
        this.category = category;
        this.productId = productId;
        this.productName = productName;
    }
}

public class Ecommerce {

    public static void main(String[] args) {
        Product[] list = new Product[5];

        list[0] = new Product(1000, "iPhone", Category.ELECTRONICS);
        list[1] = new Product(1000, "Table", Category.FURNITURE);
        list[2] = new Product(1000, "Atomic Habits", Category.BOOKS);
        list[3] = new Product(1000, "Shirt", Category.CLOTHING);
        list[4] = new Product(1000, "Plushie", Category.TOYS);

        System.out.println("Linear Search - Find 'Table'");
        Product f1 = Ecommerce.linearSearch(list, "Table");
        System.out.println("Found : \nId:\t" + f1.productId + "\nName:\t" + f1.productName);

        //Sort before binary search

        Arrays.sort(list, Comparator.comparing(p -> p.productName));

        System.out.println("Binary Search - Find 'Table'");
        Product f2 = Ecommerce.binarySearch(list, "Table");
        System.out.println("Found : \nId:\t" + f2.productId + "\nName:\t" + f2.productName);
    }

    public static Product linearSearch(Product[] list, String name) {
        for(int i = 0; i < list.length; i++) {
            if(list[i].productName.equalsIgnoreCase(name)) {
                return list[i];
            }
        }

        return null; // If not found return null
    }

    public static Product binarySearch(Product[] list, String name) {
        int l = 0, r = list.length-1;

        while(l <= r) {
            int mid = l + (r-l)/2;

            if(list[mid].productName.equalsIgnoreCase(name)) {
                return list[mid];
            } else if(list[mid].productName.compareToIgnoreCase(name) > 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return null; // If not found
    }
}