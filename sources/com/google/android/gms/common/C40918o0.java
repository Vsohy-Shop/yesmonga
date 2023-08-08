package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.o0 */
public final class C40918o0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O == 2) {
                z = SafeParcelReader.m166032P(parcel, X);
            } else if (O == 3) {
                z2 = SafeParcelReader.m166032P(parcel, X);
            } else if (O == 4) {
                iBinder = SafeParcelReader.m166041Y(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                z3 = SafeParcelReader.m166032P(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzo(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
