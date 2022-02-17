package misc;


public class methodOverLoading {

    static class Sum{
        public int sum (int x,int y){
            return (x+y);
        }
         public int sum (int x,int y, int z){
            return (x+y+z);
        }
        public double sum (double x,double y, double z){
            return (x+y+z);
        }
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(24.4,67.56,89.11));
    }
    
}
