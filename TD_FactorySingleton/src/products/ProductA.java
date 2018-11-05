package products;

public class ProductA implements Product {

    ProductA(){

    }

    @Override
    public void perform() {
        System.out.println("products.Product A");
    }
}

