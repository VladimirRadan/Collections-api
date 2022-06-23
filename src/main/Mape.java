package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class Mape {

    public static void main(String[] args) {

        //key:value
        //Authorization - value
        Map<String, String> header = new LinkedHashMap<>();
        header.put("Authorization","access_token");
        header.put("Content-Type", "application/json");
        header.put("Content-Type", "application/json");
        header.put("Content-Type", "application/json");//duplicate

        for (Map.Entry<String, String> m:header.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }



    }


}
