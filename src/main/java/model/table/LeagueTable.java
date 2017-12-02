package model.table;

import model.FootballAPI;
import model.teamFactory.Team;
import model.teamFactory.TeamFactory;
import org.json.JSONArray;
import org.json.JSONObject;


public class LeagueTable {
    private FootballAPI api = FootballAPI.getInstance();
    private int currentMatchday;
    private Team[] standing;

    public LeagueTable(){
        JSONObject res = api.connect(FootballAPI.URL + "/competitions/445/leagueTable");
        this.currentMatchday = res.getInt("matchday");

        this.standing = this.constructStanding(res.getJSONArray("standing"));
        System.out.println(standing[0]);

    }

    private Team[] constructStanding(JSONArray standing){
        Team[] teams = new Team[standing.length()];


        for (int i=0; i < standing.length(); i++) {
            JSONObject team = standing.getJSONObject(i);
            String href = team.getJSONObject("_links").getJSONObject("team").getString("href");
            int id = Integer.parseInt(href.substring(href.length()-2,href.length()));

            teams[i] = TeamFactory.createTeamForTable(id, team);
        }

        return teams;

    }

}
