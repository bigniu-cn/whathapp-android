package cn.bigniu.whathapp.api;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.StreamCorruptedException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by gabry on 2017/3/14.
 */

public class Result extends JSONObject {

    public Result(String json) throws JSONException {
        super(json);
        errcode = this.getInt("errcode");
        errmsg = this.getString("errmsg");
    }

    public int errcode;
    public String errmsg;

}
