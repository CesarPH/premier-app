package controller;

import model.table.LeagueTable;
import model.teamFactory.Team;
import view.LeagueTableView;

public class LeagueTableController {
    private LeagueTable leagueTableModel;
    private LeagueTableView leagueTableView;


    public LeagueTableController(LeagueTable leagueModel, LeagueTableView leagueTableView) {
        this.leagueTableModel = leagueModel;
        this.leagueTableView = leagueTableView;
    }


    public void updateView() {
        leagueTableView.header(leagueTableModel.getLeagueCaption(), leagueTableModel.getCurrentMatchday());
        for (Team team : leagueTableModel.getStanding()) {
            leagueTableView.addRow(team.getPosition(), team.getName(), team.getPlayedGames(), team.getWins(), team.getDraws(),
                    team.getLosses(), team.getGoalsFor(), team.getGoalsAgainst());
        }
        leagueTableView.footer();
    }

}
