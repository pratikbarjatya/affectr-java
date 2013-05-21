package io.theysay.client.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.lang.reflect.Type;

public class JsonUtils {
    public static final Gson gson = new GsonBuilder().create();

    public static <T> T fromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    public static <T> T fromJson(String json, Type type) {
        return gson.fromJson(json, type);
    }

    public static String toJson(Object src) {
        return gson.toJson(src);
    }

    public static String toJson(Object src, String root) {
        JsonObject json = new JsonObject();
        json.add(root, gson.toJsonTree(src));
        return json.toString();
    }
}
