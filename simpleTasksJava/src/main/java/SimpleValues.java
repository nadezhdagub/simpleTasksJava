public class SimpleValues {
    public static void main(String[] args) {
        
        for (int i = 2; i <= 100; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) {
                System.out.println(i);
            }
        }
    }
}
