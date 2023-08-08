package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import android.os.Parcelable;

public class Option implements Parcelable {
    public static final Parcelable.Creator<Option> CREATOR = new C10011a();

    /* renamed from: a */
    public String f27494a;

    /* renamed from: b */
    public String f27495b;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.Option$a */
    public class C10011a implements Parcelable.Creator<Option> {
        /* renamed from: a */
        public Option createFromParcel(Parcel parcel) {
            return new Option(parcel);
        }

        /* renamed from: b */
        public Option[] newArray(int i) {
            return new Option[i];
        }
    }

    public Option(String str, String str2) {
        this.f27494a = str;
        this.f27495b = str2;
    }

    /* renamed from: a */
    public String mo21005a() {
        return this.f27494a;
    }

    /* renamed from: b */
    public String mo21006b() {
        return this.f27495b;
    }

    /* renamed from: c */
    public void mo21007c(String str) {
        this.f27494a = str;
    }

    /* renamed from: d */
    public void mo21008d(String str) {
        this.f27495b = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27494a);
        parcel.writeString(this.f27495b);
    }

    public Option(Parcel parcel) {
        this.f27494a = parcel.readString();
        this.f27495b = parcel.readString();
    }
}
