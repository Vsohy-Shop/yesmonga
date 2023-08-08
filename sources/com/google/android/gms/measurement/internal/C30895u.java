package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.u */
public final class C30895u implements Parcelable.Creator {
    /* renamed from: a */
    public static void m124178a(zzaw zzaw, Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, zzaw.f74163a, false);
        C40820a.m166102S(parcel, 3, zzaw.f74164b, i, false);
        C40820a.m166108Y(parcel, 4, zzaw.f74165c, false);
        C40820a.m166094K(parcel, 5, zzaw.f74166d);
        C40820a.m166112b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        long j = 0;
        String str = null;
        zzau zzau = null;
        String str2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O == 3) {
                zzau = (zzau) SafeParcelReader.m166019C(parcel, X, zzau.CREATOR);
            } else if (O == 4) {
                str2 = SafeParcelReader.m166023G(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                j = SafeParcelReader.m166048c0(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzaw(str, zzau, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
