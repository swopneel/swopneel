package exceptionHandling;

//in this program we are checking the student age
// if the student age isi less than 12 and weight > 40, tehn 
// our program should return that the student is not eligible for registration

public class LearningThrowException {

    static void checkEligibility(int stu_age, int stu_weight){

        if (stu_age < 12 && stu_weight < 40){
            throw new ArithmeticException("student is not eligible for registration");
        }else{
            System.out.println("student is eligible to enroll");
        }

    }
    public static void main(String[]args) {
        System.out.println("welcome to the regitration process");
        checkEligibility(12, 39);
        
    }
    
}
