package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.f */
public final class C40958f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 2:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 4:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    i3 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m166025I(parcel2, X);
                    break;
                case 8:
                    j2 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 10:
                    str3 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 11:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 12:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 13:
                    str4 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 14:
                    i4 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 15:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 16:
                    j3 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 17:
                    str5 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 18:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
