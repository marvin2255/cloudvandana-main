public class PangramOrNot {
    public static int checkPangram(String str){
        // converting string into lowercase without any space between them.
        str = str.toLowerCase().replaceAll(" ", "");

        // If number of characters is less than 26 can't be a pangram.
        if(str.length()<26){
            System.out.println("Not a pangram");
            return 0;
        }
        
        // Checking whether all alphabets are present or not.
        boolean allLetterPresent = true;
        for(char ch='a'; ch<='z'; ch++){
            if(!str.contains(String.valueOf(ch))){
                allLetterPresent = false;
                break;
            }
        }

        if(allLetterPresent)
            System.out.println("It is a pangram");
        else
            System.out.println("It is not a pangram");
        return 0;
    }

    public static void main(String[] args){
        String str = "The quick brown fox jumps over a lazy dog";
        checkPangram(str);
    }
}
