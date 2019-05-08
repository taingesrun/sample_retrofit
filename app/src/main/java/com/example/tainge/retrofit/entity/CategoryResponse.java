
package com.example.tainge.retrofit.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {

    @SerializedName("code")
    private String mCode;
    @SerializedName("data")
    private List<Category> mData;
    @SerializedName("msg")
    private String mMsg;
    @SerializedName("status")
    private Boolean mStatus;

    @Override
    public String toString() {
        return "CategoryResponse{" +
                "mCode='" + mCode + '\'' +
                ", mData=" + mData +
                ", mMsg='" + mMsg + '\'' +
                ", mStatus=" + mStatus +
                '}';
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public List<Category> getData() {
        return mData;
    }

    public void setData(List<Category> data) {
        mData = data;
    }

    public String getMsg() {
        return mMsg;
    }

    public void setMsg(String msg) {
        mMsg = msg;
    }

    public Boolean getStatus() {
        return mStatus;
    }

    public void setStatus(Boolean status) {
        mStatus = status;
    }

}
