package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u */
public final class C39054u implements Parcelable.Creator<zzar> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        zzav zzav = null;
        String str = null;
        String str2 = null;
        zzaw[] zzawArr = null;
        zzat[] zzatArr = null;
        String[] strArr = null;
        zzao[] zzaoArr = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    zzav = (zzav) SafeParcelReader.m166019C(parcel, X, zzav.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 4:
                    zzawArr = (zzaw[]) SafeParcelReader.m166027K(parcel, X, zzaw.CREATOR);
                    break;
                case 5:
                    zzatArr = (zzat[]) SafeParcelReader.m166027K(parcel, X, zzat.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.m166024H(parcel, X);
                    break;
                case 7:
                    zzaoArr = (zzao[]) SafeParcelReader.m166027K(parcel, X, zzao.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzar(zzav, str, str2, zzawArr, zzatArr, strArr, zzaoArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzar[i];
    }
}
