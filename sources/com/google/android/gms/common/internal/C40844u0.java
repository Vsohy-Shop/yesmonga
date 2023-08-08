package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.u0 */
public final class C40844u0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i5 = -1;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 2:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 3:
                    i3 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 4:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 5:
                    j2 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 6:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 7:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 8:
                    i4 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 9:
                    i5 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
