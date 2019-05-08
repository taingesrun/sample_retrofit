
package com.example.tainge.retrofit.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryCreate {

    @SerializedName("cate_name")
    private String mCateName;
    @SerializedName("des")
    private String mDes;
    @SerializedName("icon_name")
    private String mIconName;
    @SerializedName("id")
    private Long mId;
    @SerializedName("keywords")
    private List<String> mKeywords;
    @SerializedName("status")
    private Boolean mStatus;

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

    public String getIconName() {
        return mIconName;
    }

    public void setIconName(String iconName) {
        mIconName = iconName;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public List<String> getKeywords() {
        return mKeywords;
    }

    public void setKeywords(List<String> keywords) {
        mKeywords = keywords;
    }

    public Boolean getStatus() {
        return mStatus;
    }

    public void setStatus(Boolean status) {
        mStatus = status;
    }

    @Override
    public String toString() {
        return "CategoryCreate{" +
                "mCateName='" + mCateName + '\'' +
                ", mDes='" + mDes + '\'' +
                ", mIconName='" + mIconName + '\'' +
                ", mId=" + mId +
                ", mKeywords=" + mKeywords +
                ", mStatus=" + mStatus +
                '}';
    }
}
