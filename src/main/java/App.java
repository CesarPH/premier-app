import model.FootballAPI;
import org.json.JSONObject;

public class App {

    public static void main(String[] args) {
        FootballAPI api = FootballAPI.getInstance();
        JSONObject res = api.getTeam((byte) 66);
        System.out.println(res.getString("name"));
    }
}
