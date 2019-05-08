
package com.example.tainge.retrofit.entity;

import com.google.gson.annotations.SerializedName;

public class SubCate {

    @SerializedName("cate_name")
    private String mCateName;
    @SerializedName("des")
    private String mDes;
    @SerializedName("icon_name")
    private Object mIconName;
    @SerializedName("id")
    private Long mId;
    @SerializedName("status")
    private Boolean mStatus;
    @SerializedName("total_url")
    private Long mTotalUrl;

    public String getCateName() {
        return mCateName;
    }

    public void setCateName(String cateName) {
        mCateName = cateName;
    }

    public String getDes() {
        return mDes;
    }

    public void setDes(String des) {
        mDes = des;
    }

    public Object getIconName() {
        return mIconName;
    }

    public void setIconName(Object iconName) {
        mIconName = iconName;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getStatus() {
        return mStatus;
    }

    public void setStatus(Boolean status) {
        mStatus = status;
    }

    public Long getTotalUrl() {
        return mTotalUrl;
    }

    public void setTotalUrl(Long totalUrl) {
        mTotalUrl = totalUrl;
    }

    @Override
    public String toString() {
        return "SubCate{" +
                "mCateName='" + mCateName + '\'' +
                ", mDes='" + mDes + '\'' +
                ", mIconName=" + mIconName +
                ", mId=" + mId +
                ", mStatus=" + mStatus +
                ", mTotalUrl=" + mTotalUrl +
                '}';
    }
}
