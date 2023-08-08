package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.kb */
public final class C38675kb implements Parcelable.Creator<zzg> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzf zzf = null;
        zzf zzf2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 4:
                    str3 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 5:
                    str4 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 6:
                    str5 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 7:
                    zzf = (zzf) SafeParcelReader.m166019C(parcel, X, zzf.CREATOR);
                    break;
                case 8:
                    zzf2 = (zzf) SafeParcelReader.m166019C(parcel, X, zzf.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzg(str, str2, str3, str4, str5, zzf, zzf2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }
}
