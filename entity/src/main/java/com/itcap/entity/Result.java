package com.itcap.entity;

/**
 * Created by cmhy on 2018/7/3.
 */
public class Result {
    private int code;
    private String msg;
    private Object data;
    private Object data2;
//    private Object data3;
//
//    public Object getData3() {
//        return data3;
//    }
//
//    public void setData3(Object data3) {
//        this.data3 = data3;
//    }

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
