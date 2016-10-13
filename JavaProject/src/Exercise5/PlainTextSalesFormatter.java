package Exercise5;

import java.util.*;
import Exercise4.*;
/**
 * Created by HZzone on 16/5/9.
 */
public class PlainTextSalesFormatter implements SalesFormatter{

    private final static String new_line =
            System.getProperty("line.separator");

    //the single instance of class PlainTextSalesFormatter
    static private PlainTextSalesFormatter
            singletonInstance = null;

    //declare private so only a PlainTextSalesFormatter object
    private PlainTextSalesFormatter(){

    }

    //static method that obtains the single instance of class PlainTextSalesFormatter
    public static PlainTextSalesFormatter getSingletonInstance(){

        if(singletonInstance == null){
            singletonInstance = new PlainTextSalesFormatter();
        }

        return singletonInstance;
    }

    /*
     * Obtains a string that contains the specified sales information in a plaintext format
     * @param sales the Sales object
     * @return a plaintext representation of the specified {@link Sales} object
     */
    public String formatSales(Sales sales){


        int i = 1;
        String out = "";

        for(Iterator iOrders = sales.getOrdersIterator(); iOrders.hasNext();){

            out +="------------------------" + new_line;
            Order order = (Order)iOrders.next();
            out += "Order " + i + new_line;

            for(Iterator iOrderItem = order.getItemsIterator(); iOrderItem.hasNext();){

                OrderItem item = (OrderItem)iOrderItem.next();
                Product product = item.getProduct();
                out += item.getQuantity() + " " + product.getCode()
                        + product.getPrice() + new_line;

            }
            out += "Total = " + order.getTotalCost() + new_line;

            i++;

        }

        return out;
    }




}
