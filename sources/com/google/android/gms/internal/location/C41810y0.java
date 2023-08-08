package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.y0 */
public final class C41810y0 implements Parcelable.Creator<zzl> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        zzj zzj = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                zzj = (zzj) SafeParcelReader.m166019C(parcel, X, zzj.CREATOR);
            } else if (O == 3) {
                iBinder = SafeParcelReader.m166041Y(parcel, X);
            } else if (O != 4) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                iBinder2 = SafeParcelReader.m166041Y(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzl(i, zzj, iBinder, iBinder2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
