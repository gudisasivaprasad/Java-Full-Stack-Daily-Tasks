public class InventoryMain{
    void main(){
    String name = IO.readln();                        //s.nextLine();
    double price = Double.parseDouble(IO.readln());   //s.nextDouble();
    int quantity = Integer.parseInt(IO.readln());     //s.nextInt();
    InventoryItem item = new InventoryItem(name,price,quantity);
    IO.println(item);
    IO.println("Total Inventory Value: "+item.calculateTotalValue());
    IO.print("Any updation in Stock Price OR Quantity :");
    String change = IO.readln();                           //s.nextLine();
    if(change.equalsIgnoreCase("yes")){
        price = Double.parseDouble(IO.readln());         // s.nextDouble();
        quantity = Integer.parseInt(IO.readln());           //s.nextInt();

        item.setPricePerUnit(price);
        item.setQuantityStock(quantity);
        IO.println("\nUpdated "+item);
        IO.println("Total Inventory Value: "+item.calculateTotalValue());
    }
    }
}

//BLC class
class InventoryItem{
    private String itemName;
    private double pricePerUnit;
    private int quantityStock;

    public InventoryItem(String itemName,double pricePerUnit,int quantityStock){
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantityStock = quantityStock;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public void setPricePerUnit(double pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }
    public void setQuantityStock(int quantityStock){
        this.quantityStock = quantityStock;
    }

    public String getItemName(){
        return itemName;
    }
    public double getPricePerUnit(){
        return pricePerUnit;
    }
    public int getQuantityStock(){
        return quantityStock;
    }

    public double calculateTotalValue(){
        return this.pricePerUnit * this.quantityStock;
    }

    public String toString(){
        return "Inventory Item Details:\nItem Name: "+itemName+"\nPrice Per Unit: "+pricePerUnit+"\nQuantity in Stock: "+quantityStock;
    }
}