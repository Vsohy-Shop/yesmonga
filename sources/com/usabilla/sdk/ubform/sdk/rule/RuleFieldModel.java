package com.usabilla.sdk.ubform.sdk.rule;

import android.os.Parcel;
import android.os.Parcelable;

public class RuleFieldModel extends RuleBaseModel implements Parcelable {
    public static final Parcelable.Creator<RuleFieldModel> CREATOR = new C10089a();

    /* renamed from: c */
    public boolean f27739c;

    /* renamed from: com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel$a */
    public class C10089a implements Parcelable.Creator<RuleFieldModel> {
        /* renamed from: a */
        public RuleFieldModel createFromParcel(Parcel parcel) {
            return new RuleFieldModel(parcel, (C10089a) null);
        }

        /* renamed from: b */
        public RuleFieldModel[] newArray(int i) {
            return new RuleFieldModel[i];
        }
    }

    public /* synthetic */ RuleFieldModel(Parcel parcel, C10089a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo21505e() {
        return this.f27739c;
    }

    /* renamed from: f */
    public void mo21506f(boolean z) {
        this.f27739c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f27739c ? (byte) 1 : 0);
    }

    public RuleFieldModel() {
    }

    public RuleFieldModel(Parcel parcel) {
        super(parcel);
        this.f27739c = parcel.readByte() != 0;
    }
}
