package inheritance;

class One {
    public void printGeek(){
        System.out.println(" I am a programming geek!");
    }
    
}

class Two extends One{
    public void printFor(){
        System.out.println(" I am learning for loop!");
    }
    
}

class Three extends Two{
    public void printGeek(){
        System.out.println(" I am a geek in class three!");
    }
    
}

public class MultipleLevelInheritance {

    public static void main(String[] args) {
        Three t = new Three();
        t.printGeek();
        t.printFor();
        t.printGeek();
        

    }
    
}
