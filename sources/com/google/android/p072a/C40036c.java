package com.google.android.p072a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.a.c */
public final class C40036c {
    static {
        C40036c.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m163042a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m163043b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m163044c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }
}
