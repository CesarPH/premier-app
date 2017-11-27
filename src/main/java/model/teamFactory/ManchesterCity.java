package model.teamFactory;

import model.fixtures.Fixtures;
import model.FootballAPI;
import org.json.JSONObject;

public class ManchesterCity implements Team{
    private final String name;
    private final String code;
    private final String shortName;
    private FootballAPI api = FootballAPI.getInstance();
    private String url = FootballAPI.URL + "/teams/67/";

    public ManchesterCity() {
        JSONObject res = api.connect(url);
        this.name = res.getString("name");
        this.code = res.getString("code");
        this.shortName = res.getString("shortName");
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
}
