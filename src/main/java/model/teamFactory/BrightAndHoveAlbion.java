package model.teamFactory;

import model.FootballAPI;
import model.teamFactory.fixtures.Fixtures;
import org.json.JSONObject;

public class BrightAndHoveAlbion implements Team {
    private String name;
    private String code;
    private String shortName;
    private int position;
    private int playedGames;
    private int goalsFor;
    private int goalsAgainst;
    private int wins;
    private int draws;
    private int losses;

    private FootballAPI api = FootballAPI.getInstance();
    private String url = FootballAPI.URL + "/teams/397/";

    public BrightAndHoveAlbion() {
        JSONObject res = api.connect(url);
        this.name = res.getString("name");
        this.code = res.getString("code");
        this.shortName = res.getString("shortName");

    }

    public BrightAndHoveAlbion(JSONObject team){
        this.name = team.getString("teamName");
        this.position = team.getInt("position");
        this.playedGames = team.getInt("playedGames");
        this.goalsFor = team.getInt("goals");
        this.goalsAgainst = team.getInt("goalsAgainst");
        this.wins = team.getInt("wins");
        this.draws = team.getInt("draws");
        this.losses = team.getInt("losses");
    }


    @Override
    public Fixtures getFixtures() {
        JSONObject res = api.connect(url + "fixtures");
        Fixtures fixtures = new Fixtures(res);
        return fixtures;
    }

    @Override
    public JSONObject getPlayers() {
        return api.connect(url + "players");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public int getPlayedGames() {
        return playedGames;
    }

    @Override
    public int getGoalsFor() {
        return goalsFor;
    }

    @Override
    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public int getDraws() {
        return draws;
    }

    @Override
    public int getLosses() {
        return losses;
    }
}
