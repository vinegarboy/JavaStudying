package ex5;
import java.util.*;

public class SumAndAverage {
    public static void main(String[] args) {
        int all = 0;
        ArrayList<Integer> values = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("���l����͂��Ă��������B");
        while (scanner.hasNext()) {
            int date = Integer.parseInt(scanner.nextLine());
            values.add(date);
        }
        System.out.println("���͂��ꂽ�f�[�^�́A");
        for (int value : values) {
            System.out.println(value);
            all +=value;
        }
        System.out.println("�f�[�^�̑��ʂ�"+all+"\n���ϒl��"+(all/values.size()));
        scanner.close();
    }
}
