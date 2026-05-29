public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

    public Product() {

    }

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;

    }

    // Método getter
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    // Método setter
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;

        if(price <= 0){
            System.out.println("error!.. el precio es incorrecto");
        }
        else{
            System.out.println(price);
        }
    }
    public void setStock(int stock) {
        this.stock = stock;
        if (stock <= 0 ){
            System.out.println("error!.. el stock no puede ser menor a 0");
        }
        else{
            System.out.println(stock);
        }
    }

}
