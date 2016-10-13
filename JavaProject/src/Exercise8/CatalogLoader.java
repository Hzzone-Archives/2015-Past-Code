package Exercise8;

/**
 * Created by HZzone on 16/6/5.
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public interface CatalogLoader {
    Catalog loadCatalog(String var1) throws FileNotFoundException, IOException, DataFormatException;
}
