package src;

public class amogus {
    public static void main(String[] args) {
        String str = "qweeukfgeeeet";
        String f;
        int k = str.length();
        for (int i = 0; i < k; i++){
            Character result1 = str.charAt(i);
            for (int j = i+1; j < k; ++j) {
                Character result2 = str.charAt(j);
                if(result2 == result1){
                 f = String.valueOf(result2 + result1);
                }
            }
        }
    }
}
