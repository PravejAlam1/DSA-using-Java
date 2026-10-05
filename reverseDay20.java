public class reverseDay20 {
  public static void main(String[] args) {
    
    // int[] arr = {2,3,5,7,6}; //=== reverse number

    // for(int i = arr.length-1; i > 0; i--) {
    //   System.out.println(i);

    // }


    //==Question Vovel and consonant
    String s = "Sneha Dayan";
    int vowel = 0;
    int consonant = 0;

    for(int i = 0; i< s.length(); i++) {

      char ch = s.charAt(i);
      if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' ) {
        vowel++;
      } else{consonant++;}
    }

    System.out.println("Vowels " + vowel);
    System.out.println("consonants " + consonant);
  }
  
}
