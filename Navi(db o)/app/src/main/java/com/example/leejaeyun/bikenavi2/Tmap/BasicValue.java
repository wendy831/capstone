package com.example.leejaeyun.bikenavi2.Tmap;

/**
 * Created by jslcs on 2017-04-15.
 */

//import com.google.android.gms.common.api.GoogleApiClient;


/**

 * Created by hp on 2016-06-23.

 */

public class BasicValue {

    //싱글턴 패턴
    final static String TAG = "BasicValue";
    private static BasicValue ourInstance = new BasicValue();



    private boolean accident;
    private boolean accident_alarm;
    private boolean robber;
    private String taas_key;
    private String skplanet_key;


    public static BasicValue getInstance(){return ourInstance;}
    private BasicValue(){}




    public boolean isAccident() {return accident;}
    public void setAccident(boolean accident) {this.accident = accident;}



    public boolean isAccident_alarm() {return accident_alarm;}
    public void setAccident_alarm(boolean accident_alarm) {this.accident_alarm = accident_alarm;}



    public boolean isRobber() {return robber;}
    public void setRobber(boolean robber) {this.robber = robber;}


  
}