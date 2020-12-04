package week05d02;

public class ChangeLetter {

    public static final String VOWELS = "aeiou";

    public String changeVowels (String temp){
        temp = temp.toLowerCase() ;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<temp.length(); i++){
            String s =  temp.substring(i,i+1);
            if (VOWELS.contains(s)) {
                sb.append("*");
            }else {
                sb.append(s);
            }
        }
        return sb.toString();    }


}
