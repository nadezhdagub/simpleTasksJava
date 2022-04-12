public class DublicatesString {
    public static void main(String[] args) {
        String st = new String("Hello");
        int count = 0;
        char[] ch = st.toCharArray();
        for (int i = 0; i < st.length(); i++) {
            for (int j = i+1; j<st.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
