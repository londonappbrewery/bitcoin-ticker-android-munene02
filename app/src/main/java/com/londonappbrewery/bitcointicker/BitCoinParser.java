package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Munene on 27/05/2017.
 */

public class BitCoinParser {
    private String ask;

    public static BitCoinParser fromJson(JSONObject jsonObject){
        try {
            BitCoinParser data = new BitCoinParser();
            data.ask = jsonObject.getString("ask");

            return data;

        }
        catch(JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getAsk() {
        return ask;
    }
}
