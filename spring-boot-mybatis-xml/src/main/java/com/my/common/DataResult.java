package com.my.common;

/**
 * Created by dev on 2018/2/9.
 */
public class DataResult<T> {

    // 是否成功标识
    private boolean success = true;

    // 成功时返回信息
    private String message;

    // 返回编码
    private Integer returnCode = 200;

    // 返回数据
    private T data;

    public DataResult() {
    }

    public DataResult(boolean success) {
        this(success, null, null);
    }

    public DataResult(T data) {
        this.data = data;
    }

    public DataResult(boolean success, String message) {
        this(success, message, null);
    }

    public DataResult(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
