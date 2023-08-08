package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.lb */
public final class C38688lb implements Parcelable.Creator<zzh> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        zzl zzl = null;
        String str = null;
        String str2 = null;
        zzm[] zzmArr = null;
        zzj[] zzjArr = null;
        String[] strArr = null;
        zze[] zzeArr = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    zzl = (zzl) SafeParcelReader.m166019C(parcel, X, zzl.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 4:
                    str2 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 5:
                    zzmArr = (zzm[]) SafeParcelReader.m166027K(parcel, X, zzm.CREATOR);
                    break;
                case 6:
                    zzjArr = (zzj[]) SafeParcelReader.m166027K(parcel, X, zzj.CREATOR);
                    break;
                case 7:
                    strArr = SafeParcelReader.m166024H(parcel, X);
                    break;
                case 8:
                    zzeArr = (zze[]) SafeParcelReader.m166027K(parcel, X, zze.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzh(zzl, str, str2, zzmArr, zzjArr, strArr, zzeArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
