
public class StringManipulatorTest{

    public static void main(String[] args) {
        //First Task
        StringManipulator manipulator = new StringManipulator();
        String export = manipulator.TrimAndConcat("    Hello     ","     World    ");
        System.out.println(export); // HelloWorld 

        //Second Task
        char letter = 'a';
        Integer a = manipulator.GetIndexOrNull("Alphabet", 'a');
        System.out.println(a); 

        //Third Task
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer b = manipulator.getIndexOrNull(word, subString);
        Integer c = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(b); // 2
        System.out.println(c); // null  


        //Fourth Task
        String words = manipulator.ConcatSubstring("Hello", 1, 2, "world");
        System.out.println(words); // eworld
    }

}
