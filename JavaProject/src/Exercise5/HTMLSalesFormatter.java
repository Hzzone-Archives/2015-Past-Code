package Exercise5;

import java.util.*;
import Exercise4.*;
/**
 * Created by HZzone on 16/5/9.
 */
public class HTMLSalesFormatter
    implements SalesFormatter{

    private final static String new_line =
            System.getProperty("line.separator");

    //the single instance of class HTMLSalesFormatter
    static private HTMLSalesFormatter
            singletonInstance = null;

    //private constructor so there is a single instance of class HTMLSalesFormatter
    private HTMLSalesFormatter(){

    }

    //Obtains the singletonInstance
    static public HTMLSalesFormatter getSingletonInstance(){

        if(singletonInstance == null){
            singletonInstance = new HTMLSalesFormatter();
        }
        return singletonInstance;
    }

    /*Obtains a string representation that contains the specified sales information
      in a HTML format*/
    public String formatSales(Sales sales){

        String out =  "<html>" + new_line
                    + "  <body>" + new_line
                    + "    <center><h2>Orders</h2></center>"+new_line;
        for(Iterator iOrders = sales.getOrdersIterator(); iOrders.hasNext();){

            Order order = (Order)iOrders.next();
            out +=    "      <hr>"+new_line
                    + "      <h4>Total = " + order.getTotalCost() +"</h4>" +new_line;

            for(Iterator iOrderItem = order.getItemsIterator(); iOrderItem.hasNext();){

                OrderItem item = (OrderItem)iOrderItem.next();
                Product product = item.getProduct();
                out +=    "      <p>"+new_line
                        + "        <b>code:</b> " + product.getCode() +"<br>" + new_line
                        + "        <b>quantity:</b> " + item.getQuantity() + "<br>" + new_line
                        + "        <b>price:</b> " + product.getPrice() + new_line
                        + "      </p>" + new_line;
            }
        }
        out += "  </body>" + new_line
                + "</html>"+ new_line;

        return out;

    }


}
