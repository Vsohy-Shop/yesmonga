package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.g2 */
public final class C30341g2 implements Parcelable.Creator<zzs> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                z = SafeParcelReader.m166032P(parcel2, X);
            } else if (O == 2) {
                j = SafeParcelReader.m166048c0(parcel2, X);
            } else if (O == 3) {
                f = SafeParcelReader.m166038V(parcel2, X);
            } else if (O == 4) {
                j2 = SafeParcelReader.m166048c0(parcel2, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel2, X);
            } else {
                i = SafeParcelReader.m166042Z(parcel2, X);
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzs(z, j, f, j2, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
