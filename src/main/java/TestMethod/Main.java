package TestMethod;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        repeat
        String stringRepeat = "Abc";
        String repeated = new String(new char[3]).replace("\0", stringRepeat);
        System.out.println(repeated);

//        isBlank
        System.out.println("TestBLANK".isBlank());      //false
        System.out.println(" TestBLANK ".isBlank());    //false
        System.out.println("  ".isBlank());     //true
        System.out.println("".isBlank());       //true

//      lines
        String stringLines = " A B C D";
        Stream<String> lines = stringLines.lines();
        lines.forEach(System.out::println);

        String stringStrip = "  Hello World !!            ";
//        strip
        System.out.println(stringStrip.strip());      //"Hello World !!"
//        stripLeading
        System.out.println(stringStrip.stripLeading()); //"Hello World !!            "
//        stripTrailing
        System.out.println(stringStrip.stripTrailing());  //"  Hello World !!"
    }

}
