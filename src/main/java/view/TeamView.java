package view;

public class TeamView {
    public void header(String name, String code, String shortName) {
        System.out.printf("%s(%s)  \n", name, code);
        System.out.printf("Nombre abrevidado: %s\n\n", shortName);

    }

    public void title(String title) {
        System.out.println(title);
    }

    public void addFixture(String home, String away, Object goalsHome, Object goalsAway) {
        String format = "%1$-25s %2$-3s-  %3$-3s %4$-25s\n\n";
        if (!goalsAway.equals(null)) {
            System.out.format(format, home, goalsHome, goalsAway, away);
        }else {
            System.out.format(format, home, "", "", away);
        }
    }
}
