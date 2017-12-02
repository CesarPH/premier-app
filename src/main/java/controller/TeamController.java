package controller;

import model.teamFactory.Team;
import model.teamFactory.fixtures.Fixture;
import model.teamFactory.fixtures.Fixtures;
import view.TeamView;

public class TeamController {

    private Team teamModel;
    private TeamView teamView;

    public TeamController(Team teamModel, TeamView teamView) {
        this.teamModel = teamModel;
        this.teamView = teamView;
    }

    public void updateView() {
        teamView.header(teamModel.getName(),teamModel.getCode(), teamModel.getShortName());
        Fixtures fixtures = teamModel.getFixtures();

        teamView.title("Próximo/actual partido:");
        teamView.addFixture(fixtures.getNextGame().getHomeTeamName(), fixtures.getNextGame().getAwayTeamName(),
                fixtures.getNextGame().getGoalsHomeTeam(), fixtures.getNextGame().getGoalsAwayTeam());

        teamView.title("Partidos jugados:");
        for (Fixture fixture : fixtures.getAll()) {
            if (fixture.getStatus().equalsIgnoreCase("finished")) {
                teamView.addFixture(fixture.getHomeTeamName(), fixture.getAwayTeamName(), fixture.getGoalsHomeTeam(), fixture.getGoalsAwayTeam());
            } else {
                break;
            }
        }
    }


}
