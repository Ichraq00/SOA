package amoa.webservices;

import amoa.domain.Product;
import amoa.domain.Products;
import amoa.exceptions.NoSuchProductException;
//import jdk.internal.access.JavaIOFileDescriptorAccess;

import javax.jws.WebService;
import java.util.ArrayList;

//import static jdk.jfr.internal.instrument.JDKEvents.remove;

@WebService(endpointInterface = "amoa.webservices.ProductsManager")
public class ProductsManagerImpl implements ProductsManager {
	public static  ArrayList<Product> l = new ArrayList();
    private static Products products = new Products(l);

    
    public long addProduct(Product product) {
        products.add(product);
        return product.getId();
    }

    
    public Product getProduct(long id) throws NoSuchProductException {
        Product product = products.get(id);

        if (product != null){
            return product;
        } else {
            throw new NoSuchProductException("No such product!");
        }
    }

    
    public double getProductPrice(long id) throws NoSuchProductException {
        Product product = products.get(id);
        if (product!=null){
            return product.getPrice();
        }else {throw new NoSuchProductException("The product is not available!");
        }
    }

    
    public Products getProducts() {
        return products;
    }

    
    public Product updateProduct(Product product) {
        long id = product.getId();
        Product productToBeUpdated = products.get(id);
        if(productToBeUpdated != null){
            productToBeUpdated.setLabel(product.getLabel());
            productToBeUpdated.setPrice(product.getPrice());
        }

        return productToBeUpdated;
    }

    
    public boolean deleteProduct(long id) {
        Product productToDelete = products.get(id);
        if (productToDelete != null){
            products.remove(id);
            return true;
        }
        return false;
    }

    
    public boolean deleteAllProducts() {
        products.removeAll();
        return true;
    }
}