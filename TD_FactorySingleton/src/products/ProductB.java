package products;

public class ProductB implements Product {

    ProductB(){

    }

    @Override
    public void perform() {
        System.out.println("products.Product B");
    }
}
