package Exercise8;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Iterator;
import java.util.Vector;

public class Order {
    private Vector items = new Vector();

    public Order() {
    }

    public void addItem(OrderItem var1) {
        this.items.add(var1);
    }

    public void removeItem(OrderItem var1) {
        this.items.removeElement(var1);
    }

    public Iterator getItemsIterator() {
        return this.items.iterator();
    }

    public OrderItem getItem(Product var1) {
        Iterator var2 = this.getItemsIterator();

        OrderItem var3;
        do {
            if(!var2.hasNext()) {
                return null;
            }

            var3 = (OrderItem)var2.next();
        } while(!var3.getProduct().equals(var1));

        return var3;
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public double getTotalCost() {
        double var1 = 0.0D;

        for(Iterator var3 = this.getItemsIterator(); var3.hasNext(); var1 += ((OrderItem)var3.next()).getValue()) {
            ;
        }

        return var1;
    }

    public OrderItem[] getItems() {
        OrderItem[] var1 = new OrderItem[this.getNumberOfItems()];
        int var2 = 0;

        for(Iterator var3 = this.getItemsIterator(); var3.hasNext(); var1[var2++] = (OrderItem)var3.next()) {
            ;
        }

        return var1;
    }
}
