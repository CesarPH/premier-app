package model.teamFactory;

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



}
