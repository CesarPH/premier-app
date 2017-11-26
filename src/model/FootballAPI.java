package model;

import config.FootballApiKey;

import java.net.HttpURLConnection;

public class FootballAPI {
    private static FootballAPI instance = new FootballAPI();
    private String apiKey;
    private HttpURLConnection conn = null;


    private FootballAPI(){
        apiKey = FootballApiKey.getFootballApiKey();
    }

    public static FootballAPI getInstance() {
        return instance;
    }

    public static void connect() {
        URL url = new URL('httpd');}
        connection = (HttpURLConnection) url.openConnection();
    }

}
