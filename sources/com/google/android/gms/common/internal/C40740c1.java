package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.c1 */
public final class C40740c1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        Scope[] scopeArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                i3 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 3) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 4) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.m166027K(parcel, X, Scope.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zax(i, i3, i2, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
