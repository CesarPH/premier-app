package model.teamFactory.fixtures;

import org.json.JSONArray;
import org.json.JSONObject;

public class Fixtures {
    private Fixture[] fixtures;
    private int season;
    private int count;

    public Fixtures(JSONObject res) {
        this.season = res.getInt("season");
        this.count = res.getInt("count");
        this.fixtures = parseJSONArray(res.getJSONArray("fixtures"));
    }

    private Fixture[] parseJSONArray(JSONArray fixtures){
        Fixture[] fixturesArray = new Fixture[this.count];

        for(int i = 0; i < this.count; i++) {
            JSONObject fixtureJSONObject = fixtures.getJSONObject(i);
            fixturesArray[i] = new Fixture(fixtureJSONObject);
        }

        return fixturesArray;
    }

    public Fixture[] getAll() {
        return fixtures;
    }

    public int getSeason() {
        return season;
    }

    public int getCount() {
        return count;
    }

    public Fixture getNextGame() {
        Fixture matchday = null;

        for(int i=0; i < this.count; i++) {
            if (!fixtures[i].getStatus().equalsIgnoreCase("finished")){
                matchday = fixtures[i];
                break;
            }
        }

        if (fixtures[this.count-1].getStatus().equalsIgnoreCase("finished")) {
            throw new Error("No hay próximos partidos");
        }

        return matchday;
    }
}
