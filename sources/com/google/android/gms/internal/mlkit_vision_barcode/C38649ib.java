package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ib */
public final class C38649ib implements Parcelable.Creator<zzq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzj zzj = null;
        zzm zzm = null;
        zzn zzn = null;
        zzp zzp = null;
        zzo zzo = null;
        zzk zzk = null;
        zzg zzg = null;
        zzh zzh = null;
        zzi zzi = null;
        byte[] bArr = null;
        double d = 0.0d;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 3:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 4:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.m166027K(parcel2, X, Point.CREATOR);
                    break;
                case 7:
                    zzj = (zzj) SafeParcelReader.m166019C(parcel2, X, zzj.CREATOR);
                    break;
                case 8:
                    zzm = (zzm) SafeParcelReader.m166019C(parcel2, X, zzm.CREATOR);
                    break;
                case 9:
                    zzn = (zzn) SafeParcelReader.m166019C(parcel2, X, zzn.CREATOR);
                    break;
                case 10:
                    zzp = (zzp) SafeParcelReader.m166019C(parcel2, X, zzp.CREATOR);
                    break;
                case 11:
                    zzo = (zzo) SafeParcelReader.m166019C(parcel2, X, zzo.CREATOR);
                    break;
                case 12:
                    zzk = (zzk) SafeParcelReader.m166019C(parcel2, X, zzk.CREATOR);
                    break;
                case 13:
                    zzg = (zzg) SafeParcelReader.m166019C(parcel2, X, zzg.CREATOR);
                    break;
                case 14:
                    zzh = (zzh) SafeParcelReader.m166019C(parcel2, X, zzh.CREATOR);
                    break;
                case 15:
                    zzi = (zzi) SafeParcelReader.m166019C(parcel2, X, zzi.CREATOR);
                    break;
                case 16:
                    bArr = SafeParcelReader.m166057h(parcel2, X);
                    break;
                case 17:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 18:
                    d = SafeParcelReader.m166036T(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzq(i, str, str2, i2, pointArr, zzj, zzm, zzn, zzp, zzo, zzk, zzg, zzh, zzi, bArr, z, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
