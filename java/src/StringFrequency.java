import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
    public static String constructStringWithFrequency(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int n = input.length();
        int Start = 0;
        while(Start <n){
            char character = input.charAt(Start);
            int frequency = 1;
            while(Start <n && input.charAt(Start) == character){

                frequency++;
                Start++;
            }
            result.append(character);
            result.append(frequency);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbcccaaa";
        String output = constructStringWithFrequency(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }


}
