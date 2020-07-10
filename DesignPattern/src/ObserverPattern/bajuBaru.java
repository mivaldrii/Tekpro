package ObserverPattern;

import java.util.ArrayList;

/**
 *
 * @author afdalrdh
 */
public class bajuBaru implements Observable {
    private boolean inStock = true;
    private ArrayList<Observer> customers;

    public bajuBaru(Boolean inStock) {
        this.inStock = inStock;
        customers = new ArrayList<Observer>();
    }

    public boolean isInStock(){
        return  inStock;
    }

    public void setInStock(boolean inStock){
        this.inStock = inStock;
        if(isInStock()){
            notifyObserver();
        }
    }

    @Override
    public void addObserver(Observer o) {
        customers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        customers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i< customers.size(); i++){
            customers.get(i).update();
        }
    }
}
