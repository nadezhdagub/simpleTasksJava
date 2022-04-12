public class Reverce {
    public static void main(String[] args) {
        String t = "Task1";
        StringBuilder stb = new StringBuilder();
        stb.append(t);
        stb = stb.reverse();
        System.out.println(stb);


        // or

        String s = "Study";
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
    }
}
