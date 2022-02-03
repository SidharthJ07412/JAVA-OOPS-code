class fan{                              
    private String fanType, manufacturer, model;
    private boolean status=false;


    public int speed = 0;

    public void getFan(){
        fanType ="ceiling_fan";
        manufacturer = "V-guard";
        model = "t430";
        System.out.println("Bought a fan");
    }
    public void setFan(){
        System.out.println("Fixed and screwed at the ceiling\nInstallation Complete");
    }
    public void on(){
        System.out.println("Fan is turned on.");
        status = true;
        speed = 1;
    }
    public void off(){
        System.out.println("Fan is turned off...");
        status = false;
        speed = 0;
    }
    public void speedUp(){
        if(speed<5){
            System.out.println("speed: "+speed+" -> "+ (speed+1));
            speed+=1;
        }
        else if (speed ==5){
            System.out.println("Maximum speed...");
        }
    }
    public void speedDown() {
        if (speed > 1) {
            System.out.println("speed: "+speed+" -> "+ (speed-1));
            speed -= 1;
        } else if (speed == 1) {
            System.out.println("Minimum speed...");
        }
    }
}
public class CS0801CS201090_A3_Q4{
    public static void main(String[] args) {
        fan f = new fan();
        f.getFan();
        f.setFan();
        f.off();
        f.on();
        f.speedDown();
        f.speedUp();
    }
}
