 class Vowels{

private static int countvowels(String str){
    String vowels = "aeiouAEIOU";
    int count = 0;
    
    for (char c : str.toCharArray()){
        if (vowels.indexOf(c) != -1)
         count++;
    }
    return count;
}

public static void main (String[] args){
    String str = "Dreamcatcher";
    System.out.print(countvowels(str));
}
}