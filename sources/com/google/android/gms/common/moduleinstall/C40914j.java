package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.moduleinstall.j */
public final class C40914j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Long l = null;
        Long l2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 3) {
                l = SafeParcelReader.m166050d0(parcel, X);
            } else if (O == 4) {
                l2 = SafeParcelReader.m166050d0(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                i3 = SafeParcelReader.m166042Z(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new ModuleInstallStatusUpdate(i, i2, l, l2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallStatusUpdate[i];
    }
}
