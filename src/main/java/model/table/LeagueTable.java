package model.table;

import model.FootballAPI;
import model.teamFactory.Team;
import model.teamFactory.TeamFactory;
import org.json.JSONArray;
import org.json.JSONObject;


public class LeagueTable {

    private String leagueCaption;
    private int currentMatchday;
    private Team[] standing;

    public LeagueTable(){
        FootballAPI api = FootballAPI.getInstance();
        JSONObject res = api.connect(FootballAPI.URL + "/competitions/445/leagueTable");
        this.currentMatchday = res.getInt("matchday");
        this.leagueCaption = res.getString("leagueCaption");

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

    public int getCurrentMatchday() {
        return currentMatchday;
    }

    public Team[] getStanding() {
        return standing;
    }

    public String getLeagueCaption() {
        return leagueCaption;
    }



}
