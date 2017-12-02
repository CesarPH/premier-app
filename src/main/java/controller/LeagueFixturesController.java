package controller;


import model.table.LeagueTable;
import model.teamFactory.fixtures.Fixture;
import model.teamFactory.fixtures.Fixtures;
import view.LeagueFixturesView;

public class LeagueFixturesController {

    private LeagueTable leagueTableModel;
    private LeagueFixturesView leagueFixturesView;

    public LeagueFixturesController(LeagueTable leagueTableModel, LeagueFixturesView leagueFixturesView) {
        this.leagueTableModel = leagueTableModel;
        this.leagueFixturesView = leagueFixturesView;
    }

    public void updateview() {
        leagueFixturesView.header(leagueTableModel.getLeagueCaption(), leagueTableModel.getCurrentMatchday());
        for (Fixture fixture : leagueTableModel.getFixtures()) {
            leagueFixturesView.addFixture(fixture.getHomeTeamName(), fixture.getAwayTeamName(), fixture.getGoalsHomeTeam(), fixture.getGoalsAwayTeam());
        }
    }

}
