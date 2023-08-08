package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.p0 */
public final class C40920p0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                z = SafeParcelReader.m166032P(parcel, X);
            } else if (O == 2) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O == 3) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 4) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                i = SafeParcelReader.m166042Z(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzq(z, str, i2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
