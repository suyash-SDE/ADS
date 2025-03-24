import java.util.*;

public class ProductOfNumbers {
    private List<Integer> prefixProd = new ArrayList<>();

    public ProductOfNumbers() {
        prefixProd.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            prefixProd.clear();
            prefixProd.add(1);
        } else {
            prefixProd.add(prefixProd.get(prefixProd.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int size = prefixProd.size();
        return k < size ? prefixProd.get(size - 1) / prefixProd.get(size - 1 - k) : 0;
    }
}
