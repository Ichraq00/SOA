package amoa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {

    @XmlElement(name="product")
    private List<Product> products;

    public Products() {
    }

    public Products(List<Product> products) {
        this.products = products;
    }

    public long add(Product product){
        products.add(product);
        return product.getId();
    }

    public Product get(long id){
        for (Product product: products){
            if (id == product.getId()){
                return product;
            }
        }
        return null;
    }
    public boolean remove(long id){
        for (Product product: products){
            if (id == product.getId()){
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public boolean removeAll() {
        for (Product product: products){
            products.remove(product);
            return true;
        }
        return false;
    }
}