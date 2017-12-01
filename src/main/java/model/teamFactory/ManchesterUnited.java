package model.teamFactory;

import model.teamFactory.fixtures.Fixtures;
import model.FootballAPI;
import org.json.JSONObject;

public class ManchesterUnited implements Team {
    private final String name;
    private final String code;
    private final String shortName;
    private FootballAPI api = FootballAPI.getInstance();
    private String url = FootballAPI.URL + "/teams/66/";

    public ManchesterUnited(){
        JSONObject res = api.connect(url);
        this.name = res.getString("name");
        this.code = res.getString("code");
        this.shortName = res.getString("shortName");
    }

    @Override
    public Fixtures getFixtures() {
        JSONObject res = api.connect(url +"fixtures");
        Fixtures fixture = new Fixtures(res);
        return fixture;
    }

    @Override
    public JSONObject getPlayers() {
        return api.connect(url + "players");
    }
}
