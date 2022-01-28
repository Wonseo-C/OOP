import static org.junit.Assert.*;

import org.junit.Test;
public class TestSort {
    public static void testSort() {
        String[] input = {"apple", "derp", "banna", "candy", "zebra"};
        String[] expected = {"apple", "banna", "candy", "derp", "zebra"};

        // Sort class가 정의 되어 있어야함.
        Sort.sort(input);
        
        if (input.length != expected.length) {
            System.out.println("Array sizes do not match");
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] == expected[i]) {
                continue;
            } else {
                System.out.println("The element is different at " + i);
            }
        }
        // for (String current : input) {
        // }

        // Equal to 위의 알고리즘
        assertArrayEquals(expected, input);
    }
    
    @Test
    public static void main(String[] args) {
        testSort();
        System.out.println("Good!");
    }

    // Quiz
    // 1. Static methods belong to (classes) while non-static methods belong to (objects).
    //    Static methods (cannot) access non-static member variables and non-static methods (can) access static member variables.

    // 3. 
    // char[] word = new char[]{'a','b','c','d','e'};
    // for (int i=0; i < 4; i+=2) {
    //     System.out.print(word[i]);
    // }
    // ans : ac

    // ssd로 깃헙 올리기
}
