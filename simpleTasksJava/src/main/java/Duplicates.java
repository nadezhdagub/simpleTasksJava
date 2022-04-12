import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    private int findDublicates(List<Integer> elem) {
        int sumElements = elem.size() - 1;
        int total = getSum(elem);
        int dublicate = total - (elem.size() - 1) * (elem.size() + 1) / 2;
        return dublicate;
    }

    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();
        for (int i = 1; i < 100; i++) {
            number.add(i);
        }
        number.add(25);
        Duplicates dn = new Duplicates();
        System.out.println(dn.findDublicates(number));
    }
}
