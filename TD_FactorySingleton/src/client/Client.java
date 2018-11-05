package client;

import products.Product;
import products.ProductFactory;

class Client {
    Product prod1, prod2, prod3;
    ProductFactory factory;

    public Client(){

    }

    public void foo(){

        /**Factory**/
        /*factory = new ProductFactory("Product B");
        prod1 = factory.createProduct();
        prod1.perform();*/

        /**Singleton avec repertoire**/
        factory = ProductFactory.getInstance("Product C");

        try {
            prod1 = factory.createProduct();
            prod1.perform();
            prod2 = factory.createProduct();
            prod2.perform();

            //Apres creation du 3eme produit, une exception est levée
            prod3 = factory.createProduct();
            prod3.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
