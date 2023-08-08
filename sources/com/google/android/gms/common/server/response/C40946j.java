package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.j */
public final class C40946j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        String str = null;
        String str2 = null;
        zaa zaa = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 2:
                    i2 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 3:
                    z = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 4:
                    i3 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 5:
                    z2 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 6:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 7:
                    i4 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 8:
                    str2 = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 9:
                    zaa = (zaa) SafeParcelReader.m166019C(parcel, X, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaa);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
