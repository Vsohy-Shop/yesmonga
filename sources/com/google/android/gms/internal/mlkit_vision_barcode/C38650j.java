package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.j */
public final class C38650j implements Parcelable.Creator<zzaj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 3) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 4) {
                i3 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 5) {
                j = SafeParcelReader.m166048c0(parcel, X);
            } else if (O != 6) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                i4 = SafeParcelReader.m166042Z(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzaj(i, i2, i3, j, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
