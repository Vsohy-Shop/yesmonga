package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.r1 */
public final class C38756r1 implements Parcelable.Creator<zze> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                strArr = SafeParcelReader.m166024H(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zze(i, strArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
