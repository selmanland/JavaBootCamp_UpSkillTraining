package day01;

public class CustomFunctionalInterface {

    public static void main(String[] args) {

    StringFunctions longestString = (s1, s2) -> {
        if(s1.length() > s2.length())
            return s1;
        return s2;
    };

    // "java", "C#"

        System.out.println( longestString.function("Java", "C#") );





    }
}
