package cn.bigniu.whathapp.api;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gabry on 2017/3/14.
 */

public class Account extends BaseApi {
    public static Result login(String mobile, String password) {
        JSONObject params = new JSONObject();
        try {
            params.put("mobile", mobile);
            params.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return post("/account/login", params);
    }

    public static JSONObject register(String nick_name, String mobile, String password) {
        JSONObject params = new JSONObject();
        try {
            params.put("nick_name", nick_name);
            params.put("mobile", mobile);
            params.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return post("/account/register", params);
    }


}
