package mapsAndSets;

public class maaxFreqCharacterUsingArray {
    public static void main(String[] args) {
        String str = "testsample";
        int[]frequency = new int[26];
        for(char ch : str.toCharArray()){
            frequency[ch - 'a']++;
        }
        int maxFrequency = 0;
        char answer = 'a';

        for (int i = 0 ; i < 26 ; i++){
            if(frequency[i] > maxFrequency){
                maxFrequency = frequency[i];
                answer = (char)(i + 'a');
            }
        }
        System.out.println("The maximum Frequency character is : " + answer);
    }
}
