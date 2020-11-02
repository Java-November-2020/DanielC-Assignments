import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB


        // double four = 4.0;
        // calling the sqrt static method of the Math class
        // double squareRoot = Math.sqrt(four); // 2.0

        double c = Math.hypot(legA, legB);
        return c;

    }
}