package com.activity.opaiweaher.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by msi-pc on 2017/12/15.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("text")
        public String info;
    }

    public class CarWash {
        @SerializedName("text")
        public String info;

    }

    public class Sport {
        @SerializedName("text")
        public String info;

    }
}
