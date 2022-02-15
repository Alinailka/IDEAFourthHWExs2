import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(100_00_65, true);
        System.out.println("Ваш бонус составил " + bonus);
    }
}


