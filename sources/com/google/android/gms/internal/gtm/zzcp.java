package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzcp implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<zzcp> CREATOR = new C41464o1();

    /* renamed from: a */
    public String f105741a;

    /* renamed from: b */
    public String f105742b;

    /* renamed from: c */
    public String f105743c;

    @Deprecated
    public zzcp() {
    }

    /* renamed from: a */
    public final String mo136138a() {
        return this.f105741a;
    }

    /* renamed from: b */
    public final String mo136139b() {
        return this.f105743c;
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105741a);
        parcel.writeString(this.f105742b);
        parcel.writeString(this.f105743c);
    }

    @Deprecated
    public zzcp(Parcel parcel) {
        this.f105741a = parcel.readString();
        this.f105742b = parcel.readString();
        this.f105743c = parcel.readString();
    }
}
