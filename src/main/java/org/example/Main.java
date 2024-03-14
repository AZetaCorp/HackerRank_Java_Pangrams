package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    public static String pangrams(String s) {
        List<Character> alphabetList = new ArrayList<>();

        for(char letter = 'A'; letter <= 'Z'; letter++){
            alphabetList.add(letter);
        }

        s = s.toUpperCase();

        for(int i = 0; i < s.length(); i++){
            if(alphabetList.contains( s.charAt(i) )){
                alphabetList.remove( alphabetList.indexOf( s.charAt(i) ) );
            }
        }

        if( alphabetList.isEmpty() ){
            return "pangram";
        }
        return "not pangram";
    }

}