
import java.util.ArrayList;

public class Basics {

    // First Task
    public void printNums(){
        int i = 0;
        while(i < 256){
            System.out.println(i);
            i++;
        }   
    }

    //Second Task
    public void printOddNums(){
        int j = 0;
        for(j = 0; j < 256; j++){
            if(j % 2 != 0) {
                System.out.println(j);
            }
        }

    }

    //Third Task
    public void printSumNums(){
        int o = 0;
        int sum = 0;
        for(o = 0; o < 256; o++){
            sum += o;
            System.out.println(o);
            System.out.println(sum);
            
        }
    }

    //Fourth Task
    public void iterateArray(){
        int[] xArray = {1, 3, 5, 7, 9, 13};
        for(int i = 0; i < xArray.length; i++){
            System.out.println(xArray[i]);
        }
    }

    // Fifth Task
    public void maxArray(int[] arr){
        int maxNum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]> maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
    }

    // Sixth Task
    public void avgOfArr(int [] arr){
        int avg = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }

    
    // Seventh Task
    public static ArrayList<Integer> oddNumArr(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++){
            if(i % 2 != 0){
                nums.add(i);
            }
        }
        return nums;
    }
    


    // Eighth Task
    public void numOfGreater(int [] arr){
        int y = 3;
        int numsAdded = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                numsAdded++;
            }
        }
        System.out.println(numsAdded);
    }

    //Ninth Task
    public void squareValues(int [] arr){
        ArrayList<Integer> squaredArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            int currNum = arr[i] * arr[i];
            squaredArr.add(currNum);
        }
        System.out.println(squaredArr);
    }

    //Tenth Task
    public void noNegatives(int[] x){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            if (x[i] < 0) {
                list.add(0);
            } else {
                list.add(x[i]);
            }
        }
        System.out.println(list);
    }

    // Eleventh Task
    public void minMaxAverage(int[] z){
        int max = 0;
        int min = 0;
        double avg = 0;
        int sum = 0;
        for(int i = 0; i < z.length; i++){
            if(z[i] > max){
                max = z[i];
            }
            if(z[i] < min){
                min = z[i];
            }
            sum += z[i];
        }
        avg = sum / z.length;

        ArrayList<String> b = new ArrayList<String>();
        b.add(String.valueOf(max));
        b.add(String.valueOf(min));
        b.add(String.valueOf(avg));
        System.out.println(b);
    }

    
    //Twelfth Task
    public void shiftArray(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        ans.add(0);
        System.out.println(ans);
    }

    //Demo
    public void shiftArrayBetter(int[] arr, int numOfShifts) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = numOfShifts; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        for (int j = arr.length - numOfShifts; j < arr.length; j++) {
            answer.add(0);
        }
        System.out.println(answer);
    }

    
}