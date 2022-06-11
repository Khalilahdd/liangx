package com.google.ff.dto;

/**
 * 封装jason对象，所有返回结果都需要使用它
 * @param <T>
 */
public class Result<T> {

    //是否成功的标志
    private boolean success;

    //成功时返回的数据
    private T data;

    //错误的信息
    private String error;


    public Result() {
    }

    //成功时返回的数据
    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    //失败时返回的数据
    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
