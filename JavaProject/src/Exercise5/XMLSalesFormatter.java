package Exercise5;

import java.util.*;
import Exercise4.*;
/**
 * Created by HZzone on 16/5/9.
 */
public class XMLSalesFormatter
    implements SalesFormatter {

    private final static String new_line =
            System.getProperty("line.separator");

    //the single instance of class XMLSalesFormatter
    static private XMLSalesFormatter
            singletonInstance = null;

    //declare private so only a XMLSalesFormatter object
    private XMLSalesFormatter() {

    }

    //static method that obtains the single instance of class XMLSalesFormatter
    public static XMLSalesFormatter getSingletonInstance() {

        if (singletonInstance == null) {
            singletonInstance = new XMLSalesFormatter();
        }
        return singletonInstance;
    }

    /*
    * Obtains a string that contains the specified sales information in a formatSales format
    * @param sales the Sales object
    * @return a formatSales representation of the specified {@link Sales} object
    */
    public String formatSales(Sales sales) {

        String out = "<Sales>" + new_line;

        for (Iterator iOrders = sales.getOrdersIterator(); iOrders.hasNext(); ) {

            Order order = (Order) iOrders.next();

            out += "<Order total=\"" + order.getTotalCost() + "\">" + new_line;

            for (Iterator iOrderItem = order.getItemsIterator(); iOrderItem.hasNext(); ) {

                OrderItem item = (OrderItem) iOrderItem.next();
                Product product = item.getProduct();
                out += "  <OrderItem quantity=\"" + item.getQuantity() + "\" price=\""
                        + product.getPrice() + "\">" + product.getCode() + "</OrderItem>"
                        + new_line;

            }

            out += "</Order>" + new_line;

        }

        return out;

    }
}
