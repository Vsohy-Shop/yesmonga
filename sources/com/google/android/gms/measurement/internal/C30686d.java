package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.d */
public final class C30686d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        String str2 = null;
        zzli zzli = null;
        String str3 = null;
        zzaw zzaw = null;
        zzaw zzaw2 = null;
        zzaw zzaw3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 4:
                    zzli = (zzli) SafeParcelReader.m166019C(parcel2, X, zzli.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 6:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 7:
                    str3 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 8:
                    zzaw = (zzaw) SafeParcelReader.m166019C(parcel2, X, zzaw.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 10:
                    zzaw2 = (zzaw) SafeParcelReader.m166019C(parcel2, X, zzaw.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 12:
                    zzaw3 = (zzaw) SafeParcelReader.m166019C(parcel2, X, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzac(str, str2, zzli, j, z, str3, zzaw, j2, zzaw2, j3, zzaw3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
