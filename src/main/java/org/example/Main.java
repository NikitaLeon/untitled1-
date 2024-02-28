//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println(expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate( 1_000_000, true);
        System.out.println(expected + " == ? == " + actual);
    }
}
