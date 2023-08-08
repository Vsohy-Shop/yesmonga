package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.ta */
public final class C30224ta implements Parcelable.Creator<zzr> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        zzn[] zznArr = null;
        zzf zzf = null;
        zzf zzf2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    zznArr = (zzn[]) SafeParcelReader.m166027K(parcel, X, zzn.CREATOR);
                    break;
                case 3:
                    zzf = (zzf) SafeParcelReader.m166019C(parcel, X, zzf.CREATOR);
                    break;
                case 4:
                    zzf2 = (zzf) SafeParcelReader.m166019C(parcel, X, zzf.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 6:
                    f = SafeParcelReader.m166038V(parcel, X);
                    break;
                case 7:
                    str2 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 8:
                    z = SafeParcelReader.m166032P(parcel, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzr(zznArr, zzf, zzf2, str, f, str2, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
