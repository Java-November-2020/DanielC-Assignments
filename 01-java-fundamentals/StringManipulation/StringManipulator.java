import java.util.Random;

public class StringManipulator{
    //First Task
    public static String TrimAndConcat(String stringOne, String stringTwo) {
        return stringOne.trim().concat(stringTwo.trim());
    }
    

    //Second Task
    public static Integer GetIndexOrNull(String input, char c) {
        return input.indexOf(c) != -1 ? input.indexOf(c) : null;
    }

    //Third Task
    public Integer getIndexOrNull(String input, String input_two){
        if(input.indexOf(input_two) != -1) {
            return input.indexOf(input_two);
        } else {
            return null;
        }
    }

    //Fourth Task
    public static String ConcatSubstring(String input, int idxA, int idxB, String replacement) {
        String substr;
        try{
            substr = input.substring(idxA, idxB);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("Exception caught: %s", e));
            substr = "LOL";
        }

        return substr.concat(replacement);
    }

    public static String RandomString(int numChars) {
        String output = "";
        Random r = new Random();
        for(int i = 0; i < numChars; i++)
            output += Character.toChars(r.nextInt(122 - 97) + 97)[0];
        
        return output;
    }



}    