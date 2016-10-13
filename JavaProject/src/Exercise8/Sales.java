package Exercise8;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Iterator;
import java.util.Vector;

public class Sales {
    private Vector orders = new Vector();

    public Sales() {
    }

    public void addOrder(Order var1) {
        this.orders.add(var1);
    }

    public Iterator getOrdersIterator() {
        return this.orders.iterator();
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }
}
