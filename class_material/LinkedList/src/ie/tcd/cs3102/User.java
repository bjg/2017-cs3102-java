package ie.tcd.cs3102;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class User {
    public static void loadAll() throws Exception {

        URL url = new URL("http://jsonplaceholder.typicode.com/users");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String inputLine;
        StringBuilder builder = new StringBuilder(2048);
        while ((inputLine = in.readLine()) != null)
            builder.append(inputLine);
        in.close();
        Gson gson = new GsonBuilder().create();
        //gson.fromJson(builder.toString());
    }
}
