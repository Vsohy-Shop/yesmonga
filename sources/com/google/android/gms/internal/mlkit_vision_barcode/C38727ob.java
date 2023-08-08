package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ob */
public final class C38727ob implements Parcelable.Creator<zzk> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                d = SafeParcelReader.m166036T(parcel, X);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                d2 = SafeParcelReader.m166036T(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzk(d, d2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
