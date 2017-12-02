package view;


public class LeagueTableView {

    public void header(String leagueName, int matchday) {
        String format = "|%1$-5s|%2$-25s|%3$-3s|%4$-3s|%5$-3s|%6$-3s|%7$-3s|%8$-3s|%9$-3s|%10$-3s|\n";

        System.out.println(leagueName);
        System.out.println("Semana actual: " + matchday);
        System.out.println();

        System.out.format(format, "Pos", "Club", "PJ","G", "E", "P", "GF", "GC", "DG", "Pts");
        System.out.println("-----------------------------------------------------------------");

    }

    public void addRow(int pos, String name, int playedGames, int wins, int draws, int losses, int goalsFor, int goalsAgainst){
        String format = "|%1$-5s|%2$-25s|%3$-3s|%4$-3s|%5$-3s|%6$-3s|%7$-3s|%8$-3s|%9$-3s|%10$-3s|\n";

        System.out.format(format, pos, name, playedGames, wins, draws, losses, goalsFor, goalsAgainst,
                this.getGoalDiff(goalsFor, goalsAgainst), this.getPoints(wins, draws));
    }

    public void footer() {
        System.out.println("");
        System.out.println("PJ: Partidos Jugados");
        System.out.println("G: Ganados");
        System.out.println("E: Empatados");
        System.out.println("P: Perdidos");
        System.out.println("GF: Goles a Favor");
        System.out.println("GC: Goles en Contra");
        System.out.println("DG: Diferencia de Goles");
        System.out.println("Pts: Puntos");
    }

    private int getGoalDiff(int goalsFor, int goalsAgainst){
        return goalsFor - goalsAgainst;
    }

    private int getPoints(int wins, int draws){
        return wins*3 + draws;
    }
}
