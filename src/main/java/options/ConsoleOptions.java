package options;

import java.util.HashMap;
import java.util.Map;

public enum ConsoleOptions {

    N("Polnoc"), S("Poludnie"), E("Wschod"), W("Zachod");

    private String wartosc;
    private static final Map<String, ConsoleOptions> STRING_CONSOLE_OPTIONS_MAP = new HashMap<>();

    ConsoleOptions(String wartosc) {
        this.wartosc = wartosc;
    }

    public static ConsoleOptions pobierzPrzezWartosc(String wartosc) {
        return STRING_CONSOLE_OPTIONS_MAP.get(wartosc);
    }

    static {
        for (ConsoleOptions consoleOptions : ConsoleOptions.values()) {
            String wartosc = consoleOptions.getWartosc();
            STRING_CONSOLE_OPTIONS_MAP.put(wartosc, consoleOptions);
        }
    }

    public String getWartosc() {
        return wartosc;
    }
}
