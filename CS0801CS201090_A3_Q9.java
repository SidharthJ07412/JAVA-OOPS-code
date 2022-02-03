class Stock{
    String item;
    double qua, rate, amt;
    Stock(String item, double quantity, double rate){
        this.item = item;
        this.qua = quantity;
        this.rate = rate;
        amt = quantity*rate;
    }
    void display(){
        System.out.println("Info from super-class Stock-->");
        System.out.println("    Name of the item -> "+ item);
        System.out.println("    Quantity available (in kg) -> "+ qua);
        System.out.println("    Rate (Rupees per kg) -> "+ rate);
        System.out.println("    Total/Net value (without Profit) -> Rs."+ amt);
    }
}
class Purchase extends Stock{
    double pqua, prate, profit;
    Purchase(String item, double quantity, double rate, double purchase_quantity, double purchase_rate){
        super(item,quantity,rate);
        super.display();
        this.pqua = purchase_quantity;
        this.prate = purchase_rate;
        qua -= pqua;
        profit = purchase_quantity*purchase_rate - purchase_quantity*rate;
        amt -= purchase_quantity*rate;
    }
    void display(){
        System.out.println("Info from sub-class Purchase-->");
        System.out.println("    Purchase Quantity (in Kg)-> "+pqua);
        System.out.println("    Purchase rate (Rupees per kg) -> "+ prate);
        System.out.println("    Profit Earned -> Rs."+ profit);
        super.display();
    }
}
public class CS0801CS201090_A3_Q9{
    public static void main(String[] args) {
        Purchase n1 = new Purchase("Jaggery", 30,50,20,60);
        n1.display();
    }
}
