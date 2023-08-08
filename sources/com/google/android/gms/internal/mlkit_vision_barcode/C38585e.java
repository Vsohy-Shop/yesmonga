package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.e */
public final class C38585e implements Parcelable.Creator<zzad> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                z = SafeParcelReader.m166032P(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzad(i, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
