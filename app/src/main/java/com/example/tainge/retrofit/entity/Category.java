
package com.example.tainge.retrofit.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {

    @SerializedName("cate_name")
    private String mCateName;
    @SerializedName("des")
    private String mDes;
    @SerializedName("icon_name")
    private String mIconName;
    @SerializedName("id")
    private Long mId;
    @SerializedName("status")
    private Boolean mStatus;
    @SerializedName("sub_cate")
    private List<SubCate> mSubCate;

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

    public Boolean getStatus() {
        return mStatus;
    }

    public void setStatus(Boolean status) {
        mStatus = status;
    }

    public List<SubCate> getSubCate() {
        return mSubCate;
    }

    public void setSubCate(List<SubCate> subCate) {
        mSubCate = subCate;
    }

    @Override
    public String toString() {
        return "Category{" +
                "mCateName='" + mCateName + '\'' +
                ", mDes='" + mDes + '\'' +
                ", mIconName='" + mIconName + '\'' +
                ", mId=" + mId +
                ", mStatus=" + mStatus +
                ", mSubCate=" + mSubCate +
                '}';
    }
}
