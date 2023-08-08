package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.d0 */
public final class C41759d0 implements Parcelable.Creator<zzbe> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        int i = 0;
        short s = 0;
        int i2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 2:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 3:
                    s = SafeParcelReader.m166054f0(parcel2, X);
                    break;
                case 4:
                    d = SafeParcelReader.m166036T(parcel2, X);
                    break;
                case 5:
                    d2 = SafeParcelReader.m166036T(parcel2, X);
                    break;
                case 6:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 7:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 8:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 9:
                    i3 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzbe(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }
}
