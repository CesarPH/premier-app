package model.teamFactory;

import org.json.JSONObject;

public abstract class TeamFactory {

    public static final int ARSENAL = 57;
    public static final int CHELSEA = 61;
    public static final int EVERTON = 62;
    public static final int LIVERPOOL = 64;
    public static final int MANCHESTER_CITY = 65;
    public static final int MANCHESTER_UNITED = 66;
    public static final int NEWCASTLE_UNITED = 67;
    public static final int STOKE_CITY = 70;
    public static final int SWANSEA_CITY = 72;
    public static final int TOTTENHAM_HOTSPUR = 73;
    public static final int WEST_BROMWICH_ALBION = 74;
    public static final int BURNLEY = 328;
    public static final int LEICESTER_CITY = 338;
    public static final int SOUTHAMPTON = 340;
    public static final int WATFORD = 346;
    public static final int CRYSTAL_PALACE = 354;
    public static final int HUDDERSFIELD_TOWN = 394;
    public static final int BRIGHT_AND_HOVE_ALBION = 397;
    public static final int WEST_HAM_UNITED = 563;
    public static final int AFC_BOURNEMOUTH = 1044;




    public static Team createTeam(int team) {

        switch(team) {
            case ARSENAL:
                return new Arsenal();
            case CHELSEA:
                return new Chelsea();
            case EVERTON:
                return new Everton();
            case LIVERPOOL:
                return new Liverpool();
            case MANCHESTER_CITY:
                return new ManchesterCity();
            case MANCHESTER_UNITED:
                return new ManchesterUnited();
            case NEWCASTLE_UNITED:
                return new NewcastleUnited();
            case STOKE_CITY:
                return new StokeCity();
            case SWANSEA_CITY:
                return new SwanseCity();
            case TOTTENHAM_HOTSPUR:
                return new Tottenham();
            case WEST_BROMWICH_ALBION:
                return new WestBromwich();
            case BURNLEY:
                return new Burnley();
            case LEICESTER_CITY:
                return new LeicesterCity();
            case SOUTHAMPTON:
                return new Southampton();
            case WATFORD:
                return new Watford();
            case CRYSTAL_PALACE:
                return new CrystalPalace();
            case HUDDERSFIELD_TOWN:
                return new HuddersfieldTown();
            case BRIGHT_AND_HOVE_ALBION:
                return new BrightAndHoveAlbion();
            case WEST_HAM_UNITED:
                return new WestHamUnited();
            case AFC_BOURNEMOUTH:
                return new AFCBournemouth();

        }

        return null;
    }

    public static Team createTeamForTable(int team, JSONObject teamInfo) {

        switch(team) {
            case ARSENAL:
                return new Arsenal(teamInfo);
            case CHELSEA:
                return new Chelsea(teamInfo);
            case EVERTON:
                return new Everton(teamInfo);
            case LIVERPOOL:
                return new Liverpool(teamInfo);
            case MANCHESTER_CITY:
                return new ManchesterCity(teamInfo);
            case MANCHESTER_UNITED:
                return new ManchesterUnited(teamInfo);
            case NEWCASTLE_UNITED:
                return new NewcastleUnited(teamInfo);
            case STOKE_CITY:
                return new StokeCity(teamInfo);
            case SWANSEA_CITY:
                return new SwanseCity(teamInfo);
            case TOTTENHAM_HOTSPUR:
                return new Tottenham(teamInfo);
            case WEST_BROMWICH_ALBION:
                return new WestBromwich(teamInfo);
            case BURNLEY:
                return new Burnley(teamInfo);
            case LEICESTER_CITY:
                return new LeicesterCity(teamInfo);
            case SOUTHAMPTON:
                return new Southampton(teamInfo);
            case WATFORD:
                return new Watford(teamInfo);
            case CRYSTAL_PALACE:
                return new CrystalPalace(teamInfo);
            case HUDDERSFIELD_TOWN:
                return new HuddersfieldTown(teamInfo);
            case BRIGHT_AND_HOVE_ALBION:
                return new BrightAndHoveAlbion(teamInfo);
            case WEST_HAM_UNITED:
                return new WestHamUnited(teamInfo);
            case AFC_BOURNEMOUTH:
                return new AFCBournemouth(teamInfo);

        }

        return null;
    }

    public static int getID(int id){
        switch (id) {
            case 1:
                return ARSENAL;
            case 2:
                return CHELSEA;
            case 3:
                return EVERTON;
            case 4:
                return LIVERPOOL;
            case 5:
                return MANCHESTER_CITY;
            case 6:
                return MANCHESTER_UNITED;
            case 7:
                return NEWCASTLE_UNITED;
            case 8:
                return STOKE_CITY;
            case 9:
                return SWANSEA_CITY;
            case 10:
                return TOTTENHAM_HOTSPUR;
            case 11:
                return WEST_BROMWICH_ALBION;
            case 12:
                return BURNLEY;
            case 13:
                return LEICESTER_CITY;
            case 14:
                return SOUTHAMPTON;
            case 15:
                return WATFORD;
            case 16:
                return CRYSTAL_PALACE;
            case 17:
                return HUDDERSFIELD_TOWN;
            case 18:
                return BRIGHT_AND_HOVE_ALBION;
            case 19:
                return WEST_HAM_UNITED;
            case 20:
                return AFC_BOURNEMOUTH;
            default:
                return 0;
        }
    }

}
