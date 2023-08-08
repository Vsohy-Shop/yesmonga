package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.i1 */
public final class C30348i1 implements Parcelable.Creator<zzbo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 1;
        int i2 = 1;
        long j = -1;
        long j2 = -1;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 3) {
                j = SafeParcelReader.m166048c0(parcel, X);
            } else if (O != 4) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                j2 = SafeParcelReader.m166048c0(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzbo(i, i2, j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbo[i];
    }
}
