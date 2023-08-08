package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r */
public final class C39027r implements Parcelable.Creator<zzbc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            if (SafeParcelReader.m166031O(X) != 1) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                i = SafeParcelReader.m166042Z(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzbc(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbc[i];
    }
}
