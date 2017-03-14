package cn.bigniu.whathapp.api;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by gabry on 2017/3/14.
 */

public class Happen extends BaseApi {

    /**
     * 获取附近的信息
     *
     * @param lat
     * @param lng
     * @param last_id
     * @param count
     * @return
     */
    public JSONObject listByLocation(double lat, double lng, long last_id, int count) {

        JSONObject params = new JSONObject();
        try {
            params.put("lat", lat);
            params.put("lng", last_id);
            params.put("count", count);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return post("/account/register", params);
    }
}
