package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.t */
public final class C30883t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            if (SafeParcelReader.m166031O(X) != 2) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                bundle = SafeParcelReader.m166055g(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzau(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
