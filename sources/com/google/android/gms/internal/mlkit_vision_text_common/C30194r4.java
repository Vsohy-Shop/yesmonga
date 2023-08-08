package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.r4 */
public final class C30194r4 implements Parcelable.Creator<zzf> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
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
                i4 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 6) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                f = SafeParcelReader.m166038V(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzf(i, i2, i3, i4, f);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
