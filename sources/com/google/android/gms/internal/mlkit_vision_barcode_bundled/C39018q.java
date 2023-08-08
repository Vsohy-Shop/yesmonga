package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q */
public final class C39018q implements Parcelable.Creator<zzba> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzat zzat = null;
        zzaw zzaw = null;
        zzax zzax = null;
        zzaz zzaz = null;
        zzay zzay = null;
        zzau zzau = null;
        zzaq zzaq = null;
        zzar zzar = null;
        zzas zzas = null;
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
                    zzat = (zzat) SafeParcelReader.m166019C(parcel2, X, zzat.CREATOR);
                    break;
                case 8:
                    zzaw = (zzaw) SafeParcelReader.m166019C(parcel2, X, zzaw.CREATOR);
                    break;
                case 9:
                    zzax = (zzax) SafeParcelReader.m166019C(parcel2, X, zzax.CREATOR);
                    break;
                case 10:
                    zzaz = (zzaz) SafeParcelReader.m166019C(parcel2, X, zzaz.CREATOR);
                    break;
                case 11:
                    zzay = (zzay) SafeParcelReader.m166019C(parcel2, X, zzay.CREATOR);
                    break;
                case 12:
                    zzau = (zzau) SafeParcelReader.m166019C(parcel2, X, zzau.CREATOR);
                    break;
                case 13:
                    zzaq = (zzaq) SafeParcelReader.m166019C(parcel2, X, zzaq.CREATOR);
                    break;
                case 14:
                    zzar = (zzar) SafeParcelReader.m166019C(parcel2, X, zzar.CREATOR);
                    break;
                case 15:
                    zzas = (zzas) SafeParcelReader.m166019C(parcel2, X, zzas.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzba(i, str, str2, bArr, pointArr, i2, zzat, zzaw, zzax, zzaz, zzay, zzau, zzaq, zzar, zzas);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzba[i];
    }
}
