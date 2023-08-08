package com.usabilla.sdk.ubform.sdk.rule;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class RuleBaseModel implements Parcelable {

    /* renamed from: a */
    public String f27737a;

    /* renamed from: b */
    public List<String> f27738b;

    public RuleBaseModel() {
    }

    /* renamed from: a */
    public String mo21499a() {
        return this.f27737a;
    }

    /* renamed from: b */
    public List<String> mo21500b() {
        return this.f27738b;
    }

    /* renamed from: c */
    public void mo21501c(String str) {
        this.f27737a = str;
    }

    /* renamed from: d */
    public void mo21502d(List<String> list) {
        this.f27738b = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27737a);
        parcel.writeStringList(this.f27738b);
    }

    public RuleBaseModel(Parcel parcel) {
        this.f27737a = parcel.readString();
        this.f27738b = parcel.createStringArrayList();
    }
}
