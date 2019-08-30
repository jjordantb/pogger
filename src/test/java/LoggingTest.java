import io.paratek.pogger.Pogger;
import io.paratek.pogger.Poggers;

public class LoggingTest {

    private static final Pogger pogger = Poggers.get();

    public static void main(String[] args) {
        method0();
        method1();
    }

    public static void method0() {
        pogger.info("Hello!");
    }

    public static void method1() {
        pogger.error("HECK");
    }

}
