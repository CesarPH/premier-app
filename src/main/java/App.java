
import controller.LeagueFixturesController;
import controller.LeagueTableController;
import controller.TeamController;
import model.table.LeagueTable;
import model.teamFactory.Team;
import model.teamFactory.TeamFactory;
import view.LeagueFixturesView;
import view.LeagueTableView;
import view.TeamView;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        home();
    }
    private static void home() {
        System.out.println("Premier App");

        System.out.println("1.- Mostrar Tabla de Posiciones");
        System.out.println("2.- Mostrar Jornada Actual");
        System.out.println("3.- Mostrar Equipos");
        System.out.println("4.- Salir");

        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                showStanding();
                break;
            case 2:
                showMatchdayWeek();
                break;
            case 3:
                showTeams();
                break;
            default:
                System.out.println("Adios!");
        }
    }


    private static void showStanding(){
        LeagueTable leagueTable = new LeagueTable();
        LeagueTableView leagueTableView = new LeagueTableView();

        LeagueTableController controller = new LeagueTableController(leagueTable, leagueTableView);
        controller.updateView();
        close();
    }

    private static void showMatchdayWeek() {
        LeagueTable leagueTable2 = new LeagueTable();
        LeagueFixturesView leagueFixturesView = new LeagueFixturesView();

        LeagueFixturesController fixturesController = new LeagueFixturesController(leagueTable2, leagueFixturesView);
        fixturesController.updateview();
        close();
    }

    private static void close() {

        System.out.println("\nPresione cualquier numero para regresar al Inicio");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int opc = scanner.nextInt();
        System.out.println();
        home();

    }

    private static void showTeams() {
        teamList();
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int opc = scanner.nextInt();

        int id = TeamFactory.getID(opc);
        Team team = TeamFactory.createTeam(id);

        if (id == 0) {
            System.out.println();
            home();
        }

        TeamView teamView = new TeamView();
        TeamController teamController = new TeamController(team, teamView);
        teamController.updateView();



        System.out.println("¿Desea elegir otro equipo? 1-Si 2-No");
        System.out.print("> ");
        opc = scanner.nextInt();
        if(opc == 1){
            showTeams();
        } else {
            System.out.println();
            home();
        }

    }

    private static void teamList() {
        System.out.println("Equipos:");
        System.out.println("----------------------");
        System.out.println("1.- Arsenal");
        System.out.println("2.- Chelsea");
        System.out.println("3.- Everton");
        System.out.println("4.- Liverpool");
        System.out.println("5.- Manchester City");
        System.out.println("6.- Manchester United");
        System.out.println("7.- Newcastle United");
        System.out.println("8.- Stoke City");
        System.out.println("9.- Swansea City");
        System.out.println("10.- Tottenham");
        System.out.println("11.- West Bromwich Albion");
        System.out.println("12.- Burnley");
        System.out.println("13.- Leicester City");
        System.out.println("14.- Southampton");
        System.out.println("15.- Watford");
        System.out.println("16.- Crystal Palace");
        System.out.println("17.- Huddersfield Town");
        System.out.println("18.- Bright & Hove Albion");
        System.out.println("19.- West Ham United");
        System.out.println("20.- AFC Bournemouth");
        System.out.println();

        System.out.println("21.- Regresar");
        System.out.println();

        System.out.println("¿Qué equipo desea ver información? ");
    }
}
