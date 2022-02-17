package inheritance;

class Bicycle{

    int gear;
    int speed;

    public Bicycle(int gear, int speed){
        this.gear =gear;
        this.speed =speed;
    }

    public void applyBrake(int decrement){
            speed -= decrement; //speed = speed - decrement
    }

    public void speedUp(int increment){
            speed += increment;
    }

    public String toString(){
            return ("No of gears are "+ gear + "speed of the bicycle is"  + speed);
    }

}
class MountainBike extends Bicycle{
        int seatheight;

        public MountainBike (int gear, int speed, int startheight){
            super(gear,speed);
            seatheight =startheight;

        }

        public void setHeight(int newValue){
            seatheight = newValue;
        }
        @Override
        public String toString(){
            return (super.toString()+ "Swat height is" + speed);
    }
}

public class inheritance_concepts{

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        
    }

}