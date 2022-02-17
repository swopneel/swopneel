package exceptionHandling;

class MyException extends Exception{
    String str1;

    MyException(String str2){
        str1 = str2;
    }
    public String toString(){
        return ("Eception occured: " + str1);
    }
}

public class UserDefinedExceptions {
    public static void main(String[] args) {
        try {
            System.out.println("strating of try block");
            throw new MyException("This is an eror message");
        }
        catch(MyException e){
            System.out.println("catch_block here buddy");
            System.out.println(e);
        }
    }
    
}
