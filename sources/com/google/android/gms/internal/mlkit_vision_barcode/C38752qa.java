package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.qa */
public final class C38752qa implements Parcelable.Creator<zzms> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzml zzml = null;
        zzmo zzmo = null;
        zzmp zzmp = null;
        zzmr zzmr = null;
        zzmq zzmq = null;
        zzmm zzmm = null;
        zzmi zzmi = null;
        zzmj zzmj = null;
        zzmk zzmk = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 2:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 4:
                    bArr = SafeParcelReader.m166057h(parcel2, X);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.m166027K(parcel2, X, Point.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 7:
                    zzml = (zzml) SafeParcelReader.m166019C(parcel2, X, zzml.CREATOR);
                    break;
                case 8:
                    zzmo = (zzmo) SafeParcelReader.m166019C(parcel2, X, zzmo.CREATOR);
                    break;
                case 9:
                    zzmp = (zzmp) SafeParcelReader.m166019C(parcel2, X, zzmp.CREATOR);
                    break;
                case 10:
                    zzmr = (zzmr) SafeParcelReader.m166019C(parcel2, X, zzmr.CREATOR);
                    break;
                case 11:
                    zzmq = (zzmq) SafeParcelReader.m166019C(parcel2, X, zzmq.CREATOR);
                    break;
                case 12:
                    zzmm = (zzmm) SafeParcelReader.m166019C(parcel2, X, zzmm.CREATOR);
                    break;
                case 13:
                    zzmi = (zzmi) SafeParcelReader.m166019C(parcel2, X, zzmi.CREATOR);
                    break;
                case 14:
                    zzmj = (zzmj) SafeParcelReader.m166019C(parcel2, X, zzmj.CREATOR);
                    break;
                case 15:
                    zzmk = (zzmk) SafeParcelReader.m166019C(parcel2, X, zzmk.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzms(i, str, str2, bArr, pointArr, i2, zzml, zzmo, zzmp, zzmr, zzmq, zzmm, zzmi, zzmj, zzmk);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzms[i];
    }
}
