/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Nicholas
 */
public class PriceChangeEvent {
    private double priceChange;

    public final StockExchange exchange;
    
    /**
     * Public constructor for the PriceChangeEvent class that links a Stock Exchange
     * and provides a price change.
     * @param exchange StockExchange object representing the stock exchange
     * @param priceChange Double value representing the amount the stock's price has changed.
     */
    public PriceChangeEvent(StockExchange exchange, double priceChange){
        this.exchange = exchange;
        this.priceChange = priceChange;
    }
    
    /**
     * Method used to get the priceChange value.
     * @return priceChange value of type double representing the price change.
     */
    public double getPriceChange(){
        return priceChange;
    }
    /**
     * Method used to set the priceChange field.
     * @param priceChange value to be stored in the priceChange field.
    */
    public void setPriceChange(double priceChange){
        this.priceChange = priceChange;
    }
    
    /**
     * Method used to get the current price of the stock.
     * @return 
     */
    public double getCurrentPrice(){
        return this.exchange.getPrice();
    }
    
    /**
     * Method used to update the stock value every second.
     * @throws InterruptedException
     */
    /*
    public void updatePrice() throws InterruptedException{
        if(exchange.isOpen()){
            Thread.sleep(1000);
            int direction = (int) (100 * Math.random());
            PriceChangeEvent event;
            if(direction < 50){
                exchange.setPrice(exchange.getPrice()-1);
                event = new PriceChangeEvent(exchange, -1);
            }
            else{
                exchange.setPrice(exchange.getPrice()+1);
                event = new PriceChangeEvent(exchange, 1);
            }
            for(Object obs: exchange.getObs()){
                if(obs instanceof StockPricePrinter){
                    StockPricePrinter casted_obs = (StockPricePrinter) obs;
                    casted_obs.priceChanged(event);
                }
                if(obs instanceof StockMonitor){
                    StockMonitor casted_obs = (StockMonitor) obs;
                    casted_obs.priceChanged(event);
                }
            }
            updatePrice();
        }
        
    } */
    
}
