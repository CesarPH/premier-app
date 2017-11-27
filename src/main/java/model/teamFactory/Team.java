package model.teamFactory;

import model.fixtures.Fixtures;
import org.json.JSONObject;

public interface Team {
    public Fixtures getFixtures();
    public JSONObject getPlayers();
}