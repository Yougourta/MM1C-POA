package products;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    /*private String language;

    public ProductFactory(String language){
        this.language = language;
    }

    public Product createProduct(){

        if (language.equals("Product A")){
            return new ProductA();
        }

        if (language.equals("Product B")){
            return new ProductB();
        }

        if (language.equals("Product C")){
            return new ProductC();
        }

        return new ProductA();
    }*/

    //Singleton avec repertoire

    private  String language;
    private  static int nbProducts = 0;
    private  final int LIMIT = 2;

    private  static Map<String, ProductFactory> instance = new HashMap<>();

    private ProductFactory(String language){
        this.language = language;
    }

    public static ProductFactory getInstance(String language){
        if(!instance.containsKey(language))
            instance.put(language, new ProductFactory(language));
        return new ProductFactory(language);
    }

    public Product createProduct() throws Exception {
        nbProducts++;
        if (nbProducts > LIMIT)
            throw new Exception("Limite de produit atteinte !");
        if (language.equals("Product A")){
            return new ProductA();
        }

        if (language.equals("Product B")){
            return new ProductB();
        }

        if (language.equals("Product C")){
            return new ProductC();
        }
        return new ProductA();
    }
}
