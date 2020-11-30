import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava{
    
    // First Task
    public static void sumArray(){
        int [] xArray = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        int count = 0;
        // loop through for loop to gather sum of indexes, and find nums > 10
        for(int i = 0; i < xArray.length; i++){
            int x = xArray[i];
            sum += x;
            //if num > 10, that num becomes x
            if(x > 10){
                count++;
                //making a new array index to cycle through to add nums to new array
            }
        }

        int[] greaterThanTen = new int[count];
        int arrIndex = 0;

        // LOOP AGAIN
        for(int i = 0; i < xArray.length; i++){
            int x = xArray[i];
            if(x > 10){
                greaterThanTen[arrIndex] = x;
                arrIndex++;
            }
        }

        System.out.println(sum);
        System.out.println(Arrays.toString(greaterThanTen));
    }

    // Second Task
    public static void stringArray(){
        String [] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        int count = 0;
        int arrIndex = 0;
        String name = "";
        Collections.shuffle(Arrays.asList(names));
        for(int i = 0; i < names.length; i++){
            if(names[i].length() > 5){
                count++;
            }
        }
        // Printing the shuffled array
        System.out.println(Arrays.toString(names));
        //if array length > 5, it goes into a new array of names > 5 length
        String[] greaterThanFive = new String[count];
        for(int i = 0; i < names.length; i++){
            if(names[i].length() > 5){
                name = names[i];
                //System.out.println(name);
                greaterThanFive[arrIndex] = name;
                arrIndex++;
            }
        }

        System.out.println(Arrays.toString(greaterThanFive));
    }

    //Third Task
    public static void alphabet(){
        String[] alphab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Collections.shuffle(Arrays.asList(alphab));
        System.out.println(Arrays.toString(alphab));
        System.out.println(alphab[0]);
        System.out.println(alphab[25]);
        if(alphab[0] == "a"){
            System.out.println("It is a vowel.");
        } else if(alphab[0] == "e"){
            System.out.println("It is a vowel.");
        } else if(alphab[0] == "i"){
            System.out.println("It is a vowel.");
        } else if(alphab[0] == "o"){
            System.out.println("It is a vowel.");
        } else if(alphab[0] == "u"){
            System.out.println("It is a vowel.");
        }
    }

    //Fourth Task
    public static void tenRandom(){
        int start = 55;
        int end = 100;
        int count = 10;
        int arrIndex = 0;
        int [] arrRandom = new int [count];
        while(count != 0){
            int randInt = 0;
            Random rand = new Random();
            //Why does this section work? --
            int lowerBound = 55;
            int upperBound = 100;
            int offset = upperBound - lowerBound;
            //What is this doing?
            int int_random = rand.nextInt(offset) + lowerBound;
            // --
            arrRandom[arrIndex] = int_random;
            arrIndex++;
            count--;
        }
        System.out.println(Arrays.toString(arrRandom));

    }

    //Fifth Task
    public static void tenRandomSorted(){
        int start = 55;
        int end = 100;
        int count = 10;
        int arrIndex = 0;
        int [] arrRandom = new int [count];
        while(count != 0){
            int randInt = 0;
            Random rand = new Random();
            //Why does this section work? --
            int lowerBound = 55;
            int upperBound = 100;
            int offset = upperBound - lowerBound;
            //What is this doing?
            int int_random = rand.nextInt(offset) + lowerBound;
            // --
            arrRandom[arrIndex] = int_random;
            arrIndex++;
            count--;
        }
        Arrays.sort(arrRandom);
        System.out.println(Arrays.toString(arrRandom));

    }

    //Sixth Task
    public static void generateRandString(){
        Random r = new Random();
        int count = 5;
        int arrIndex;
        arrIndex = 0;
        String [] alphab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] empty = new String[count];
        while(count != 0){
            Collections.shuffle(Arrays.asList(alphab));
            empty[arrIndex] = alphab[0];
            arrIndex++;
            count--;
        }

        System.out.println(Arrays.toString(empty));
    }

    //Seventh Task
    public static void tenRandStrings(){
        int count = 5;
        Random r = new Random();
        String [] alphab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String [] tenStrings = new String [10];
        for(int i = 0; i < tenStrings.length; i++){
            tenStrings[i] = GetRandomString(alphab);
        }
        System.out.println(Arrays.toString(tenStrings));
    }

    private static String GetRandomString(String[] alphabet)
    {
        Collections.shuffle(Arrays.asList(alphabet));
        return alphabet[0] + alphabet[1] + alphabet[2] + alphabet[3] + alphabet[4];
    }

}

