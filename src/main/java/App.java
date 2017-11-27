
import model.teamFactory.Team;
import model.teamFactory.TeamFactory;

public class App {

    public static void main(String[] args) {
        Team team = TeamFactory.createTeam(TeamFactory.MANCHESTER_UNITED);

        System.out.println(team.getFixtures().getAll()[12].getStatus());
        System.out.println(team.getPlayers());

        team = TeamFactory.createTeam(TeamFactory.MANCHESTER_CITY);
        System.out.println(team.getPlayers());

        String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
        System.out.format(format, "A", "AA", "AAA");
        System.out.format(format, "B", "", "BBBBB");
        System.out.format(format, "C", "CCCCC", "CCCCCCCC");

        String ex[] = { "E", "EEEEEEEEEE", "E" };

        System.out.format(String.format(format, (Object[]) ex));


    }
}
