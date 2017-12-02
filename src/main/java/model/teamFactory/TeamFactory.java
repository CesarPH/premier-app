package model.teamFactory;

import org.json.JSONObject;

public abstract class TeamFactory {

    public static final int MANCHESTER_UNITED = 66;
    public static final int MANCHESTER_CITY = 67;

    public static Team createTeam(int team) {

        switch(team) {
            case MANCHESTER_UNITED:
                return new ManchesterUnited();
            case MANCHESTER_CITY:
                return new ManchesterCity();
        }

        return null;
    }

    public static Team createTeamForTable(int team, JSONObject teamInfo) {

        switch(team) {
            case MANCHESTER_UNITED:
                return new ManchesterUnited(teamInfo);
            case MANCHESTER_CITY:
                return new ManchesterCity(teamInfo);
        }

        return null;
    }



}
