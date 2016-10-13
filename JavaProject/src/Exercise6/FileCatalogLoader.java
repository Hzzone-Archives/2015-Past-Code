package Exercise6;
import java.io.*;
import java.util.*;
import Exercise4.*;

/**
 * Created by HZzone on 16/5/22.
 */
public class FileCatalogLoader
        implements CatalogLoader{

    /* Prefix of a line with product data */
    private final static String PRODUCT_PREFIX = "Product";

    /* Prefix of a line with coffee data */
    private final static String COFFEE_PREFIX = "Coffee";

    /* Prefix of a line with brewer data */
    private final static String BREWER_PREFIX = "Brewer";

    /*Delimeter*/
    private final static String DELI = "_";

    /**
     * Loads the information in the specified file into a product
     * catalog and returns the catalog.
     *
     * @param filename  The name of a file that contains catalog
     *                  information.
     * @return a product catalog.
     * @throws FileNotFoundException  if the specified file does not
     *                                exist.
     * @throws IOException if there is an error reading the
     *                     information in the specified file.
     * @throws Exercise6.DataFormatException if the file contains malformed
     *                             data.
     */
    public Catalog loadCatalog(String filename)
            throws IOException,FileNotFoundException,Exercise6.DataFormatException{

        Catalog catalog = new Catalog();
        BufferedReader reader =
                new BufferedReader(new FileReader(filename));
        String line = reader.readLine();

        while(line != null){
            Product product;
            if(line.startsWith(PRODUCT_PREFIX)){
                product = readProduct(line);
            }
            else if(line.startsWith(COFFEE_PREFIX)){
                product = readCoffee(line);
            }
            else if(line.startsWith(BREWER_PREFIX)){
                product = readCoffeeBrewer(line);
            }
            else throw new Exercise6.DataFormatException();
            catalog.addProduct(product);
        }
        reader.close();

        return catalog;

    }

    /**
     * reads a line of coffee-accessory data
     * @param line a string of coffee-accessory data
     * @return product a coffee accessory
     * @throws Exercise6.DataFormatException If the line has errors
     */
    private Product readProduct(String line)
        throws Exercise6.DataFormatException{

        StringTokenizer tokenizer = new StringTokenizer(line, DELI);
        Product accessory;

        if(tokenizer.countTokens() != 3){
            throw new Exercise6.DataFormatException();
        }
        else{
            try{
                accessory = new Product(tokenizer.nextToken(),
                        tokenizer.nextToken(), Double.parseDouble(tokenizer.nextToken()));
            }catch(NumberFormatException nfe){
                throw new Exercise6.DataFormatException();
            }
        }

        return accessory;
    }

    /**
     *reads a line of coffee data
     * @param line a string of coffee data
     * @return coffee
     * @throws Exercise6.DataFormatException If the line has errors
     */
    private Coffee readCoffee(String line)
        throws Exercise6.DataFormatException{

        StringTokenizer tokenizer = new StringTokenizer(line, DELI);
        Coffee coffee;
        if(tokenizer.countTokens() != 9){
            throw new Exercise6.DataFormatException();
        }
        else{
            try{
                coffee = new Coffee(tokenizer.nextToken(), tokenizer.nextToken(),
                        Double.parseDouble(tokenizer.nextToken()), tokenizer.nextToken(),
                        tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(),
                        tokenizer.nextToken(), tokenizer.nextToken());
            }catch(NumberFormatException nfe){
                throw new Exercise6.DataFormatException();
            }

        }
        return coffee;
    }

    /**
     *reads a line of CoffeeBrewer data
     * @param line a string of CoffeeBrewer data
     * @return CoffeeBrewer
     * @throws Exercise6.DataFormatException If the line has errors
     */
    private CoffeeBrewer readCoffeeBrewer(String line)
        throws Exercise6.DataFormatException{
        StringTokenizer tokenizer = new StringTokenizer(line, DELI);
        CoffeeBrewer brewer;

        if(tokenizer.countTokens() != 6){
            throw new Exercise6.DataFormatException();
        }
        else{
            try{
                brewer = new CoffeeBrewer(tokenizer.nextToken(), tokenizer.nextToken(),
                        Double.parseDouble(tokenizer.nextToken()), tokenizer.nextToken(),
                        tokenizer.nextToken(), Integer.parseInt(tokenizer.nextToken()));
            }catch(NumberFormatException nfe){
                throw new Exercise6.DataFormatException();
            }

        }
        return brewer;


    }
}
