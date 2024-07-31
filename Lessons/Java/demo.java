public class demo{
    public static void main(String[] args) {
        String str = "hello";
        char[] charArr = str.toCharArray();
        int n = charArr.length;

        for(int i=0 , j=n-1; i<j ; i++ , j--){
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }
        System.out.println(new String(charArr));
    }
}