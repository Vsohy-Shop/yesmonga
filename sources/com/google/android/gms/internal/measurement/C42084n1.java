package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.n1 */
public final class C42084n1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 2:
                    j2 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 3:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 4:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 6:
                    str3 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 7:
                    bundle = SafeParcelReader.m166055g(parcel2, X);
                    break;
                case 8:
                    str4 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
