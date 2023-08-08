package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.oa */
public final class C30164oa implements Parcelable.Creator<zzl> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        zzr[] zzrArr = null;
        zzf zzf = null;
        zzf zzf2 = null;
        zzf zzf3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    zzrArr = (zzr[]) SafeParcelReader.m166027K(parcel2, X, zzr.CREATOR);
                    break;
                case 3:
                    zzf = (zzf) SafeParcelReader.m166019C(parcel2, X, zzf.CREATOR);
                    break;
                case 4:
                    zzf2 = (zzf) SafeParcelReader.m166019C(parcel2, X, zzf.CREATOR);
                    break;
                case 5:
                    zzf3 = (zzf) SafeParcelReader.m166019C(parcel2, X, zzf.CREATOR);
                    break;
                case 6:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 7:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 8:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 9:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 10:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 11:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 12:
                    i3 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzl(zzrArr, zzf, zzf2, zzf3, str, f, str2, i, z, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
