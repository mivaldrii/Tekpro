package ObserverPattern;

/**
*
* @author afdalrdh
*/
public class Main {
   public static void main(String[] args) {
       bajuBaru Baju = new bajuBaru(true);
          
       Customer customer1 = new Customer(Baju, "Jimmy");
       Baju.addObserver(customer1);

       Customer customer2 = new Customer(Baju, "Syaiful");
       Baju.addObserver(customer2);
       
       Baju.setInStock(true);
   }
}
