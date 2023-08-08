package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.c0 */
public final class C40681c0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O == 2) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                j = SafeParcelReader.m166048c0(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new Feature(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
