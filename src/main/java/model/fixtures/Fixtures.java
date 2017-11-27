package model.fixtures;

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

    public Object getOne(int index) {
        return null;
    }

    public Fixture[] getAll() {
        System.out.println();
        return fixtures;
    }

    public int getSeason() {
        return season;
    }

    public int getCount() {
        return count;
    }
}
