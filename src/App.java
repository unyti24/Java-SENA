public class App {
    public static void main(String[] args){

        // OBJETO 1, usando constructor parametrizado
        Product product1 = new Product("1", "Condones", 3000, 200);

        // usar setter
        product1.setPrice(5000);

        // usar getter
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());

        // usar toString
        System.out.println(product1);


        // OBJETO 2, usando constructor por defecto
        Product product2 = new Product();

        // usar setters
        product2.setId("2");
        product2.setName("Lubricante");
        product2.setPrice(15000);
        product2.setStock(50);

        // modificar atributo con setter
        product2.setStock(100);

        // usar getters
        System.out.println(product2.getName());
        System.out.println(product2.getStock());

        // usar toString
        System.out.println(product2);
    }
    
}
