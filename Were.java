
class Computer{
    public void playMusic(){
        System.out.println("It is Play music");
    }

    public int buyPen(int cost){

        System.out.println("The Value of the pen:" +cost);
        return cost;
    }
}


public class Were {

    public static void main(String a[]){
int cost=100;
Computer com = new Computer();
com.playMusic();
com.buyPen(cost);



    }
    
}
