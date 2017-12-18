package com.activity.opaiweaher.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by msi-pc on 2017/12/15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperaturn;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
