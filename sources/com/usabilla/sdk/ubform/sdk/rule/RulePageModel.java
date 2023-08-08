package com.usabilla.sdk.ubform.sdk.rule;

import android.os.Parcel;
import android.os.Parcelable;

public class RulePageModel extends RuleBaseModel implements Parcelable {
    public static final Parcelable.Creator<RulePageModel> CREATOR = new C10090a();

    /* renamed from: c */
    public String f27740c;

    /* renamed from: com.usabilla.sdk.ubform.sdk.rule.RulePageModel$a */
    public class C10090a implements Parcelable.Creator<RulePageModel> {
        /* renamed from: a */
        public RulePageModel createFromParcel(Parcel parcel) {
            return new RulePageModel(parcel, (C10090a) null);
        }

        /* renamed from: b */
        public RulePageModel[] newArray(int i) {
            return new RulePageModel[i];
        }
    }

    public /* synthetic */ RulePageModel(Parcel parcel, C10090a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo21511e() {
        return this.f27740c;
    }

    /* renamed from: f */
    public void mo21512f(String str) {
        this.f27740c = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27740c);
    }

    public RulePageModel() {
    }

    public RulePageModel(Parcel parcel) {
        super(parcel);
        this.f27740c = parcel.readString();
    }
}
