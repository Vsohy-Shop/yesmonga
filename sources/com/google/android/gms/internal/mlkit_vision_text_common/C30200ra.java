package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.ra */
public final class C30200ra implements Parcelable.Creator<zzn> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            SafeParcelReader.m166031O(X);
            SafeParcelReader.m166058h0(parcel, X);
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzn();
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
