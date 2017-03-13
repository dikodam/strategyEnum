import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IStrategy> strategies = new ArrayList<>();
        strategies.add(Strategy.CAPITALS);
        strategies.add(Strategy.LOWERCASE);
        for (IStrategy s : strategies) {
            s.doStuff("LOl");
        }
    }
}
