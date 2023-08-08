package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ua */
public final class C38801ua implements Parcelable.Creator<zzmj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        zzmn zzmn = null;
        String str = null;
        String str2 = null;
        zzmo[] zzmoArr = null;
        zzml[] zzmlArr = null;
        String[] strArr = null;
        zzmg[] zzmgArr = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    zzmn = (zzmn) SafeParcelReader.m166019C(parcel, X, zzmn.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 4:
                    zzmoArr = (zzmo[]) SafeParcelReader.m166027K(parcel, X, zzmo.CREATOR);
                    break;
                case 5:
                    zzmlArr = (zzml[]) SafeParcelReader.m166027K(parcel, X, zzml.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.m166024H(parcel, X);
                    break;
                case 7:
                    zzmgArr = (zzmg[]) SafeParcelReader.m166027K(parcel, X, zzmg.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzmj(zzmn, str, str2, zzmoArr, zzmlArr, strArr, zzmgArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzmj[i];
    }
}
