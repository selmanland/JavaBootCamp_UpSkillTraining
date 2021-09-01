package day01;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> {
            if(number %2 ==0)
                return true;
            return false;
        };

        boolean r1 = isEven.test(1002);

        System.out.println(r1);

        System.out.println("--------------------------------------------");



    }


}
