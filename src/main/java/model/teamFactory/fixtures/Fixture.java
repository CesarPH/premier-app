package model.teamFactory.fixtures;

import org.json.JSONObject;

public class Fixture {
    private String date;
    private String status;
    private int matchday;
    private String homeTeamName;
    private String awayTeamName;
    private Object goalsHomeTeam;
    private Object goalsAwayTeam;

    public Fixture(JSONObject fixture) {
        this.date = fixture.getString("date");
        this.status = fixture.getString("status");
        this.matchday = fixture.getInt("matchday");
        this.homeTeamName = fixture.getString("homeTeamName");
        this.awayTeamName = fixture.getString("awayTeamName");
        this.goalsHomeTeam = fixture.getJSONObject("result").get("goalsHomeTeam");
        this.goalsAwayTeam = fixture.getJSONObject("result").get("goalsAwayTeam");
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public int getMatchday() {
        return matchday;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public Object getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public Object getGoalsAwayTeam() {
        return goalsAwayTeam;
    }
}
