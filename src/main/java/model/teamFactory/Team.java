package model.teamFactory;

import model.teamFactory.fixtures.Fixtures;
import org.json.JSONObject;

public interface Team {
    Fixtures getFixtures();
    JSONObject getPlayers();
    String getName();
    String getCode();
    String getShortName();
    int getPosition();
    int getPlayedGames();
    int getGoalsFor();
    int getGoalsAgainst();
    int getWins();
    int getDraws();
    int getLosses();
}