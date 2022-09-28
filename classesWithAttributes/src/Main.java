public class Main {
    public static void main(String[] args){
        Product product = new Product();
        Product product2 = new Product(1,"Kahve makinesi","Smeg", 6852,7,"sarı");
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(7850);
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println("Ürünün kodu: "+product.getKod());
    }
}
