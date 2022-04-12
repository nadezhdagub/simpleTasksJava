import java.util.HashMap;
import java.util.Map;

public class CountWorldsInMap {
    public static void main(String[] args) {
        String st = " one two three four one";
        String[] worlds = st.split(" ");
        Map<String, Integer> key = new HashMap<String, Integer>();
        for (int i = 0; i <= worlds.length; i++) {
            if (key.containsKey(worlds[i])) {
                int counter = key.get(worlds[i]);
                key.put(worlds[i], counter + 1);
            }
            else {
                key.put(worlds[i], 1);
            }
        }
        System.out.println(key);
    }
}
