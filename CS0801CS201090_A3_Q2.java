import java.sql.SQLOutput;
import java.util.Scanner;

class Creditcard{
    private String name,cardNo,expiryMonth;
    private boolean enabled;
    private int pin, cardType,currentCredit=0,creditLimit=0;    
    Creditcard(String name,int cardType, int currentCredit){
        this.name = name;
        cardNo = "0040318319159263";
        enabled = false;
        pin = 1010;
        expiryMonth = "05/Jan/2027";
        this.cardType = cardType;
        this.currentCredit = currentCredit;
        creditLimit = 9999999;
    }
    void changePin(int pin){         
        if(enabled) {
            this.pin = pin;
            System.out.println("Pin change successful");
        }
        else{
            System.out.println("Not Enabled");
        }
    }
    void transact(int amt){
        if(enabled) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Pin (Number 0 is not allowed): ");
            int p = sc.nextInt();
            if(p == pin) {
                currentCredit -= amt;
                System.out.println("Transaction Successful, current amount -> "+ currentCredit);
            }
            else{
                System.out.println("Pin incorrect");
            }
        }
        else{System.out.println("Not Enabled");}
    }
    void changeCardStatus(boolean b){
        enabled = b;
    }
    void display(){
        System.out.println("Name -> " + name);
        System.out.println("Card No. -> " + cardNo);
        if(cardType==1){System.out.println("Card Type -> Silver\nDiscount -> 1%");}
        else if(cardType==2){System.out.println("Card Type -> Gold\nDiscount -> 2%");}
        else if(cardType==3){System.out.println("Card Type -> Platinum\nDiscount -> 3%");}
        System.out.println("pin -> " + pin);
        System.out.println("exp -> " + expiryMonth);
        System.out.println("Current Credit -> " + currentCredit);

    }
}
public class CS0801CS201090_A3_Q2 {
    public static void main(String[] args) {
        Creditcard card = new Creditcard("SIDHARTH", 3, 8000);
        card.display();

    }
}
