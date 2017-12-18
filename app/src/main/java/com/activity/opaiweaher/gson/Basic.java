package com.activity.opaiweaher.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by msi-pc on 2017/12/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
