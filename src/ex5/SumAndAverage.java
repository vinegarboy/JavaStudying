package ex5;
import java.util.*;

public class SumAndAverage {
    public static void main(String[] args) {
        int all = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        while (scanner.hasNext()) {
            int date = Integer.parseInt(scanner.nextLine());
            values.add(date);
        }
        System.out.println("入力されたデータは、");
        for (int value : values) {
            System.out.println(value);
            all +=value;
        }
        System.out.println("データの総量は"+all+"\n平均値は"+(all/values.size()));
        scanner.close();
    }
}
