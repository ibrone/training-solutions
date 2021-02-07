package week05d04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

    private  List<Product2> products = new ArrayList<>();

  public boolean addProduct (Product2 product){
    if (isValid(product)){
        return false;
    }
    products.add(product);
    return true;

  }

  public int getNumberofExpired() {
      int count = 0;
      for (Product2 p : products) {
          if (p.isExpired()) {
              count++;
          }
      }
      return count;
  }

  private boolean isValid(Product2 product){
      if(containsByName(product)||product.isExpired()){
          return  false;
      }return true;
  }
private boolean containsByName(Product2 product){
      for (Product2 p : products){
          if (p.getName().equals(product.getName())){
              return true;
          }
      }return false;
}
}
