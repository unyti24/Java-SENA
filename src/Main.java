public class Main {
    public static void main(String[] args){
        Product product1 = new Product("1", "condones", 3000, 200);
        String readId = product1.getId();
        System.out.println(readId);

        String readName = product1.getName();
        System.out.println(readName);

        double readPrice = product1.getPrice();
        System.out.println(readPrice);

        int readStock = product1.getStock();
        System.out.println(readStock);
    }
}
