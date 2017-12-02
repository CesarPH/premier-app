package controller;

import model.teamFactory.Team;
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
        
    }


}
