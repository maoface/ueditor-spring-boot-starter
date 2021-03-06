package com.maoface.ueditor.entity;

/**
 * @author zhuxuchao
 * @date 2020-04-15 20:08
 */
public class BaseResponse implements Response {
    String state;

    public BaseResponse() {
    }

    public BaseResponse(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
