package com.scbrl.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Bruce.Liu
 * 2017-07-04 01:30
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
