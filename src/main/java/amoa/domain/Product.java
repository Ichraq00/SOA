package amoa.domain;


import javax.xml.bind.annotation.XmlAccessType;

import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlRootElement;

 @XmlRootElement(name="product")
 @XmlAccessorType(XmlAccessType.FIELD)

public class Product {
	 
	 private long id ;
	 private String label ;
	 private double price ;
	 
	 
	 public Product() {
		 
	 }
     public Product(long id , String label ,double price) {
    	 this.id =id;
    	 this.label = label;
    	 this.price =price;
     }
     
     public Product(long id ) {
    	 this.id =id ; 
     }
     
     public String getLabel() {
 		return label;
 	}
 	public void setLabel(String label) {
 		this.label = label;
 	}
 	public double getPrice() {
 		return price;
 	}
 	public void setPrice(double price) {
 		this.price = price;
 	}
 	public void setId(long id) {
 		this.id = id;
 	}
 	public long getId() {
     	 return id ;
      }
     
}
