package view;

import model.table.LeagueTable;
import model.teamFactory.Team;

public class LeagueTableView {

    public void printTable(LeagueTable leagueTable) {
        Team[] standing = leagueTable.getStanding();
        String format = "|%1$-5s|%2$-25s|%3$-3s|%4$-3s|%5$-3s|%6$-3s|%7$-3s|%8$-3s|%9$-3s|%10$-3s|\n";

        System.out.println(leagueTable.getLeagueCaption());
        System.out.println("Semana actual: " + leagueTable.getCurrentMatchday());

        System.out.format(format, "Pos", "Club", "PJ","G", "E", "P", "GF", "GC", "DG", "Pts");
        System.out.println("-----------------------------------------------------------------");

        for (Team team : standing) {
            System.out.format(format, team.getPosition(),
                    team.getName(), team.getPlayedGames(), team.getWins(), team.getDraws(), team.getLosses(), team.getGoalsFor(),
                    team.getGoalsAgainst(), this.getGoalDiff(team.getGoalsFor(), team.getGoalsAgainst()), this.getPoints(team.getWins(), team.getDraws()));
        }

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
