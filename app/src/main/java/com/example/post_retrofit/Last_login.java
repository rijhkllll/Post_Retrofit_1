package com.example.post_retrofit;

public class Last_login {

private  String  date_time;
private String ip4;

    public Last_login(String date_time, String ip4) {
        this.date_time = date_time;
        this.ip4 = ip4;
    }


    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getIp4() {
        return ip4;
    }

    public void setIp4(String ip4) {
        this.ip4 = ip4;
    }
}
