package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.e1 */
public final class C30329e1 implements Parcelable.Creator<zzbj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                str2 = SafeParcelReader.m166023G(parcel, X);
            } else if (O == 2) {
                str3 = SafeParcelReader.m166023G(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                str = SafeParcelReader.m166023G(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zzbj(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbj[i];
    }
}
