package model;

import config.FootballApiKey;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
// import org.json;


public class FootballAPI {
    private static FootballAPI instance = new FootballAPI();
    private String apiKey;


    private FootballAPI(){
        this.apiKey = FootballApiKey.getFootballApiKey();
    }

    public static FootballAPI getInstance() {
        return instance;
    }

    public JSONObject getTeam(byte id) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL("http://api.football-data.org/v1/teams/" + id);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/JSON");
            conn.setRequestProperty("X-Auth-Token", apiKey);
            conn.setRequestProperty("Content-Language", "en-US");
            conn.setUseCaches(false);
            conn.setDoOutput(true);
            conn.setDoInput(true);


            InputStream is = conn.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuffer response = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();

            //JSONParser JSONResponse = new JSONParser();
            JSONObject TeamJSON = new JSONObject(response.toString());
            return TeamJSON;

        }catch (MalformedURLException e){
            // new URL() failed
            // ...
            System.out.println("The URL Failed! \n"+e.getMessage());

        }catch (IOException e) {
            // openConnection() failed
            // ...
            System.out.println("The Connection Failed! \n"+e.getMessage());
        }

        return null;
    }

}
