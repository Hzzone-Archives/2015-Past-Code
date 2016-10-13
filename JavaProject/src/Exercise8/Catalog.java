package Exercise8;

/**
 * Created by HZzone on 16/6/5.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Iterator;
import java.util.Vector;

public class Catalog {
    private Vector products = new Vector();

    public Catalog() {
    }

    public void addProduct(Product var1) {
        this.products.add(var1);
    }

    public Iterator getProductsIterator() {
        return this.products.iterator();
    }

    public Product getProduct(String var1) {
        Iterator var2 = this.getProductsIterator();

        Product var3;
        do {
            if(!var2.hasNext()) {
                return null;
            }

            var3 = (Product)var2.next();
        } while(!var3.getCode().equals(var1));

        return var3;
    }

    public int getNumberOfProducts() {
        return this.products.size();
    }

    public String[] getCodes() {
        String[] var1 = new String[this.getNumberOfProducts()];
        int var2 = 0;

        for(Iterator var3 = this.getProductsIterator(); var3.hasNext(); var1[var2++] = ((Product)var3.next()).getCode()) {
            ;
        }

        return var1;
    }
}

