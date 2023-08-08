package com.onetrust.otpublishers.headless.p052UI.DataModels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;

/* renamed from: com.onetrust.otpublishers.headless.UI.DataModels.d */
public class C35025d implements Parcelable {
    public static final Parcelable.Creator<C35025d> CREATOR = new C35026a();

    /* renamed from: a */
    public String f85264a;

    /* renamed from: b */
    public ArrayList<C35024c> f85265b = new ArrayList<>();

    /* renamed from: com.onetrust.otpublishers.headless.UI.DataModels.d$a */
    public class C35026a implements Parcelable.Creator<C35025d> {
        /* renamed from: a */
        public C35025d createFromParcel(Parcel parcel) {
            return new C35025d(parcel);
        }

        /* renamed from: b */
        public C35025d[] newArray(int i) {
            return new C35025d[i];
        }
    }

    public C35025d() {
    }

    @C0363p0
    /* renamed from: a */
    public String mo104252a() {
        return this.f85264a;
    }

    /* renamed from: b */
    public void mo104253b(@C0359n0 String str) {
        this.f85264a = str;
    }

    /* renamed from: c */
    public void mo104254c(@C0363p0 ArrayList<C35024c> arrayList) {
        this.f85265b = arrayList;
    }

    @C0363p0
    /* renamed from: d */
    public ArrayList<C35024c> mo104255d() {
        return this.f85265b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85264a);
    }

    public C35025d(Parcel parcel) {
        this.f85264a = parcel.readString();
    }
}
