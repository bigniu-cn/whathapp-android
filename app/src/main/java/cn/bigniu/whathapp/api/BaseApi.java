package cn.bigniu.whathapp.api;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by gabry on 2017/3/14.
 */

public class BaseApi {

    static String Host = "http://192.168.1.15:3000";
    static OkHttpClient client = new OkHttpClient();
    static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");


    static JSONObject post(String api_path, JSONObject api_params) {
        JSONObject result = null;
        RequestBody body = RequestBody.create(JSON, api_params.toString());
        Request request = new Request.Builder()
                .url(Host + api_path)
                .post(body)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            String responseBodyStr = response.body().string();
            result = new JSONObject(responseBodyStr);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }
}
