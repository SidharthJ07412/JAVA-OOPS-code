class Record{
    String name[];
    int rank[];
    Record(){}
    Record(String []name, int rank[]){
        this.name = name;
        this.rank = rank;
    }
    void display(){
        for(int i =0; i< name.length;i++){
            System.out.println(name[i]+" : "+rank[i]);
        }
    }
}
class Rank extends Record{
    static String topper;
    static int index= 999999999;
    Rank(String name[], int rank[]) {
        super(name,rank);
        for(int i =0; i< rank.length;i++){
            index = Math.min(index,rank[i]);
            if(index == rank[i]){
                topper = name[i];
            }
        }
    }
    void highest(){
        System.out.println("Rank of topper is : "+index);
    }
    void display(){
        System.out.println("\nTopper ->  "+topper+" : Rank -> "+index+"\n");
        super.display();
    }
}

public class CS0801CS201090_A3_Q5 {
    public static void main(String[] args) {
        String name[] = {"Sidharth", "arun", "Sourabh","prince", "Ram"};
        int rank[] = {178,212,232,122,167};
        Rank s1 = new Rank(name,rank);
        s1.display();
    }
}
