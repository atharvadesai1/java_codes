
import java.util.Scanner;

public class StringMatching{
    public static int checkStringMatch(String s, String word){
        int i = 0;
        int j = 0;
        int index = -1;
        int wordLength = word.length();
        
        while(i<s.length()){ 
            if(s.charAt(i) == word.charAt(j)){
                int hold = i+1;
                i++;
                j++;

                while(j < wordLength){
                    if(s.charAt(i) == word.charAt(j)){
                        i++;
                        j++;
                    }
                    else{
                        j = 0;
                        i = hold;
                        break;
                    }
                }

                if (j!=0){
                    return hold-1;
                }
            }
            else{
                i++;
            }
        }

        return index;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String s = sc.nextLine();
        System.out.println("Enter the string to find: ");
        String word = sc.nextLine();

        int index = checkStringMatch(s, word);
        if (index!=-1){
            System.out.println("The word is present in the string at index "+ index);
        }
        else{
            System.out.println("The word is not present in the string!");
        }
    }
}