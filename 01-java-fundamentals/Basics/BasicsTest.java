
public class BasicsTest{

    public static void main(String[] args) {
        //First Task
        Basics taskOne = new Basics();
        taskOne.printNums();

        //Second Task
        taskOne.printOddNums();

        //Third Task
        taskOne.printSumNums();

        //Fourth Task
        taskOne.iterateArray();

        //Fifth Task
        int[] myArr = {-3, -5, 1, 10, 15};
        taskOne.maxArray(myArr);

        //Sixth Task
        int[] myArrTwo = {2, 10, 3};
        taskOne.avgOfArr(myArrTwo);

        //Seventh Task
        taskOne.oddNumArr();

        //Eighth Task
        int[] myArrThree = {1, 3, -2, 5, 7};
        taskOne.numOfGreater(myArrThree);

        //Ninth Task
        int[] myArrFour = {1, 4, 6, 8};
        taskOne.squareValues(myArrFour);

        //Tenth Task
        int [] x = {1, 5, 10, -2};
        taskOne.noNegatives(x);

        //Eleventh Task
        int [] z = {1, 5, 10, -2};
        taskOne.minMaxAverage(z);

        //Twelfth Task
        int [] ab = {1, 5, 10, -2};
        taskOne.shiftArray(ab);

        // Demo
        int[] demoArr = {1, 5, 10, -2};
        int numOfShifts = 0;
        taskOne.shiftArrayBetter(demoArr, numOfShifts);
    }


}