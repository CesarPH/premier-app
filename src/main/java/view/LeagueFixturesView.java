package view;


public class LeagueFixturesView {


    public void header(String leagueCaption, int currentMatchday){
        System.out.println(leagueCaption);
        System.out.printf("Jornada actual: %d \n\n", currentMatchday);
        System.out.format("%1$-24s %2$-10s %3$-24s \n", "Casa","" ,"Visitante");
        System.out.println("--------------------------------------------------------------");
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
