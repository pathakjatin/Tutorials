import java.util.HashSet;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        HashSet<Character> jewelSet = new HashSet<>();
        for(char c : jewels.toCharArray()){
            jewelSet.add(c);
        }
        for(char s : stones.toCharArray()){
            if(jewelSet.contains(s)){
                count++;
            }
            
        }

        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    
}
