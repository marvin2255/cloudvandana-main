import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s){
        // Checking whethere the string is empty
        if (s == null || s.length() == 0){
            System.out.println("Not valid");
            return -1;
        }

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        // Validating the roman number
        for(int i=0; i<s.length()-1; i++){
            if(!map.containsKey(s.charAt(i))){
                System.out.println("Not a valid Roman Number ");
                return -1;
            }
        }

        System.out.println("Roman Number : " + s);

        // Getting the Integer value
        int len = s.length(), result = map.get(s.charAt(len-1));
        for( int i = len-2; i>=0 ; i--){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }

        System.out.println("Integer : " + result);
        return result;
    }
    public static void main(String[] args){
        romanToInt("MIXX");
    }
}
